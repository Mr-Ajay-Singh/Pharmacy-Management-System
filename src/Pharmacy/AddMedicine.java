/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmacy;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author A-jay
 */
public class AddMedicine extends javax.swing.JFrame {
Connection con1;
        PreparedStatement insert;
    private final String pass;
    private final String user;
    /**
     * Creates new form AddMedicine
     */
    public AddMedicine() {
         this.setLocation(500, 250);
        this.setVisible(true);
        initComponents();
        user = Singleton.getInstance().getUser();
        pass = Singleton.getInstance().getPass();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textMedPrice = new javax.swing.JTextField();
        textMedExp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textMedName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        buttonMedAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel8.setText("Medicine");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 26, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Price");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 194, -1, -1));

        textMedPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedPriceActionPerformed(evt);
            }
        });
        getContentPane().add(textMedPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 217, 56, -1));

        textMedExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedExpActionPerformed(evt);
            }
        });
        getContentPane().add(textMedExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 217, 58, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("exp_date(yyyy-mm-dd)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 194, -1, -1));

        textMedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMedNameActionPerformed(evt);
            }
        });
        getContentPane().add(textMedName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 128, 58, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Med Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 105, -1, -1));

        buttonMedAdd.setText("Add");
        buttonMedAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedAddActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 251, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue_background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMedPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedPriceActionPerformed

    private void textMedExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedExpActionPerformed

    private void textMedNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMedNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMedNameActionPerformed

    private void buttonMedAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedAddActionPerformed
        // int id = Integer.parseInt(textMedMID.getText().trim());
        String name = textMedName.getText().trim();
        int price = Integer.parseInt(textMedPrice.getText().trim());
        java.sql.Date date = java.sql.Date.valueOf(textMedExp.getText().trim());

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy",user,pass);

            insert = con1.prepareStatement("insert into medicine(med_name,price,exp_date) values(?,?,?)");
            //insert.setInt(1, id);
            insert.setString(1, name);
            insert.setInt(2, price);
            insert.setDate(3,date);
            insert.executeUpdate();

            JOptionPane.showMessageDialog(this, "Success insertion");
        } catch (SQLException ex) {
            Logger.getLogger(Pharmacy.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_buttonMedAddActionPerformed

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
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMedAdd;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField textMedExp;
    private javax.swing.JTextField textMedName;
    private javax.swing.JTextField textMedPrice;
    // End of variables declaration//GEN-END:variables
}
