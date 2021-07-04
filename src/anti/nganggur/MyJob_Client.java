package anti.nganggur;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class MyJob_Client extends javax.swing.JFrame {

    private DefaultTableModel  Table_Client;
    private String SQL; 
    private Login temp;
    public MyJob_Client() {
        initComponents();
        this.TampilData();
    }
    
    
    public void TampilData() {
        Table_Client = new DefaultTableModel();
        Table_Client.addColumn("Judul");
        Table_Client.addColumn("Jenis");
        Table_Client.addColumn("Deskripsi");
        Table_Client.addColumn("Tawaran Fee");
        Table_Client.addColumn("Freelancer");
        Table_Client.addColumn("Status");
        Table_Clientt.setModel(Table_Client);
        Connection conn = DBConnection.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from pekerjaan_client";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                Table_Client.addRow(new Object[]{
                    res.getString("Nama_Pekerjaan"),
                    res.getString("Jenis_Pekerjaan"),
                    res.getString("Deskripsi_Pekerjaan"),
                    res.getInt("Tawaran_Fee"),
                    res.getString("Username_Freelance"),
                    res.getString("Status_Pekerjaan")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Clientt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table_Clientt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Judul", "Jenis", "Deskripsi", "Tawaran_Fee", "Freelancer", "Status"
            }
        ));
        jScrollPane1.setViewportView(Table_Clientt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 760, 520));

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 70, 30));

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 130, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\akhma\\OneDrive\\Pictures\\Saved Pictures\\White.PNG")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 270, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anti/nganggur/MyJob_Client.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
     new Dashboard_Client().setVisible(true);
     dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     new Login().setVisible(true);
     dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJob_Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Clientt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
