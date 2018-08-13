/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.bo;

import lk.ijse.sms.dao.RegistationDetailDAO;
import lk.ijse.sms.dto.RegistationDetailsDTO;

/**
 *
 * @author User
 */
public class RegistationDetailsBO {
    
    
    private final RegistationDetailDAO registationDetailDAO;

    public RegistationDetailsBO() {
        this.registationDetailDAO = new RegistationDetailDAO();
    }
    
    
    
    public boolean save(RegistationDetailsDTO registationDetailsDTO)throws Exception{
        System.out.println("dfdcc");
        return  registationDetailDAO.save(registationDetailsDTO);
    }
}
