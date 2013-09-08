/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.awt.AWTUtilities;
import control.DBConnection;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Naveen
 */
public class controlPanel extends javax.swing.JFrame {

    String user = "Naveen";

    /**
     * Creates new form controlPanel
     */
    public controlPanel() {
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

        UserAccounts = new javax.swing.JLayeredPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        image = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ControlPanel = new javax.swing.JLayeredPane();
        changeUserName = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        image1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        txt_userName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        image.setBounds(80, 0, 140, 150);
        jDesktopPane1.add(image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane1.setBounds(820, 140, 220, 200);
        UserAccounts.add(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username.setBounds(230, 170, 450, 30);
        UserAccounts.add(username, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/change_pass.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/glow_pass.png"))); // NOI18N
        jButton1.setBounds(710, 360, 410, 100);
        UserAccounts.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/change_accpic.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/glow_accpic.png"))); // NOI18N
        jButton2.setBounds(250, 470, 410, 100);
        UserAccounts.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/change_status.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setBounds(710, 470, 410, 100);
        UserAccounts.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/delete.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/delete_glow.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(460, 590, 410, 100);
        UserAccounts.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/change_user.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/glow_user.png"))); // NOI18N
        jButton5.setBounds(250, 360, 410, 100);
        UserAccounts.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/control panel.png"))); // NOI18N
        jLabel1.setBounds(0, 0, 1366, 768);
        UserAccounts.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        image1.setBounds(0, 0, 220, 200);
        jDesktopPane2.add(image1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane2.setBounds(830, 200, 220, 200);
        jLayeredPane3.add(jDesktopPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/done_d.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/doneg1.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(440, 280, 250, 90);
        jLayeredPane3.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txt_userName.setBounds(230, 210, 450, 30);
        jLayeredPane3.add(txt_userName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images_controlPanel/userNameChange.png"))); // NOI18N
        jLabel2.setBounds(0, 0, 1366, 768);
        jLayeredPane3.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(0, 0, 1366, 768);
        changeUserName.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        changeUserName.setBounds(0, 0, 1366, 768);
        ControlPanel.add(changeUserName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String username = null;//current userName
        try {
            DBConnection.setConnection().createStatement().executeUpdate("UPDATE login set username='" + txt_userName.getText() + "' WHERE username='"+username+"'");
            JOptionPane.showMessageDialog(this, "User Name updated succesfully !", "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            if (!(txt_userName.getText() == null)) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(controlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new controlPanel().setVisible(true);
                controlPanel in = new controlPanel();
                AWTUtilities.setWindowOpaque(in, false);
                in.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ControlPanel;
    private javax.swing.JLayeredPane UserAccounts;
    private javax.swing.JLayeredPane changeUserName;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLabel txt_userName;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
    String jpath;

    public void search() {
        try {
            ResultSet rs = DBConnection.setConnection().createStatement().executeQuery("SELECT * FROM login WHERE username='" + user + "'");
            while (rs.next()) {
                username.setText(rs.getString("username"));
                //-------------FILE CHOOSER-------------------------------------
                JFileChooser jf = new JFileChooser();
                jf.showOpenDialog(this);
                File f = jf.getSelectedFile();
                String path = f.getAbsolutePath();
                path = path.replace("\\", "/");
                //-------------Showing the selected file------------------------
                File ff = new File(path);
                Image img = ImageIO.read(ff);
                img = img.getScaledInstance(image.WIDTH, image.HEIGHT, Image.SCALE_SMOOTH);
                image.setIcon(new ImageIcon(img));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
