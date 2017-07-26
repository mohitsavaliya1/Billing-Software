
import java.sql.*;
import java.util.Vector;
import javax.management.remote.JMXProviderException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class Details_Items extends javax.swing.JInternalFrame {

      private Vector<Vector<String>> data;
      private Vector<String> header;
    
public Details_Items()throws SQLException, Exception {
   
      DCEngin dce = new DCEngin("select * from item_master");
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

        jPanel1 = new javax.swing.JPanel();
        cod = new javax.swing.JLabel();
        EXIT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        codd = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setName("jPanel1"); // NOI18N

        cod.setBackground(new java.awt.Color(102, 0, 0));
        cod.setFont(new java.awt.Font("Corbel", 1, 36));
        cod.setForeground(new java.awt.Color(255, 255, 255));
        cod.setText("Details Of Items");
        cod.setName("cod"); // NOI18N

        EXIT.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        EXIT.setText("Exit");
        EXIT.setName("EXIT"); // NOI18N
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        codd.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        codd.setName("codd"); // NOI18N
        new JScrollPane(codd,jScrollPane1.VERTICAL_SCROLLBAR_ALWAYS,jScrollPane1.HORIZONTAL_SCROLLBAR_ALWAYS);
        codd.setAutoResizeMode(codd.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(codd);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\java proj\\billing\\images\\detail item.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cod))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
     this.dispose();
}//GEN-LAST:event_EXITActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel cod;
    private javax.swing.JTable codd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
