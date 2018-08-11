/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.sms.dto.CourseDTO;

/**
 *
 * @author User
 */
public class CourseDAO {
    
    
    
    private  final File file = new File("E:/Sms Data/cource.txt");
    
    
    public boolean save(CourseDTO courseDTO) throws Exception {
        
        if (!file.exists()) {
            boolean createNewFile = file.createNewFile();
        }
    
        String data = "";
        data += courseDTO.getId() + " ";
        data += courseDTO.getcName() + " ";
        data += courseDTO.getFee() + " ";
        data += courseDTO.getcDuration();
        
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

    public  boolean update(CourseDTO courseDTO)throws Exception{
        
        String data = "";
        data += courseDTO.getId() + " ";
        data += courseDTO.getcName() + " ";
        data += courseDTO.getFee() + " ";
        data += courseDTO.getcDuration();
        
        BufferedWriter bufferedWriter = null;
        
        try {
            FileWriter  fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
        
        return true;
        } finally {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }
         
    }
    
    
    
   public  List<CourseDTO> getAllCource() throws FileNotFoundException, IOException  {
        BufferedReader reader = null;
        List<CourseDTO> courseDTOs = new ArrayList<>();
        try {
            
            FileReader fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                CourseDTO studentDTO = new CourseDTO();
                studentDTO.setId(data[0]);
                studentDTO.setcName(data[1]);
                studentDTO.setFee(data[2]);
                studentDTO.setcDuration(data[3]);
                

                courseDTOs.add(studentDTO);
                
            }
            return courseDTOs;
        } finally {
            if (reader != null) {
                reader.close();
            }
           
        }
    }
   
   

    public  boolean delete(String id) throws FileNotFoundException, IOException{
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
            return isCourse(id);
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
           
        }
    }

    
    

    public  CourseDTO search(String sid) throws FileNotFoundException, IOException {
        BufferedReader reader = null;
        CourseDTO courseDTO = null;
        try {

            
            FileReader fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                if (data[0].equals(sid)) {
                courseDTO = new CourseDTO();
                courseDTO.setId(data[0]);
                courseDTO.setcName(data[1]);
                courseDTO.setFee(data[2]);
                courseDTO.setcDuration(data[3]);
                

                }
            }
            return courseDTO;
        } finally {
            if (reader != null) {
                reader.close();
            }
            
        }
    }

    

    private  boolean isCourse(String id) throws IOException, FileNotFoundException{
       CourseDTO courseDTO = search(id);
        return courseDTO == null;
    }
    
    
    
    ///////////////////////////////////////////////////////////////////////

//    private  FileWriter fileWriter;
//    private  BufferedWriter bufferedWriter;
//    private  FileReader fileReader;
//    private  BufferedReader bufferedReader;
//    
//    public CourseDAO() throws IOException {
//        fileWriter = new FileWriter(file,true);
//        bufferedWriter = new BufferedWriter(fileWriter);
//        fileReader = new FileReader(file);
//        bufferedReader = new BufferedReader(fileReader);
//    }
    
    
//    public boolean writeFile(List<CourseDTO>courseDTOs)throws Exception{
//      
//        try(FileOutputStream outputStream = new FileOutputStream(file); ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
//            objectOutputStream.writeObject(courseDTOs);
//        }
//        return true;
//    }
    
//    public boolean save(CourseDTO courseDTO)throws Exception{
//       List<CourseDTO>courseDTOs = new ArrayList<>();
//       courseDTOs.add(courseDTO);
//       return writeFile(courseDTOs);
//    }
    
//    public boolean save(CourseDTO courseDTO)throws Exception{
//        if (!file.exists()) {
//            boolean add = file.createNewFile();
//        }
//        
//        String data = "";
//        
//        data += courseDTO.getId() + " ";
//        data += courseDTO.getcName() + " ";
//        data += courseDTO.getFee() + " ";
//        data += courseDTO.getcDuration();
//       
//        
//        try {           
//            bufferedWriter.write(data);
//            bufferedWriter.newLine();
//            return true;
//        } finally{
//            if (bufferedWriter != null) {
//                bufferedWriter.close();
//            }
//        }
//    }
//    
//    public boolean delete(String id)throws Exception{
//        
//
//        
//        try{
//
//           
//            List<String>data = new ArrayList<>();
//            String line = null;
//            
//            while ((line = bufferedReader.readLine()) != null) {
//               String[] list = line.split("");
//                if (!list[0].equals(id)) {
//                    data.add(line);
//                }
//                
//            }
//            
//            for(String linedata : data){
//                bufferedWriter.write(linedata);
//                bufferedWriter.newLine();
//            }
//            
//            return isExist(id);
//            
//        }finally{
//            if (bufferedReader != null) {
//                bufferedReader.close();
//            }if(bufferedWriter !=null){
//                bufferedWriter.close();
//            }
//        }
//    }
//
//    
//public List<CourseDTO> getAllCourse()throws Exception{
//    
//    List<CourseDTO>courseDTOs = new ArrayList<>();
//    CourseDTO courseDTO = null;
//    try {
//        String line = null;
//        while ((line = bufferedReader.readLine()) != null) {            
//            String[] data = line.split(" ");
//            courseDTO = new CourseDTO();
//            courseDTO.setId(data[0]);
//            courseDTO.setcName(data[1]);
//            courseDTO.setFee(data[2]);
//            courseDTO.setcDuration(data[3]);
//            
//            courseDTOs.add(courseDTO);
//            
//        }
//        return courseDTOs;
//    } finally{
//        
//        if (bufferedReader != null) {
//            bufferedReader.close();
//            
//        }
//    }
//
//}
//    
//    public CourseDTO search(String id)throws Exception{
//    
//        CourseDTO courseDTO = null;
//        try {
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {                
//                String[] data = line.split(" ");
//                if (data[0].equals(id)) {
//                    courseDTO = new CourseDTO();
//                    courseDTO.getId();
//                    courseDTO.getcName();
//                    courseDTO.getFee();
//                    courseDTO.getcDuration();
//                }
//            }
//            return  courseDTO;
//        } finally{
//            if (bufferedReader != null) {
//                bufferedReader.close();
//            }
//        }
//       
//    }
//
//    public boolean Update(String id)throws Exception{
//        
//        
//        return false;
//        
//    }
//    private boolean isExist(String id) throws Exception{
//        
//        CourseDTO courseDTO = search(id);
//        return courseDTO == null;
//    }
//        
   
   
}
