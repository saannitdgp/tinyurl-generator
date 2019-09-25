package com.sandeep.service.impl;

import com.sandeep.dao.ITinyURLDao;
import com.sandeep.entity.Student;
import com.sandeep.service.ITinyURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "tinyURLServiceImpl")
public class TinyURLServiceImpl implements ITinyURLService {

    @Autowired
    private ITinyURLDao tinyURLDao;

    @Override
    public boolean isValidURL(String url) {
        return false;
    }

    @Override
    @Transactional
    public long register(Student student) {
        return tinyURLDao.save(student);
    }

    @Override public Student findStudent(int id) {
        return tinyURLDao.fetchStudentById(id);
    }
}
