/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tourismproject;

import static com.mycompany.tourismproject.NewJFrame.r;
import static java.lang.Math.random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Properties;  
import java.util.Random;
import javax.mail.*;  
import javax.mail.internet.*;  

/**
 *
 * @author hp
 */
public class forget_password extends javax.swing.JFrame {

    /**
     * Creates new form forget_password
     */
    public forget_password() {
        initComponents();
        this.setSize(400,300);
        this.setResizable(false);
        this.jpancode.setVisible(false);
        this.jpanemailforpassword.setVisible(false);
        this.jpannewpassword.setVisible(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    
    static int code;
       public static void sendemail(String recepient) throws MessagingException {


        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        // Get a Properties object
        Properties props = System.getProperties();
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "888");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        props.put("mail.store.protocol", "pop3");
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.starttls.enable", "true");
        Random number=new Random();
        code=number.nextInt(99999999);

        final String username = "haitham.hinnawi9@gmail.com";//
        final String password = "haithamxcfgx";
        try {
            Session session = Session.getDefaultInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            // -- Create a new message --
            Message msg = new MimeMessage(session);

            // -- Set the FROM and TO fields --
            msg.setFrom(new InternetAddress(username));
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(recepient, false));
            msg.setSubject("Reset Password");
            msg.setText(Integer.toString(code));
            msg.setSentDate(new Date());
            Transport.send(msg);
            System.out.println("Message sent.");

        } catch (MessagingException e) {
            System.out.println("Erreur d'envoi, cause: " + e);
        }


    }


