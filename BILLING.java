
import java.awt.ScrollPane;
import java.sql.*;
import java.text.DateFormat;
import java.util.Vector;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Logger;




public class BILLING extends javax.swing.JInternalFrame {

    private static class JasperDesign {

        public JasperDesign() {
        }
    }

        private Vector<Vector<String>> data;
        private Vector<Vector<String>> data1;
   private Vector<String> header;
   int tot=0;
   
    Connection con=null;
    PreparedStatement pst=null;
  Statement st=null,stDelete=null;
   ResultSet rs = null;
   
   ScrollPane s; 
    int i_no=0;
    
    private  Vector<String> header1=null;
    
    
   public BILLING() {
        
    try
    {
       
         
        
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
       
       DummyData dce1 = new DummyData("select * from dummy");
  data1 = dce1.getData();
       header1 = new Vector<String>();
       header1.add("item no");
       header1.add("item Name");
       header1.add("make");
       header1.add("srno");
       header1.add("unitprice");
       header1.add("quantity");
       header1.add("total");

        initComponents();
       
        
        rs=st.executeQuery("select max(Bill_no) from Billinfo");
           
              rs.next();
              if(rs!=null)
              {
                  i_no=rs.getInt(1);
              i_no++;
              } 
           else
                    i_no=1;
              
              bn.setText(""+i_no);
              bn.setEditable(false);     
        
                     pno.setEditable(false);
                     make.setEditable(false);
                     unitp.setEditable(false);
                     ratio.setEditable(false);
                     unit.setEditable(false);
                     pname.setEditable(false);
                      subtotal.setEditable(false);
                           
                
               Date d = new Date();
               String curDate = "";
               

     
       DateFormat df=null;
      
       df=DateFormat.getDateInstance(DateFormat.SHORT);
         String s1= df.format(d);
                
       datetxt.setText(""+s1);
       
       try {
              st=con.createStatement();
              rs=st.executeQuery("select * from Customer_Master");
              while(rs.next())
              {
                  billto.addItem(""+rs.getString(2));
                   
              }
                  } catch (Exception ex) {
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }catch(Exception e)
    {
     }
    }
   
   
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        datetxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cstno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tinno = new javax.swing.JTextField();
        pono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pd = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        make = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        srno = new javax.swing.JTextField();
        unit = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ratio = new javax.swing.JTextField();
        unitp = new javax.swing.JTextField();
        q = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sc = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        remove = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tp = new javax.swing.JTextField();
        subtotal = new javax.swing.JTextField();
        total2 = new javax.swing.JTextField();
        tax = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        billto = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 24));
        jLabel1.setText("BILLING");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setText("bill no");
        jLabel2.setName("jLabel2"); // NOI18N

        bn.setBackground(new java.awt.Color(255, 255, 204));
        bn.setName("bn"); // NOI18N
        bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel3.setText("cust no");
        jLabel3.setName("jLabel3"); // NOI18N

        cno.setBackground(new java.awt.Color(255, 255, 204));
        cno.setName("cno"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel4.setText("date");
        jLabel4.setName("jLabel4"); // NOI18N

        datetxt.setName("datetxt"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel5.setText("bill to");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel6.setText("cst no");
        jLabel6.setName("jLabel6"); // NOI18N

        cstno.setBackground(new java.awt.Color(255, 255, 204));
        cstno.setName("cstno"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel7.setText("tin no");
        jLabel7.setName("jLabel7"); // NOI18N

        tinno.setBackground(new java.awt.Color(255, 255, 204));
        tinno.setName("tinno"); // NOI18N

        pono.setName("pono"); // NOI18N
        pono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ponoActionPerformed(evt);
            }
        });
        pono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ponoKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel9.setText("purchase order date");
        jLabel9.setName("jLabel9"); // NOI18N

        pd.setName("pd"); // NOI18N
        pd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pdKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel10.setText("p no");
        jLabel10.setName("jLabel10"); // NOI18N

        pno.setBackground(new java.awt.Color(255, 255, 204));
        pno.setName("pno"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel11.setText("product");
        jLabel11.setName("jLabel11"); // NOI18N

        pname.setBackground(new java.awt.Color(255, 255, 204));
        pname.setName("pname"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel12.setText("make");
        jLabel12.setName("jLabel12"); // NOI18N

        make.setBackground(new java.awt.Color(255, 255, 204));
        make.setName("make"); // NOI18N
        make.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel13.setText("serial no");
        jLabel13.setName("jLabel13"); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel14.setText("unit");
        jLabel14.setName("jLabel14"); // NOI18N

        srno.setName("srno"); // NOI18N
        srno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srnoActionPerformed(evt);
            }
        });
        srno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srnoKeyReleased(evt);
            }
        });

        unit.setBackground(new java.awt.Color(255, 255, 204));
        unit.setName("unit"); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel15.setText("ratio");
        jLabel15.setName("jLabel15"); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel16.setText("unit price");
        jLabel16.setName("jLabel16"); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel17.setText("quantity");
        jLabel17.setName("jLabel17"); // NOI18N

        ratio.setBackground(new java.awt.Color(255, 255, 204));
        ratio.setName("ratio"); // NOI18N

        unitp.setBackground(new java.awt.Color(255, 255, 204));
        unitp.setName("unitp"); // NOI18N

        q.setName("q"); // NOI18N
        q.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel18.setText("TOTAL");
        jLabel18.setName("jLabel18"); // NOI18N

        total.setBackground(new java.awt.Color(255, 204, 255));
        total.setName("total"); // NOI18N

        add.setFont(new java.awt.Font("SimHei", 0, 24));
        add.setText("ADD");
        add.setName("add"); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(make, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(srno, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unit, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ratio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(unitp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(25, 25, 25))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pname, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(make, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pno, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ratio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(unitp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(srno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setName("jPanel2"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        sc.setModel(new javax.swing.table.DefaultTableModel(data,header));
        sc.setName("sc"); // NOI18N
        search.setName("search");
        sc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scMouseClicked(evt);
            }
        });
        new JScrollPane(sc,jScrollPane1.VERTICAL_SCROLLBAR_ALWAYS,jScrollPane1.HORIZONTAL_SCROLLBAR_ALWAYS);
        sc.setAutoResizeMode(sc.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(sc);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        );

        jPanel3.setName("jPanel3"); // NOI18N

        remove.setFont(new java.awt.Font("SimHei", 0, 14));
        remove.setText("REMOVE");
        remove.setName("remove"); // NOI18N
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel20.setText("SUB TOTAL");
        jLabel20.setName("jLabel20"); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel21.setText("TAX");
        jLabel21.setName("jLabel21"); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel23.setText("TOTAL");
        jLabel23.setName("jLabel23"); // NOI18N

        tp.setName("tp"); // NOI18N
        tp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tpFocusLost(evt);
            }
        });
        tp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tpKeyReleased(evt);
            }
        });

        subtotal.setBackground(new java.awt.Color(255, 204, 255));
        subtotal.setName("subtotal"); // NOI18N

        total2.setBackground(new java.awt.Color(255, 204, 255));
        total2.setName("total2"); // NOI18N

        tax.setBackground(new java.awt.Color(255, 204, 255));
        tax.setName("tax"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(data1,header1));
        jTable1.setName("jTable1"); // NOI18N
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(remove)
                .addGap(336, 336, 336)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(subtotal))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(remove)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setName("jPanel4"); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton3.setText("PRINT");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 0, 14));
        save.setText("SAVE");
        save.setName("save"); // NOI18N
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton5.setText("NEW");
        jButton5.setName("jButton5"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton6.setText("EXIT");
        jButton6.setName("jButton6"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(95, 95, 95)
                .addComponent(save)
                .addGap(120, 120, 120)
                .addComponent(jButton5)
                .addGap(114, 114, 114)
                .addComponent(jButton6)
                .addGap(172, 172, 172))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(save)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        billto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SELECT CUSTOMER-" }));
        billto.setName("billto"); // NOI18N
        billto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billtoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                billtoMouseReleased(evt);
            }
        });
        billto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                billtoItemStateChanged(evt);
            }
        });
        billto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                billtoFocusLost(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel22.setText("Purchase order No");
        jLabel22.setName("jLabel22"); // NOI18N

        jLabel19.setFont(new java.awt.Font("Pristina", 0, 18));
        jLabel19.setText("SEARCH ");
        jLabel19.setName("jLabel19"); // NOI18N

        search.setName("search"); // NOI18N
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billto, 0, 191, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cno, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cstno, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(datetxt)
                            .addComponent(tinno, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pono, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                        .addGap(17, 17, 17)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tinno, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cstno, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_bnActionPerformed

private void srnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srnoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_srnoActionPerformed

private void scMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scMouseClicked

    
     try {
            
           
            int r= sc.getSelectedRow();
            int c=sc.getSelectedColumn();
                     Object s=sc.getValueAt(r, 1);
            String NameVal = s.toString(); 
            rs = st.executeQuery("select * from Item_Master where item_name='"+NameVal+"'");
                rs.next();
                     pno.setText(""+rs.getInt(1));
                     make.setText(""+rs.getString(3));
                     unitp.setText(""+rs.getString(4));
                     ratio.setText(""+rs.getString(5));
                     unit.setText(""+rs.getString(6));
                     pname.setText(""+rs.getString(2));
         
                   con= re.getCon();      
                   st=con.createStatement();
        } catch (SQLException ex) {

           ex.printStackTrace();
        }
    
}//GEN-LAST:event_scMouseClicked

private void billtoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_billtoFocusLost
}//GEN-LAST:event_billtoFocusLost

