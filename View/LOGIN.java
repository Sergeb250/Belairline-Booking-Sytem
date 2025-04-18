/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.UserDao;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import model.User;

/**
 *
 * @author Serge B
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        adminbtn = new javax.swing.JRadioButton();
        signup = new javax.swing.JButton();
        signin = new javax.swing.JButton();
        passTxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 153));
        jLabel3.setFont(new java.awt.Font("Wide Latin", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/airplane.png"))); // NOI18N
        jLabel3.setText("BELAIRLINES");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 28, 310, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/user.png"))); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 110, 130, 31));

        jLabel4.setBackground(new java.awt.Color(255, 255, 153));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/shield.png"))); // NOI18N
        jLabel4.setText("PassWord");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 31));
        jPanel1.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 30));

        adminbtn.setBackground(new java.awt.Color(255, 255, 153));
        adminbtn.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        adminbtn.setForeground(new java.awt.Color(102, 153, 0));
        adminbtn.setText("As Admin");
        adminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtnActionPerformed(evt);
            }
        });
        jPanel1.add(adminbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        signup.setBackground(new java.awt.Color(255, 255, 153));
        signup.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(102, 153, 0));
        signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/add.png"))); // NOI18N
        signup.setText("SignUp");
        signup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 91, -1));

        signin.setBackground(new java.awt.Color(255, 255, 153));
        signin.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        signin.setForeground(new java.awt.Color(102, 153, 0));
        signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/key.png"))); // NOI18N
        signin.setText("SignIn");
        signin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        jPanel1.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 91, -1));
        jPanel1.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 350, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons/istockphoto-619394704-1024x1024.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
        
         JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
        
         Register reg = new Register();
         reg.setVisible(true);
         
         currentFrame.dispose();
    }//GEN-LAST:event_signupActionPerformed

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        // TODO add your handling code here:
        
          String username = usernameTxt.getText().trim();
    String password = passTxt.getText().trim();

    // style for dialogs
    UIManager.put("OptionPane.background", new Color(255, 255, 153));
    UIManager.put("Panel.background", new Color(255, 255, 153));
    UIManager.put("OptionPane.messageForeground", new Color(0, 100, 0));
    UIManager.put("OptionPane.messageFont", new Font("SansSerif", Font.BOLD, 18));

    // Check if fields are empty
    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    // Admin login (only if admin radio button is selected)
    if (adminbtn.isSelected()) {
        if (username.equals("admin") && password.equals("54321")) {
            JOptionPane.showMessageDialog(this, "Welcome Admin!");
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            currentFrame.dispose();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect admin credentials.");
            return;
        }
    }

    // Normal user login
    UserDao dao = new UserDao();
    boolean isValid;
        isValid = dao.verifyLogin(username, password);

    if (isValid) {
        JOptionPane.showMessageDialog(this, "Login successful! Welcome to BelairLines.");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());

        
        Booking booking = new Booking(username); 
         
            new Booking(username).setVisible(true);
        

        currentFrame.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Incorrect username or password. Please try again.");
    }
        
        
               
  
        
        
    }//GEN-LAST:event_signinActionPerformed

    private void adminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminbtnActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JButton signin;
    private javax.swing.JButton signup;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
