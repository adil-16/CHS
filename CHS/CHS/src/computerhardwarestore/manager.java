/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerhardwarestore;

/**
 *
 * @author fahee
 */
public class manager extends javax.swing.JFrame {

    /**
     * Creates new form manager
     */
    public manager() {
        initComponents();
        jPanel4.hide();
        jScrollPane2.hide();
        
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
        jLabel2 = new javax.swing.JLabel();
        LoginLabel = new javax.swing.JLabel();
        Employee = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Products = new javax.swing.JButton();
        Shop = new javax.swing.JButton();
        SignUpBox = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LogoutSymbol = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LoginLabel1 = new javax.swing.JLabel();
        LoginLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHS.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        LoginLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        LoginLabel.setText("Manager-Section");
        jPanel1.add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        Employee.setBackground(new java.awt.Color(0, 51, 51));
        Employee.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        Employee.setForeground(new java.awt.Color(255, 255, 255));
        Employee.setText("Employee");
        Employee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Employee.setContentAreaFilled(false);
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeMouseClicked(evt);
            }
        });
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 170, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 520, -1));

        Products.setBackground(new java.awt.Color(0, 51, 51));
        Products.setFont(new java.awt.Font("Agency FB", 0, 30)); // NOI18N
        Products.setForeground(new java.awt.Color(255, 255, 255));
        Products.setText("Product");
        Products.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Products.setContentAreaFilled(false);
        Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsMouseClicked(evt);
            }
        });
        Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsActionPerformed(evt);
            }
        });
        jPanel1.add(Products, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 170, -1));

        Shop.setBackground(new java.awt.Color(0, 51, 51));
        Shop.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        Shop.setForeground(new java.awt.Color(255, 255, 255));
        Shop.setText("Shop");
        Shop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Shop.setContentAreaFilled(false);
        Shop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShopMouseClicked(evt);
            }
        });
        Shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShopActionPerformed(evt);
            }
        });
        jPanel1.add(Shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 170, -1));

        SignUpBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SignUpbox (1).png"))); // NOI18N
        SignUpBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpBoxMouseClicked(evt);
            }
        });
        jPanel1.add(SignUpBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 430, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Group 8 (1).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DashBoard");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, -1));

        LogoutSymbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jPanel4.add(LogoutSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 30, 50));

        SubmitButton.setBackground(new java.awt.Color(0, 51, 51));
        SubmitButton.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Log-Out");
        SubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitButton.setContentAreaFilled(false);
        SubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButtonMouseClicked(evt);
            }
        });
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        jPanel4.add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 120, 50));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 300, -1));

        jScrollPane2.setViewportView(jPanel4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 600));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Group 8 (1).png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DataBaseBG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1060));

        LoginLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        LoginLabel1.setText("Admin-Section");
        jPanel1.add(LoginLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        LoginLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        LoginLabel2.setText("Admin-Section");
        jPanel1.add(LoginLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeMouseClicked

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
        // TODO add your handling code here:
         new managerEmployee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmployeeActionPerformed

    private void ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseClicked
        // TODO add your handling code here:

        new managerProduct().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductsMouseClicked

    private void ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductsActionPerformed

    private void ShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopMouseClicked
        // TODO add your handling code here:
        new managerShop().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ShopMouseClicked

    private void ShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShopActionPerformed

    private void SignUpBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpBoxMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jPanel4.hide();
        jScrollPane2.hide();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void SubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButtonMouseClicked
        new signIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SubmitButtonMouseClicked

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:

        jPanel4.setVisible(true);
        jScrollPane2.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Employee;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel LoginLabel1;
    private javax.swing.JLabel LoginLabel2;
    private javax.swing.JLabel LogoutSymbol;
    private javax.swing.JButton Products;
    private javax.swing.JButton Shop;
    private javax.swing.JLabel SignUpBox;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}