package anti.nganggur;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Text_Username = new javax.swing.JTextField();
        Text_Status = new javax.swing.JTextField();
        Text_Lokasi = new javax.swing.JTextField();
        Text_Password = new javax.swing.JPasswordField();
        Register_Button = new javax.swing.JButton();
        Freelancer = new javax.swing.JRadioButton();
        Client = new javax.swing.JRadioButton();
        MALE = new javax.swing.JRadioButton();
        FEMALE = new javax.swing.JRadioButton();
        Login_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        label1.setText("label1");

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 1170, -1, -1));

        Text_Username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Text_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_UsernameActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 330, 490, 50));

        Text_Status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(Text_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 700, 490, 50));

        Text_Lokasi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(Text_Lokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 800, 490, 50));

        Text_Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(Text_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 430, 490, 50));

        Register_Button.setBorderPainted(false);
        Register_Button.setContentAreaFilled(false);
        Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Register_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 860, 350, 50));

        Freelancer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Freelancer.setText("Freelancer");
        Freelancer.setContentAreaFilled(false);
        jPanel1.add(Freelancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, -1, -1));

        Client.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Client.setText("Client");
        Client.setContentAreaFilled(false);
        jPanel1.add(Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, -1, -1));

        MALE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MALE.setText("Male");
        MALE.setContentAreaFilled(false);
        jPanel1.add(MALE, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, -1, -1));

        FEMALE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FEMALE.setText("Female");
        FEMALE.setContentAreaFilled(false);
        jPanel1.add(FEMALE, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, -1, -1));

        Login_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Login_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 930, 80, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anti/nganggur/Register Page.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean verify(){
        String Username = Text_Username.getText();
        String Password = String.valueOf(Text_Password.getPassword());
        String Status = Text_Status.getText();
        String Lokasi = Text_Lokasi.getText();
        String role = "Freelancer";
        String gender = "Male";
        
        if (Username.trim().equals("") || Password.trim().equals("") || 
                Status.trim().equals("") || Lokasi.trim().equals("") || 
                role.trim().equals("") || gender.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "satu diantara fields lain ada yang kosong","Fields Kosong",2);
            return false;
            }else{
            return true;
            
            }
    };
    private void Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_ButtonActionPerformed
        String Username = Text_Username.getText();
        String Password = String.valueOf(Text_Password.getPassword());
        String Status = Text_Status.getText();
        String Lokasi = Text_Lokasi.getText();
        String gender = "Male";
        
        if (FEMALE.isSelected())
        {
            gender = "Female";
        }
        
        if (verify()) 
        {
            if(Client.isSelected()) 
        {
            PreparedStatement ps;
            ResultSet rs;
            String registerUserQuery = "INSERT INTO `client`(`Username_Client`,`Password_Client`, `Status_Client`,`Lokasi_Client`, `Gender_Client`)VALUES(?,?,?,?,?)";
            
            try {
                      
                      ps = DBConnection.getConnection().prepareStatement(registerUserQuery);
                      ps.setString(1, Username);
                      ps.setString(2, Password);
                      ps.setString(3, Status);
                      ps.setString(4, Lokasi);
                      ps.setString(5, gender);
                      
                       
                      if(ps.executeUpdate() != 0)
                         {
                             JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                             new Login().setVisible(true);
                             dispose();
                         }else{
                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                         }
                      
                  } catch (SQLException ex) {
                      Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                      
                  }
        } else if(Freelancer.isSelected()) {
            PreparedStatement ps;
            ResultSet rs;
                
            String registerUserQuery = "INSERT INTO `freelance`(`Nama_Freelance`,`Password_Freelancer`, `Status_Freelance`,`Lokasi_Freelance`, `Gender_Freelance`)VALUES(?,?,?,?,?)";
            try {
                      
                      ps = DBConnection.getConnection().prepareStatement(registerUserQuery);
                      ps.setString(1, Username);
                      ps.setString(2, Password);
                      ps.setString(3, Status); 
                      ps.setString(4, Lokasi);
                      ps.setString(5, gender);
                      
                       
                      if(ps.executeUpdate() != 0)
                         {
                             JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                             new Login().setVisible(true);
                             dispose();
                         }else{
                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                         }
                      
                  } catch (SQLException ex) {
                      Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                      
                  }
        }
         
        } 
        
    }//GEN-LAST:event_Register_ButtonActionPerformed
    private void Login_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_LabelMouseClicked
        new Login().setVisible(true);
        
    }//GEN-LAST:event_Login_LabelMouseClicked

    private void Text_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_UsernameActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Client;
    private javax.swing.JRadioButton FEMALE;
    private javax.swing.JRadioButton Freelancer;
    private javax.swing.JLabel Login_Label;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JButton Register_Button;
    private javax.swing.JTextField Text_Lokasi;
    private javax.swing.JPasswordField Text_Password;
    private javax.swing.JTextField Text_Status;
    private javax.swing.JTextField Text_Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
