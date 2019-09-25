package com.sandeep.service;

import com.sandeep.entity.Student;

public interface ITinyURLService {
    /**
     * check whether given url is valid or not.
     * @param url value of url
     * @return
     */
    boolean isValidURL(String url);

    long register(Student student);

    Student findStudent(int id);

}
