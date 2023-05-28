/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerhardwarestore;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author fahee
 */
public class signInEmployee extends javax.swing.JFrame {

    /**
     * Creates new form signInEmployee
     */
    public signInEmployee() {
        initComponents();
    }

    String branchStore = "";
    Path path = Paths.get("D:\\employee.txt");
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        SubmitButton = new javax.swing.JButton();
        LoginLabel = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SignUpBox = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 720));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Admin LogIn");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(490, 550, 130, 30);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Manager LogIn ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(490, 520, 130, 30);

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));
        username.setText("User Name");
        username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(480, 340, 230, 40);

        jSeparator1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(320, 520, 430, 30);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        SubmitButton.setBackground(new java.awt.Color(255, 255, 255));
        SubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Sign-In");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(500, 470, 100, 40);

        LoginLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        LoginLabel.setText(" Employee Log-In");
        jPanel1.add(LoginLabel);
        LoginLabel.setBounds(350, 230, 380, 56);

        UserName.setFont(new java.awt.Font("Agency FB", 1, 26)); // NOI18N
        UserName.setText("User Name");
        UserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserNameMouseEntered(evt);
            }
        });
        jPanel1.add(UserName);
        UserName.setBounds(350, 340, 93, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHS.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 60, 430, 170);

        SignUpBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SignUpbox (1).png"))); // NOI18N
        SignUpBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpBoxMouseClicked(evt);
            }
        });
        jPanel1.add(SignUpBox);
        SignUpBox.setBounds(320, 50, 430, 530);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 1100, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButtonMouseClicked
        // TODO add your handling code here:
            try {
            Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            Statement stmt = mycon.createStatement();
            ResultSet result = stmt.executeQuery("select employee_username, shop_branch from employee_details");
            int count = 0;
            while (result.next()) {
                if((username.getText().equals(result.getString(1)))){
                    employee db1 = new employee();
                    this.hide();
                    db1.setVisible(true);
                    count = 1;
                    branchStore = result.getString(2);
                    try {
                        Files.writeString(path, branchStore, StandardCharsets.UTF_8);
                    }
                    catch (IOException ex) {
                        System.out.print("Invalid Path");
                    } 
                }
            }
            if(count==0){
                JOptionPane.showMessageDialog(null, "Invalid Username");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_SubmitButtonMouseClicked

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        // TODO add your handling code here:
        username.setText("");
    }//GEN-LAST:event_usernameMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void UserNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameMouseEntered

    private void SignUpBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpBoxMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
          signInManager dbaa1 = new signInManager ();
            this.hide();
            dbaa1.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
          signIn dbaa1 = new signIn ();
            this.hide();
            dbaa1.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(signInEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signInEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signInEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signInEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signInEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel SignUpBox;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
