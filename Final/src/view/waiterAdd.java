/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.quaries;

/**
 *
 * @author Naveen
 */
public class waiterAdd extends javax.swing.JFrame {

    /**
     * Creates new form waiterAdd
     */
    public waiterAdd() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtnic = new javax.swing.JTextField();
        ttname = new javax.swing.JTextField();
        jbf = new javax.swing.JRadioButton();
        jbm = new javax.swing.JRadioButton();
        txtmobile = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txthome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtnic.setBackground(new java.awt.Color(247, 247, 247));
        txtnic.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });
        txtnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnicKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnicKeyReleased(evt);
            }
        });
        txtnic.setBounds(360, 170, 330, 30);
        jLayeredPane1.add(txtnic, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ttname.setBackground(new java.awt.Color(247, 247, 247));
        ttname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ttname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ttnameKeyTyped(evt);
            }
        });
        ttname.setBounds(360, 210, 340, 30);
        jLayeredPane1.add(ttname, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbf.setBackground(new java.awt.Color(247, 247, 247));
        jbf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbf.setForeground(new java.awt.Color(0, 177, 255));
        jbf.setText("Female");
        jbf.setBounds(470, 260, 69, 25);
        jLayeredPane1.add(jbf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbm.setBackground(new java.awt.Color(247, 247, 247));
        jbm.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jbm.setForeground(new java.awt.Color(0, 177, 255));
        jbm.setText("Male");
        jbm.setBounds(370, 260, 55, 25);
        jLayeredPane1.add(jbm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtmobile.setBackground(new java.awt.Color(247, 247, 247));
        txtmobile.setText("+94");
        txtmobile.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmobileKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmobileKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmobileKeyReleased(evt);
            }
        });
        txtmobile.setBounds(360, 350, 340, 30);
        jLayeredPane1.add(txtmobile, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtaddress.setBackground(new java.awt.Color(247, 247, 247));
        txtaddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtaddress.setBounds(360, 430, 340, 30);
        jLayeredPane1.add(txtaddress, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(780, 570, 57, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txthome.setBackground(new java.awt.Color(247, 247, 247));
        txthome.setText("+94");
        txthome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txthome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txthomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthomeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthomeKeyTyped(evt);
            }
        });
        txthome.setBounds(360, 390, 170, 30);
        jLayeredPane1.add(txthome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/waiteradd..png"))); // NOI18N
        jLabel1.setBounds(10, 0, 1366, 768);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicActionPerformed

    private void txtnicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnicKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnicKeyTyped

    private void txtnicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnicKeyReleased

        if (txtnic.getCaretPosition() == 9) {
            if (txtnic.getText().lastIndexOf(" v") == -1) {
                txtnic.setText(txtnic.getText() + " v");
            }
            if (Integer.parseInt(txtnic.getText().substring(2, 5)) > 500) {
                //                if (Integer.parseInt(txtnic.getText().substring(0, 2)) + 1900 > new DateTime().getYear() - 23) {
                    jbf.setSelected(true);
                    //                }

            } else {
                jbm.setSelected(true);
            }
            if (ttname.getText().isEmpty()) {
            } else {
                if (Character.isLowerCase(ttname.getText().charAt(0))) {
                    ttname.setText(new String(String.valueOf(ttname.getText().charAt(0))).toUpperCase() + ttname.getText().substring(1));
                }
            }
        }
    }//GEN-LAST:event_txtnicKeyReleased

    private void ttnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttnameKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) | c == ' ')) {
            evt.consume();

        }
        if (ttname.getText().length() >= 40) {
            evt.consume();
        }
    }//GEN-LAST:event_ttnameKeyTyped

    private void txtmobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyPressed
        // TODO add your handling code here:

        if (txtmobile.getCaretPosition() <= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmobileKeyPressed

    private void txtmobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) | c == '+')) {
            evt.consume();
        }
        if (txtmobile.getText().length() == 12) {
            evt.consume();
        }

        if (txtmobile.getCaretPosition() == 3) {
            System.out.println("4");
            if (evt.getKeyChar() == '0') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtmobileKeyTyped

    private void txtmobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyReleased

    }//GEN-LAST:event_txtmobileKeyReleased
String m ="";
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            if (jbm.isSelected()) {
                m = "m";
            } else if (jbf.isSelected()) {
                m = "f";

            }
            String[] name = ttname.getText().split(" ");
            String feild[] = {txtnic.getText(), ttname.getText(), m, txtmobile.getText(), txthome.getText(), txtaddress.getText(), "dsds"};
            quaries.waitersave("labourer", feild);

            //        String[] ar={"123"z,"123","123","123","123","123","123","123","123","123","123"};
            //        quaries.autosave("usertype", ar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txthomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthomeKeyPressed
        // TODO add your handling code here:

        if (txthome.getCaretPosition() <= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txthomeKeyPressed

    private void txthomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthomeKeyReleased

    }//GEN-LAST:event_txthomeKeyReleased

    private void txthomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthomeKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) | c == '+')) {
            evt.consume();
        }
        if (txthome.getText().length() == 12) {
            evt.consume();
        }

        if (txthome.getCaretPosition() == 3) {

            if (evt.getKeyChar() == '0') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txthomeKeyTyped

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
            java.util.logging.Logger.getLogger(waiterAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(waiterAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(waiterAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(waiterAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new waiterAdd().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    public static javax.swing.JRadioButton jbf;
    public static javax.swing.JRadioButton jbm;
    public static javax.swing.JTextField ttname;
    public static javax.swing.JTextField txtaddress;
    public static javax.swing.JTextField txthome;
    public static javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtnic;
    // End of variables declaration//GEN-END:variables
}
