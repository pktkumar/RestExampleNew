package com.myComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:my.properties")

public class MyComponent {

    @Autowired
    Environment environment;

    @GetMapping(value = "/GetValue")
    public void getValue(){

        System.out.println("from properties file "+ environment.getProperty("my.name"));
    }
}
