/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.awt.AWTUtilities;
import control.DBConnection;
import control.focus;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.invoice_quaries;

/**
 *
 * @author AT
 */
public class invoice extends javax.swing.JFrame {

    /**
     * Creates new form invoice
     */
    public invoice() {
        initComponents();
        m();
        visible();
    }

    public void visible() {
        txt_waiterno.setVisible(true);
        com_invoicewaiter.setVisible(true);
        invoice_id_bill.setVisible(false);
        invoice_id_takeaway.setVisible(false);
        invoice_id_treat.setVisible(false);
        txt_userNIC.setVisible(false);
        JB_labour.setVisible(false);
        JB_user.setVisible(false);
        com_treat.setVisible(false);
    }

    public void treatVisible(){
        txt_waiterno.setVisible(false);
        com_invoicewaiter.setVisible(false);
        txt_userNIC.setVisible(true);
        JB_labour.setVisible(true);
        JB_user.setVisible(true);
        com_treat.setVisible(true);
        invoice_id_treat.setVisible(true);
        invoice_id_bill.setVisible(false);
        invoice_id_takeaway.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        txt_item = new javax.swing.JTextField();
        combo_item = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_qty = new javax.swing.JTextField();
        txt_userNIC = new javax.swing.JTextField();
        com_treat = new javax.swing.JComboBox();
        JB_labour = new javax.swing.JRadioButton();
        JB_user = new javax.swing.JRadioButton();
        txt_waiterno = new javax.swing.JTextField();
        com_invoicewaiter = new javax.swing.JComboBox();
        txt_grandTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        invoice_id_bill = new javax.swing.JLabel();
        invoice_id_takeaway = new javax.swing.JLabel();
        invoice_id_treat = new javax.swing.JLabel();
        JB_Bill = new javax.swing.JRadioButton();
        JB_Takeway = new javax.swing.JRadioButton();
        JB_treatBill = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButton2.setText("delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(520, 620, 63, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txt_item.setBackground(new java.awt.Color(246, 246, 246));
        txt_item.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_item.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_itemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_itemKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_itemKeyTyped(evt);
            }
        });
        txt_item.setBounds(240, 180, 240, 40);
        jLayeredPane1.add(txt_item, javax.swing.JLayeredPane.DEFAULT_LAYER);

        combo_item.setBackground(new java.awt.Color(246, 246, 246));
        combo_item.setEditable(true);
        combo_item.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        combo_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_itemMouseClicked(evt);
            }
        });
        combo_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_itemActionPerformed(evt);
            }
        });
        combo_item.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combo_itemFocusGained(evt);
            }
        });
        combo_item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_itemKeyPressed(evt);
            }
        });
        combo_item.setBounds(250, 190, 210, 20);
        jLayeredPane1.add(combo_item, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable1.setBackground(new java.awt.Color(246, 246, 246));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Item ID", "Item", "Quantity", "Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setResizable(false);

        jScrollPane1.setBounds(250, 230, 830, 330);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txt_qty.setBackground(new java.awt.Color(246, 246, 246));
        txt_qty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_qty.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtyActionPerformed(evt);
            }
        });
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_qtyKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_qtyKeyTyped(evt);
            }
        });
        txt_qty.setBounds(620, 180, 210, 40);
        jLayeredPane1.add(txt_qty, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txt_userNIC.setBackground(new java.awt.Color(246, 246, 246));
        txt_userNIC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_userNIC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_userNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userNICActionPerformed(evt);
            }
        });
        txt_userNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_userNICKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_userNICKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_userNICKeyTyped(evt);
            }
        });
        txt_userNIC.setBounds(360, 130, 180, 30);
        jLayeredPane1.add(txt_userNIC, javax.swing.JLayeredPane.DEFAULT_LAYER);

        com_treat.setEditable(true);
        com_treat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_treatActionPerformed(evt);
            }
        });
        com_treat.setBounds(360, 130, 180, 30);
        jLayeredPane1.add(com_treat, javax.swing.JLayeredPane.DEFAULT_LAYER);

        JB_labour.setBackground(new java.awt.Color(246, 246, 246));
        buttonGroup2.add(JB_labour);
        JB_labour.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JB_labour.setForeground(new java.awt.Color(0, 177, 255));
        JB_labour.setText("Labour");
        JB_labour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_labourActionPerformed(evt);
            }
        });
        JB_labour.setBounds(610, 130, 70, 25);
        jLayeredPane1.add(JB_labour, javax.swing.JLayeredPane.DEFAULT_LAYER);

        JB_user.setBackground(new java.awt.Color(246, 246, 246));
        buttonGroup2.add(JB_user);
        JB_user.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JB_user.setForeground(new java.awt.Color(0, 177, 255));
        JB_user.setText("User");
        JB_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_userActionPerformed(evt);
            }
        });
        JB_user.setBounds(550, 130, 55, 25);
        jLayeredPane1.add(JB_user, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txt_waiterno.setBackground(new java.awt.Color(246, 246, 246));
        txt_waiterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_waiterno.setText("W");
        txt_waiterno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_waiterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_waiternoActionPerformed(evt);
            }
        });
        txt_waiterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_waiternoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_waiternoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_waiternoKeyTyped(evt);
            }
        });
        txt_waiterno.setBounds(470, 130, 200, 30);
        jLayeredPane1.add(txt_waiterno, javax.swing.JLayeredPane.DEFAULT_LAYER);

        com_invoicewaiter.setBackground(new java.awt.Color(246, 246, 246));
        com_invoicewaiter.setEditable(true);
        com_invoicewaiter.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        com_invoicewaiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_invoicewaiterActionPerformed(evt);
            }
        });
        com_invoicewaiter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                com_invoicewaiterKeyReleased(evt);
            }
        });
        com_invoicewaiter.setBounds(470, 130, 200, 30);
        jLayeredPane1.add(com_invoicewaiter, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txt_grandTotal.setEditable(false);
        txt_grandTotal.setBackground(new java.awt.Color(246, 246, 246));
        txt_grandTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_grandTotal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_grandTotal.setBounds(1000, 180, 180, 40);
        jLayeredPane1.add(txt_grandTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Genarate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(360, 610, 80, 40);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        invoice_id_bill.setText("bill");
        invoice_id_bill.setBounds(170, 130, 120, 30);
        jLayeredPane1.add(invoice_id_bill, javax.swing.JLayeredPane.DEFAULT_LAYER);

        invoice_id_takeaway.setText("takeaway");
        invoice_id_takeaway.setBounds(170, 130, 120, 30);
        jLayeredPane1.add(invoice_id_takeaway, javax.swing.JLayeredPane.DEFAULT_LAYER);

        invoice_id_treat.setText("treat");
        invoice_id_treat.setBounds(170, 130, 120, 30);
        jLayeredPane1.add(invoice_id_treat, javax.swing.JLayeredPane.DEFAULT_LAYER);

        JB_Bill.setBackground(new java.awt.Color(246, 246, 246));
        buttonGroup1.add(JB_Bill);
        JB_Bill.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JB_Bill.setForeground(new java.awt.Color(0, 177, 255));
        JB_Bill.setText("Bill");
        JB_Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BillActionPerformed(evt);
            }
        });
        JB_Bill.setBounds(770, 130, 43, 25);
        jLayeredPane1.add(JB_Bill, javax.swing.JLayeredPane.DEFAULT_LAYER);

        JB_Takeway.setBackground(new java.awt.Color(246, 246, 246));
        buttonGroup1.add(JB_Takeway);
        JB_Takeway.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JB_Takeway.setForeground(new java.awt.Color(0, 177, 255));
        JB_Takeway.setText("Take Away");
        JB_Takeway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_TakewayActionPerformed(evt);
            }
        });
        JB_Takeway.setBounds(850, 130, 110, 25);
        jLayeredPane1.add(JB_Takeway, javax.swing.JLayeredPane.DEFAULT_LAYER);

        JB_treatBill.setBackground(new java.awt.Color(246, 246, 246));
        buttonGroup1.add(JB_treatBill);
        JB_treatBill.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JB_treatBill.setForeground(new java.awt.Color(0, 177, 255));
        JB_treatBill.setText("Treat");
        JB_treatBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_treatBillActionPerformed(evt);
            }
        });
        JB_treatBill.setBounds(980, 130, 60, 25);
        jLayeredPane1.add(JB_treatBill, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoice.png"))); // NOI18N
        jLabel2.setBounds(0, 0, 1370, 770);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_itemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_itemKeyPressed
        if (!(txt_item.getText().isEmpty())) {
            focus.textFieldsNext(evt, txt_item, txt_item);
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            combo_item.grabFocus();
            combo_item.showPopup();

        }
    }//GEN-LAST:event_txt_itemKeyPressed

    private void txt_itemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_itemKeyReleased
        try {
            String field = txt_item.getText();
            ResultSet rs = invoice_quaries.invoiceSeach(field);
            Vector v = new Vector();
            while (rs.next()) {
                v.add(rs.getString(2));
            }
            combo_item.setModel(new DefaultComboBoxModel(v));
            combo_item.showPopup();




        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_itemKeyReleased

    private void txt_itemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_itemKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) | Character.isLetter(c) | c == ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_itemKeyTyped

    private void combo_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_itemMouseClicked
    }//GEN-LAST:event_combo_itemMouseClicked

    private void combo_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_itemActionPerformed
        txt_item.setText(combo_item.getSelectedItem().toString());
    }//GEN-LAST:event_combo_itemActionPerformed

    private void txt_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyPressed

        if (!(txt_qty.equals(null))) {
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            int i = dt.getRowCount();
            i++;
            if (evt.getKeyCode() == evt.VK_ENTER) {

                try {
                    String field1 = txt_item.getText();
                    ResultSet rs = invoice_quaries.invoiceTable(field1);
                    Vector v = new Vector();
                    while (rs.next()) {
                        v.add(i);
                        v.add(rs.getString(1));
                        v.add(rs.getString(2));
                        v.add(txt_qty.getText());
                        v.add(rs.getString(4));
                        //-----------------------calculating total------------------
                        int getQty = Integer.parseInt(txt_qty.getText());
                        double price = Double.parseDouble(rs.getString(4));
                        double total = getQty * price;
                        //----------------------------------------------------------
                        v.add(total);
                        dt.addRow(v);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                double tot = 0;
                for (int a = 0; a < dt.getRowCount(); a++) {
                    if (!(dt.getValueAt(a, 5).equals(null))) {
                        double cellTot = Double.parseDouble(dt.getValueAt(a, 5).toString());
                        tot += cellTot;
                        txt_grandTotal.setText(tot + "");
                    }
                }
                focus.textFieldsNext(evt, JB_treatBill, txt_item);
                txt_item.setText(null);
                txt_qty.setText(null);
            }
        }
    }//GEN-LAST:event_txt_qtyKeyPressed

    private void txt_waiternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_waiternoKeyPressed

        int i = evt.getKeyCode();
        if (txt_waiterno.getCaretPosition() <= 1) {
            evt.consume();
        }
        if (i == 17 || i == 127 || !(i == 8)) {
            evt.consume();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            com_invoicewaiter.grabFocus();
            com_invoicewaiter.showPopup();

        }

    }//GEN-LAST:event_txt_waiternoKeyPressed

    private void txt_waiternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_waiternoActionPerformed
        txt_waiterno.setText(com_invoicewaiter.getSelectedItem().toString());
    }//GEN-LAST:event_txt_waiternoActionPerformed

    private void txt_waiternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_waiternoKeyReleased
        try {
            String field2 = txt_waiterno.getText();
            ResultSet rs = invoice_quaries.invoiceWaiter(field2);
            Vector v = new Vector();
            while (rs.next()) {

                v.add(rs.getString(1));
            }
            com_invoicewaiter.setModel(new DefaultComboBoxModel(v));
            com_invoicewaiter.showPopup();
            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                com_invoicewaiter.grabFocus();
                com_invoicewaiter.showPopup();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //ok
    }//GEN-LAST:event_txt_waiternoKeyReleased

    private void com_invoicewaiterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_com_invoicewaiterKeyReleased
    }//GEN-LAST:event_com_invoicewaiterKeyReleased

    private void com_invoicewaiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_invoicewaiterActionPerformed
        txt_waiterno.setText(com_invoicewaiter.getSelectedItem().toString());
    }//GEN-LAST:event_com_invoicewaiterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (JB_Bill.isSelected()) {
            //------------------------------------Should Insert Date and time fields--------------------------

            String field3[] = {invoice_id_bill.getText(), txt_grandTotal.getText(), " 3 ", txt_waiterno.getText()};


            try {
                invoice_quaries.invoiceaddDb(field3);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();

            int a = dt.getRowCount();

            for (int b = 0; b < a; b++) {
                String r = dt.getValueAt(b, 0).toString();
                String r1 = dt.getValueAt(b, 1).toString();
                String r2 = dt.getValueAt(b, 2).toString();
                String r3 = dt.getValueAt(b, 3).toString();
                String r4 = dt.getValueAt(b, 4).toString();
                String r5 = dt.getValueAt(b, 5).toString();
                try {
                    DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO invoice_reg VALUES ('" + invoice_id_bill.getText() + "','" + r + "','" + r1 + "','" + r2 + "','" + r3 + "','" + r4 + "','" + r5 + "')");
                    txt_waiterno.setText(null);
                    txt_grandTotal.setText(null);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        if (JB_Takeway.isSelected()) {
            //---------
            String field3[] = {invoice_id_takeaway.getText(), txt_grandTotal.getText(), " 3 ", "YES"};
            
            

            try {
                invoice_quaries.invoiceTakeAdd(field3);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();

            int a = dt.getRowCount();

            for (int b = 0; b < a; b++) {
                String r = dt.getValueAt(b, 0).toString();
                String r1 = dt.getValueAt(b, 1).toString();
                String r2 = dt.getValueAt(b, 2).toString();
                String r3 = dt.getValueAt(b, 3).toString();
                String r4 = dt.getValueAt(b, 4).toString();
                String r5 = dt.getValueAt(b, 5).toString();
                
                try {
                    DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO invoice_reg VALUES ('" + invoice_id_takeaway.getText() + "','" + r + "','" + r1 + "','" + r2 + "','" + r3 + "','" + r4 + "','" + r5 + "')");
                    txt_waiterno.setText(null);
                    txt_grandTotal.setText(null);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        if (JB_treatBill.isSelected()) {
            if (JB_user.isSelected()) {
                //---------
                try {
                    String field3[] = {invoice_id_treat.getText(), txt_grandTotal.getText(), " 3 ", txt_userNIC.getText(), null};
                    invoice_quaries.invoiceTreatAdd(field3);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (JB_labour.isSelected()) {
                //---------
                try {
                    String field2 = txt_userNIC.getText();
                    ResultSet rs = invoice_quaries.invoiceSearchLabour(field2);
                    while (rs.next()) {
                        String id = rs.getString(1);

                        String field3[] = {invoice_id_treat.getText(), txt_grandTotal.getText(), " 3 ", null, id};

                        invoice_quaries.invoiceTreatAdd(field3);

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();

        int a = dt.getRowCount();

        for (int b = 0; b < a; b++) {
            String r = dt.getValueAt(b, 0).toString();
            String r1 = dt.getValueAt(b, 1).toString();
            String r2 = dt.getValueAt(b, 2).toString();
            String r3 = dt.getValueAt(b, 3).toString();
            String r4 = dt.getValueAt(b, 4).toString();
            String r5 = dt.getValueAt(b, 5).toString();
            try {
                DBConnection.setConnection().createStatement().executeUpdate("INSERT INTO invoice_reg VALUES ('" + invoice_id_treat.getText() + "','" + r + "','" + r1 + "','" + r2 + "','" + r3 + "','" + r4 + "','" + r5 + "')");
                txt_waiterno.setText(null);
                txt_grandTotal.setText(null);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        }



    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_waiternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_waiternoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_waiternoKeyTyped

    private void txt_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_qtyKeyTyped

    private void combo_itemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combo_itemFocusGained
    }//GEN-LAST:event_combo_itemFocusGained

    private void combo_itemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_itemKeyPressed
    }//GEN-LAST:event_combo_itemKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        int i = jTable1.getSelectedRow();
        dt.removeRow(i);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qtyActionPerformed

    private void txt_userNICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userNICKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userNICKeyPressed

    private void txt_userNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userNICKeyReleased
        try {
            String field2 = txt_userNIC.getText();
            if (JB_user.isSelected()) {
                ResultSet rs = invoice_quaries.invoiceSearchUser(field2);
                Vector v = new Vector();
                while (rs.next()) {

                    v.add(rs.getString(1));
                }
                com_treat.setModel(new DefaultComboBoxModel(v));
                com_treat.showPopup();
            }
            if (JB_labour.isSelected()) {
                ResultSet rs = invoice_quaries.invoiceSearchLabour(field2);
                Vector v = new Vector();
                while (rs.next()) {
                    v.add(rs.getString(2));
                }
                com_treat.setModel(new DefaultComboBoxModel(v));
                com_treat.showPopup();
            }
            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                com_treat.grabFocus();
                com_treat.showPopup();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (evt.getKeyCode() == KeyEvent.VK_PAGE_UP) {
            JB_user.setSelected(true);
        }
        if (evt.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
            JB_labour.setSelected(true);
        }
    }//GEN-LAST:event_txt_userNICKeyReleased

    private void txt_userNICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userNICKeyTyped
        if (txt_userNIC.getCaretPosition() == 9) {
            if (txt_userNIC.getText().lastIndexOf(" v") == -1) {
                txt_userNIC.setText(txt_userNIC.getText() + " v");
            }
        }


    }//GEN-LAST:event_txt_userNICKeyTyped

    private void txt_userNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userNICActionPerformed
    }//GEN-LAST:event_txt_userNICActionPerformed

    private void JB_BillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BillActionPerformed
        visible();
        invoice_id_bill.setVisible(true);
    }//GEN-LAST:event_JB_BillActionPerformed

    private void JB_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_userActionPerformed

    private void JB_labourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_labourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_labourActionPerformed

    private void JB_treatBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_treatBillActionPerformed
        treatVisible();
    }//GEN-LAST:event_JB_treatBillActionPerformed

    private void JB_TakewayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_TakewayActionPerformed
        visible();
        invoice_id_takeaway.setVisible(true);
    }//GEN-LAST:event_JB_TakewayActionPerformed

    private void com_treatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_treatActionPerformed
        txt_userNIC.setText(com_treat.getSelectedItem().toString());
    }//GEN-LAST:event_com_treatActionPerformed

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
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new invoice().setVisible(true);
                invoice in = new invoice();
                AWTUtilities.setWindowOpaque(in, false);
                in.setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JB_Bill;
    private javax.swing.JRadioButton JB_Takeway;
    private javax.swing.JRadioButton JB_labour;
    private javax.swing.JRadioButton JB_treatBill;
    private javax.swing.JRadioButton JB_user;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox com_invoicewaiter;
    private javax.swing.JComboBox com_treat;
    private javax.swing.JComboBox combo_item;
    private javax.swing.JLabel invoice_id_bill;
    private javax.swing.JLabel invoice_id_takeaway;
    private javax.swing.JLabel invoice_id_treat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_grandTotal;
    private javax.swing.JTextField txt_item;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_userNIC;
    private javax.swing.JTextField txt_waiterno;
    // End of variables declaration//GEN-END:variables
    JTextField cb;

    public void m() {
        try {
            cb = (JTextField) combo_item.getEditor().getEditorComponent();
            cb.addKeyListener((KeyAdapter) new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent ev) {
                    if (ev.getKeyCode() == KeyEvent.VK_ENTER) {
                        txt_qty.grabFocus();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
