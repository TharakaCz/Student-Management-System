/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import lk.ijse.sms.dto.RegistationDetailsDTO;

/**
 *
 * @author User
 */
public class RegistationDetailDAO {
    
    
    private File file = new File("E:/Sms Data/registationDetails.txt");
    
    
    
    public boolean save(RegistationDetailsDTO registationDetailsDTO)throws Exception{
    
        if (!file.exists()) {
            file.createNewFile();
        }
        String data = "";
        data += registationDetailsDTO.getsName() +" ";
        data += registationDetailsDTO.getsEmail() +" ";
        data += registationDetailsDTO.getcName() +" ";
        data += registationDetailsDTO.getcDuration();
        
        
        BufferedWriter bufferedWriter = null;
        
        try {
            FileWriter fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            return  true;
        } finally {
            if (bufferedWriter !=null) {
                bufferedWriter.close();
            }
            
        }
    }
}
