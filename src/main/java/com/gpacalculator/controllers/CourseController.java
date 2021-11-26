package com.gpacalculator.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CourseController {

    @GetMapping("/test")
   public ResponseEntity<String> test(){
       String s = "testing is done";
       return new ResponseEntity<>(s, HttpStatus.OK);
    }
}
