
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naeem
 */
public class Adminlogin extends javax.swing.JFrame {

    /**
     * Creates new form Adminlogin
     */
    public Adminlogin() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        adminlogback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        adminname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        adminpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Administrator Login");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(12, 13, 482, 81);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Administrator Name: ");
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(77, 123, 259, 31);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(77, 161, 256, 37);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setText("Administrator Password: ");
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(77, 211, 304, 31);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Login");
        jPanel1.add(jButton1);
        jButton1.setBounds(77, 315, 143, 40);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(77, 260, 257, 34);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(347, 191, 0, 0);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 104, 0, 0);

        adminlogback.setBackground(new java.awt.Color(0, 153, 153));
        adminlogback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminlogback.setText("Back");
        adminlogback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminlogbackMouseClicked(evt);
            }
        });
        getContentPane().add(adminlogback);
        adminlogback.setBounds(200, 90, 110, 30);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        adminname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adminname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminnameActionPerformed(evt);
            }
        });
        jPanel2.add(adminname);
        adminname.setBounds(77, 161, 256, 37);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(77, 315, 143, 40);
        jPanel2.add(adminpass);
        adminpass.setBounds(77, 260, 257, 34);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Admin Login");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 20, 360, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Admin Name:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 110, 220, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Admin Password:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(80, 210, 220, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(396, 150, 410, 410);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main_background.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1190, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminlogbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminlogbackMouseClicked
       Restor r=new Restor();
      r.setSize(1200,750);
      r.setVisible(true);
      r.setLocationRelativeTo(null);  // TODO add your handling code here:
    }//GEN-LAST:event_adminlogbackMouseClicked

    private void adminnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

                 ResultSet rs = null;
        PreparedStatement pst = null;
       
        
        
         String sql = "select * from admin where aname = ? and pwd = ?";
        try
        {
            pst = Connect.ConnectDB().prepareStatement(sql);
            pst.setString(1, adminname.getText());
            String adminpwd= String.valueOf(adminpass.getPassword());
            pst.setString(2, adminpwd );
            rs = pst.executeQuery();
            if (rs.next())
            {
                //JOptionPane.showMessageDialog(null, "Username and Password correct");
                
                this.dispose();
                Adminmenu m=new Adminmenu();
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

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminlogback;
    private javax.swing.JTextField adminname;
    private javax.swing.JPasswordField adminpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
