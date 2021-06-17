package com.knoldus;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//annotation to make this rest controller for spring
public class HelloController {

    @RequestMapping("/hello")//annotation to map method with url we want
    public String answer(){
        return "Hi";
    }
}
