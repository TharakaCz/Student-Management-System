/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.controller;

import java.io.IOException;
import java.util.List;
import lk.ijse.sms.bo.CourseBO;
import lk.ijse.sms.dto.CourseDTO;

/**
 *
 * @author User
 */
public class CourseController {
    
    private final CourseBO courseBO;

    public CourseController() throws IOException{
        courseBO = new CourseBO();
    }
    
    public  boolean save(CourseDTO courseDTO)throws Exception{
        return courseBO.save(courseDTO);
    }
    
    public boolean delete(String id)throws Exception{
        return courseBO.delete(id);
    }
    
    public List<CourseDTO>getAllCourse()throws Exception{
        return courseBO.getAllCource();
    }
    
    public  CourseDTO search(String id)throws Exception{
        return courseBO.search(id);
    }
//    public boolean delete(int id)throws Exception{
//        return courseBO.delete(id);
//    }
//    
//    public boolean  update(CourseDTO courseDTO)throws Exception{
//        return courseBO.update(courseDTO);
//    }
//    
//    public  CourseDTO search(int id)throws Exception{
//        return null;
//    }
}
