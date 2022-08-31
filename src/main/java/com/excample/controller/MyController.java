package com.excample.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;


@RestController
public class MyController {

//http://localhost:8090/Test
/*    @RequestMapping("/Test")
       public String indexNew() {
        return "my second page";
    }*/


//http://localhost:8090/What?name=Kumar

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


        System.out.println("calling Scheduler for every 10 Secs" + new Date());

    }


// to call another API which running in 8080 port


//     @Scheduled(cron = "*/10 * * * * *")
//    public void myCron() {
//        String url = "http://localhost:8080/Test";
//        RestTemplate restTemplate = new RestTemplate();
//        String str = restTemplate.getForObject(url, String.class);
//
//        System.out.println(str);
//
//    }





}