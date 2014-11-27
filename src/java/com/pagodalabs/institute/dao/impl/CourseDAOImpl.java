/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.institute.dao.impl;

import com.pagodalabs.institute.beans.Course;
import com.pagodalabs.institute.dao.CourseDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author forsell
 */
@Repository
public class CourseDAOImpl implements CourseDAO {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public CourseDAOImpl() {
    }
    
    
    public CourseDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
        
    }
    @Override
    public int insert(Course course) {
        String sql="INSERT INTO courses(course_name,course_description,status) values(?,?,?)";
        return jdbcTemplate.update(sql,new Object[]{course.getName(),course.getDescription(),course.isStatus()});
    }

    @Override
    public int update(Course course) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        String sql="DELETE from courses where course_id=?";
        return jdbcTemplate.update(sql,new Object[]{id});
    }

    @Override
    public List<Course> getAll() {
        String sql="SELECT * FROM courses";
        List<Course> courseList= jdbcTemplate.query(sql,new RowMapper<Course>() {

            @Override
            public Course mapRow(ResultSet rs, int i) throws SQLException {
                Course course=new Course();
                course.setId(rs.getInt("course_id"));
                course.setName(rs.getString("course_name"));
                course.setDescription(rs.getString("course_description"));
                course.setStatus(rs.getBoolean("status"));
                return course;
            }
        });
        return courseList;
    }

    @Override
    public Course getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    

}
