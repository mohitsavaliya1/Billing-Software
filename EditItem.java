
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class EditItem extends javax.swing.JInternalFrame {
        private Vector<Vector<String>> data;
   private Vector<String> header;
   
    Connection con=null;
    PreparedStatement pst=null;
  Statement st=null;
   ResultSet rs = null;
     String NameVal;

    public EditItem()throws SQLException, Exception {
   
  con= re.getCon();      
st=con.createStatement();
      DCEngin dce = new DCEngin("select * from Item_Master");
                 data = dce.getData();
       
       header = new Vector<String>();
       header.add("item no");
       header.add("item Name");
       header.add("make");
       header.add("rate");
       header.add("ratio");
       header.add("unit");
       
        initComponents();
        setSize(675, 600);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        iu = new javax.swing.JTextField();
        ir = new javax.swing.JTextField();
        in = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ira = new javax.swing.JTextField();
        im = new javax.swing.JTextField();
        ino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        UPDATE = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(800, 608));

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "item_ratio", "item_unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setName("jTable2"); // NOI18N
        jScrollPane2.setViewportView(jTable2);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        jTable1.setName("jTable1"); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\java proj\\billing\\images\\edit.jpg")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT ITEMS DETAILS");
        jLabel1.setName("jLabel1"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setName("jPanel2"); // NOI18N

        iu.setText(" ");
        iu.setName("iu"); // NOI18N
        iu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iuKeyReleased(evt);
            }
        });

        ir.setText(" ");
        ir.setName("ir"); // NOI18N
        ir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                irKeyReleased(evt);
            }
        });

        in.setText(" ");
        in.setName("in"); // NOI18N
        in.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Item Name");
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Item Rate");
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Item Unit");
        jLabel9.setName("jLabel9"); // NOI18N

        ira.setText(" ");
        ira.setName("ira"); // NOI18N
        ira.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iraKeyReleased(evt);
            }
        });

        im.setText(" ");
        im.setName("im"); // NOI18N
        im.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imKeyReleased(evt);
            }
        });

        ino.setBackground(new java.awt.Color(255, 255, 153));
        ino.setText(" ");
        ino.setName("ino"); // NOI18N
        ino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item NO");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Item Make");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item Ratio");
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(ino, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel7)
                        .addGap(52, 52, 52)
                        .addComponent(in, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(im, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8)
                        .addGap(58, 58, 58)
                        .addComponent(ir, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addComponent(ira, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9)
                        .addGap(60, 60, 60)
                        .addComponent(iu, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(im, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(iu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(ira))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setName("jPanel3"); // NOI18N

        UPDATE.setFont(new java.awt.Font("Tahoma", 1, 14));
        UPDATE.setText("UPDATE");
        UPDATE.setName("UPDATE"); // NOI18N
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        EXIT.setFont(new java.awt.Font("Tahoma", 1, 14));
        EXIT.setText("EXIT");
        EXIT.setName("EXIT"); // NOI18N
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)))
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
   this.dispose();
}//GEN-LAST:event_EXITActionPerformed

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     try {
            
           
            int r= jTable1.getSelectedRow();
            int c=jTable1.getSelectedColumn();
                     Object s=jTable1.getValueAt(r, 1);
            String NameVal = s.toString(); 
            rs = st.executeQuery("select * from Item_Master where item_name='"+NameVal+"'");
                rs.next();
                     ino.setText(""+rs.getInt(1));
                     in.setText(""+rs.getString(2));
                     im.setText(""+rs.getString(3));
                     ir.setText(""+rs.getString(4));
                     ira.setText(""+rs.getString(5));
                     iu.setText(""+rs.getString(6));
                     
        } catch (SQLException ex) {
            //Logger.getLogger(EditCustomer.class.getName()).log(Level.SEVERE, null, ex);
           ex.printStackTrace();
        }

}//GEN-LAST:event_jTable1MouseClicked

private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
try{
   
    int noval=Integer.parseInt(ino.getText());    
   pst=con.prepareStatement("update Item_Master  set  item_name=?, item_Make=?, item_Rate=?, item_Ratio=?, item_Unit=? where item_no="+noval+"");
    pst.setString(1,""+in.getText());
    pst.setString(2,""+im.getText());
    pst.setString(3,""+ir.getText());
    pst.setString(4,""+ira.getText());
    pst.setString(5,""+iu.getText());
    
    pst.executeUpdate();
    con .close();
        con= re.getCon();      
        st=con.createStatement();
       
        DCEngin dbe = new DCEngin("select * from Item_Master");
       data = dbe.getData();
      
       
       header = new Vector<String>();
       header.add("item no");
       header.add("item Name");
       header.add("make");
       header.add("rate");
       header.add("ratio");
       header.add("unit");
       jTable1.setModel(new DefaultTableModel(data,header));
  
ino.setText("");
 in.setText("");
 im.setText("");
 ir.setText("");
 ira.setText("");
 iu.setText("");
}                                   
catch(Exception e)
{
    e.printStackTrace();
}                                      
    
}//GEN-LAST:event_UPDATEActionPerformed

private void inoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inoKeyReleased
int f=0; 
    String s=ino.getText();
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
     ino.setText(s1);
    }

}//GEN-LAST:event_inoKeyReleased

private void irKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_irKeyReleased
int f=0; 
    String s=ir.getText();
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
     ir.setText(s1);
    }
// TODO add your handling code here:
}//GEN-LAST:event_irKeyReleased

private void iraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iraKeyReleased
int f=0; 
    String s=ira.getText();
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
     ira.setText(s1);
    }
// TODO add your handling code here:
}//GEN-LAST:event_iraKeyReleased

private void inKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inKeyReleased
int f=0; 
    String s=in.getText();
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
     in.setText(s1);
    }// TODO add your handling code here:
}//GEN-LAST:event_inKeyReleased

private void iuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iuKeyReleased
int f=0; 
    String s=iu.getText();
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
     iu.setText(s1);
    }// TODO add your handling code here:
}//GEN-LAST:event_iuKeyReleased

private void imKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imKeyReleased
int f=0; 
    String s=im.getText();
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
     im.setText(s1);
    }// TODO add your handling code here:
}//GEN-LAST:event_imKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField im;
    private javax.swing.JTextField in;
    private javax.swing.JTextField ino;
    private javax.swing.JTextField ir;
    private javax.swing.JTextField ira;
    private javax.swing.JTextField iu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
