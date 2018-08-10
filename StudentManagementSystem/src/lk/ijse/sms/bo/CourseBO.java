/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.bo;

import java.io.IOException;
import java.util.List;
import lk.ijse.sms.dao.CourseDAO;
import lk.ijse.sms.dto.CourseDTO;

/**
 *
 * @author User
 */
public class CourseBO {
    
     private final CourseDAO courseDAO;

    public CourseBO() throws IOException {
       courseDAO = new CourseDAO();
    }

    
 
public boolean save(CourseDTO courseDTO)throws Exception{
    
    return courseDAO.save(courseDTO);
}
   

public  boolean delete(String id)throws Exception{
    return courseDAO.delete(id);
}

public CourseDTO search(String id)throws Exception{
    return courseDAO.search(id);
}

public List<CourseDTO>getAllCource()throws Exception{
    return courseDAO.getAllCourse();
}
//public boolean delete(int id)throws Exception{
//    
//    return courseDAO.delete(id);
//    
//}
//
//public boolean update(CourseDTO courseDTO)throws Exception{
//    return courseDAO.update(courseDTO);
//}
//
//
//public CourseDTO search(int id)throws Exception{
//return courseDAO.search(id);
//}
}
