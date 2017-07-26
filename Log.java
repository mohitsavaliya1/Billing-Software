

import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Log extends javax.swing.JFrame {

      Connection con=null;
   Statement st=null;
   ResultSet rs=null;
   String u1,p1,u2,p2;
   
    public Log() {
        initComponents();
        
        
       try{
       con=re.getCon();
    st=con.createStatement();
    JFrame j=new JFrame();
    j.setSize(300, 300);
   wup.setVisible(false);
        
        
    }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ut = new javax.swing.JTextField();
        pt = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        cancle = new javax.swing.JButton();
        wup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\java proj\\billing\\images\\logo_login.jpg")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\java proj\\billing\\images\\startup_256.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Username");
        jLabel1.setName("jLabel1"); // NOI18N

        ut.setBackground(new java.awt.Color(255, 204, 255));
        ut.setText(" ");
        ut.setName("ut"); // NOI18N

        pt.setBackground(new java.awt.Color(255, 204, 255));
        pt.setName("pt"); // NOI18N
        pt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ptKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Password ");
        jLabel2.setName("jLabel2"); // NOI18N

        ok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ok.setText("OK");
        ok.setName("ok"); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        cancle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancle.setText("Cancel");
        cancle.setName("cancle"); // NOI18N
        cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleActionPerformed(evt);
            }
        });

        wup.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        wup.setForeground(new java.awt.Color(255, 0, 0));
        wup.setText("         Wrong Username OR Password");
        wup.setName("wup"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(wup, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ok)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ut, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addContainerGap(31, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancle)
                            .addComponent(ok))
                        .addGap(30, 30, 30)
                        .addComponent(wup, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ptKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ptKeyPressed
// TODO add your handling code here:
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
    {
        try
    {
      rs = st.executeQuery("select * from Login");
      rs.next();
      u1=rs.getString(1);
      p1=rs.getString(2);
      
       u2=ut.getText();
       p2=pt.getText();
        u2=u2.trim();
        p2=p2.trim();
       if(  u1.equals(u2) && p1.equals(p2))
       {
      
        SplashForm z=new  SplashForm();
   z.setVisible(true); 
     
 //     mainform f=new mainform();
  //    f.setVisible(true);
     
           
       this.dispose();
  
     
       }
   else
       {
            ut.requestFocusInWindow();
            wup.setVisible(true);
            pt.setText("");
            ut.setText("");
   
       }
    
    }
    catch(Exception e)
    {}
    }
}//GEN-LAST:event_ptKeyPressed

private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

    try
    {
      rs = st.executeQuery("select * from Login");
      rs.next();
      u1=rs.getString(1);
      p1=rs.getString(2);
      
       u2=ut.getText();
       p2=pt.getText();
        u2=u2.trim();
        p2=p2.trim();
        
       if(  u1.equals(u2) && p1.equals(p2))
       {
//       mainform f=new mainform();
     SplashForm z=new  SplashForm();
    z.setVisible(true);
    
  //    f.setVisible(true);
       this.dispose();
  
     
       }
   else
       {
            ut.requestFocusInWindow();
           wup.setVisible(true);
           
            pt.setText("");
            ut.setText("");
            
       }
    }
    catch(Exception e)
    {}
         
}//GEN-LAST:event_okActionPerformed

private void cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleActionPerformed
      
    this.dispose();
}//GEN-LAST:event_cancleActionPerformed

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
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Log().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField pt;
    private javax.swing.JTextField ut;
    private javax.swing.JLabel wup;
    // End of variables declaration//GEN-END:variables
}
