package com.sandeep.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class TinyURLController {

    @RequestMapping(value = "/check",method = RequestMethod.GET)
    public ResponseEntity check(){
        return ResponseEntity.ok(HttpStatus.ACCEPTED);
    }
}
