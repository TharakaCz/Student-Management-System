/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.ijse.sms.veiw;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class Main extends javax.swing.JFrame {

    /** Creates new form Main */
    public Main() {
        initComponents();
       
        
         setSize(1200, 780);
         setLocationRelativeTo(null);
        

        lblDashboard.setBackground(new  Color(0xEDE89F));

        
        
        DashBoard forme = new DashBoard();
        pnlMain.removeAll();
        forme.setSize(pnlMain.getSize());
        pnlMain.add(forme);
        pnlMain.revalidate();
        pnlMain.repaint();
        
         //Labels
         lblPreview.setVisible(false);
         lblfowerd.setVisible(false);
         lblTitle.setText("Welcome Student Management System");
         setTitle("Student Management System");
         ImageIcon icon = new ImageIcon(this.getClass().getResource("/assest/Graduation.png"));
         
         this.setIconImage(icon.getImage());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new org.jdesktop.swingx.JXPanel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        lblTitle = new org.jdesktop.swingx.JXLabel();
        lblPreview = new org.jdesktop.swingx.JXLabel();
        lblfowerd = new org.jdesktop.swingx.JXLabel();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        lblExit = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        lblStudent = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        lblCourse = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        lblRegistation = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        lblAboutUs = new org.jdesktop.swingx.JXLabel();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        lblDashboard = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(null);
        getContentPane().add(pnlMain);
        pnlMain.setBounds(230, 60, 960, 680);

        jXPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jXPanel2.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jXPanel2.add(lblTitle);
        lblTitle.setBounds(270, 10, 360, 40);

        lblPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Right Button.png"))); // NOI18N
        lblPreview.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jXPanel2.add(lblPreview);
        lblPreview.setBounds(900, 10, 40, 40);

        lblfowerd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Prev.png"))); // NOI18N
        lblfowerd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jXPanel2.add(lblfowerd);
        lblfowerd.setBounds(20, 10, 40, 40);

        getContentPane().add(jXPanel2);
        jXPanel2.setBounds(230, 0, 960, 60);

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jXPanel1.setLayout(null);

        jXLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Exit.png"))); // NOI18N
        jXPanel1.add(jXLabel5);
        jXLabel5.setBounds(30, 580, 50, 60);

        lblExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblExit.setText("                       Exit");
        lblExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        jXPanel1.add(lblExit);
        lblExit.setBounds(10, 580, 210, 60);

        jXLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Student.png"))); // NOI18N
        jXPanel1.add(jXLabel1);
        jXLabel1.setBounds(30, 220, 60, 60);

        lblStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblStudent.setText("                     Manage Student");
        lblStudent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStudentMouseClicked(evt);
            }
        });
        jXPanel1.add(lblStudent);
        lblStudent.setBounds(10, 220, 210, 60);

        jXLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Reading.png"))); // NOI18N
        jXPanel1.add(jXLabel2);
        jXLabel2.setBounds(30, 310, 50, 60);

        lblCourse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCourse.setText("                     Manage Course");
        lblCourse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCourseMouseClicked(evt);
            }
        });
        jXPanel1.add(lblCourse);
        lblCourse.setBounds(10, 310, 210, 60);

        jXLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Registration.png"))); // NOI18N
        jXPanel1.add(jXLabel3);
        jXLabel3.setBounds(30, 400, 50, 60);

        lblRegistation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblRegistation.setText("                      Registation");
        lblRegistation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRegistation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistationMouseClicked(evt);
            }
        });
        jXPanel1.add(lblRegistation);
        lblRegistation.setBounds(10, 400, 210, 60);

        jXLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Services.png"))); // NOI18N
        jXPanel1.add(jXLabel4);
        jXLabel4.setBounds(30, 490, 50, 60);

        lblAboutUs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAboutUs.setText("                       About Us");
        lblAboutUs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutUsMouseClicked(evt);
            }
        });
        jXPanel1.add(lblAboutUs);
        lblAboutUs.setBounds(10, 490, 210, 60);

        jXLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/Dashboard.png"))); // NOI18N
        jXPanel1.add(jXLabel7);
        jXLabel7.setBounds(30, 130, 50, 60);

        lblDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDashboard.setText("                     DashBoard");
        lblDashboard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });
        jXPanel1.add(lblDashboard);
        lblDashboard.setBounds(10, 130, 210, 60);

        getContentPane().add(jXPanel1);
        jXPanel1.setBounds(0, 0, 230, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudentMouseClicked
        
      boolean isCliked = true;
      
        if (isCliked) {
            
            lblTitle.setText("Manage Student");
            lblfowerd.setVisible(true);
            lblCourse.setBackground(new Color(0xFFFFFF));
            lblStudent.setBackground(new Color(0xEDE89F));
            lblAboutUs.setBackground(new  Color(0xFFFFFF));
            lblDashboard.setBackground(new  Color(0xFFFFFF));
            lblExit.setBackground(new  Color(0xFFFFFF));
            lblRegistation.setBackground(new  Color(0xFFFFFF));
        }else{
            lblTitle.setText("");
        }
        
        StudentForm forme = null;
        try {
            forme = new StudentForm();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        pnlMain.removeAll();
        forme.setSize(pnlMain.getSize());
        pnlMain.add(forme);
        pnlMain.revalidate();
        pnlMain.repaint();
    }//GEN-LAST:event_lblStudentMouseClicked

    private void lblCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCourseMouseClicked
        
        try {
            boolean isClicked = true;
            
            if (isClicked) {
                lblTitle.setText("Manage Course");
                lblfowerd.setVisible(true);
                lblCourse.setBackground(new Color(0xEDE89F));
                lblStudent.setBackground(new Color(0xFFFFFF));
                lblAboutUs.setBackground(new  Color(0xFFFFFF));
                lblDashboard.setBackground(new  Color(0xFFFFFF));
                lblExit.setBackground(new  Color(0xFFFFFF));
                lblRegistation.setBackground(new  Color(0xFFFFFF));
            }else{
                lblTitle.setText("");
                
            }
            
            CourseForm forme = new CourseForm();
            pnlMain.removeAll();
            forme.setSize(pnlMain.getSize());
            pnlMain.add(forme);
            pnlMain.revalidate();
            pnlMain.repaint();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblCourseMouseClicked

    private void lblRegistationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistationMouseClicked
           
        boolean isClicked = true;
        
        if (isClicked) {
             lblRegistation.setBackground(new Color(0xEDE89F));
              lblCourse.setBackground(new Color(0xFFFFFF));
                lblStudent.setBackground(new Color(0xFFFFFF));
                lblAboutUs.setBackground(new  Color(0xFFFFFF));
                lblDashboard.setBackground(new  Color(0xFFFFFF));
                lblExit.setBackground(new  Color(0xFFFFFF));
        }
        
            Registation forme = new Registation();
            pnlMain.removeAll();
            forme.setSize(pnlMain.getSize());
            pnlMain.add(forme);
            pnlMain.revalidate();
            pnlMain.repaint();
    }//GEN-LAST:event_lblRegistationMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        boolean isConfirm = true;
        if(isConfirm){
            System.exit(0);
            
        }else{
            this.dispose();
        }
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        
        boolean isClickes = true;
        
        if (isClickes) {
                lblRegistation.setBackground(new Color(0xFFFFFF));
                lblCourse.setBackground(new Color(0xFFFFFF));
                lblStudent.setBackground(new Color(0xFFFFFF));
                lblAboutUs.setBackground(new  Color(0xFFFFFF));
                lblDashboard.setBackground(new  Color(0xEDE89F));
                lblExit.setBackground(new  Color(0xFFFFFF));
        }
        
        DashBoard forme = new DashBoard();
        pnlMain.removeAll();
        forme.setSize(pnlMain.getSize());
        pnlMain.add(forme);
        pnlMain.revalidate();
        pnlMain.repaint();
        
        lblTitle.setText("Welcome Student Management System");
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblAboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutUsMouseClicked
        
        boolean isClicked = true;
        
        if (isClicked) {
            
                lblRegistation.setBackground(new Color(0xFFFFFF));
                lblCourse.setBackground(new Color(0xFFFFFF));
                lblStudent.setBackground(new Color(0xFFFFFF));
                lblAboutUs.setBackground(new  Color(0xEDE89F));
                lblDashboard.setBackground(new  Color(0xFFFFFF));
                lblExit.setBackground(new  Color(0xFFFFFF));
        }
        
        AboutUs forme = new AboutUs();
        pnlMain.removeAll();
        forme.setSize(pnlMain.getSize());
        pnlMain.add(forme);
        pnlMain.revalidate();
        pnlMain.repaint();
        
        lblTitle.setText("About US");
    }//GEN-LAST:event_lblAboutUsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXLabel lblAboutUs;
    private org.jdesktop.swingx.JXLabel lblCourse;
    private org.jdesktop.swingx.JXLabel lblDashboard;
    private org.jdesktop.swingx.JXLabel lblExit;
    private org.jdesktop.swingx.JXLabel lblPreview;
    private org.jdesktop.swingx.JXLabel lblRegistation;
    private org.jdesktop.swingx.JXLabel lblStudent;
    private org.jdesktop.swingx.JXLabel lblTitle;
    private org.jdesktop.swingx.JXLabel lblfowerd;
    private org.jdesktop.swingx.JXPanel pnlMain;
    // End of variables declaration//GEN-END:variables

}
