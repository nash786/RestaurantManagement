
import java.awt.*;
import java.sql.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naeem
 */
public class Customerlogin extends javax.swing.JFrame {

    /**
     * Creates new form Customerlogin
     */
    
    
    public Customerlogin() {
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

        jPanel1 = new javax.swing.JPanel();
        custname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        custpass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cloginback = new javax.swing.JButton();
        register = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        custname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        custname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custnameActionPerformed(evt);
            }
        });
        jPanel1.add(custname);
        custname.setBounds(77, 161, 256, 37);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(77, 315, 143, 40);
        jPanel1.add(custpass);
        custpass.setBounds(77, 260, 257, 34);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Customer Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 210, 250, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Customer Login");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 20, 390, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Customer Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 110, 220, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(396, 150, 410, 410);

        cloginback.setBackground(new java.awt.Color(0, 153, 153));
        cloginback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cloginback.setText("Back");
        cloginback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cloginbackMouseClicked(evt);
            }
        });
        cloginback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cloginbackActionPerformed(evt);
            }
        });
        getContentPane().add(cloginback);
        cloginback.setBounds(200, 100, 110, 30);

        register.setBackground(new java.awt.Color(0, 153, 153));
        register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register.setText("Sign up");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register);
        register.setBounds(870, 160, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Sign up");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(890, 110, 80, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Don't have an account?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(830, 70, 220, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1190, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custnameActionPerformed

    private void cloginbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cloginbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cloginbackActionPerformed

    private void cloginbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cloginbackMouseClicked
     this.dispose();
        Restor r=new Restor();
       r.setSize(1200,750);
        r.setVisible(true);
        r.setLocationRelativeTo(null);   // TODO add your handling code here:
    }//GEN-LAST:event_cloginbackMouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
      this.dispose();
        Custregister c=new Custregister();
       c.setSize(1200,750);
        c.setVisible(true);
        c.setLocationRelativeTo(null);  // TODO add your handling code here:
    }//GEN-LAST:event_registerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ResultSet rs = null;
        PreparedStatement pst = null;
       
        
        
         String sql = "select * from customer where cname = ? and pwd = ?";
        try
        {
            pst = Connect.ConnectDB().prepareStatement(sql);
            pst.setString(1, custname.getText());
            String customerpass= String.valueOf(custpass.getPassword());
            pst.setString(2, customerpass );
            rs = pst.executeQuery();
            if (rs.next())
            {
                //JOptionPane.showMessageDialog(null, "Username and Password correct");
                Menu menu;
                menu = new Menu(custname.getText(),String.valueOf(custpass.getPassword()));
                this.dispose();
                Menu m=new Menu();
                m.setSize(1200,775);
                m.setVisible(true);
                m.setLocationRelativeTo(null);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "invalid username and password");
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Customerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customerlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customerlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cloginback;
    private javax.swing.JTextField custname;
    private javax.swing.JPasswordField custpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
