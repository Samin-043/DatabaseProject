/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.jar.Attributes;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SupplierFrame extends javax.swing.JFrame {

    
    int supplieID=1;
    /**
     * Creates new form SupplierFrame
     */
    public SupplierFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 500);
        this.setLocationRelativeTo(null);
        
        showSupplier();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        address_box = new javax.swing.JComboBox<>();
        jButton_SupplierSave = new javax.swing.JButton();
        jButton_MenuPageBack = new javax.swing.JButton();
        txt_phone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel2.setText("Address");

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel4.setText("Email");

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_emailKeyPressed(evt);
            }
        });

        address_box.setMaximumRowCount(10);
        address_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chattogram,Bangladesh", "Rajshahi,Bangladesh", "Khulna,Bangladesh", "Barishal,Bangladesh", "Sylhet,Bangladesh", "Dhaka,Bangladesh", "Rangpur,Bangladesh", "Mymensingh,Bangladesh", " " }));

        jButton_SupplierSave.setBackground(new java.awt.Color(255, 102, 102));
        jButton_SupplierSave.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jButton_SupplierSave.setText("ADD");
        jButton_SupplierSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SupplierSaveActionPerformed(evt);
            }
        });

        jButton_MenuPageBack.setBackground(new java.awt.Color(255, 102, 102));
        jButton_MenuPageBack.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jButton_MenuPageBack.setText("Back");
        jButton_MenuPageBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MenuPageBackActionPerformed(evt);
            }
        });

        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phoneKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("              Supplier ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(354, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_MenuPageBack)
                .addGap(96, 96, 96)
                .addComponent(jButton_SupplierSave)
                .addGap(344, 344, 344))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_phone)
                            .addComponent(address_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_name)
                            .addComponent(txt_email)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(address_box, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_SupplierSave)
                    .addComponent(jButton_MenuPageBack))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void jButton_MenuPageBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MenuPageBackActionPerformed
        Menu_Frame mf=new Menu_Frame();
        mf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_MenuPageBackActionPerformed

    private void jButton_SupplierSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SupplierSaveActionPerformed
        
       try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url="jdbc:sqlserver://localhost:1433;databaseName=WarehouseManagementSystem;user=sa;password=123467";
                Connection con=DriverManager.getConnection(url);
                String query="insert into supplier(name,address_sup,phone_num,email)values(?,?,?,?)";
                PreparedStatement pst=con.prepareStatement(query);
                pst.setString(1,txt_name.getText());
                pst.setString(2,address_box.getSelectedItem().toString());
                pst.setString(3, txt_phone.getText());
                pst.setString(4, txt_email.getText());
                
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Inserted Succesfully");
                
       }
       catch (Exception e) 
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
        dispose();
    }//GEN-LAST:event_jButton_SupplierSaveActionPerformed

    private void txt_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyPressed
                 
                 String ph_num=txt_phone.getText();
                 int len=ph_num.length();
                 char ch=evt.getKeyChar();
                 
                 if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9')
                 {
                     if(len<11)
                     {
                         txt_phone.setEditable(true);
                     }
                     else   
                     {
                         txt_phone.setEditable(false);
                     }
                 }
                 
                 else
                 {
                     if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                     {
                         txt_phone.setEditable(true);
                     }
                     else
                     {
                         txt_phone.setEditable(false);
                     }  
                       
                 }
    }//GEN-LAST:event_txt_phoneKeyPressed

    private void txt_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyPressed
        /*String email;
        email=txt_email.getText();
        char ch=evt.getKeyChar();
        if(ch=='@')
        {
            txt_email.setEditable(false);
        }
        else   
        {
            txt_email.setEditable(true);
        }*/
    }//GEN-LAST:event_txt_emailKeyPressed

    
    public ArrayList<Supplier> supplierlist(){
            ArrayList<Supplier> supplierlist=new ArrayList<>();
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=WarehouseManagementSystem;selectMethod=cursor", "sa", "123467");
                Statement statement = connection.createStatement();
                
                ResultSet resultSet=statement.executeQuery("Select * from supplier");
                Supplier sp;
               
                
                while(resultSet.next())
                {
                   sp=new Supplier(resultSet.getInt("supplier_id"),resultSet.getString("name"), resultSet.getString("address_sup"),resultSet.getString("phone_num"), resultSet.getString("email"));
                   supplierlist.add(sp);
                   
                }
                
            }
            catch (Exception e) {
            e.printStackTrace();
           }
            
            return supplierlist;
    }
    
    public void showSupplier()
    {
        ArrayList<Supplier> suplist=supplierlist();
        //DefaultTableModel model=(DefaultTableModel)jTable_supplier.getModel();
        Object[] row=new Object[5];
        for(int i=0;i<suplist.size();i++)
        {
             row[0]=suplist.get(i).getsupplier_id();
             row[1]=suplist.get(i).getname();
             row[2]=suplist.get(i).getaddress();
             row[3]=suplist.get(i).getphone();
             row[4]=suplist.get(i).getemail();
             //model.addRow(row);
        }
    }
    
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
            java.util.logging.Logger.getLogger(SupplierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> address_box;
    private javax.swing.JButton jButton_MenuPageBack;
    private javax.swing.JButton jButton_SupplierSave;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
