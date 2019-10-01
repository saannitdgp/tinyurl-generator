package com.sandeep.service;

import com.sandeep.entity.Student;
import com.sandeep.objects.request.StudentSRO;
import com.sandeep.objects.response.StudentInfoResponse;

import java.util.Set;

public interface ITinyURLService {
    /**
     * check whether given url is valid or not.
     * @param url value of url
     * @return
     */
    boolean isValidURL(String url);

    long register(StudentSRO studentSRO);

    Student findStudent(int id);

    StudentInfoResponse findStudentByReportCardId(int reportCardId);

    Set<StudentInfoResponse> fetchStudentsOfClass(String className);


}
