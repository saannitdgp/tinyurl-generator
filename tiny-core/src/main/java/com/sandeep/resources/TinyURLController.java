package com.sandeep.resources;

import com.sandeep.objects.request.CreateUrlRequest;
import com.sandeep.objects.request.RegisterStudentRequest;
import com.sandeep.objects.request.StudentSRO;
import com.sandeep.objects.response.BaseResponse;
import com.sandeep.objects.response.StudentInfoResponse;
import com.sandeep.service.ITinyURLService;
import com.sandeep.util.IConvertorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class TinyURLController extends BaseController{

    @RequestMapping(value ="/v1/create_tiny_url",method = RequestMethod.POST)
    public ResponseEntity<BaseResponse> createTinyURL(@RequestBody CreateUrlRequest urlRequest) {
        return null;
    }

    @Autowired
        private ITinyURLService tinyURLService;

    @Autowired
    private IConvertorService convertorService;

    @RequestMapping(value = "/v1/register", method = RequestMethod.POST)
    public BaseResponse<Long> registerNewStudent(@RequestBody RegisterStudentRequest request) {

        BaseResponse<Long> baseResponse = new BaseResponse<>();
        baseResponse.setData(tinyURLService.register(request.getStudent()));
        setSuccessResultInfo(baseResponse);
        return baseResponse;
    }

    @RequestMapping(value = "/v1/students",method = RequestMethod.GET)
    public BaseResponse<StudentSRO> getRegisteredStudent(@RequestParam(name = "student_id",required = true) Integer id) {
        BaseResponse<StudentSRO> baseResponse = new BaseResponse<>();
        baseResponse.setData(convertorService.getStudentSROFromStudent(tinyURLService.findStudent(id)));
        setSuccessResultInfo(baseResponse);
        return baseResponse;
    }
    @RequestMapping(value = "/v1/fetch_studnent/report_card_id",method = RequestMethod.GET)
    public BaseResponse<StudentInfoResponse> getRegisteredStudentByReportCard(@RequestParam(name = "report_card_id",required = true) Integer id) {
        BaseResponse<StudentInfoResponse> baseResponse = new BaseResponse<>();
        baseResponse.setData(tinyURLService.findStudentByReportCardId(id));
        setSuccessResultInfo(baseResponse);
        return baseResponse;
    }

    @RequestMapping(value = "/v1/students",method = RequestMethod.GET)
    public BaseResponse<StudentInfoResponse> getStudentOfClass(@RequestParam(name = "class_name") String className) {
        BaseResponse<StudentInfoResponse> baseResponse = new BaseResponse<>();
        baseResponse.setData(tinyURLService.findStudentByReportCardId(className));
        setSuccessResultInfo(baseResponse);
        return baseResponse;
    }
}
