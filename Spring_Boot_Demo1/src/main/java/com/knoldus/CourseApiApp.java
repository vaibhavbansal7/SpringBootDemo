package com.knoldus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {
    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class,args);//1st argument is the class having main method and 2nd is the argument passed to main method1
    }
}