    private static Message prepareMessage(Session session, String myacount, String recepient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myacount));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("java");
            message.setText("look ");
            return message;
        } catch (Exception ex) {
           // Logger.getLogger(class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanusernameforpassword = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtextusermaneforpassword = new javax.swing.JTextField();
        jbotnextforemail = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jpanemailforpassword = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtextemailforpassword = new javax.swing.JTextField();
        jbotNextforgetcode = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpancode = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jbotnextfornewpassword = new javax.swing.JButton();
        jtextcodeforpassword = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpannewpassword = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbotconfirm = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanusernameforpassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Username");
        jpanusernameforpassword.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 70, 20));

        jtextusermaneforpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextusermaneforpasswordActionPerformed(evt);
            }
        });
        jpanusernameforpassword.add(jtextusermaneforpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 150, -1));

        jbotnextforemail.setText("Next");
        jbotnextforemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotnextforemailActionPerformed(evt);
            }
        });
        jpanusernameforpassword.add(jbotnextforemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 100, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Microsoft\\Downloads\\icons8-lock-orientation-50 (1).png")); // NOI18N
        jpanusernameforpassword.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Microsoft\\Desktop\\rasmus-smedstrup-mortensen-_ZtPsxAomeI-unsplash_400x300.jpg")); // NOI18N
        jpanusernameforpassword.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jpanusernameforpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 310));

        jpanemailforpassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email");
        jpanemailforpassword.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 54, 20));
        jpanemailforpassword.add(jtextemailforpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 150, -1));

        jbotNextforgetcode.setText("Next");
        jbotNextforgetcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotNextforgetcodeActionPerformed(evt);
            }
        });
        jpanemailforpassword.add(jbotNextforgetcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 100, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Microsoft\\Downloads\\icons8-lock-orientation-50 (1).png")); // NOI18N
        jpanemailforpassword.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Microsoft\\Desktop\\rasmus-smedstrup-mortensen-_ZtPsxAomeI-unsplash_400x300.jpg")); // NOI18N
        jpanemailforpassword.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jpanemailforpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 310));

        jpancode.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Verification code");
        jpancode.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 140, 20));

        jbotnextfornewpassword.setText("Next");
        jbotnextfornewpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotnextfornewpasswordActionPerformed(evt);
            }
        });
        jpancode.add(jbotnextfornewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 100, -1));
        jpancode.add(jtextcodeforpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 150, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Microsoft\\Downloads\\icons8-lock-orientation-50 (1).png")); // NOI18N
        jpancode.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Microsoft\\Desktop\\rasmus-smedstrup-mortensen-_ZtPsxAomeI-unsplash_400x300.jpg")); // NOI18N
        jpancode.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jpancode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 310));

        jpannewpassword.setPreferredSize(new java.awt.Dimension(400, 300));
        jpannewpassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("New Password");
        jpannewpassword.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Re-enter Password");
        jpannewpassword.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, 20));

        jbotconfirm.setText("Reset Password");
        jbotconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotconfirmActionPerformed(evt);
            }
        });
        jpannewpassword.add(jbotconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 160, -1));
        jpannewpassword.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, -1));
        jpannewpassword.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Microsoft\\Downloads\\icons8-lock-orientation-50 (1).png")); // NOI18N
        jpannewpassword.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Microsoft\\Desktop\\rasmus-smedstrup-mortensen-_ZtPsxAomeI-unsplash_400x300.jpg")); // NOI18N
        jpannewpassword.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jpannewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextusermaneforpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextusermaneforpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextusermaneforpasswordActionPerformed

    private void jbotnextforemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotnextforemailActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            DriverManager.registerDriver(new oracle .jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            String user="c##haitham";
            String password="123456";
            Connection con = DriverManager.getConnection(url,user,password);
            Statement stmt = con.createStatement();
            String strQry="Select * from customer order by cid";
            ResultSet rs=stmt.executeQuery(strQry);
            boolean x=false;
            String g;
            String v;
            while (rs.next()){
               g=rs.getString("username");
                if(this.jtextusermaneforpassword.getText().equals(g)){
                    
                    x=true;
                    this.jpancode.setVisible(false);
                    this.jpanemailforpassword.setVisible(true);
                    this.jpannewpassword.setVisible(false);
                    this.jpanusernameforpassword.setVisible(false);
                   
            
                }
                
            }
            if(x==false){
            JOptionPane.showMessageDialog(null, "username not found");
            this.jtextusermaneforpassword.setText("");
            }
            con.close();
        } catch (Exception ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jbotnextforemailActionPerformed

    private void jbotnextfornewpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotnextfornewpasswordActionPerformed
        // TODO add your handling code here:
        
        if(jtextcodeforpassword.getText().equals(Integer.toString(code))){
             this.jpancode.setVisible(false);
        this.jpanemailforpassword.setVisible(false);
        this.jpannewpassword.setVisible(true);
        this.jpanusernameforpassword.setVisible(false);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Wrong code number");
            jtextcodeforpassword.setText("");
        }
        
        
        
       
    }//GEN-LAST:event_jbotnextfornewpasswordActionPerformed

    private void jbotNextforgetcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotNextforgetcodeActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            DriverManager.registerDriver(new oracle .jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            String user="c##haitham";
            String password="123456";
            Connection con = DriverManager.getConnection(url,user,password);
            Statement stmt = con.createStatement();
            String strQry="Select * from customer order by cid";
            ResultSet rs=stmt.executeQuery(strQry);
            boolean x=false;
            String g;
            String v;
            while (rs.next()){
               g=rs.getString("EMAIL");
                if(this.jtextemailforpassword.getText().equals(g)){
                    x=true;
                    
                 sendemail(jtextemailforpassword.getText()); 
                    
                    
                    
                    
             this.jpancode.setVisible(true);
            this.jpanemailforpassword.setVisible(false);
            this.jpannewpassword.setVisible(false);
            this.jpanusernameforpassword.setVisible(false);
                   
            
                }
                
            }
            if(x==false){
            JOptionPane.showMessageDialog(null, "Email is wrong");
            this.jtextemailforpassword.setText("");
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        
       
    }//GEN-LAST:event_jbotNextforgetcodeActionPerformed

    private void jbotconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotconfirmActionPerformed
        // TODO add your handling code here:
        if(jPasswordField1.getText().equals(jPasswordField2.getText())){
            try {
                DriverManager.registerDriver(new oracle .jdbc.driver.OracleDriver());
                  String url="jdbc:oracle:thin:@localhost:1521:XE";
            String user="c##haitham";
            String password="123456";
            Connection con = DriverManager.getConnection(url,user,password);
            Statement stmt = con.createStatement();
            String sql="update CUSTOMER set PASSWORD='"+jPasswordField1.getText()+"' where USERNAME='"+jtextusermaneforpassword.getText()+"'";
             stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Done");
            r.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(forget_password.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Password does not match");
            this.jPasswordField1.setText("");
            this.jPasswordField2.setText("");
        }
        
    }//GEN-LAST:event_jbotconfirmActionPerformed

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
            java.util.logging.Logger.getLogger(forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forget_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forget_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jPasswordField1;
    private javax.swing.JTextField jPasswordField2;
    private javax.swing.JButton jbotNextforgetcode;
    private javax.swing.JButton jbotconfirm;
    private javax.swing.JButton jbotnextforemail;
    private javax.swing.JButton jbotnextfornewpassword;
    private javax.swing.JPanel jpancode;
    private javax.swing.JPanel jpanemailforpassword;
    private javax.swing.JPanel jpannewpassword;
    private javax.swing.JPanel jpanusernameforpassword;
    private javax.swing.JTextField jtextcodeforpassword;
    private javax.swing.JTextField jtextemailforpassword;
    private javax.swing.JTextField jtextusermaneforpassword;
    // End of variables declaration//GEN-END:variables
}