private void srnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srnoKeyReleased
int f=0; 
    String s1=srno.getText();
    String s2=null;
    for(int i=0;i<s1.length();i++)
    {
      char a=s1.charAt(i);  
       
      if(Character.isLetter(a))
      {
           f=1;
        s1=s1.substring(0, i);   
      }
    }
    if(f==1)
    {
        JOptionPane.showMessageDialog(null,"character not allowed");
   srno.setText(null);
    }

}//GEN-LAST:event_srnoKeyReleased

private void qKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qKeyReleased

int f=0; 
    String s=q.getText();
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
        q.setText(null);
    }
    
        int subVal=Integer.parseInt(q.getText());
       int t=Integer.parseInt(unitp.getText());
   
    float perVal=0f;
     
    perVal=subVal*t;
    total.setText(""+perVal);
    
    
}//GEN-LAST:event_qKeyReleased

private void ponoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ponoKeyReleased

    int f=0; 
    String s=pono.getText();
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
     pono.setText(null);
    }

    
}//GEN-LAST:event_ponoKeyReleased

private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

}//GEN-LAST:event_saveActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
this.dispose();
}//GEN-LAST:event_jButton6ActionPerformed

private void billtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billtoMouseClicked



}//GEN-LAST:event_billtoMouseClicked

private void billtoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_billtoItemStateChanged
// TODO add your handling code here:
         try {
       
            
             String NameVal = billto.getSelectedItem().toString(); 
           rs = st.executeQuery("select * from Customer_Master where Customer_name='"+NameVal+"'");
                rs.next();
                
                
               
                     cno.setText(""+rs.getInt(1));
                     cstno.setText(""+rs.getString(8));
                     tinno.setText(""+rs.getString(9));

                     
                     
                     // con.close();
 //con=re.getCon();

        } catch (SQLException ex) {
  
           ex.printStackTrace();
        }
}//GEN-LAST:event_billtoItemStateChanged

