package com.sandeep.service.impl;

import com.sandeep.dao.ITinyURLDao;
import com.sandeep.entity.ReportCard;
import com.sandeep.entity.Student;
import com.sandeep.entity.StudentClassInfo;
import com.sandeep.objects.request.StudentSRO;
import com.sandeep.objects.response.StudentInfoResponse;
import com.sandeep.service.ITinyURLService;
import com.sandeep.util.IConvertorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service(value = "tinyURLServiceImpl")
public class TinyURLServiceImpl implements ITinyURLService {

    @Autowired
    private ITinyURLDao tinyURLDao;

    @Autowired
    private IConvertorService convertorService;

    @Override
    public boolean isValidURL(String url) {
        return false;
    }

    @Override
    @Transactional
    public long register(StudentSRO studentSRO) {
        Student student = new Student();
        student.setName(studentSRO.getName());
        student.setEmail(studentSRO.getEmail());
        ReportCard reportCard = new ReportCard();
        reportCard.setPercentage(studentSRO.getReportCardInfo().getPercentage());
        reportCard.setDepartment(studentSRO.getReportCardInfo().getDepartment());
        StudentClassInfo studentClassInfo = new StudentClassInfo();
        StudentClassInfo preStudentClassInfo = tinyURLDao.getClassInfo(studentSRO.getClassOfStudent().getClassName());
        if(preStudentClassInfo != null) {
            studentClassInfo.setId(preStudentClassInfo.getId());
        }
        studentClassInfo.setName(studentSRO.getClassOfStudent().getClassName());
        student.setClassInfo(studentClassInfo);
        student.setReportCard(reportCard);
        return tinyURLDao.save(student);
    }

    @Override
    @Transactional
    public Student findStudent(int id) {
        Student result = new Student();
        Student student =  tinyURLDao.fetchStudentById(id);
        if(student == null) return result;
        ReportCard reportCard =  new ReportCard();
        reportCard.setDepartment(student.getReportCard().getDepartment());
        reportCard.setPercentage(student.getReportCard().getPercentage());
        result.setReportCard(reportCard);
        result.setEmail(student.getEmail());
        result.setName(student.getName());
        result.setStudentId(student.getStudentId());
        return result;
    }

    @Override
    @Transactional
    public StudentInfoResponse findStudentByReportCardId(int reportCardId) {
        ReportCard reportCard = tinyURLDao.fetchReportCardById(reportCardId);
        return convertorService.getStudentInfoResponseFromReportCard(reportCard);
    }

    @Override
    @Transactional
    public Set<StudentInfoResponse> fetchStudentsOfClass(String className) {
        return null;
    }
}
