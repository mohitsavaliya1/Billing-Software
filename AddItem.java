
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddItem extends javax.swing.JInternalFrame {
 Connection con=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   Statement st; 
   int i_no=0;
   
    public AddItem() {
        
        con =  re.getCon();
        initComponents();
        try {
              st=con.createStatement();
              rs=st.executeQuery("select max(item_no)from Item_Master");
           
              rs.next();
              if(rs!=null)
              {
                  i_no=rs.getInt(1);
              i_no++;
              } 
           else
                    i_no=1;
              
              ino.setText(""+i_no);
        
        } catch (Exception ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        irate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        imake = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        iunit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        iratio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        iname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setClosable(true);
        setVisible(true);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setName("jPanel5"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setName("jPanel2"); // NOI18N

        irate.setName("irate"); // NOI18N
        irate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                irateKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item Rate");
        jLabel5.setName("jLabel5"); // NOI18N

        imake.setName("imake"); // NOI18N
        imake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imakeActionPerformed(evt);
            }
        });
        imake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imakeKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Make");
        jLabel2.setName("jLabel2"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imake, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(irate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(imake, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(irate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\java proj\\billing\\images\\item.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 36));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADD ITEM DETAILS");
        jLabel7.setName("jLabel7"); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setName("jPanel3"); // NOI18N

        iunit.setName("iunit"); // NOI18N
        iunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iunitActionPerformed(evt);
            }
        });
        iunit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iunitKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Item Unit");
        jLabel6.setName("jLabel6"); // NOI18N

        iratio.setName("iratio"); // NOI18N
        iratio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iratioKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Ratio");
        jLabel3.setName("jLabel3"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iratio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(iunit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(iratio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(iunit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N

        iname.setName("iname"); // NOI18N
        iname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inameKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item Name");
        jLabel4.setName("jLabel4"); // NOI18N

        ino.setBackground(new java.awt.Color(255, 255, 153));
        ino.setName("ino"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item No");
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(ino, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(iname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(iname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setName("jPanel4"); // NOI18N

        exit.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        exit.setText("EXIT");
        exit.setName("exit"); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        save.setText("SAVE");
        save.setName("save"); // NOI18N
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iunitActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_iunitActionPerformed

    private void imakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imakeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_imakeActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        try
{    

 pst=con.prepareStatement("Insert into Item_Master values(?,?,?,?,?,?)");
 pst.setString(1,""+ino.getText());
 pst.setString(2,""+iname.getText());
 pst.setString(3,""+imake.getText());
 pst.setString(4,""+irate.getText());
 pst.setString(5,""+iratio.getText());
 pst.setString(6,""+iunit.getText());
 
 pst.executeUpdate();
  
 JOptionPane.showMessageDialog(null, "Record Inserted Sucessfully....");
rs=st.executeQuery("select max(item_no)from Item_Master");
           
              rs.next();
              if(rs!=null)
              {
                  i_no=rs.getInt(1);
              i_no++;
              } 
           else
                    i_no=1;
              
              ino.setText(""+i_no);
        
 
 //ino.setText("");
 iname.setText("");
 imake.setText("");
 irate.setText("");
 iratio.setText("");
 iunit.setText("");
 con.close();
 con=re.getCon();
}
catch(Exception ex)
{
    System.out.print("error");
}       

    }//GEN-LAST:event_saveActionPerformed

private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
this.dispose();
}//GEN-LAST:event_exitActionPerformed

private void inameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inameKeyReleased
int f=0; 
    String s=iname.getText();
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
     iname.setText(null);
    }
}//GEN-LAST:event_inameKeyReleased

private void iunitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iunitKeyReleased
int f=0; 
    String s=iunit.getText();
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
     iunit.setText(null);
    }
}//GEN-LAST:event_iunitKeyReleased

private void imakeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imakeKeyReleased
int f=0; 
    String s=imake.getText();
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
     imake.setText(null);
    }
}//GEN-LAST:event_imakeKeyReleased

private void irateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_irateKeyReleased
int f=0; 
    String s=irate.getText();
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
     irate.setText(null);
    }

}//GEN-LAST:event_irateKeyReleased

private void iratioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iratioKeyReleased

int f=0; 
    String s=iratio.getText();
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
     iratio.setText(null);
    }
    
}//GEN-LAST:event_iratioKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JTextField imake;
    private javax.swing.JTextField iname;
    private javax.swing.JTextField ino;
    private javax.swing.JTextField irate;
    private javax.swing.JTextField iratio;
    private javax.swing.JTextField iunit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

}

