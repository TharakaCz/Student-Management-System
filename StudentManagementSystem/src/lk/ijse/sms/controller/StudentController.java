/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.controller;

import java.io.IOException;
import java.util.List;
import lk.ijse.sms.bo.StudentBO;
import lk.ijse.sms.dto.StudentDTO;

/**
 *
 * @author User
 */
public class StudentController {
    
    
    private final StudentBO studentBO;

    public StudentController() throws IOException {
        this.studentBO = new StudentBO();
    }
    
    public  boolean save(StudentDTO studentDTO)throws Exception{
        return studentBO.save(studentDTO);
    }
    
    public boolean update(StudentDTO studentDTO) throws Exception{
        return studentBO.update(studentDTO);
    }
    
    public boolean delete(String id)throws Exception{
        return studentBO.delete(id);
    }
    
//    public boolean update(StudentDTO studentDTO)throws Exception{
//        return studentBO.update(studentDTO);
//    }
    
    
    public  StudentDTO search(String id)throws Exception{
        return studentBO.search(id);
    }
    
    public List<StudentDTO>getAllStudent()throws Exception{
        return studentBO.getAllStudents();
    }
}
