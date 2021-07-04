package anti.nganggur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    String temp;

    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        Login_Button = new javax.swing.JButton();
        Text_Username = new javax.swing.JTextField();
        Text_Password = new javax.swing.JPasswordField();
        Freelancer = new javax.swing.JRadioButton();
        Client = new javax.swing.JRadioButton();
        Register_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login_Button.setBorderPainted(false);
        Login_Button.setContentAreaFilled(false);
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Login_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 730, 330, 50));

        Text_Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(Text_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 490, 50));

        Text_Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(Text_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, 490, 50));

        Freelancer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Freelancer.setText("FREELANCER");
        Freelancer.setContentAreaFilled(false);
        Freelancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FreelancerActionPerformed(evt);
            }
        });
        jPanel1.add(Freelancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, -1, -1));

        Client.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Client.setText("CLIENT");
        Client.setContentAreaFilled(false);
        jPanel1.add(Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, -1, -1));

        Register_Label.setText(".");
        Register_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Register_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Register_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 810, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anti/nganggur/Login Page.png"))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        
        PreparedStatement st;
        ResultSet rs;

        // get the username & password
        String username = Text_Username.getText();
        String password = String.valueOf(Text_Password.getPassword());
        if (Client.isSelected()){
        String query = "SELECT * FROM `client` WHERE `Username_Client` = ? AND `Password_Client` = ?";
        
        try {
            st = DBConnection.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                           new Dashboard_Client().setVisible(true);
                           dispose();

            }else{
                // error message
                JOptionPane.showMessageDialog(null, "Invalid Username or Password","login error",2);
            }      
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else if (Freelancer.isSelected()){
            String query = "SELECT * FROM `freelance` WHERE `Nama_Freelance` = ? AND `Password_Freelancer` = ?";
        
            try {
                st = DBConnection.getConnection().prepareStatement(query);

                st.setString(1, username);
                st.setString(2, password);
                rs = st.executeQuery();

                if(rs.next())
                {
                   
                             new Job_Freelance().setVisible(true);
                             dispose();
                            
                        

                }else{
                    
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password","login error",2);
                }      
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
            
    }//GEN-LAST:event_Login_ButtonActionPerformed
    private void Register_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_LabelMouseClicked
         new Register().setVisible(true);
         dispose();
    }//GEN-LAST:event_Register_LabelMouseClicked

    private void FreelancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FreelancerActionPerformed
    }//GEN-LAST:event_FreelancerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Client;
    private javax.swing.JRadioButton Freelancer;
    private javax.swing.JButton Login_Button;
    private javax.swing.JLabel Register_Label;
    private javax.swing.JPasswordField Text_Password;
    private javax.swing.JTextField Text_Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
