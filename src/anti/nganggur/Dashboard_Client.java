package anti.nganggur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Dashboard_Client extends javax.swing.JFrame {
    Login Temp;
    public Dashboard_Client() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Done_Button = new javax.swing.JButton();
        Job_BTN = new javax.swing.JButton();
        MyJob_BTN = new javax.swing.JButton();
        Balance_BTN = new javax.swing.JButton();
        Setting_BTN = new javax.swing.JButton();
        Text_NamaPekerjaan = new javax.swing.JTextField();
        Text_Deksripksi = new javax.swing.JTextField();
        Text_Fee = new javax.swing.JTextField();
        Text_JenisPekerjaan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Text_Id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 130, 40));

        Done_Button.setBorder(null);
        Done_Button.setContentAreaFilled(false);
        Done_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Done_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Done_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 770, 150, 40));

        Job_BTN.setContentAreaFilled(false);
        getContentPane().add(Job_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 70, 30));

        MyJob_BTN.setToolTipText("");
        MyJob_BTN.setContentAreaFilled(false);
        MyJob_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyJob_BTNActionPerformed(evt);
            }
        });
        getContentPane().add(MyJob_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 80, 30));

        Balance_BTN.setContentAreaFilled(false);
        Balance_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Balance_BTNMouseClicked(evt);
            }
        });
        getContentPane().add(Balance_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 100, 30));

        Setting_BTN.setContentAreaFilled(false);
        Setting_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Setting_BTNMouseClicked(evt);
            }
        });
        getContentPane().add(Setting_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 90, 30));

        Text_NamaPekerjaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NamaPekerjaanActionPerformed(evt);
            }
        });
        getContentPane().add(Text_NamaPekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 540, 40));

        Text_Deksripksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_DeksripksiActionPerformed(evt);
            }
        });
        getContentPane().add(Text_Deksripksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 540, 170));
        getContentPane().add(Text_Fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 540, 40));
        getContentPane().add(Text_JenisPekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 540, 40));

        jLabel3.setText("Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 700, -1, -1));

        jLabel4.setText("Nama Pekerjaan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jLabel5.setText("Jenis Pekerjaan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jLabel6.setText("Deskripsi Pekerjaan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        Text_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_IdActionPerformed(evt);
            }
        });
        getContentPane().add(Text_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 720, 540, 40));

        jLabel7.setText("Tawaran Fee");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\akhma\\OneDrive\\Pictures\\Saved Pictures\\White.PNG")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 270, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anti/nganggur/Job_Client.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean verify(){
        String judul = Text_NamaPekerjaan.getText();
        String jenis = Text_JenisPekerjaan.getText();
        String deksripsi = Text_Deksripksi.getText();
        String tawaran = Text_Fee.getText();
        String kode = Text_Id.getText();
        
        if (judul.trim().equals("") || jenis.trim().equals("") || 
            deksripsi.trim().equals("") || tawaran.trim().equals("") || 
            kode.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "satu diantara fields lain ada yang kosong","Fields Kosong",2);
            return false;
            }else{
            return true;
            
            }
    };
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     new Login().setVisible(true);
     dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Done_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Done_ButtonActionPerformed
        String temp =  "whd" ;
        String temp2 = "";
        String sts ="Belum";
        String judul = Text_NamaPekerjaan.getText();
        String jenis = Text_JenisPekerjaan.getText();
        String deksripsi = Text_Deksripksi.getText();
        String tawaran = Text_Fee.getText();
        String kode = Text_Id.getText();
        String client = temp;
        String freelancer = temp2;
        String Status = sts;
        
        
        if (verify()) 
        {
            PreparedStatement ps;
            ResultSet rs;
            String registerUserQuery = "INSERT INTO `pekerjaan_client`(`Nama_Pekerjaan`,`Jenis_Pekerjaan`, `Deskripsi_Pekerjaan`,`Tawaran_Fee`,`Id_Pekerjaan`,`Username_Client`,`Username_Freelance`,`Status_Pekerjaan`)VALUES(?,?,?,?,?,?,?,?)";
            
            try {
                      
                      ps = DBConnection.getConnection().prepareStatement(registerUserQuery);
                      ps.setString(1, judul);
                      ps.setString(2, jenis);
                      ps.setString(3, deksripsi);
                      ps.setString(4, tawaran);
                      ps.setString(5, kode);
                      ps.setString(6, client);
                      ps.setString(7, freelancer);
                      ps.setString(8, Status);
                      
                      
                      
                       
                      if(ps.executeUpdate() != 0)
                         {
                             JOptionPane.showMessageDialog(null, "Your Job Has Been Created");
                             new MyJob_Client().setVisible(true);
                             dispose();
                         }else{
                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                         }
                      
                  } catch (SQLException ex) {
                      Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                      
                  }
        }
    }//GEN-LAST:event_Done_ButtonActionPerformed

    private void Text_NamaPekerjaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NamaPekerjaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_NamaPekerjaanActionPerformed

    private void Text_DeksripksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_DeksripksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_DeksripksiActionPerformed

    private void MyJob_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyJob_BTNActionPerformed
    new MyJob_Client().setVisible(true);
    dispose();
    }//GEN-LAST:event_MyJob_BTNActionPerformed

    private void Balance_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Balance_BTNMouseClicked
    new Balance_Client().setVisible(true);
    dispose();
    }//GEN-LAST:event_Balance_BTNMouseClicked

    private void Setting_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Setting_BTNMouseClicked
    new Settings_Client().setVisible(true);
    dispose();
    }//GEN-LAST:event_Setting_BTNMouseClicked

    private void Text_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_IdActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Balance_BTN;
    private javax.swing.JButton Done_Button;
    private javax.swing.JButton Job_BTN;
    private javax.swing.JButton MyJob_BTN;
    private javax.swing.JButton Setting_BTN;
    private javax.swing.JTextField Text_Deksripksi;
    private javax.swing.JTextField Text_Fee;
    private javax.swing.JTextField Text_Id;
    private javax.swing.JTextField Text_JenisPekerjaan;
    private javax.swing.JTextField Text_NamaPekerjaan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
