/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.sms.dto.RegistationDTO;

/**
 *
 * @author User
 */
public class RegistationDAO {
    
    
    private final File file = new File("E:/Sms Data/registation.txt");
    
    
    public boolean writeFile(List<RegistationDTO>registationDTOs)throws Exception{
        
        try( FileOutputStream fileOutputStream = new FileOutputStream(file); ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
            objectOutputStream.writeObject(registationDTOs);
            return true;
        
        }    
    }
    
    public boolean save(RegistationDTO registationDTO)throws Exception{
        List<RegistationDTO>registationDTOs = new ArrayList<>();
        registationDTOs.add(registationDTO);
        return writeFile(registationDTOs);
    }
}
