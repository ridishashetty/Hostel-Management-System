
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.YearMonth;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ridisha Shetty
 */
public class KitchenMaterials extends javax.swing.JFrame {

    /**
     * Creates new form KitchenMaterials
     */
    public KitchenMaterials() {
        initComponents();
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int windowWidth = this.getWidth();
        int windowHeight = this.getHeight();
        this.setBounds(center.x - windowWidth / 2, center.y - windowHeight / 2, windowWidth,
            windowHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    String url = "jdbc:sqlserver://192.168.0.98:1433;databaseName=hostel;integratedSecurity=true";
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagePanel = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        routine = new javax.swing.JLabel();
        rent = new javax.swing.JLabel();
        room = new javax.swing.JLabel();
        kitchen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        metricBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        costField = new javax.swing.JTextField();
        itemBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        quanField = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelS = new javax.swing.JLabel();
        specifyField = new javax.swing.JTextField();
        bill = new javax.swing.JLabel();
        reports = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        fee = new javax.swing.JLabel();
        staff = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KITCHEN MATERIALS");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pagePanel.setBackground(new java.awt.Color(238, 255, 237));
        pagePanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pagePanelComponentShown(evt);
            }
        });

        dashboard.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        dashboard.setForeground(new java.awt.Color(0, 51, 255));
        dashboard.setText("Dashboard");
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        routine.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        routine.setForeground(new java.awt.Color(0, 51, 255));
        routine.setText("Routine Check");
        routine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routineMouseClicked(evt);
            }
        });

        rent.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        rent.setForeground(new java.awt.Color(0, 51, 255));
        rent.setText("Rent Payment");
        rent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentMouseClicked(evt);
            }
        });

        room.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        room.setForeground(new java.awt.Color(0, 51, 255));
        room.setText("Room Distribution");
        room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomMouseClicked(evt);
            }
        });

        kitchen.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        kitchen.setText("Kitchen Materials");
        kitchen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitchenMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 0), null, null, new java.awt.Color(0, 102, 0)));

        metricBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "kg", "gm", "l", "ml" }));
        metricBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metricBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Cost:");

        jLabel2.setText("Quantity:");

        updateBtn.setBackground(new java.awt.Color(255, 255, 255));
        updateBtn.setForeground(new java.awt.Color(0, 102, 0));
        updateBtn.setText("Update");
        updateBtn.setActionCommand("");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        costField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costFieldActionPerformed(evt);
            }
        });

        itemBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select item" }));
        itemBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemBoxItemStateChanged(evt);
            }
        });
        itemBox.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                itemBoxComponentShown(evt);
            }
        });

        jLabel1.setText("Item:");

        clearBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearBtn.setForeground(new java.awt.Color(0, 102, 0));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KITCHEN MATERIALS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelS.setText("Specify:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(labelS))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(quanField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(metricBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(itemBox, 0, 106, Short.MAX_VALUE)
                    .addComponent(costField)
                    .addComponent(specifyField, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metricBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(costField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specifyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(updateBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bill.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        bill.setForeground(new java.awt.Color(0, 51, 255));
        bill.setText("Pay Bill");
        bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billMouseClicked(evt);
            }
        });

        reports.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        reports.setForeground(new java.awt.Color(0, 51, 255));
        reports.setText("Add Reports");
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
        });

        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });

        fee.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        fee.setForeground(new java.awt.Color(0, 51, 255));
        fee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fee.setText("Fee Details");
        fee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feeMouseClicked(evt);
            }
        });

        staff.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        staff.setForeground(new java.awt.Color(0, 51, 255));
        staff.setText("Staff Manage");
        staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pagePanelLayout = new javax.swing.GroupLayout(pagePanel);
        pagePanel.setLayout(pagePanelLayout);
        pagePanelLayout.setHorizontalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(routine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(room)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kitchen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staff)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pagePanelLayout.setVerticalGroup(
            pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dashboard)
                        .addComponent(routine)
                        .addComponent(room)
                        .addComponent(rent)
                        .addComponent(kitchen)
                        .addComponent(bill)
                        .addComponent(reports)
                        .addComponent(fee)
                        .addComponent(staff))
                    .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_dashboardMouseClicked

    private void routineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routineMouseClicked
        // TODO add your handling code here:
        new RoutineCheck().setVisible(true);
        dispose();
    }//GEN-LAST:event_routineMouseClicked

    private void roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomMouseClicked
        // TODO add your handling code here:
        new RoomDistribution().setVisible(true);
        dispose();
    }//GEN-LAST:event_roomMouseClicked

    private void rentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentMouseClicked
        // TODO add your handling code here:
        new RentPayment().setVisible(true);
        dispose();
    }//GEN-LAST:event_rentMouseClicked

    private void kitchenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitchenMouseClicked
        // TODO add your handling code here:
        new KitchenMaterials().setVisible(true);
        dispose();
    }//GEN-LAST:event_kitchenMouseClicked

    private void metricBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metricBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metricBoxActionPerformed

    private void pagePanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pagePanelComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pagePanelComponentShown

    private void itemBoxComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_itemBoxComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemBoxComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(pagePanel, "yaali");    GAS & WATER & LIGHT bill?
        ImageIcon icon=new ImageIcon("images/login.png");
        Image img=icon.getImage();
        Image newimg=img.getScaledInstance(24, 22, java.awt.Image.SCALE_SMOOTH);
        ImageIcon finale=new ImageIcon(newimg);
        profile.setIcon(finale);
        
        labelS.setVisible(false);
        specifyField.setVisible(false);
        
        itemBox.addItem("Chicken");
        itemBox.addItem("Coffee Powder");
        itemBox.addItem("Dal");
        itemBox.addItem("Garlic");
        itemBox.addItem("Ginger");
        itemBox.addItem("Flour");
        itemBox.addItem("Maida");
        itemBox.addItem("Milk");
        itemBox.addItem("Other");
        itemBox.addItem("Onion");
        itemBox.addItem("Paneer");
        itemBox.addItem("Potatoes");
        itemBox.addItem("Pulses");
        itemBox.addItem("Rice");
        itemBox.addItem("Salt");
        itemBox.addItem("Spices");
        itemBox.addItem("Sugar");
        itemBox.addItem("Tea Powder");
        itemBox.addItem("Tomatoes");
        itemBox.addItem("Vegetable Oil");
    }//GEN-LAST:event_formComponentShown

    private void costFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costFieldActionPerformed

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        // TODO add your handling code here:
        if(itemBox.getSelectedItem()=="Other")
        {
            if(specifyField.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(pagePanel, "Specify if other!");
            }
            else
            {
                String quantity=quanField.getText()+" "+metricBox.getSelectedItem();
                LocalDate ld=LocalDate.now();
                //System.out.println(quantity);
                try
                {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection con = DriverManager.getConnection(url);
                    Statement stmt=con.createStatement();

                    String s="INSERT INTO inventory(item, buy, buyDate, price) VALUES('"+specifyField.getText()+"','"+quantity+"','"+ld+"','"+costField.getText()+"')";
                    int a=stmt.executeUpdate(s);
                    if(a>0)
                    {
                        JOptionPane.showMessageDialog(pagePanel, "Updated Successfully!");
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        else
        {
            String quantity=quanField.getText()+" "+metricBox.getSelectedItem();
            LocalDate ld=LocalDate.now();
            try
            {
                if(quanField.getText().matches("[0-9]{1,3}") && costField.getText().matches("[0-9]{1,}") && !itemBox.getSelectedItem().equals("Select item"))
                {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection con = DriverManager.getConnection(url);
                    Statement stmt=con.createStatement();

                    String s="INSERT INTO inventory(item, buy, buyDate, price) VALUES('"+itemBox.getSelectedItem()+"','"+quantity+"','"+ld+"','"+costField.getText()+"')";
                    int a=stmt.executeUpdate(s);
                    if(a>0)
                    {
                        JOptionPane.showMessageDialog(pagePanel, "Updated Successfully!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(pagePanel, "Invalid entry!");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_updateBtnMouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        itemBox.setSelectedItem("Select item");
        costField.setText("");
        quanField.setText("");
        metricBox.setSelectedItem("kg");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void billMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billMouseClicked
        // TODO add your handling code here:
        new BillPayment().setVisible(true);
        dispose();
    }//GEN-LAST:event_billMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void itemBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemBoxItemStateChanged
        // TODO add your handling code here:
        if(itemBox.getSelectedItem()=="Other")
        {
            labelS.setVisible(true);
            specifyField.setVisible(true);
        }
        else
        {
            labelS.setVisible(false);
            specifyField.setVisible(false);
        }
    }//GEN-LAST:event_itemBoxItemStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url);
            Statement stmt=con.createStatement();
            
            //////Update monthly revenue & expense
            int cur_m=LocalDate.now().getMonthValue();
            int cur_y=LocalDate.now().getYear();
            int exists;
            String check="SELECT * FROM profLoss WHERE months='"+cur_m+"' AND years='"+cur_y+"'";
            ResultSet r_check=stmt.executeQuery(check);
            if(r_check.next())
            { 
                exists=1;
            }
            else
            {
                exists=0;
            }
            
            ////////////....................................................///////////////////////
            String fDate="01";
            String month=Integer.toString(LocalDate.now().getMonthValue());
            int year=LocalDate.now().getYear();
            
        //Max date in a month    
            YearMonth yearMonthObject = YearMonth.of(year, LocalDate.now().getMonthValue());
            int daysInMonth = yearMonthObject.lengthOfMonth();
            int lDate=daysInMonth;
        
            if(month.length()==1)
            {
                month="0"+month;
            }
            
            String start=year+"-"+month+"-"+fDate;
            String last=year+"-"+month+"-"+lDate;
            LocalDate lStart=LocalDate.parse(start);
            LocalDate lLast=LocalDate.parse(last);
            
            int veg=0, nonveg=0;
                        String v="Select foodCost AS f from feeDetails where opt='veg'";
                        ResultSet rv=stmt.executeQuery(v);
                        if(rv.next())
                        {
                            veg=rv.getInt("f");
                        }
                        
                        String nv="Select foodCost AS f from feeDetails where opt='nonveg'";
                        ResultSet rnv=stmt.executeQuery(nv);
                        if(rnv.next())
                        {
                            nonveg=rnv.getInt("f");
                        }
                        
            int std4=0, std3=0, pre2=0, pre1=0;
                        String rent4="Select roomRent AS r from feeDetails where opt='Standard-4'";
                        ResultSet rs4=stmt.executeQuery(rent4);
                        if(rs4.next())
                        {
                            std4=rs4.getInt("r");
                        }
                        
                        String rent3="Select roomRent AS r from feeDetails where opt='Standard-3'";
                        ResultSet rs3=stmt.executeQuery(rent3);
                        if(rs3.next())
                        {
                            std3=rs3.getInt("r");
                        }
                        
                        String rent2="Select roomRent AS r from feeDetails where opt='Premium-2'";
                        ResultSet rs2=stmt.executeQuery(rent2);
                        if(rs2.next())
                        {
                            pre2=rs2.getInt("r");
                        }
                        
                        String rent1="Select roomRent AS r from feeDetails where opt='Premium-1'";
                        ResultSet rs1=stmt.executeQuery(rent1);
                        if(rs1.next())
                        {
                            pre1=rs1.getInt("r");
                        }
            int sum=0;
            String otp="SELECT * FROM resident WHERE houseStatus='1'";
            ResultSet rop=stmt.executeQuery(otp);
            while(rop.next())
            {
             //check if revenue only for people joined in or before the month
                LocalDate din=rop.getDate("joinFrom").toLocalDate();
                if(din.isBefore(lLast) || din.isEqual(lLast))
                {
                    //System.out.println(din);
                    if(rop.getString("food").equals("veg"))
                    {   //food=2000;  sum+=food;  
                        sum+=veg;
                    }
                    else if(rop.getString("food").equals("nonveg"))
                    {   //food=3500;  sum+=food;  
                        sum+=nonveg;
                    }
                    else
                    {   sum+=0;  }
                    
                    //////////
                    if(rop.getInt("floorNo")<4)
                    {  
                        sum+=std4;
                    }
                    else if(rop.getInt("floorNo")==4)
                    {
                        sum+=std3;
                    }
                    else if(rop.getInt("floorNo")==5)
                    {
                        sum+=pre2;
                    }
                    else if(rop.getInt("floorNo")>5)
                    {
                        sum+=pre1;
                    }
                }
            }
            //System.out.println("Revenue: "+sum);    //revenue in current month includes everyone joined this month and before
            
            String exp="SELECT sum(price) as monthExp FROM inventory WHERE month(buyDate)='"+month+"'";
            int tot=0;
            ResultSet rexp=stmt.executeQuery(exp);
            if(rexp.next())
            {   tot=rexp.getInt("monthExp");    }
            
            ////////////////////............................................................///////////////////////
            if(exists==0)
            {// doesn't exist-> insert
                //JOptionPane.showMessageDialog(pagePanel, "not exists");
                String qry="INSERT INTO profLoss(months, years, revenue, expense) VALUES('"+cur_m+"','"+cur_y+"','"+sum+"','"+tot+"')";
                int a=stmt.executeUpdate(qry);
                if(a==1)
                {
                    //System.out.println("Insert successful");
                }
                else
                {
                    //System.out.println("Insert not successful");
                }
            }
            else
            {// exists-> update
                //JOptionPane.showMessageDialog(pagePanel, "exists");
                String qry="UPDATE profLoss SET revenue='"+sum+"', expense='"+tot+"' WHERE months='"+cur_m+"' AND years='"+cur_y+"'";
                //System.out.println(qry);
                int a=stmt.executeUpdate(qry);
                if(a==1)
                {
                    //System.out.println("Update successful");
                }
                else
                {
                    //System.out.println("Update not successful");
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosed

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
        // TODO add your handling code here:
        new Reports().setVisible(true);
        dispose();
    }//GEN-LAST:event_reportsMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        // TODO add your handling code here:
        new LoginPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_profileMouseClicked

    private void feeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feeMouseClicked
        // TODO add your handling code here:
        new Fees().setVisible(true);
        dispose();
    }//GEN-LAST:event_feeMouseClicked

    private void staffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffMouseClicked
        // TODO add your handling code here:
        new Staff().setVisible(true);
        dispose();
    }//GEN-LAST:event_staffMouseClicked

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
            java.util.logging.Logger.getLogger(KitchenMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitchenMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitchenMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitchenMaterials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitchenMaterials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bill;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField costField;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel fee;
    private javax.swing.JComboBox itemBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kitchen;
    private javax.swing.JLabel labelS;
    private javax.swing.JComboBox metricBox;
    private javax.swing.JPanel pagePanel;
    private javax.swing.JLabel profile;
    private javax.swing.JTextField quanField;
    private javax.swing.JLabel rent;
    private javax.swing.JLabel reports;
    private javax.swing.JLabel room;
    private javax.swing.JLabel routine;
    private javax.swing.JTextField specifyField;
    private javax.swing.JLabel staff;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}