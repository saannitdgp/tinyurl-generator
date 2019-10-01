package com.sandeep.util.impl;

import com.sandeep.entity.ReportCard;
import com.sandeep.entity.Student;
import com.sandeep.objects.request.ReportCardInfoSRO;
import com.sandeep.objects.request.StudentSRO;
import com.sandeep.objects.response.StudentInfoResponse;
import com.sandeep.util.IConvertorService;
import org.springframework.stereotype.Service;

@Service(value = "convertorSerive")
public class ConvertorService implements IConvertorService {

    @Override
    public StudentSRO getStudentSROFromStudent(Student student) {

        StudentSRO studentSRO = new StudentSRO();
        studentSRO.setEmail(student.getEmail());
        studentSRO.setName(student.getEmail());
        ReportCardInfoSRO reportCardInfoSRO = new ReportCardInfoSRO();
        if(student.getReportCard() != null) {
            reportCardInfoSRO.setDepartment(student.getReportCard().getDepartment());
            reportCardInfoSRO.setPercentage(student.getReportCard().getPercentage());
        }
        studentSRO.setReportCardInfo(reportCardInfoSRO);
        return studentSRO;
    }

    @Override
    public StudentInfoResponse getStudentInfoResponseFromReportCard(ReportCard reportCard) {
        StudentInfoResponse response = new StudentInfoResponse();
        if(reportCard != null && reportCard.getStudent() != null) {
            response.setEmail(reportCard.getStudent().getEmail());
            response.setName(reportCard.getStudent().getName());
        }
        return response;
    }
}
