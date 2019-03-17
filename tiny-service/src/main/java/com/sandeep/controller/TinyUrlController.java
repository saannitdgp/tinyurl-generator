package com.sandeep.controller;

import com.sandeep.service.ITinyURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class TinyUrlController {

    @Autowired
    private ITinyURLService tinyURLService;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ResponseEntity check(){
        return ResponseEntity.ok("OK");
    }

    @RequestMapping(value = "/create" , method = RequestMethod.POST)
    public ResponseEntity cerateRecord(){
        System.out.println("Created");
        return ResponseEntity.ok(tinyURLService.createTinyURL("www.google.com"));
    }
}