private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
           
    try{
                    
  int tot=0;
               con= re.getCon();      
  st=con.createStatement();

 pst=con.prepareStatement("insert into dummy values(?,?,?,?,?,?,?,?)");
 pst.setInt(1,Integer.parseInt(bn.getText()));
 pst.setInt(2,Integer.parseInt(pno.getText()));
 pst.setString(3,""+pname.getText());
 pst.setString(4,""+make.getText());
 pst.setString(5,""+srno.getText());
 pst.setInt(6,Integer.parseInt(unitp.getText()));
 pst.setInt(7,Integer.parseInt(q.getText()));
 pst.setString(8,""+total.getText());
 pst.executeUpdate();
 
 
       rs=st.executeQuery("select Total from dummy");
      while(rs.next())
       {
           tot=tot+rs.getInt(1);
       }
       subtotal.setText(""+tot);
       tp.setFocusable(true);
       
      DummyData dce1 = new DummyData("select Item_No,Item_Name,Item_Make,Item_Srno,Unit_Price,Unit_Quantity,Total from dummy");
      data1 = dce1.getData();
      jTable1.setModel(new DefaultTableModel(data1,header1));
    
    
    q.setText("");
    srno.setText("");
    total.setText("");
    pno.setText("");
    pname.setText("");
    make.setText("");
    unitp.setText("");
    total.setText("");
    unit.setText("");
    ratio.setText("");
    
    
   } 
           
   catch(Exception ex)
   {
       System.out.println("Error = "+ex);
   } 
}//GEN-LAST:event_addActionPerformed

private void tpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tpFocusLost
}//GEN-LAST:event_tpFocusLost

private void tpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpKeyReleased
    
    int st=Integer.parseInt(subtotal.getText());
    int taxVal=Integer.parseInt(tp.getText());
    int perVal=0;
     perVal=((st*taxVal)/100);
     tax.setText(""+perVal);
     int total3=st+perVal;
     total2.setText(""+total3);    
     
    
}//GEN-LAST:event_tpKeyReleased

private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
 try {
                
           
                 DCEngin dce = new DCEngin("select * from Item_Master where Item_name like '"+search.getText()+"%'");
                 data = dce.getData();
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

   
}//GEN-LAST:event_searchKeyReleased

