/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.institute.dao;

import com.pagodalabs.institute.beans.Course;
import java.util.List;

/**
 *
 * @author forsell
 */
public interface CourseDAO {
    public int insert(Course course);
    public int update(Course course);
    public int delete(int id);
    public List<Course> getAll();
    public Course getById(int id);
}
