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


public class SearchItem extends javax.swing.JInternalFrame {
        
        Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel  dml;
     
     private Vector<Vector<String>> data;
        private Vector<String> header;
   
    public SearchItem()throws SQLException, Exception {
   
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
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sbin = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sbi = new javax.swing.JTextField();
        sbn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "item_no", "item_name", "item_make", "item_rate", "item_ratio", "item_unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        sbin.setBorder(new javax.swing.border.MatteBorder(null));
        sbin.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        sbin.setName("sbin"); // NOI18N
        jScrollPane2.setViewportView(sbin);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\java proj\\billing\\images\\find.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   search Items");
        jLabel1.setName("jLabel1"); // NOI18N

        sbi.setText(" ");
        sbi.setName("sbi"); // NOI18N
        sbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbiActionPerformed(evt);
            }
        });
        sbi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sbiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sbiKeyTyped(evt);
            }
        });

        sbn.setName("sbn"); // NOI18N
        sbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sbnKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search by Item_No");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search by Item_Name");
        jLabel2.setName("jLabel2"); // NOI18N

        ok.setFont(new java.awt.Font("Tahoma", 1, 18));
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
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sbi)
                                    .addComponent(sbn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, 0, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sbi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sbn, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ok)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbiActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_sbiActionPerformed

private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
   this.dispose();

}//GEN-LAST:event_okActionPerformed

private void sbiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbiKeyTyped
    
}//GEN-LAST:event_sbiKeyTyped

private void sbnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbnKeyReleased

    int f=0; 
    
   String s=sbn.getText();
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
     sbn.setText(s1);
    }

try {
                
           
                 DCEngin dce = new DCEngin("select * from Item_Master where Item_no like '"+sbn.getText()+"%'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Item No");
       header.add("Item Name");
       header.add("Make");
       header.add("Rate");
       header.add("Ratio");
       header.add("Unit");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));           
        } catch (Exception ex) {
            Logger.getLogger(Search_customer.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    
}//GEN-LAST:event_sbnKeyReleased

private void sbiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sbiKeyReleased

    int f=0; 
    
   String s=sbi.getText();
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
     sbi.setText(s1);
    
    }

    try {
                
           
                 DCEngin dce = new DCEngin("select * from Item_Master where Item_name like '"+sbi.getText().trim()+"%'");
                 data = dce.getData();
                 header = new Vector<String>();
       header.add("Item No");
       header.add("Item Name");
       header.add("Make");
       header.add("Rate");
       header.add("Ratio");
       header.add("Unit");
       
      sbin.setModel(new javax.swing.table.DefaultTableModel(data,header));           
        } catch (Exception ex) {
            Logger.getLogger(Search_customer.class.getName()).log(Level.SEVERE, null, ex);
        }


}//GEN-LAST:event_sbiKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton ok;
    private javax.swing.JTextField sbi;
    private javax.swing.JTable sbin;
    private javax.swing.JTextField sbn;
    // End of variables declaration//GEN-END:variables

}
