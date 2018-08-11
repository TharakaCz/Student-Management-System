/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
    
    
    public boolean save(RegistationDTO registationDTO) throws Exception {
        
        if (!file.exists()) {
            boolean createNewFile = file.createNewFile();
        }
    
        String data = "";
        data += registationDTO.getRid()+ " ";
        data += registationDTO.getSid()+ " ";
        data += registationDTO.getCid()+ " ";
        data += registationDTO.getFee()+ " ";
        data += registationDTO.getDate();
        
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            return true;
        } finally {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        
        }
    
    }
}
