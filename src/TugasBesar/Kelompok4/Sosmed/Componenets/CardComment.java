/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Componenets;

/**
 *
 * @author FRZ
 */
public class CardComment extends javax.swing.JPanel {

    /**
     * Creates new form CardComment
     */
    public CardComment() {
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

        nama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comment = new javax.swing.JTextArea();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 100, true));
        setPreferredSize(new java.awt.Dimension(1200, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nama.setText("Nama");
        nama.setPreferredSize(new java.awt.Dimension(200, 50));
        add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1120, 80));

        comment.setColumns(20);
        comment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comment.setLineWrap(true);
        comment.setRows(3);
        jScrollPane1.setViewportView(comment);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea comment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nama;
    // End of variables declaration//GEN-END:variables
}