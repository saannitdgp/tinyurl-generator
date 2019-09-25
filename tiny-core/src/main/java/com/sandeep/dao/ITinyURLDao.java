package com.sandeep.dao;

import com.sandeep.entity.Student;

public interface ITinyURLDao {

    long save(Object object);

    Student fetchStudentById(int id);
}
