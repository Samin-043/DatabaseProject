/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class TransactionFrame extends javax.swing.JFrame {

    /**
     * Creates new form TransactionFrame
     */
    public TransactionFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        fillcombo_SupplierName();
        show_product();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox_Supplier = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton_Base = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Product_Stock = new javax.swing.JTextField();
        jTextField_Product_Unit = new javax.swing.JTextField();
        jTextField_Product_Amount = new javax.swing.JTextField();
        jComboBox_Product_Name = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("       Transaction");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jComboBox_Supplier.setMaximumRowCount(100);
        jComboBox_Supplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name" }));
        jComboBox_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SupplierActionPerformed(evt);
            }
        });

        jLabel2.setText("From :-");

        jRadioButton_Base.setText("Base");
        jRadioButton_Base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_BaseActionPerformed(evt);
            }
        });

        jLabel3.setText("        Type :-");

        jLabel4.setText("Product Name  :");

        jLabel5.setText("Product Stock  :");

        jLabel6.setText("      Amount       :");

        jLabel7.setText("         Unit            : ");

        jTextField_Product_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Product_StockActionPerformed(evt);
            }
        });

        jComboBox_Product_Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_Product_NameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox_Product_NameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBox_Product_NameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox_Product_NameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBox_Product_NameMouseReleased(evt);
            }
        });
        jComboBox_Product_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Product_NameActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton_Base, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jComboBox_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Product_Stock)
                    .addComponent(jTextField_Product_Unit)
                    .addComponent(jTextField_Product_Amount)
                    .addComponent(jComboBox_Product_Name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton_Base)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Product_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Product_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Product_Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Product_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SupplierActionPerformed


    }//GEN-LAST:event_jComboBox_SupplierActionPerformed

    private void jRadioButton_BaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_BaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_BaseActionPerformed

    private void jTextField_Product_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Product_StockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Product_StockActionPerformed

    private void jComboBox_Product_NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_Product_NameMouseClicked
        
        
        
    }//GEN-LAST:event_jComboBox_Product_NameMouseClicked

    private void jComboBox_Product_NameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_Product_NameMouseEntered
        
    }//GEN-LAST:event_jComboBox_Product_NameMouseEntered

    private void jComboBox_Product_NameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_Product_NameMouseExited
       
    }//GEN-LAST:event_jComboBox_Product_NameMouseExited

    private void jComboBox_Product_NameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_Product_NameMousePressed
       
    }//GEN-LAST:event_jComboBox_Product_NameMousePressed

    private void jComboBox_Product_NameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_Product_NameMouseReleased
        
    }//GEN-LAST:event_jComboBox_Product_NameMouseReleased

    private void jComboBox_Product_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Product_NameActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=WarehouseManagementSystem;selectMethod=cursor", "sa", "123467");
            Statement statement = connection.createStatement();
            
            String value1 = (String)jComboBox_Product_Name.getSelectedItem();
            
            System.out.println(value1);
            String query = "Select product_unit,product_price from product where product_name='"+value1+"'";
           
           ResultSet rs=statement.executeQuery(query);
            
            while(rs.next())
            {
                String pd_unit=rs.getString("product_unit");
                jTextField_Product_Unit.setText(pd_unit);
                
                String pd_price=rs.getString("product_price");
                jTextField_Product_Amount.setText(pd_price);
                
            }
            
         
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox_Product_NameActionPerformed

    private void fillcombo_SupplierName() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=WarehouseManagementSystem;selectMethod=cursor", "sa", "123467");
            Statement statement = connection.createStatement();
            String query = "Select name from supplier";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet res;
            res = ps.executeQuery();
            jRadioButton_Base.setSelected(false);
            
            while (res.next()) {
                String name = res.getString("name");
                jComboBox_Supplier.addItem(name);
                
               
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void show_product() {
        

        PreparedStatement ps;
         ResultSet res;
        //if (jRadioButton_Base.isSelected()) {
        boolean ck=false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=WarehouseManagementSystem;selectMethod=cursor", "sa", "123467");
            Statement statement = connection.createStatement();
            String query = "Select product_name from product";
            
            ps = connection.prepareStatement(query);       
            res = ps.executeQuery();
            jComboBox_Product_Name.addItem(" ");
            while (res.next()) {
                String pro_name = res.getString("product_name");
                jComboBox_Product_Name.addItem(pro_name);
               
            }

        } catch (Exception e) {
            e.printStackTrace();
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
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox_Product_Name;
    private javax.swing.JComboBox<String> jComboBox_Supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_Base;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Product_Amount;
    private javax.swing.JTextField jTextField_Product_Stock;
    private javax.swing.JTextField jTextField_Product_Unit;
    // End of variables declaration//GEN-END:variables
}
