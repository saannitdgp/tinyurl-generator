package com.sandeep.dao.impl;

import com.sandeep.dao.ITinyURLDao;
import com.sandeep.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TinyURLDaoImpl implements ITinyURLDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public long save(Object object) {

       sessionFactory.getCurrentSession().save(object);
       return ((Student)object).getStudentId();
    }


    @Override
    public Student fetchStudentById(int id) {

        Query query = sessionFactory.getCurrentSession().createQuery("from student where studentId := id");
        query.setParameter("id",id);
        return (Student)query.uniqueResult();
    }
}
