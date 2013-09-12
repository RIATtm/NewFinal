/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.awt.AWTUtilities;
import control.DBConnection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Queries;

/**
 *
 * @author Naveen
 */
public class Login extends javax.swing.JFrame {

    private String user;
    private String password;
    boolean access;

    /**
     * Creates new form Login
     */
    public Login() {
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

        BGPane = new javax.swing.JLayeredPane();
        glassPane = new javax.swing.JLayeredPane();
        fieldPane = new javax.swing.JLayeredPane();
        txt_password = new javax.swing.JPasswordField();
        txt_userName = new javax.swing.JTextField();
        signIn = new javax.swing.JButton();
        woodyPad = new javax.swing.JLabel();
        glass = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txt_password.setBackground(new java.awt.Color(237, 228, 212));
        txt_password.setBorder(null);
        txt_password.setDisabledTextColor(new java.awt.Color(237, 228, 212));
        txt_password.setOpaque(false);
        txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passwordFocusLost(evt);
            }
        });
        txt_password.setBounds(200, 185, 200, 30);
        fieldPane.add(txt_password, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txt_userName.setBackground(new java.awt.Color(237, 228, 212));
        txt_userName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_userName.setBorder(null);
        txt_userName.setOpaque(false);
        txt_userName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_userNameFocusLost(evt);
            }
        });
        txt_userName.setBounds(200, 140, 200, 30);
        fieldPane.add(txt_userName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        signIn.setBorder(null);
        signIn.setContentAreaFilled(false);
        signIn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ss.png"))); // NOI18N
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        signIn.setBounds(250, 270, 120, 50);
        fieldPane.add(signIn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fieldPane.setBounds(10, 10, 610, 463);
        glassPane.add(fieldPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        woodyPad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        woodyPad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        woodyPad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        woodyPad.setBounds(0, 30, 620, 440);
        glassPane.add(woodyPad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        glass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/glass.png"))); // NOI18N
        glass.setBounds(0, 0, 770, 540);
        glassPane.add(glass, javax.swing.JLayeredPane.DEFAULT_LAYER);

        glassPane.setBounds(368, 140, 770, 540);
        BGPane.add(glassPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/72.png"))); // NOI18N
        BG.setBounds(0, 0, 1366, 768);
        BGPane.add(BG, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BGPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BGPane, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed

        if (txt_userName.getText().isEmpty() || new String(txt_password.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username or Password Cannot be Empty !!");
        } else {
            if (user == null && password == null) {
                try {
                    ResultSet auto = Queries.autoSearch("login", "username", "autoGen");
                    if (auto.next()) {
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password 1!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Database is Crashed !!");
                        txt_password.setVisible(false);
                    }

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Database is Crashed !!");
                    txt_password.setVisible(false);
                    //-------------------------------Admin
                }
            } else {
                if (access) {
                    //----------------------------------------------------------

                    try {
                        ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM userHistory WHERE userType_user_nic=(SELECT userType_user_nic FROM login WHERE username='" + txt_userName.getText() + "' AND password='" + new String(txt_password.getPassword()) + "')");
                        if (rs.next()) {
                            loginStatus = rs.getString("delStatus");

                            //------------------------------------------------
                            if (loginStatus.equals("Temporaly")) {
                                int lReply = JOptionPane.showConfirmDialog(this, "Your account has been deleted temporaly \n do you want to restore the account again?", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                if (lReply == JOptionPane.YES_OPTION) {
                                    try {
                                        ResultSet rss = DBConnection.setConnection().createStatement().executeQuery("SELECT *FROM Login WHERE username='" + txt_userName.getText() + "' AND password='" + new String(txt_password.getPassword()) + "'");
                                        if (rss.next()) {
                                            ControlPanel1 cp = new ControlPanel1(user);
                                            AWTUtilities.setWindowOpaque(cp, false);
                                            this.dispose();
                                            cp.setVisible(true);
                                        } else {
                                            i++;
                                            JOptionPane.showMessageDialog(this, "Username and Password did not match", "Warning", JOptionPane.WARNING_MESSAGE);
                                            if (i == 3) {
                                                int reply = JOptionPane.showConfirmDialog(this, "<html>You have reached the maximum number if errors<br>Do you wish to try again??</html>", "Confirmation message", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                                                if (reply == JOptionPane.YES_OPTION) {
                                                    txt_userName.setText(null);
                                                    txt_password.setText(null);
                                                    i = 0;
                                                } else if (reply == JOptionPane.NO_OPTION) {
                                                    this.dispose();
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                } else if (lReply == JOptionPane.NO_OPTION) {
                                    this.dispose();
                                }
                            } else if (loginStatus.equals("Permenantly")) {
                                JOptionPane.showMessageDialog(this, "Sorry you don't have permissions to login to the system", "Message", JOptionPane.ERROR_MESSAGE);
                                this.dispose();
                            }
                        } else {
                            try {
                                ResultSet rrs = DBConnection.setConnection().createStatement().executeQuery("SELECT *FROM Login WHERE username='" + txt_userName.getText() + "' AND password='" + new String(txt_password.getPassword()) + "'");
                                if (rrs.next()) {
                                    ControlPanel1 cp = new ControlPanel1(user);
                                    AWTUtilities.setWindowOpaque(cp, false);
                                    this.dispose();
                                    cp.setVisible(true);
                                } else {
                                    i++;
                                    JOptionPane.showMessageDialog(this, "Username and Password did not match", "Warning", JOptionPane.WARNING_MESSAGE);
                                    if (i == 3) {
                                        int reply = JOptionPane.showConfirmDialog(this, "<html>You have reached the maximum number if errors<br>Do you wish to try again??</html>", "Confirmation message", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                                        if (reply == JOptionPane.YES_OPTION) {
                                            txt_userName.setText(null);
                                            txt_password.setText(null);
                                            i = 0;
                                        } else if (reply == JOptionPane.NO_OPTION) {
                                            this.dispose();
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                    //----------------------------------------------------------
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password 2!");
                }
            }
        }
    }//GEN-LAST:event_signInActionPerformed

    private void txt_userNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userNameFocusLost
        try {
            ResultSet rs = Queries.autoSearch("login", "username", txt_userName.getText());
            if (rs.next()) {
                user = rs.getString("username");
                password = rs.getString("password");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fully Database is Crashed OUT!!");//----********** IF DB DOSEN'T EXISTS *************-------------
            txt_password.setVisible(false);

        }
    }//GEN-LAST:event_txt_userNameFocusLost

    private void txt_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusLost
        if (user == null && password == null) {
            if(txt_userName==null){
                JOptionPane.showMessageDialog(this, "Username cannot be null", "Message", JOptionPane.WARNING_MESSAGE);
            }
            if(txt_password==null){
                JOptionPane.showMessageDialog(this, "Password cannot be null", "Message", JOptionPane.WARNING_MESSAGE);
            }
            if(txt_userName==null && txt_password==null){
                JOptionPane.showMessageDialog(this, "Username and Password cannot be null", "Message", JOptionPane.WARNING_MESSAGE);
            }
            JOptionPane.showMessageDialog(this, "Username you enterd is incorrect", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (user == null && password == null ) {
            JOptionPane.showMessageDialog(this, "Username and Password cannot be null", "Message", JOptionPane.ERROR_MESSAGE);
        } else if (password.equals(new String(txt_password.getPassword()))) {
            access = true;
        } else if (password == null || user != null) {
            JOptionPane.showMessageDialog(this, "Password cannot be null", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (password != null || user == null) {
            JOptionPane.showMessageDialog(this, "Username cannot be null", "Message", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("hgv");
        }
    }//GEN-LAST:event_txt_passwordFocusLost

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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login l = new Login();
                AWTUtilities.setWindowOpaque(l, false);
                l.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLayeredPane BGPane;
    private javax.swing.JLayeredPane fieldPane;
    private javax.swing.JLabel glass;
    private javax.swing.JLayeredPane glassPane;
    private javax.swing.JButton signIn;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_userName;
    private javax.swing.JLabel woodyPad;
    // End of variables declaration//GEN-END:variables
    int i = 0;
    String loginStatus;
}