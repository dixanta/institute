/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pagodalabs.institute.controllers;
import com.pagodalabs.institute.beans.Course;
import com.pagodalabs.institute.dao.CourseDAO;
/*import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;*/
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
public class DefaultController {
   
    @Autowired
    private CourseDAO courseDAO;

    @RequestMapping(value="/",method=RequestMethod.GET)
    public String index(ModelMap map){
        /*SessionFactory  factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
         Transaction tx = null;
         Integer courseId = null;
         try{
            tx = session.beginTransaction();
            Course course = new Course(0,"Advanced Java","Advanced Java", Boolean.TRUE);
            courseId = (Integer) session.save(course); 
            tx.commit();
         }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace(); 
         }finally {
            session.close(); 
         }   */
        
        
        courseDAO.insert(new Course(0,"Advanced Java","Advanced Java", Boolean.TRUE));
        return "admin/default/index";
    }
}
