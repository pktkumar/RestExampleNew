package com.excample.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
public class MyController {


    @RequestMapping("/Test")
    public String indexNew() {
        return "my second page";
    }


//http://localhost:8080/What?name=Kumar

    @GetMapping(value = "/What")
    public String noIdea(@RequestParam(value = "name") String myName) {
        System.out.println("myName" + myName);
        return "no idea " + myName;

    }

    /*
     * cron jobs for every 10 secs
     * @EnableScheduling on @springbootapplication
     * 
     */
    @Scheduled(cron = "*/10 * * * * *")
    public void myCron() {
        System.out.println("Method executed at every 5 seconds. Current time is :: " + new Date());
    }


}