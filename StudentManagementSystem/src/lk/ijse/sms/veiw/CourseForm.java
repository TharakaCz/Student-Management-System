/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.veiw;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.sms.controller.CourseController;
import lk.ijse.sms.dto.CourseDTO;

/**
 *
 * @author User
 */
public class CourseForm extends javax.swing.JPanel {

    /**
     * Creates new form CourseForm
     */
    private final CourseController controller;
//    private CourseDTO courseDTO;
//    private List<CourseDTO> courseDTOs;
    
    public CourseForm() throws IOException  {
        initComponents();
        loardAllCourse();
        controller = new CourseController();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        txtName = new org.jdesktop.swingx.JXTextField();
        txtDuration = new org.jdesktop.swingx.JXTextField();
        txtFree = new org.jdesktop.swingx.JXTextField();
        btnSave = new org.jdesktop.swingx.JXButton();
        btnDelete = new org.jdesktop.swingx.JXButton();
        btnUpdate = new org.jdesktop.swingx.JXButton();
        txtNew = new org.jdesktop.swingx.JXButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new org.jdesktop.swingx.JXTable();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        txtID = new org.jdesktop.swingx.JXTextField();
        lblSearch = new org.jdesktop.swingx.JXLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jXLabel2.setText("Duration              :-");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel2);
        jXLabel2.setBounds(130, 250, 119, 36);

        jXLabel4.setText("ID                        :-");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel4);
        jXLabel4.setBounds(130, 80, 119, 30);

        jXLabel5.setText("Fee                      :-");
        jXLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel5);
        jXLabel5.setBounds(130, 190, 119, 36);

        txtName.setPrompt("Input Course Name");
        add(txtName);
        txtName.setBounds(290, 140, 411, 28);

        txtDuration.setPrompt("Input Course Duration");
        add(txtDuration);
        txtDuration.setBounds(290, 250, 411, 28);

        txtFree.setPrompt("Input Course Fee");
        add(txtFree);
        txtFree.setBounds(290, 190, 411, 28);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Save.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave);
        btnSave.setBounds(780, 80, 138, 36);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Trash.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(780, 140, 138, 36);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Update.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(780, 200, 138, 36);

        txtNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/New.png"))); // NOI18N
        txtNew.setText("ADD NEW");
        txtNew.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewActionPerformed(evt);
            }
        });
        add(txtNew);
        txtNew.setBounds(780, 20, 138, 34);

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Fee", "Duration"
            }
        ));
        jScrollPane1.setViewportView(tblCourse);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 380, 900, 280);

        jXLabel3.setText("Cource List  :-");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel3);
        jXLabel3.setBounds(30, 350, 120, 23);

        jXLabel6.setText("Name                   :-");
        jXLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel6);
        jXLabel6.setBounds(130, 140, 119, 36);

        txtID.setPrompt("Input ID");
        add(txtID);
        txtID.setBounds(290, 80, 410, 30);

        lblSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Search.png"))); // NOI18N
        add(lblSearch);
        lblSearch.setBounds(710, 80, 30, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        try {
            CourseDTO courseDTO = new CourseDTO();
            String id = txtID.getText().trim();
            String cName = txtName.getText().trim();
            String fee = txtFree.getText().trim();
            String duration = txtDuration.getText().trim();
            
             courseDTO = new CourseDTO(id, cName, fee, duration);
//            CourseDTO courseDTO = new CourseDTO(0,cName,fee,duration);
            if(controller.save(courseDTO)){
                JOptionPane.showMessageDialog(this,"Added");
                loardAllCourse();
            }else{
                JOptionPane.showMessageDialog(this, "Faild");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            boolean delete=controller.delete(txtID.getText());
            
            if (delete) {
                JOptionPane.showMessageDialog(this, "Deleted");
//                loardAllCourse();
            }else{
                JOptionPane.showMessageDialog(this, "Fild");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewActionPerformed
       txtID.setText(null);
       txtName.setText(null);
       txtFree.setText(null);
       txtDuration.setText(null);
    }//GEN-LAST:event_txtNewActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnDelete;
    private org.jdesktop.swingx.JXButton btnSave;
    private org.jdesktop.swingx.JXButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel lblSearch;
    private org.jdesktop.swingx.JXTable tblCourse;
    private org.jdesktop.swingx.JXTextField txtDuration;
    private org.jdesktop.swingx.JXTextField txtFree;
    private org.jdesktop.swingx.JXTextField txtID;
    private org.jdesktop.swingx.JXTextField txtName;
    private org.jdesktop.swingx.JXButton txtNew;
    // End of variables declaration//GEN-END:variables

    public final void loardAllCourse(){
        
        
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblCourse.getModel();
            dtm.setRowCount(0);
            
            List<CourseDTO>courseDTOs;
            
            courseDTOs = controller.getAllCourse();
            
            for (CourseDTO courseDTO1 : courseDTOs) {
                Object[] o = {courseDTO1.getId(),courseDTO1.getcName(),courseDTO1.getFee(),courseDTO1.getcDuration()};
                dtm.addRow(o);
            }
        } catch (Exception ex) {
            Logger.getLogger(CourseForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
