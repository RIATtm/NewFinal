/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.awt.AWTUtilities;
import model.ProductQuaries;

/**
 *
 * @author AT
 */
public class Product_registry extends javax.swing.JFrame {

    /**
     * Creates new form Product_registry
     */
    public Product_registry() {
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

        jLayeredPane2 = new javax.swing.JLayeredPane();
        txt_proName = new javax.swing.JTextField();
        txt_type = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_proid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txt_proName.setBackground(new java.awt.Color(246, 246, 246));
        txt_proName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_proName.setBounds(580, 310, 320, 40);
        jLayeredPane2.add(txt_proName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txt_type.setBackground(new java.awt.Color(246, 246, 246));
        txt_type.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_type.setBounds(580, 350, 320, 40);
        jLayeredPane2.add(txt_type, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txt_price.setBackground(new java.awt.Color(246, 246, 246));
        txt_price.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_price.setBounds(580, 390, 320, 40);
        jLayeredPane2.add(txt_price, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txt_proid.setBackground(new java.awt.Color(246, 246, 246));
        txt_proid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_proid.setBounds(580, 270, 320, 40);
        jLayeredPane2.add(txt_proid, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addf.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addfg.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(740, 470, 240, 100);
        jLayeredPane2.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/home.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/homeg.png"))); // NOI18N
        jButton2.setBounds(140, 540, 180, 80);
        jLayeredPane2.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/back.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/backg.png"))); // NOI18N
        jButton3.setBounds(220, 630, 170, 70);
        jLayeredPane2.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addProduct.png"))); // NOI18N
        jLabel1.setBounds(0, 0, 1370, 770);
        jLayeredPane2.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1367, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String field[] = {txt_proid.getText(), txt_proName.getText(), txt_type.getText(), txt_price.getText()};
            ProductQuaries.save(field);
        } catch (Exception e) {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(Product_registry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_registry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_registry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_registry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                Product_registry add = new Product_registry();
                AWTUtilities.setWindowOpaque(add, false);
                add.setVisible(true);
             }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_proName;
    private javax.swing.JTextField txt_proid;
    private javax.swing.JTextField txt_type;
    // End of variables declaration//GEN-END:variables
}