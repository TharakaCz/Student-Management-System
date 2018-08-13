/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.controller;

import java.io.IOException;
import lk.ijse.sms.bo.RegistationBO;
import lk.ijse.sms.dto.RegistationDTO;

/**
 *
 * @author User
 */
public class RegistationController {
    
    private final RegistationBO registationBO;

    public RegistationController() throws IOException,NullPointerException{
        this.registationBO = new RegistationBO();
    }

    
    
    public boolean save(RegistationDTO registationDTO)throws Exception{
        System.out.println("dfdcc");
        return registationBO.save(registationDTO);
    }
}
