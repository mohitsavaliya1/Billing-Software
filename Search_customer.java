

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public final class Search_customer extends javax.swing.JInternalFrame {
   
        Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel  dml;
    
    
    private Vector<Vector<String>> data;
   private Vector<String> header;
    
   public Search_customer () throws SQLException, Exception {
   
       DBEngine dbe = new DBEngine("select * from Customer_Master");
       data = dbe.getData();
       
       header = new Vector<String>();
       header.add("customer no");
       header.add("Customer Name");
       header.add("Add1");
       header.add("Add2");
       header.add("Add3");
       header.add("Cont. No");
       header.add("Mail ID");
       header.add("cst no");
       header.add("tin no");
       header.add("stex no");
      
       initComponents();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sbn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sbn1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        sc = new javax.swing.JTable();
        ok = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Customers");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\java proj\\billing\\images\\find.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search by name");
        jLabel2.setName("jLabel2"); // NOI18N

        sbn.setText(" ");
        sbn.setName("sbn"); // NOI18N
        sbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbnActionPerformed(evt);
            }
        });
        sbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sbnFocusLost(evt);
            }
        });
        sbn.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                sbnInputMethodTextChanged(evt);
            }
        });
        sbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sbnKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sbnKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search by no");
        jLabel3.setName("jLabel3"); // NOI18N

        sbn1.setText(" ");
        sbn1.setName("sbn1"); // NOI18N
        sbn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbn1ActionPerformed(evt);
            }
        });
        sbn1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sbn1FocusLost(evt);
            }
        });
        sbn1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                sbn1InputMethodTextChanged(evt);
            }
        });
        sbn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sbn1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sbn1KeyTyped(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        sc.setModel(new javax.swing.table.DefaultTableModel(data,header));
        sc.setColumnSelectionAllowed(true);
        sc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sc.setName("sc"); // NOI18N
        jScrollPane1.setViewportView(sc);

        ok.setFont(new java.awt.Font("Tahoma", 0, 18));
        ok.setText("OK");
        ok.setName("ok"); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sbn1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(sbn, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                .addGap(261, 261, 261))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sbn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sbn1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
     this.dispose();
}//GEN-LAST:event_okActionPerformed

private void sbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbnActionPerformed
   
}//GEN-LAST:event_sbnActionPerformed

private void sbnInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_sbnInputMethodTextChanged
 
}//GEN-LAST:event_sbnInputMethodTextChanged

private void sbnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbnKeyTyped


}//GEN-LAST:event_sbnKeyTyped

private void sbnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbnKeyReleased

    int f=0; 
    
   String s=sbn.getText();
    String s1=null;
        
    for(int i=0;i<s.length();i++)
    {
    
      char a=s.charAt(i);  
       Character chr=new Character(a);
       
      if(chr.isDigit(a))
      {
           f=1;
        s1=s.substring(0, i);   
      }
    }
    if(f==1)
    {
        JOptionPane.showMessageDialog(null,"number not allowed");
     sbn.setText(s1);
    
    }

 try {
                 
                 DBEngine dbe = new DBEngine("select * from Customer_Master where Customer_Name like '"+sbn.getText().trim()+"%'");
                 data = dbe.getData();
                 header = new Vector<String>();
       header.add("customer no");
       header.add("Customer Name");
       header.add("Add1");
       header.add("Add2");
       header.add("Add3");
       header.add("Cont. No");
       header.add("Mail ID");
       header.add("cst no");
       header.add("tin no");
       header.add("stex no");
       
      sc.setModel(new javax.swing.table.DefaultTableModel(data,header));           
        } catch (Exception ex) {
            Logger.getLogger(Search_customer.class.getName()).log(Level.SEVERE, null, ex);
        }

}//GEN-LAST:event_sbnKeyReleased

private void sbnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sbnFocusLost
}//GEN-LAST:event_sbnFocusLost

private void sbn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbn1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_sbn1ActionPerformed

private void sbn1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sbn1FocusLost
// TODO add your handling code here:
}//GEN-LAST:event_sbn1FocusLost

private void sbn1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_sbn1InputMethodTextChanged
// TODO add your handling code here:
}//GEN-LAST:event_sbn1InputMethodTextChanged

private void sbn1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbn1KeyReleased

    int f=0; 
    
   String s=sbn1.getText();
    String s1=null;
        
    for(int i=0;i<s.length();i++)
    {
    
      char a=s.charAt(i);  
       Character chr=new Character(a);
       
      if(chr.isLetter(a))
      {
           f=1;
        s1=s.substring(0, i);   
      }
    }
    if(f==1)
    {
        JOptionPane.showMessageDialog(null,"character not allowed");
     sbn1.setText(s1);
    
    }
    

 try {
                 
                 DBEngine dbe = new DBEngine("select * from Customer_Master where Customer_Name like '"+sbn1.getText().trim()+"%'");
                 data = dbe.getData();
                 header = new Vector<String>();
       header.add("customer no");
       header.add("Customer Name");
       header.add("Add1");
       header.add("Add2");
       header.add("Add3");
       header.add("Cont. No");
       header.add("Mail ID");
       header.add("cst no");
       header.add("tin no");
       header.add("stex no");
       
      sc.setModel(new javax.swing.table.DefaultTableModel(data,header));           
        } catch (Exception ex) {
            Logger.getLogger(Search_customer.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    
}//GEN-LAST:event_sbn1KeyReleased

private void sbn1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbn1KeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_sbn1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok;
    private javax.swing.JTextField sbn;
    private javax.swing.JTextField sbn1;
    private javax.swing.JTable sc;
    // End of variables declaration//GEN-END:variables

}
