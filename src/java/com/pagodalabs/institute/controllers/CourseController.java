/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.institute.controllers;


import com.pagodalabs.institute.dao.CourseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author forsell
 */

@Controller
public class CourseController {

    @Autowired
    private CourseDAO courseDAO;
    @RequestMapping(value="/course",method=RequestMethod.GET)
    public String index(ModelMap map){
        map.put("header","Course Management");
        map.put("courses", courseDAO.getAll());
        //map.put("course",new Course(1,"Test","Test",Boolean.FALSE));
        //courseDAO.delete(2);
        return "admin/course/index";
    }
}
