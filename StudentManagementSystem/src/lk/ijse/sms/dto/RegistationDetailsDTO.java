/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.dto;

/**
 *
 * @author User
 */
public class RegistationDetailsDTO {
    
    private String sName;
    
    private String sEmail;
    
    private String cName;
    
    private String cDuration;

    public RegistationDetailsDTO() {
    }

    public RegistationDetailsDTO(String sName, String sEmail, String cName, String cDuration) {
        this.sName = sName;
        this.sEmail = sEmail;
        this.cName = cName;
        this.cDuration = cDuration;
    }

    /**
     * @return the sName
     */
    public String getsName() {
        return sName;
    }

    /**
     * @param sName the sName to set
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * @return the sEmail
     */
    public String getsEmail() {
        return sEmail;
    }

    /**
     * @param sEmail the sEmail to set
     */
    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
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
