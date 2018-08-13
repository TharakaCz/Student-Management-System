/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.controller;

import java.io.IOException;
import lk.ijse.sms.bo.RegistationDetailsBO;
import lk.ijse.sms.dto.RegistationDetailsDTO;

/**
 *
 * @author User
 */
public class RegistationDetailsController {
    
    
    private final RegistationDetailsBO registationDetailsBO;

    public RegistationDetailsController() throws IOException,NullPointerException{
        this.registationDetailsBO = new RegistationDetailsBO();
    }

    
    
    
    
    public  boolean save(RegistationDetailsDTO registationDetailsDTO)throws Exception{
        System.out.println("dfdcc");
        return registationDetailsBO.save(registationDetailsDTO);
    }
}
