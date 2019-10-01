package com.sandeep.util;


import com.sandeep.entity.ReportCard;
import com.sandeep.entity.Student;
import com.sandeep.objects.request.StudentSRO;
import com.sandeep.objects.response.StudentInfoResponse;

public interface IConvertorService {

    StudentSRO  getStudentSROFromStudent(Student student);

    StudentInfoResponse getStudentInfoResponseFromReportCard(ReportCard reportCard);

}
