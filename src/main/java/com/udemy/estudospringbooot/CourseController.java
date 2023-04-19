package com.udemy.estudospringbooot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(
                new Course (1 ,"Curso 1", "in28minutes"),
                new Course (2 ,"Curso 2", "in28minutes"),
                new Course (3 ,"Curso 3", "in28minutes")
        );
    }
}
