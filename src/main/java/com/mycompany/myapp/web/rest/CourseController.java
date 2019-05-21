package com.example.demo.controller;

import com.example.demo.modal.Course;
import com.example.demo.modal.dto.CourseDto;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// single function interface
@RestController
@RequestMapping
public class CourseController {
    @Autowired // IOC
    CourseService courseService; // Singleton

    @GetMapping(path = "/", produces = "application/json")
    public HttpEntity findAllCourses(){
        List<Course> allCourses = courseService.findAllCourses();

        return new ResponseEntity<>(allCourses,HttpStatus.OK);
    }

    // @GetMapping(path = "/look-up/{inputString}", produces = "application/json")
    // public HttpEntity<Course> searchCourse(@PathVariable("inputString") String inputString) {
    //     List<Course> findedCourse = courseService.searchByCourseName(inputString);

    //     return new ResponseEntity(findedCourse, HttpStatus.OK);
    // }

    // @PostMapping(path = "/add", produces = "application/json")
    // public HttpEntity<Course> addCourse(@RequestBody Course newCourse) {
    //     List<Course> addedCourse = courseService.addCourse(newCourse);
    //     List<Course> allCourses = courseService.findAllCourses();

    //     return new ResponseEntity(allCourses, HttpStatus.OK);

    // }

    // @PutMapping(path = "/update/{inputString}", produces = "application/json")
    // public HttpEntity<Course> updateCourse(@PathVariable("inputString") String inputString, @RequestBody Course updateCourse) {
    //     List<Course> updatedCourse = courseService.updateCourse(inputString, updateCourse);

    //     return new ResponseEntity(updatedCourse, HttpStatus.OK);
    // }

    // @DeleteMapping(path = "/delete/{inputString}", produces = "application/json")
    // public HttpEntity<Course> deleteCourse(@PathVariable("inputString") String inputString) {
    //     List<Course> deletedCourse = courseService.deleteByCourseName(inputString);

    //     return new ResponseEntity(deletedCourse, HttpStatus.OK);
    // }
}