private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
 
                 
            try {
                 DummyData dce1 = new DummyData("select * from dummy");
                data1 = dce1.getData();
                  jTable1.setModel(new DefaultTableModel(data1,header1));
           
            } catch (Exception ex) {
                Logger.getLogger(BILLING.class.getName()).log(Level.SEVERE, null, ex);
            }
  
            
 
}//GEN-LAST:event_removeActionPerformed

private void billtoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billtoMouseReleased
pono.setFocusable(true);
}//GEN-LAST:event_billtoMouseReleased

private void pdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pdKeyReleased
               
}//GEN-LAST:event_pdKeyReleased

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

  try {
      
                  con= re.getCon();      
                 st=con.createStatement();
                 
      
            int r= jTable1.getSelectedRow();
            int c=jTable1.getSelectedColumn();
            Object s=jTable1.getValueAt(r, 1);
            String NameVal = s.toString(); 
           pst=con.prepareStatement("delete from dummy where Item_Name='"+NameVal+"'");
                     pst.executeUpdate();
       } catch (SQLException ex) {
         ex.printStackTrace();
        }


}//GEN-LAST:event_jTable1MouseClicked

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            rs=st.executeQuery("select max(Bill_no) from Billinfo");
        
        rs.next();
                 i_no=rs.getInt(1);
              i_no++;
              
              bn.setText(""+i_no);
 } catch (SQLException ex) {
            Logger.getLogger(BILLING.class.getName()).log(Level.SEVERE, null, ex);
        }
           
              





}//GEN-LAST:event_jButton5ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    
    
}//GEN-LAST:event_jButton3ActionPerformed

private void ponoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ponoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_ponoActionPerformed

private void makeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_makeActionPerformed

private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked

    try
{ 
    
    
 pst=con.prepareStatement("insert into Billinfo values(?,?,?,?,?,?,?,?,?,?,?,?)");
 pst.setInt(1,Integer.parseInt(bn.getText()));
 pst.setInt(2,Integer.parseInt(cno.getText()));
  pst.setString(3,billto.getSelectedItem().toString()); 
 pst.setString(4,""+pono.getText());
 pst.setString(5,""+pd.getText());
 pst.setString(6,""+cstno.getText());
 pst.setString(7,""+tinno.getText());
 pst.setString(8,""+datetxt.getText());
 pst.setInt(9,Integer.parseInt(subtotal.getText()));
 pst.setInt(10,Integer.parseInt(tp.getText()));
 pst.setInt(11,Integer.parseInt(tax.getText()));
 pst.setInt(12,Integer.parseInt(total2.getText()));

 pst.executeUpdate();

 
       JOptionPane.showMessageDialog(null, "Record Inserted Sucessfully....");
 
             
   pst=con.prepareStatement("DELETE * from dummy");
   pst.executeUpdate();
   con.close();
  
       con= re.getCon();      
        st=con.createStatement();
       
        DummyData dbe = new DummyData("select * from dummy");
        data = dbe.getData();
      
      jTable1.setModel(new DefaultTableModel(data,header1));

         
pno.setText("");
pname.setText("");
make.setText("");
srno.setText("");
unitp.setText("");
q.setText("");
total.setText("");
 bn.setText("");
 cno.setText("");

 pono.setText("");
 pd.setText("");
 cstno.setText("");
 tinno.setText("");
 datetxt.setText("");
 subtotal.setText("");
 tp.setText("");
 tax.setText("");
 subtotal.setText("");
 total2.setText("");
 
 
 rs=st.executeQuery("select max(Bill_no) from Billinfo");
           
              rs.next();
                 i_no=rs.getInt(1);
              i_no++;
              
              bn.setText(""+i_no);
 
 con.close();
 con=re.getCon();
}                                    
catch(Exception ex)
{
    System.out.print("error"+ex);
}

}//GEN-LAST:event_saveMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JComboBox billto;
    private javax.swing.JTextField bn;
    private javax.swing.JTextField cno;
    private javax.swing.JTextField cstno;
    private javax.swing.JTextField datetxt;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField make;
    private javax.swing.JTextField pd;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pno;
    private javax.swing.JTextField pono;
    private javax.swing.JTextField q;
    private javax.swing.JTextField ratio;
    private javax.swing.JButton remove;
    private javax.swing.JButton save;
    private javax.swing.JTable sc;
    private javax.swing.JTextField search;
    private javax.swing.JTextField srno;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTextField tax;
    private javax.swing.JTextField tinno;
    private javax.swing.JTextField total;
    private javax.swing.JTextField total2;
    private javax.swing.JTextField tp;
    private javax.swing.JTextField unit;
    private javax.swing.JTextField unitp;
    // End of variables declaration//GEN-END:variables
}
