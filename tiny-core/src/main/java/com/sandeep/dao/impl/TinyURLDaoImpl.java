package com.sandeep.dao.impl;

import com.sandeep.dao.ITinyURLDao;
import com.sandeep.entity.ReportCard;
import com.sandeep.entity.Student;
import com.sandeep.entity.StudentClassInfo;
import com.sandeep.util.SessionUtil;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TinyURLDaoImpl implements ITinyURLDao {

    @Autowired
    private SessionUtil sessionUtil;

    @Override
    @Transactional
    public long save(Object object) {
       sessionUtil.getSession().save(object);
       Student student = sessionUtil.getSession().get(Student.class,1);
       return ((Student)object).getStudentId();
    }

    @Override
    public Student fetchStudentById(int id) {
        Query query = sessionUtil.getSession().createQuery("from Student where studentId =:id");
        query.setParameter("id",id);
        return (Student)query.uniqueResult();
    }

    @Override
    public ReportCard fetchReportCardById(int id) {
        Query query = sessionUtil.getSession().createQuery("from ReportCard where id =:id");
        query.setParameter("id",id);
        return (ReportCard) query.uniqueResult();
    }

    @Override
    public StudentClassInfo getClassInfo(String name) {
        Query query = sessionUtil.getSession().createQuery("from StudentClassInfo where name =:name");
        query.setParameter("name",name);
        return  (StudentClassInfo)query.uniqueResult();
    }
}
