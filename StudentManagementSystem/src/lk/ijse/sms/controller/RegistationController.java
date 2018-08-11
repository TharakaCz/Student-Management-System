/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.controller;

import lk.ijse.sms.bo.RegistationBO;
import lk.ijse.sms.dto.RegistationDTO;

/**
 *
 * @author User
 */
public class RegistationController {
    
    private  RegistationBO registationBO;
    
    public boolean save(RegistationDTO registationDTO)throws Exception{
        return registationBO.save(registationDTO);
    }
}
