package com.excample.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class MyController {

        @RequestMapping("/")
        public String index(){
            return "my first page";
        }

        @RequestMapping("/Test")
        public String indexNew(){
            return "my second page";
        }

        @GetMapping(value = "/What")
        public String noIdea(@RequestParam(value = "name") String myName){
            System.out.println("myName" + myName);
            return "no idea "+myName;
    }
}
