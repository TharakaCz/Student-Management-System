/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.veiw;

import java.io.IOException;
import javax.swing.JOptionPane;
import lk.ijse.sms.controller.StudentController;
import lk.ijse.sms.dto.StudentDTO;

/**
 *
 * @author User
 */
public class StudentForm extends javax.swing.JPanel {

    /**
     * Creates new form StudentForm
     */
    private final StudentController controller;
    public StudentForm() throws IOException {
        initComponents();
        
        controller = new StudentController();
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
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        txtBirthDay = new org.jdesktop.swingx.JXTextField();
        txtName = new org.jdesktop.swingx.JXTextField();
        txtAddress = new org.jdesktop.swingx.JXTextField();
        txtEmail = new org.jdesktop.swingx.JXTextField();
        txtContactNo = new org.jdesktop.swingx.JXTextField();
        btnUpdate = new org.jdesktop.swingx.JXButton();
        btnAdd = new org.jdesktop.swingx.JXButton();
        btnDelete = new org.jdesktop.swingx.JXButton();
        btnNew = new org.jdesktop.swingx.JXButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new org.jdesktop.swingx.JXTable();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        txtID = new org.jdesktop.swingx.JXTextField();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jXLabel2.setText("Birth Day                  :-");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel2);
        jXLabel2.setBounds(70, 320, 176, 32);

        jXLabel3.setText("ID                            :-");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel3);
        jXLabel3.setBounds(70, 20, 176, 28);

        jXLabel4.setText("Address                   :-");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel4);
        jXLabel4.setBounds(70, 140, 176, 28);

        jXLabel5.setText("Email                        :-");
        jXLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel5);
        jXLabel5.setBounds(70, 200, 176, 28);

        jXLabel6.setText("Contact No               :-");
        jXLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel6);
        jXLabel6.setBounds(70, 260, 176, 32);
        add(txtBirthDay);
        txtBirthDay.setBounds(300, 320, 410, 29);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName);
        txtName.setBounds(300, 80, 410, 29);
        add(txtAddress);
        txtAddress.setBounds(300, 140, 410, 29);
        add(txtEmail);
        txtEmail.setBounds(300, 200, 410, 29);
        add(txtContactNo);
        txtContactNo.setBounds(300, 260, 410, 29);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(btnUpdate);
        btnUpdate.setBounds(790, 200, 150, 32);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Save.png"))); // NOI18N
        btnAdd.setText("Save");
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd);
        btnAdd.setBounds(790, 80, 150, 32);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Trash.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(btnDelete);
        btnDelete.setBounds(790, 140, 150, 32);

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/New.png"))); // NOI18N
        btnNew.setText("ADD NEW");
        btnNew.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(btnNew);
        btnNew.setBounds(790, 20, 150, 32);

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Address", "Email", "Contact No", "Birth Day"
            }
        ));
        jScrollPane1.setViewportView(tblStudent);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 420, 920, 240);

        jXLabel1.setText("All Students  :-");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel1);
        jXLabel1.setBounds(20, 390, 140, 30);

        txtID.setText("jXTextField1");
        add(txtID);
        txtID.setBounds(300, 20, 410, 30);

        jXLabel7.setText("Name                       :-");
        jXLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add(jXLabel7);
        jXLabel7.setBounds(70, 80, 176, 28);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        
//        try {
//            String Name = txtName.getText().trim();
//            String Address = txtName.getText().trim();
//            String Email = txtEmail.getText().trim();
//            String ContactNo = txtContactNo.getText().trim();
//            String BirthDay = txtBirthDay.getText().trim();
//            
//            StudentDTO studentDTO = new StudentDTO(0, Name, Address, Email, ContactNo, BirthDay);
//            
//            if (controller.save(studentDTO)) {
//                JOptionPane.showMessageDialog(this, "Student Added Succsess Fully");
//            }else{
//                JOptionPane.showMessageDialog(this, "Student Added Faild Pleace Try Again");
//            }
//        } catch (Exception e) {
//        }
//        try {
//            String cName = txtName.getText().trim();
//            double fee =  Double.parseDouble(txtFree.getText().trim().equals("") ? "0" : txtFree.getText().trim());
//            String duration = txtDuration.getText().trim();
//            CourseDTO courseDTO = new CourseDTO(0,cName,fee,duration);
//            if(controller.save(courseDTO)){
//                JOptionPane.showMessageDialog(this,"Added");
//            }else{
//                JOptionPane.showMessageDialog(this, "Faild");
//            }
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnAdd;
    private org.jdesktop.swingx.JXButton btnDelete;
    private org.jdesktop.swingx.JXButton btnNew;
    private org.jdesktop.swingx.JXButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXTable tblStudent;
    private org.jdesktop.swingx.JXTextField txtAddress;
    private org.jdesktop.swingx.JXTextField txtBirthDay;
    private org.jdesktop.swingx.JXTextField txtContactNo;
    private org.jdesktop.swingx.JXTextField txtEmail;
    private org.jdesktop.swingx.JXTextField txtID;
    private org.jdesktop.swingx.JXTextField txtName;
    // End of variables declaration//GEN-END:variables
}
