/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.sms.dto.StudentDTO;

/**
 *
 * @author User
 */
public class StudentDAO {
    
    private final File file = new File("E:/Sms Data/student.txt");
    
    
   public boolean save(StudentDTO studentDTO) throws Exception {
        
        if (!file.exists()) {
            boolean createNewFile = file.createNewFile();
        }
        
        String data = "";
        data += studentDTO.getId() + " ";
        data += studentDTO.getName() + " ";
        data += studentDTO.getAddress() + " ";
        data += studentDTO.getEmail() + " ";
        data += studentDTO.getContatctNo() + " ";
        data += studentDTO.getBirthDay();
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

   public  boolean update(StudentDTO studentDTO)throws Exception{
   
       String data = "";
        data += studentDTO.getId() + " ";
        data += studentDTO.getName() + " ";
        data += studentDTO.getAddress() + " ";
        data += studentDTO.getEmail() + " ";
        data += studentDTO.getContatctNo() + " ";
        data += studentDTO.getBirthDay();
        BufferedWriter bufferedWriter = null;
        
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            return true;
       } finally {
            
            if (bufferedWriter != null) {
              
                bufferedWriter.close();
            }
       }
        
   }
   
   
   public  List<StudentDTO> getAllStudent() throws Exception{
        BufferedReader reader = null;
        List<StudentDTO> studentDTOs = new ArrayList<>();
        try {
            
            FileReader fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                StudentDTO studentDTO = new StudentDTO();
                studentDTO.setId(data[0]);
                studentDTO.setName(data[1]);
                studentDTO.setAddress(data[2]);
                studentDTO.setEmail(data[3]);
                studentDTO.setContatctNo(data[4]);
                studentDTO.setBirthDay(data[5]);

                studentDTOs.add(studentDTO);
               
            }
            return studentDTOs;
        } finally {
            if (reader != null) {
                reader.close();
            }
           
        }
    }
   
   

    public  boolean delete(String id) throws Exception{
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            
            FileReader fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);
            List<String> fileData = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                if (!data[0].equals(id)) {
                    fileData.add(line);
                }
            }

            FileWriter fileWriter = new FileWriter(file);
            writer = new BufferedWriter(fileWriter);
            for (String lineData : fileData) {
                writer.write(lineData);
                writer.newLine();
            }
            return isStudent(id);
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
           
        }
    }

    
    

    public  StudentDTO search(String id) throws Exception {
        BufferedReader reader = null;
        StudentDTO studentDTO = null;
        try {

            
            FileReader fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                if (data[0].equals(id)) {
                studentDTO = new StudentDTO();
                studentDTO.setId(data[0]);
                studentDTO.setName(data[1]);
                studentDTO.setAddress(data[2]);
                studentDTO.setEmail(data[3]);
                studentDTO.setContatctNo(data[4]);
                studentDTO.setBirthDay(data[5]);

                }
            }
            return studentDTO;
        } finally {
            if (reader != null) {
                reader.close();
            }
            
        }
    }

    

    private boolean isStudent(String id) throws Exception{
       StudentDTO studentDTO = search(id);
        return studentDTO == null;
    }
}
