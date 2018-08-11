/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.bo;

import java.io.IOException;
import java.util.List;
import lk.ijse.sms.dao.StudentDAO;
import lk.ijse.sms.dto.StudentDTO;

/**
 *
 * @author User
 */
public class StudentBO {
    
    
    private final StudentDAO studentDAO;

    public StudentBO() throws IOException {
        this.studentDAO = new StudentDAO();
    }

    
    public boolean save(StudentDTO studentDTO)throws Exception{
        return  studentDAO.save(studentDTO);
    }
    
    public  boolean update(StudentDTO studentDTO) throws Exception{
        return studentDAO.update(studentDTO);
    }
    public boolean delete(String id)throws Exception{
        return studentDAO.delete(id);
    }
    
    public List<StudentDTO>getAllStudents()throws Exception{
        return  studentDAO.getAllStudent();
    }
//    public  boolean update(StudentDTO studentDTO)throws Exception{
//        return studentDAO.update(studentDTO);
//    }
    
    public StudentDTO search(String id)throws Exception{
    return studentDAO.search(id);
    }
}
