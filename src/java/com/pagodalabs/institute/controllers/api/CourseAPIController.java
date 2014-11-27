/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.institute.controllers.api;

import com.pagodalabs.institute.beans.Course;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author forsell
 */
@RestController
@RequestMapping(value="api/course")
public class CourseAPIController {
    
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public Course detail(@PathVariable(value="id") int id){
        Course course=new Course(1,"Java","Java",true);
        return course;
    } 

}
