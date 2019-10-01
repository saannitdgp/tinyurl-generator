package com.sandeep.dao;

import com.sandeep.entity.ReportCard;
import com.sandeep.entity.Student;
import com.sandeep.entity.StudentClassInfo;

public interface ITinyURLDao {

    long save(Object object);

    Student fetchStudentById(int id);

    ReportCard fetchReportCardById(int id);

    StudentClassInfo getClassInfo(String name);
}
