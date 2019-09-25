package com.sandeep.resources;

import com.sandeep.entity.Student;
import com.sandeep.objects.request.CreateUrlRequest;
import com.sandeep.objects.response.BaseResponse;
import com.sandeep.service.ITinyURLService;
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

    @RequestMapping(value = "/v1/register", method = RequestMethod.POST)
    public BaseResponse<Long> registerNewStudent(@RequestBody Student student) {

        BaseResponse<Long> baseResponse = new BaseResponse<>();
        baseResponse.setData(tinyURLService.register(student));
        setSuccessResultInfo(baseResponse);
        return baseResponse;
    }

    public BaseResponse<Student> getRegisteredStudent(@RequestParam(name = "id",required = true) Integer id) {
        BaseResponse<Student> baseResponse = new BaseResponse<>();
        baseResponse.setData(tinyURLService.findStudent(id));
        setSuccessResultInfo(baseResponse);
        return baseResponse;
    }
}
