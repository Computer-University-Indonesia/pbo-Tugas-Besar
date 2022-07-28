/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Views;

import TugasBesar.Kelompok4.Sosmed.Controllers.AuthController;
import javax.swing.JFrame;

/**
 *
 * @author FRZ
 */
public class ForgetPasswordView extends javax.swing.JFrame {

    /**
     * Creates new form ForgetPasswordView
     */
    public ForgetPasswordView() {
        initComponents();
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        saveButton.setText("Save");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        newPasswordField = new javax.swing.JPasswordField();
        saveButton = new TugasBesar.Kelompok4.Sosmed.Componenets.ButtonPanel();
        copyright = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(21, 115, 255));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(700, 760));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(500, 660));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Lupa Password");
        Title.setPreferredSize(new java.awt.Dimension(300, 50));
        mainPanel.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        namaLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        namaLabel.setText("Nama");
        namaLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        mainPanel.add(namaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        newPasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        newPasswordLabel.setText("New Password");
        newPasswordLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        mainPanel.add(newPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        namaField.setToolTipText("");
        namaField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 115, 255), 2, true));
        namaField.setPreferredSize(new java.awt.Dimension(400, 50));
        namaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaFieldActionPerformed(evt);
            }
        });
        mainPanel.add(namaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        newPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 115, 255), 2, true));
        newPasswordField.setPreferredSize(new java.awt.Dimension(400, 50));
        mainPanel.add(newPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });
        mainPanel.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyright.setText("Copyright (c) 2022, FSociety");
        copyright.setPreferredSize(new java.awt.Dimension(300, 30));
        mainPanel.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, -1, -1));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        usernameLabel.setText("Username");
        usernameLabel.setPreferredSize(new java.awt.Dimension(200, 30));
        mainPanel.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        usernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 115, 255), 2, true));
        usernameField.setPreferredSize(new java.awt.Dimension(400, 50));
        mainPanel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        backgroundPanel.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaFieldActionPerformed

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ForgetPasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgetPasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgetPasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgetPasswordView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPasswordView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel copyright;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private TugasBesar.Kelompok4.Sosmed.Componenets.ButtonPanel saveButton;
    private javax.swing.JPasswordField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}