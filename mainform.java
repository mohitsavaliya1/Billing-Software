

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.*;


public class mainform extends javax.swing.JFrame {

     Statement st;
   Connection con=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
 
    
    public mainform() {
        
         con =  re.getCon();
        initComponents();
        
       // initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jDesktopPane1.setName("jDesktopPane1"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\java proj\\billing\\images\\background.jpg")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1368, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );

        jPanel1.setBounds(0, 0, 1370, 750);
        jDesktopPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenu1.setLabel("Add");
        jMenu1.setName("jMenu1"); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem1.setText("Add Customer");
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem2.setText("Add Items");
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem3.setText("Billing");
        jMenuItem3.setName("jMenuItem3"); // NOI18N
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenu3.setLabel("View");
        jMenu3.setName("jMenu3"); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem4.setText("Customers");
        jMenuItem4.setName("jMenuItem4"); // NOI18N
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem5.setText("Items");
        jMenuItem5.setName("jMenuItem5"); // NOI18N
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem6.setText("Search Customer");
        jMenuItem6.setName("jMenuItem6"); // NOI18N
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem7.setText("Search Item");
        jMenuItem7.setName("jMenuItem7"); // NOI18N
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenu2.setName("jMenu2"); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem8.setText("Edit Customers");
        jMenuItem8.setName("jMenuItem8"); // NOI18N
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem9.setText("Edit Items");
        jMenuItem9.setName("jMenuItem9"); // NOI18N
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Tools");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenu4.setName("jMenu4"); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem10.setText("Calculator");
        jMenuItem10.setName("jMenuItem10"); // NOI18N
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem11.setText("Notepad");
        jMenuItem11.setName("jMenuItem11"); // NOI18N
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Setting");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenu5.setName("jMenu5"); // NOI18N

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem13.setText("Change Username");
        jMenuItem13.setName("jMenuItem13"); // NOI18N
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem14.setText("Change Password");
        jMenuItem14.setName("jMenuItem14"); // NOI18N
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Help");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenu6.setName("jMenu6"); // NOI18N

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem15.setText("About");
        jMenuItem15.setName("jMenuItem15"); // NOI18N
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Report");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenu7.setName("jMenu7"); // NOI18N
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem12.setText("All Customers");
        jMenuItem12.setName("jMenuItem12"); // NOI18N
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jMenuItem16.setText("All Items");
        jMenuItem16.setName("jMenuItem16"); // NOI18N
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem16);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1369, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
AddCustomer ac=new AddCustomer();
jDesktopPane1.add(ac);
ac.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
AddItem ai=new AddItem();
jDesktopPane1.add(ai);
ai.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
 
        try {
           Details_Customer  dc = new Details_Customer();
            jDesktopPane1.add(dc);
            dc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
Details_Items di;
        try {
            di = new Details_Items();
            jDesktopPane1.add(di);
          di.setVisible(true);//
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
Search_customer sc;
        try {
           sc = new Search_customer();
           jDesktopPane1.add(sc);
            sc.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
SearchItem si;
        try {
            si = new SearchItem();
            jDesktopPane1.add(si);
            si.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    
   JDesktopPane getDesktopPane()
   {
       return jDesktopPane1;
   }
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
EditCustomer ec;
        try {
            ec = new EditCustomer();
            jDesktopPane1.add(ec);
            ec.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
EditItem ei;
        try {
            ei = new EditItem();
            jDesktopPane1.add(ei);
            ei.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
ChangeUsername cu=new ChangeUsername();
jDesktopPane1.add(cu);
cu.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
ChangePassword cp=new ChangePassword();
jDesktopPane1.add(cp);
cp.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
    ABOUT a=new ABOUT();
    jDesktopPane1.add(a);
a.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu7ActionPerformed

private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
 
   
       Runtime rt=Runtime.getRuntime();
        try {
            rt.exec("c:/WINDOWS/system32/calc.exe");
           
        } catch (IOException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}//GEN-LAST:event_jMenuItem10ActionPerformed

private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

 Runtime rt=Runtime.getRuntime();
        try {
            rt.exec("c:/WINDOWS/system32/notepad.exe");
           
        } catch (IOException ex) {
            Logger.getLogger(mainform.class.getName()).log(Level.SEVERE, null, ex);
        }

}//GEN-LAST:event_jMenuItem11ActionPerformed

private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
  
}//GEN-LAST:event_jMenu4ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
BILLING bb=new BILLING();
jDesktopPane1.add(bb);
bb.setVisible(true);
    
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
try
{
   String Report= "D:\\java proj\\billing\\Billing_System\\src\\customer.jrxml";
   JasperReport JASP_REP= JasperCompileManager.compileReport(Report);
   JasperPrint JASP_PRINT=JasperFillManager.fillReport(JASP_REP, null,con);
   JasperViewer.viewReport(JASP_PRINT);
}
catch(Exception e)
{
    System.out.println(e);
}
}//GEN-LAST:event_jMenuItem12ActionPerformed

private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
   try
{
   String Report= "D:\\java proj\\billing\\Billing_System\\src\\item.jrxml";
   JasperReport JASP_REP= JasperCompileManager.compileReport(Report);
   JasperPrint JASP_PRINT=JasperFillManager.fillReport(JASP_REP, null,con);
   JasperViewer.viewReport(JASP_PRINT);
}
catch(Exception e)
{
    System.out.println(e);
} 
}//GEN-LAST:event_jMenuItem16ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
