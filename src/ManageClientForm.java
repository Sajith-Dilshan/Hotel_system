
import java.awt.Color;//
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;//
import javax.swing.JOptionPane;
import javax.swing.border.Border;//
import javax.swing.table.DefaultTableModel;
//import javax.swing.border.LineBorder;


public class ManageClientForm extends javax.swing.JFrame {

    CLIENTS client = new CLIENTS();
    
    
    public ManageClientForm() {
        initComponents();
        // add white  border to the clear fields button
                Border border =BorderFactory.createMatteBorder(2, 2, 2, 2, Color.white);
                jButton_clear.setBorder(border);
                
                
        //populate the jtable
        
        
        client.fillclientsdataJTable(jTable1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerate  by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jTextField_id = new javax.swing.JTextField();
        jLabel_id = new javax.swing.JLabel();
        jTextField_FName = new javax.swing.JTextField();
        jLabel_Fname = new javax.swing.JLabel();
        jTextField_LName = new javax.swing.JTextField();
        jLabel_Lname = new javax.swing.JLabel();
        jTextField_ContactNo = new javax.swing.JTextField();
        jLabel_contactNo = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel_email = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_add = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_remove = new javax.swing.JButton();
        jButton_clear = new javax.swing.JButton();
        jButton_Refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Manage Clients");

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack)
                .addGap(242, 242, 242)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBack)
                    .addComponent(jLabel1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel_id.setText("ID :");

        jLabel_Fname.setText("Frist Name :");

        jLabel_Lname.setText("Last Name :");

        jLabel_contactNo.setText("Contact No :");

        jLabel_email.setText("Email :");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First_Name", "Last_Name", "Contact_No", "Email"
            }
        )
        // make the jtable not editable
        {public boolean isCellEditable(int row, int column){return false;}}

    );
    jTable1.setGridColor(new java.awt.Color(255, 255, 0));
    jTable1.setSelectionBackground(new java.awt.Color(0, 204, 204));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButton_add.setBackground(new java.awt.Color(255, 255, 0));
    jButton_add.setText("Add New Client");
    jButton_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton_add.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_addActionPerformed(evt);
        }
    });

    jButton_edit.setBackground(new java.awt.Color(255, 255, 0));
    jButton_edit.setText("Edit");
    jButton_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton_edit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_editActionPerformed(evt);
        }
    });

    jButton_remove.setBackground(new java.awt.Color(255, 255, 0));
    jButton_remove.setText("Remove");
    jButton_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton_remove.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_removeActionPerformed(evt);
        }
    });

    jButton_clear.setBackground(new java.awt.Color(255, 51, 51));
    jButton_clear.setText("Clear Fields");
    jButton_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton_clear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_clearActionPerformed(evt);
        }
    });

    jButton_Refresh.setText("Refresh");
    jButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton_RefreshActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel_id)
                                        .addComponent(jLabel_Fname)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_Lname, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel_contactNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel_email, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField_id)
                                .addComponent(jTextField_FName)
                                .addComponent(jTextField_LName, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addComponent(jTextField_ContactNo)
                                .addComponent(jTextField_Email))))
                    .addGap(0, 32, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(24, 24, 24))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_id))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_Fname)
                        .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Lname))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel_contactNo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jTextField_ContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_email)
                        .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(107, 107, 107)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(26, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        // add a new client 
        
        // get data frome the fields
        int id = Integer.valueOf(jTextField_id.getText());
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String contact = jTextField_ContactNo.getText();
        String email = jTextField_Email.getText();
        
        try {
            
            
            if(fname.trim().equals("") || lname.trim().equals("") || contact.trim().equals("") || email.trim().equals("") ){
            
            
            JOptionPane.showMessageDialog(rootPane, "Fields are empty ", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            
            }else{
            
               if(client.addClient(id,fname,lname,contact,email))
               {
                //JOptionPane.showMessageDialog(rootpane, "New client added succeesfully ","Add clients", JOptioPane, 2);
                  JOptionPane.showMessageDialog(rootPane, "New client added succeesfully ", "Add client", JOptionPane.INFORMATION_MESSAGE);
               }
               else{
                  JOptionPane.showMessageDialog(rootPane, "New client Not added", "Add client", JOptionPane.ERROR_MESSAGE);
               }
            
            }
            
                 
        } catch (SQLException ex) {
            Logger.getLogger(ManageClientForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         
        
        
    }//GEN-LAST:event_jButton_addActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Display the selected row data in the jfields
        
        
        //get the jtable model
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        //get selected row index
        int rIndex = jTable1.getSelectedRow();
        
        //display data
        jTextField_id.setText(model.getValueAt(rIndex, 0).toString());
        jTextField_FName.setText(model.getValueAt(rIndex, 1).toString());
        jTextField_LName.setText(model.getValueAt(rIndex, 2).toString());
        jTextField_ContactNo.setText(model.getValueAt(rIndex,3).toString());
        jTextField_Email.setText(model.getValueAt(rIndex, 4).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        // edit a client details
       
        int id;
        id = Integer.valueOf (jTextField_id.getText());
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String contact = jTextField_ContactNo.getText();
        String email = jTextField_Email.getText();
        
        if(fname.trim().equals("") || lname.trim().equals("") || contact.trim().equals("") || email.trim().equals("") ){
            
            
            JOptionPane.showMessageDialog(rootPane, "Fields are empty ", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            
            }else{
            
            
            try {
                if(client.editClient(id,fname,lname,contact,email))
                {
                    //JOptionPane.showMessageDialog(rootpane, "New client added succeesfully ","Add clients", JOptioPane, 2);
                    JOptionPane.showMessageDialog(rootPane, "New data updated succeesfully ", "Update client", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "client data Not updated", "Update client", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ManageClientForm.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            
            }
        
        
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeActionPerformed
       
        int id;
        id = Integer.valueOf (jTextField_id.getText());
         if(client.removeClient(id))
                {
                    //JOptionPane.showMessageDialog(rootpane, "New client added succeesfully ","Add clients", JOptioPane, 2);
                    JOptionPane.showMessageDialog(rootPane, "client data deleted succeesfully ", "Remove client", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "client data Not deleted", "Remove client", JOptionPane.ERROR_MESSAGE);
                }
         
        
    }//GEN-LAST:event_jButton_removeActionPerformed

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        //clear textfields
        
        jTextField_id.setText("");
        jTextField_FName.setText("");
        jTextField_LName.setText("");
        jTextField_ContactNo.setText("");
        jTextField_Email.setText("");
        
        
        
    }//GEN-LAST:event_jButton_clearActionPerformed

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
//clear the jlable first
 jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID","First Name","Last Name","Phone","Email"}));

//populate the jtable
        client.fillclientsdataJTable(jTable1);
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        Mainform M = new Mainform();
                    M.setVisible(true);
                    M.pack();
                    M.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(ManageClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Fname;
    private javax.swing.JLabel jLabel_Lname;
    private javax.swing.JLabel jLabel_contactNo;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_ContactNo;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
