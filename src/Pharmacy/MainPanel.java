/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmacy;

import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

/**
 *
 * @author A-jay
 */
public class MainPanel extends javax.swing.JFrame {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pharmacyMain = new javax.swing.JButton();
        pharmacyMain1 = new javax.swing.JButton();
        employeeMain = new javax.swing.JButton();
        billMain = new javax.swing.JButton();
        addPatientMain = new javax.swing.JButton();
        addPharmacyMain = new javax.swing.JButton();
        addEmployeeMain = new javax.swing.JButton();
        addSellsMain = new javax.swing.JButton();
        addMedicineMain = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));
        setExtendedState(1);
        setIconImages(null);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pharmacy Management System");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        pharmacyMain.setBackground(new java.awt.Color(24, 175, 171));
        pharmacyMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pharmacyMain.setForeground(new java.awt.Color(255, 255, 255));
        pharmacyMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pharma.png"))); // NOI18N
        pharmacyMain.setText("Pharmacy ");
        pharmacyMain.setIconTextGap(20);
        pharmacyMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyMainActionPerformed(evt);
            }
        });
        getContentPane().add(pharmacyMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 200, 33));

        pharmacyMain1.setBackground(new java.awt.Color(24, 175, 171));
        pharmacyMain1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        pharmacyMain1.setForeground(new java.awt.Color(255, 51, 0));
        pharmacyMain1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        pharmacyMain1.setText("Log Out");
        pharmacyMain1.setIconTextGap(20);
        pharmacyMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyMain1ActionPerformed(evt);
            }
        });
        getContentPane().add(pharmacyMain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 240, 70));

        employeeMain.setBackground(new java.awt.Color(24, 175, 171));
        employeeMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        employeeMain.setForeground(new java.awt.Color(255, 255, 255));
        employeeMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N
        employeeMain.setText("Employee Detail");
        employeeMain.setIconTextGap(20);
        employeeMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeMainActionPerformed(evt);
            }
        });
        getContentPane().add(employeeMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 200, 33));

        billMain.setBackground(new java.awt.Color(24, 175, 171));
        billMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        billMain.setForeground(new java.awt.Color(255, 255, 255));
        billMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bill.png"))); // NOI18N
        billMain.setText("Bill Details");
        billMain.setIconTextGap(20);
        billMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billMainActionPerformed(evt);
            }
        });
        getContentPane().add(billMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 200, 33));

        addPatientMain.setBackground(new java.awt.Color(24, 175, 171));
        addPatientMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addPatientMain.setForeground(new java.awt.Color(255, 255, 255));
        addPatientMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patient.png"))); // NOI18N
        addPatientMain.setText("Patient");
        addPatientMain.setIconTextGap(20);
        addPatientMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientMainActionPerformed(evt);
            }
        });
        getContentPane().add(addPatientMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 200, 33));

        addPharmacyMain.setBackground(new java.awt.Color(24, 175, 171));
        addPharmacyMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addPharmacyMain.setForeground(new java.awt.Color(255, 255, 255));
        addPharmacyMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pharma.png"))); // NOI18N
        addPharmacyMain.setText("Pharmacy");
        addPharmacyMain.setIconTextGap(20);
        addPharmacyMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPharmacyMainActionPerformed(evt);
            }
        });
        getContentPane().add(addPharmacyMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 200, 33));

        addEmployeeMain.setBackground(new java.awt.Color(24, 175, 171));
        addEmployeeMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addEmployeeMain.setForeground(new java.awt.Color(255, 255, 255));
        addEmployeeMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N
        addEmployeeMain.setText("Employee");
        addEmployeeMain.setIconTextGap(20);
        addEmployeeMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeMainActionPerformed(evt);
            }
        });
        getContentPane().add(addEmployeeMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 200, 33));

        addSellsMain.setBackground(new java.awt.Color(24, 175, 171));
        addSellsMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addSellsMain.setForeground(new java.awt.Color(255, 255, 255));
        addSellsMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sells.png"))); // NOI18N
        addSellsMain.setText("Sells");
        addSellsMain.setIconTextGap(20);
        addSellsMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSellsMainActionPerformed(evt);
            }
        });
        getContentPane().add(addSellsMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 200, 33));

        addMedicineMain.setBackground(new java.awt.Color(24, 175, 171));
        addMedicineMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addMedicineMain.setForeground(new java.awt.Color(255, 255, 255));
        addMedicineMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medicine.png"))); // NOI18N
        addMedicineMain.setText("Medicine");
        addMedicineMain.setIconTextGap(20);
        addMedicineMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineMainActionPerformed(evt);
            }
        });
        getContentPane().add(addMedicineMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 200, 33));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_main.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 11, 1380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void addPatientMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientMainActionPerformed
        new AddPatient().setVisible(true);
    }//GEN-LAST:event_addPatientMainActionPerformed

    private void employeeMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeMainActionPerformed
        new ShowEmployeeDetails().setVisible(true);
    }//GEN-LAST:event_employeeMainActionPerformed

    private void billMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billMainActionPerformed
       new CheckBill().setVisible(true);
    }//GEN-LAST:event_billMainActionPerformed

    private void addPharmacyMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPharmacyMainActionPerformed
        new AddPharmacy().setVisible(true);
    }//GEN-LAST:event_addPharmacyMainActionPerformed

    private void addSellsMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSellsMainActionPerformed
        new AddSells().setVisible(true);
    }//GEN-LAST:event_addSellsMainActionPerformed

    private void addMedicineMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineMainActionPerformed
        new AddMedicine().setVisible(true);
    }//GEN-LAST:event_addMedicineMainActionPerformed

    private void addEmployeeMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeMainActionPerformed
       new AddEmployee().setVisible(true);
    }//GEN-LAST:event_addEmployeeMainActionPerformed

    private void pharmacyMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyMainActionPerformed
        new SelectPharmacy().setVisible(true);
    }//GEN-LAST:event_pharmacyMainActionPerformed

    private void pharmacyMain1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyMain1ActionPerformed
        Singleton.getInstance().setPass("");
        Singleton.getInstance().setUser("");
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_pharmacyMain1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeMain;
    private javax.swing.JButton addMedicineMain;
    private javax.swing.JButton addPatientMain;
    private javax.swing.JButton addPharmacyMain;
    private javax.swing.JButton addSellsMain;
    private javax.swing.JButton billMain;
    private javax.swing.JButton employeeMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton pharmacyMain;
    private javax.swing.JButton pharmacyMain1;
    // End of variables declaration//GEN-END:variables
}
