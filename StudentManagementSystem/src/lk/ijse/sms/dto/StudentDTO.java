/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.dto;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class StudentDTO implements Serializable{
    
    private String id;

    private String name;

    private String address;

    private String email;

    private String contatctNo;

    private String birthDay;

    public StudentDTO() {
    }

    public StudentDTO(String id) {
        this.id = id;
        
    }

    public StudentDTO(String id, String name, String address, String email, String contatctNo, String birthDay) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.contatctNo = contatctNo;
        this.birthDay = birthDay;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contatctNo
     */
    public String getContatctNo() {
        return contatctNo;
    }

    /**
     * @param contatctNo the contatctNo to set
     */
    public void setContatctNo(String contatctNo) {
        this.contatctNo = contatctNo;
    }

    /**
     * @return the birthDay
     */
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

     
    
    
}
