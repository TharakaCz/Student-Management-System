/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.bo;

import lk.ijse.sms.dao.RegistationDAO;
import lk.ijse.sms.dto.RegistationDTO;

/**
 *
 * @author User
 */
public class RegistationBO {
    
    private final RegistationDAO registationDAO;

    public RegistationBO() {
        this.registationDAO = new RegistationDAO();
    }
    
    
    
    
    public  boolean save(RegistationDTO registationDTO) throws Exception{
        System.out.println("dfdcc");
        return registationDAO.save(registationDTO);
        
    }
}
