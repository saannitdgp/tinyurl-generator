package com.sandeep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class TinyUrlController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ResponseEntity check(){
        return ResponseEntity.ok("OK");
    }
}
