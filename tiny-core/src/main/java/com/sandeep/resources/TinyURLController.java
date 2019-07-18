package com.sandeep.resources;

import com.sandeep.objects.constants.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class TinyURLController {

    @RequestMapping(value ="/v1/create_tiny_url",method = RequestMethod.POST)
    public ResponseEntity<BaseResponse> createTinyURL(String longURL) {
        return null;
    }

}
