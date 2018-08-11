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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lk.ijse.sms.dto.StudentDTO;

/**
 *
 * @author User
 */
public class StudentDAO {
    
    private final File file = new File("E:/Sms Data/student.txt");
    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    
    
    private FileWriter fileWriter;
    private FileReader fileReader;
    
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;
    
 
    
   public StudentDAO() throws IOException {
       fileWriter = new FileWriter(file,true);
       fileReader = new FileReader(file);
       
       bufferedWriter = new BufferedWriter(fileWriter);
       bufferedReader = new BufferedReader(fileReader);
       
    }
   
   
   public  boolean save(StudentDTO studentDTO)throws Exception{
       
       if (!file.exists()) {
           boolean add = file.createNewFile();
       }
       
       String data = "";
       data += studentDTO.getId() + " ";
       data += studentDTO.getName() + " ";
       data += studentDTO.getAddress() + " ";
       data += studentDTO.getEmail() + " ";
       data += studentDTO.getContatctNo() + " ";
       data += studentDTO.getBirthDay();
       
       try {
           
           bufferedWriter.write(data);
           bufferedWriter.newLine();
           return true;
       } finally {
           
           if (bufferedWriter != null) {
               bufferedWriter.close();
               
           }
       }
      
   }
   
   public boolean delete(String id)throws Exception{
   
       try {
           List<String>list = new ArrayList<>();
           String line = null;
           
           while ((line = bufferedReader.readLine()) !=null) {               
               String[] data = line.split(" ");
               if (!data[0].equals(id)) {
                   list.add(line);
               }
           }
           
           for (String string: list) {
               bufferedWriter.write(string);
               bufferedWriter.newLine();
           }
           return isExist(id);
       } finally {
           if (bufferedReader != null) {
               bufferedReader.close();
           }if (bufferedWriter !=null) {
               bufferedWriter.close();
           }
       }
   }
   
   public StudentDTO search(String id)throws Exception{
       
       StudentDTO studentDTO = null;
       try {
           String line = null;
           
           while ((line = bufferedReader.readLine()) != null) {               
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
       } finally{
           if (bufferedReader !=null) {
               bufferedReader.close();
           }
       }
   }
   
   public  List<StudentDTO>getAllStudent()throws Exception{
       List<StudentDTO>studentDTOs = new ArrayList<>();
       StudentDTO studentDTO = null;
       try {
           String line =null;
           
           while ((line = bufferedReader.readLine()) != null) {               
               String[] data = line.split(" ");
               studentDTO = new StudentDTO();
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
           if (bufferedReader !=null) {
               bufferedReader.close();
           }
       }
   }

    private boolean isExist(String id) throws Exception {
       StudentDTO studentDTO = search(id);
       return studentDTO == null;
    }
    
}
