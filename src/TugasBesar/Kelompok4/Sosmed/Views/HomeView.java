/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Views;

import TugasBesar.Kelompok4.Sosmed.Componenets.*;
import TugasBesar.Kelompok4.Sosmed.Constants.Authentication;
import TugasBesar.Kelompok4.Sosmed.Controllers.PostController;
import java.awt.Color;
import java.util.Stack;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;

/**
 *
 * @author sahanya
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    PostController controller;
    

    public HomeView() {
        initComponents();
        this.setResizable(false);
        controller = new PostController();
        homeButton.setText("Home");
        profileButton.setText("Profile");
        homeButton.isAtctive(true);
        nama.setText(Authentication.getName());
        loadPost();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profileButton = new TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel();
        homeButton = new TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        backgroundPanel = new javax.swing.JPanel();
        namaPanel = new javax.swing.JPanel();
        nama = new javax.swing.JLabel();
        backgroundTitle = new javax.swing.JPanel();
        titleField = new javax.swing.JTextField();
        backgroundPost = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        postField = new javax.swing.JTextArea();
        postButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1440, 984));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(21, 115, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1440, 100));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FSociety");
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        profileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileButtonMouseClicked(evt);
            }
        });
        jPanel3.add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, -1));

        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        jPanel3.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 884));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1440, 600));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(jPanel6);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 125, true));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(1400, 250));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaPanel.setBackground(new java.awt.Color(241, 241, 241));
        namaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 50, true));
        namaPanel.setPreferredSize(new java.awt.Dimension(300, 50));
        namaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nama.setText("Nama");
        nama.setPreferredSize(new java.awt.Dimension(260, 50));
        namaPanel.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        backgroundPanel.add(namaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        backgroundTitle.setBackground(new java.awt.Color(241, 241, 241));
        backgroundTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 50, true));
        backgroundTitle.setPreferredSize(new java.awt.Dimension(300, 50));
        backgroundTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleField.setText("Title");
        titleField.setBorder(null);
        titleField.setPreferredSize(new java.awt.Dimension(260, 50));
        titleField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleFieldMouseClicked(evt);
            }
        });
        backgroundTitle.add(titleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        backgroundPanel.add(backgroundTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        backgroundPost.setBackground(new java.awt.Color(241, 241, 241));
        backgroundPost.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 50, true));
        backgroundPost.setPreferredSize(new java.awt.Dimension(1360, 100));
        backgroundPost.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        postField.setColumns(20);
        postField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        postField.setRows(5);
        jScrollPane2.setViewportView(postField);

        backgroundPost.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1320, 100));

        backgroundPanel.add(backgroundPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        postButton.setBackground(new java.awt.Color(241, 241, 241));
        postButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 115, 255), 25, true));
        postButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        postButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                postButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                postButtonMouseExited(evt);
            }
        });
        postButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Post");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        postButton.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        backgroundPanel.add(postButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 200, -1, -1));

        jPanel1.add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ProfileView().setVisible(true);

    }//GEN-LAST:event_profileButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
        profileButton.isAtctive(false);
        homeButton.isAtctive(true);

    }//GEN-LAST:event_homeButtonMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        String[] inputs = {titleField.getText(), postField.getText()};

        controller.store(inputs);
        loadPost();
        this.titleField.setText("Title");
        this.postField.setText("");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:

        postButton.setBorder(new LineBorder(new Color(1, 95, 235), 25, true));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        postButton.setBorder(new LineBorder(new Color(21, 115, 255), 25, true));
    }//GEN-LAST:event_jLabel2MouseExited

    private void postButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_postButtonMouseClicked

    private void postButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postButtonMouseEntered
        // TODO add your handling code here:
        postButton.setBorder(new LineBorder(new Color(1, 95, 235), 25, true));
        System.out.println("mouse enter");
    }//GEN-LAST:event_postButtonMouseEntered

    private void postButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postButtonMouseExited
        // TODO add your handling code here:
        postButton.setBorder(new LineBorder(new Color(21, 115, 255), 25, true));
    }//GEN-LAST:event_postButtonMouseExited

    private void titleFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleFieldMouseClicked
        // TODO add your handling code here:
        this.titleField.setText("");
    }//GEN-LAST:event_titleFieldMouseClicked

    /**
     * @param args the command line arguments
     */
    public void loadPost() {
        Stack<Stack> data = controller.get();
        jPanel6.setLayout(new BoxLayout(jPanel6, BoxLayout.Y_AXIS));

        jPanel6.removeAll();
        jPanel6.revalidate();
        for (Stack<String> row : data) {
            CardPanel card = new CardPanel();
            card.setId(row.get(4));
            card.setName(row.get(0));
            card.setTitle(row.get(1));
            card.setDesc(row.get(2));
            card.setDate(row.get(3));
            card.setLikeCount(row.get(5));

            jPanel6.add(card);
        }
//        jPanel6.revalidate();
    }

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel backgroundPost;
    private javax.swing.JPanel backgroundTitle;
    private TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nama;
    private javax.swing.JPanel namaPanel;
    private javax.swing.JPanel postButton;
    private javax.swing.JTextArea postField;
    private TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel profileButton;
    private javax.swing.JTextField titleField;
    // End of variables declaration//GEN-END:variables
}
