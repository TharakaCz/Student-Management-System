/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.sms.veiw;

import java.awt.Color;

/**
 *
 * @author User
 */
public class Registation extends javax.swing.JPanel {

    /**
     * Creates new form Registation
     */
    public Registation() {
        initComponents();
        
        txtRegistationID.setBorder(null);
        txtFee.setBorder(null);
        txtDate.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        cmbCourseID = new org.jdesktop.swingx.JXComboBox();
        cmbStudentID = new org.jdesktop.swingx.JXComboBox();
        txtDate = new org.jdesktop.swingx.JXTextField();
        txtRegistationID = new org.jdesktop.swingx.JXTextField();
        txtFee = new org.jdesktop.swingx.JXTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistation = new org.jdesktop.swingx.JXTable();
        btnUpdate = new org.jdesktop.swingx.JXButton();
        btnAddNew = new org.jdesktop.swingx.JXButton();
        btnSave = new org.jdesktop.swingx.JXButton();
        btnDelete = new org.jdesktop.swingx.JXButton();
        lblSearch = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        spDate = new org.jdesktop.swingx.JXLabel();
        spRID = new org.jdesktop.swingx.JXLabel();
        spFee = new org.jdesktop.swingx.JXLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jXLabel1.setText("Registation List     :-");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel1);
        jXLabel1.setBounds(20, 410, 150, 30);

        jXLabel2.setText("Registation ID  :- ");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel2);
        jXLabel2.setBounds(110, 60, 120, 30);

        jXLabel3.setText("Student ID         :-");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel3);
        jXLabel3.setBounds(110, 130, 120, 30);

        jXLabel4.setText("Course ID          :-");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel4);
        jXLabel4.setBounds(110, 190, 120, 30);

        jXLabel5.setText("Fee                      :-");
        jXLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel5);
        jXLabel5.setBounds(110, 260, 130, 30);
        add(cmbCourseID);
        cmbCourseID.setBounds(260, 190, 430, 30);
        add(cmbStudentID);
        cmbStudentID.setBounds(260, 130, 430, 30);

        txtDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDatePropertyChange(evt);
            }
        });
        add(txtDate);
        txtDate.setBounds(260, 330, 430, 30);

        txtRegistationID.setPrompt("Input Registation ID");
        txtRegistationID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegistationIDMouseClicked(evt);
            }
        });
        add(txtRegistationID);
        txtRegistationID.setBounds(260, 60, 430, 30);

        txtFee.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtFeePropertyChange(evt);
            }
        });
        add(txtFee);
        txtFee.setBounds(260, 260, 430, 30);

        tblRegistation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registation ID", "Student ID", "Course ID", "Fee", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblRegistation);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 450, 910, 200);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Update.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(780, 260, 160, 30);

        btnAddNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/New.png"))); // NOI18N
        btnAddNew.setText("ADD NEW");
        btnAddNew.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(btnAddNew);
        btnAddNew.setBounds(780, 60, 160, 30);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Save.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave);
        btnSave.setBounds(780, 130, 160, 30);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Trash.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(780, 190, 160, 30);

        lblSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Search.png"))); // NOI18N
        lblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchMouseClicked(evt);
            }
        });
        add(lblSearch);
        lblSearch.setBounds(700, 60, 30, 30);

        jXLabel6.setText("Date                    :-");
        jXLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(jXLabel6);
        jXLabel6.setBounds(110, 330, 140, 30);

        spDate.setBackground(new java.awt.Color(153, 153, 153));
        add(spDate);
        spDate.setBounds(260, 360, 430, 2);

        spRID.setBackground(new java.awt.Color(153, 153, 153));
        add(spRID);
        spRID.setBounds(260, 90, 430, 2);

        spFee.setBackground(new java.awt.Color(153, 153, 153));
        add(spFee);
        spFee.setBounds(260, 290, 430, 2);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void lblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSearchMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtRegistationIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegistationIDMouseClicked
       spRID.setBackground(new Color(0x58C9F7));
       spFee.setBackground(new Color(153,153,153));
       spDate.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_txtRegistationIDMouseClicked

    private void txtFeePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtFeePropertyChange
       spRID.setBackground(new Color(153,153,153));
       spFee.setBackground(new Color(0x58C9F7));
       spDate.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_txtFeePropertyChange

    private void txtDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDatePropertyChange
        spRID.setBackground(new Color(153,153,153));
       spFee.setBackground(new Color(153,153,153));
       spDate.setBackground(new Color(0x58C9F7));
    }//GEN-LAST:event_txtDatePropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnAddNew;
    private org.jdesktop.swingx.JXButton btnDelete;
    private org.jdesktop.swingx.JXButton btnSave;
    private org.jdesktop.swingx.JXButton btnUpdate;
    private org.jdesktop.swingx.JXComboBox cmbCourseID;
    private org.jdesktop.swingx.JXComboBox cmbStudentID;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel lblSearch;
    private org.jdesktop.swingx.JXLabel spDate;
    private org.jdesktop.swingx.JXLabel spFee;
    private org.jdesktop.swingx.JXLabel spRID;
    private org.jdesktop.swingx.JXTable tblRegistation;
    private org.jdesktop.swingx.JXTextField txtDate;
    private org.jdesktop.swingx.JXTextField txtFee;
    private org.jdesktop.swingx.JXTextField txtRegistationID;
    // End of variables declaration//GEN-END:variables
}
