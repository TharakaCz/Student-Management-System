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
public class CourseDTO implements Serializable{
    
    private String id;

    private String cName;

    private String fee;

    private String cDuration;
    
     public CourseDTO() {
    }

    public CourseDTO(String id) {
        this.id = id;
        
    }

    public CourseDTO(String id, String cName, String fee, String cDuration) {
        this.id = id;
        this.cName = cName;
        this.fee = fee;
        this.cDuration = cDuration;
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
     * @return the cName
     */
    public String getcName() {
        return cName;
    }

    /**
     * @param cName the cName to set
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * @return the fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * @return the cDuration
     */
    public String getcDuration() {
        return cDuration;
    }

    /**
     * @param cDuration the cDuration to set
     */
    public void setcDuration(String cDuration) {
        this.cDuration = cDuration;
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
