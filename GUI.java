



package Ryanair_Flight_app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Ryanair Ticket App
 * GUI.java
 * @author Louise Howard
 */


public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    
    public GUI() {
        initComponents();
        //    Hiding the Show Histoy button until Submit button is selected
        historyBtn.setVisible(false);
    }

    
    // Initialising all variables used in GUI are below
    public double returnPrice; 
    Ticket tick;
    public double agePrice;
    public int seatPrice;
    public double flightPrice;
    public double destinationPrice;   
    public double totalCost;
    public String destinationName;
    public String name;
    public int age;
    public String passport;
   
    

  
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        adultButton = new javax.swing.JCheckBox();
        childButton = new javax.swing.JCheckBox();
        economyButton = new javax.swing.JCheckBox();
        FirstClassButton = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTextBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ageTextBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passTextBox = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxDestination = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        singleButton = new javax.swing.JCheckBox();
        returnButton = new javax.swing.JCheckBox();
        jLabelTotalCost = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextReceipt = new javax.swing.JTextArea();
        totalCostLabel = new javax.swing.JLabel();
        standardButton = new javax.swing.JCheckBox();
        receiptButton = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        buttonGroup3.add(adultButton);
        adultButton.setText("Adult");
        adultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(childButton);
        childButton.setText("Child");
        childButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(economyButton);
        economyButton.setText("Economy");
        economyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                economyButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(FirstClassButton);
        FirstClassButton.setText("First Class");
        FirstClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstClassButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ryanair Ticket Purchase");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ticket Type");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator1.setBackground(new java.awt.Color(51, 0, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customer Info");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Class Type");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("First Name & Last Name:");

        nameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Age:");

        ageTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Passport Number");

        passTextBox.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextBoxActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Destination");

        jComboBoxDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "LA", "New York", "Amsterdam", "Berlin", "Tokyo", "Seoul", "Sydney", "Egypt", "Warsaw", "London" }));
        jComboBoxDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDestinationActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Destination Choice:");

        jSeparator5.setBackground(new java.awt.Color(51, 51, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Flight Type");

        buttonGroup2.add(singleButton);
        singleButton.setText("Single Flight");
        singleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(returnButton);
        returnButton.setText("Return Flight");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        jLabelTotalCost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTotalCost.setText("Total Cost:");

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(51, 51, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Receipt");

        jTextReceipt.setColumns(20);
        jTextReceipt.setRows(5);
        jScrollPane1.setViewportView(jTextReceipt);

        buttonGroup1.add(standardButton);
        standardButton.setText("Standard");
        standardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardButtonActionPerformed(evt);
            }
        });

        receiptButton.setText("Print Receipt");
        receiptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receiptButtonMouseClicked(evt);
            }
        });

        historyBtn.setText("Show History");
        historyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(standardButton)
                        .addGap(33, 33, 33)
                        .addComponent(economyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(FirstClassButton)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(ageTextBox)
                                    .addComponent(passTextBox)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(adultButton)
                                .addGap(83, 83, 83)
                                .addComponent(childButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 26, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(28, 28, 28)
                        .addComponent(jComboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(singleButton)
                                .addGap(38, 38, 38)
                                .addComponent(returnButton))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonExit)
                                    .addComponent(jLabelTotalCost))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonClear)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSubmit)
                                        .addGap(18, 18, 18)
                                        .addComponent(receiptButton))
                                    .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel12)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())))))
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jComboBoxDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(singleButton)
                                    .addComponent(returnButton))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTotalCost)
                                    .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonExit)
                                    .addComponent(jButtonClear)
                                    .addComponent(jButtonSubmit)
                                    .addComponent(receiptButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(nameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(ageTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(passTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adultButton)
                                    .addComponent(childButton))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(economyButton)
                                    .addComponent(FirstClassButton)
                                    .addComponent(standardButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(historyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultButtonActionPerformed
        if(adultButton.isSelected()){
            agePrice = 30;
        }
    }//GEN-LAST:event_adultButtonActionPerformed

    private void economyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_economyButtonActionPerformed
       tick = new Economy();
    }//GEN-LAST:event_economyButtonActionPerformed

    private void childButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childButtonActionPerformed
        if(childButton.isSelected()){
            agePrice = 20;
        }
    }//GEN-LAST:event_childButtonActionPerformed

    private void FirstClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstClassButtonActionPerformed
        tick = new FirstClass();
    }//GEN-LAST:event_FirstClassButtonActionPerformed

    private void singleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleButtonActionPerformed
        if(singleButton.isSelected()){
            returnPrice = 1;
        }
    }//GEN-LAST:event_singleButtonActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        
        historyBtn.setVisible(true);
        
        
//        @author Conor Howard assigned the varibales from the inheritance class
        if(standardButton.isSelected()){
//            Standard myStandard;
//            myStandard = new Standard();
            ((Standard)(tick)).compute();
            seatPrice = tick.getSeatPrice();
        }
        else if(economyButton.isSelected()){
//            Economy myEconomy;
//            myEconomy = new Economy();
            ((Economy)(tick)).compute();
            seatPrice = tick.getSeatPrice();
        }
        else if(FirstClassButton.isSelected()){
//            FirstClass myFirstClass;
//            myFirstClass = new FirstClass();
            ((FirstClass)(tick)).compute();
            seatPrice = tick.getSeatPrice();
        }
        
        // Destination coding goes here
        // LA, New York, Amsterdam, Berlin, Tokyo, Seoul, Sydney, Egypt, Warsaw, London
        
        //@author Eamon Doherty coded everything that's below this comment. Doing the receipt and destination code.
        if((jComboBoxDestination.getSelectedItem().equals("LA")) ){
            destinationPrice = 1119;
            destinationName = "LA";
        }
        
        else if (jComboBoxDestination.getSelectedItem().equals("New York")){
            destinationPrice = 550;
            destinationName = "New York";           
        }
        
        else if ((jComboBoxDestination.getSelectedItem().equals("Amsterdam"))) {
            destinationPrice = 100;
            destinationName = "Amsterdam";
        }    
        
        else if (jComboBoxDestination.getSelectedItem().equals("Berlin")){
            destinationPrice = 125;
            destinationName = "Berlin";
        }
        
        else if (jComboBoxDestination.getSelectedItem().equals("London")) {
            destinationPrice = 90;
            destinationName = "London";
        }        
                
        else if ((jComboBoxDestination.getSelectedItem().equals("Tokyo"))){
            destinationPrice = 880;
            destinationName = "Tokyo";
        } 
        else if (jComboBoxDestination.getSelectedItem().equals("Seoul")) {
            destinationPrice = 1220;
            destinationName = "Seoul";
        }
        
        else if (jComboBoxDestination.getSelectedItem().equals("Sydney")) {
            destinationPrice = 1400;
            destinationName = "Sydney";
        }
        
        else if((jComboBoxDestination.getSelectedItem().equals("Egypt"))){
            destinationPrice = 333;
            destinationName = "Egypt";
        }
        else if((jComboBoxDestination.getSelectedItem().equals("Warsaw"))){
            destinationPrice = 180;
            destinationName = "Warsaw";
        }
        
               
        
        totalCost = (seatPrice + agePrice + destinationPrice)* returnPrice;
        
        String Total = String.format("€%.2f",totalCost);
        totalCostLabel.setText(Total);
        
        // @author C.Howard
        // 5/12/2017
        try{
            File f = new File("history.txt");
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            String textName = nameTextBox.getText();
            String textAge = ageTextBox.getText();
            String textPass = passTextBox.getText();
            bw.write(textName);
            bw.write(textAge);
            bw.write(textPass);
            bw.newLine();
            bw.close();
            
            
        }
        catch (IOException e){
            
        }
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jComboBoxDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDestinationActionPerformed
       
       
    }//GEN-LAST:event_jComboBoxDestinationActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        if(returnButton.isSelected()){
            returnPrice = 1.7;
        }
    }//GEN-LAST:event_returnButtonActionPerformed

    private void nameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextBoxActionPerformed
//        String TextName = jTextFieldEnterName.getText();
    }//GEN-LAST:event_nameTextBoxActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        totalCostLabel.setText(null);
        buttonGroup3.clearSelection();
        passTextBox.setText(null);
        nameTextBox.setText(null);
        ageTextBox.setText(null);
        jTextReceipt.setText(null);
        jComboBoxDestination.setSelectedItem("None");
        historyBtn.setVisible(false);
        
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void receiptButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiptButtonMouseClicked
       
        historyBtn.setVisible(true);
        
       //Eamon coded the receipt, Wojtek and Conor Howard helped with problems and structuring of the receipt
         Ticket t = new Ticket();
        
        
        String Destination = String.format("€%.2f", destinationPrice);
        String Total = String.format("€%.2f",totalCost);
        String DestinationName = String.format(destinationName);    
        
        
        String format ="%-20s %s" ;
        String Receipt = String.format(format, " Your total cost is " +Total+ 
                                               "                            ",
                                            
                                               "\n The original cost before additional prices " +Destination +
                                                       
                                               "\n You are travelling to " +DestinationName +
                                               
                                               "\n Your seat Number is: " + t.getSeatNum());      
       
                
          jTextReceipt.setText(Receipt);
         
        
       
        
    }//GEN-LAST:event_receiptButtonMouseClicked

    private void standardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardButtonActionPerformed
      tick = new Standard ();
    }//GEN-LAST:event_standardButtonActionPerformed

    private void historyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyBtnActionPerformed

        

          try{
              File f = new File("history.txt");
              FileReader fr = new FileReader(f);
              BufferedReader br = new BufferedReader(fr);
              String textName;
              String textAge;
              String textPass;
              ArrayList<String> showHistory = new ArrayList();
              textName = br.readLine();
              textAge = br.readLine();
              textPass = br.readLine();
              while(textName!=null){
                  showHistory.add(textName);
                  showHistory.add(textAge);
                  showHistory.add(textPass);
                  JOptionPane.showMessageDialog(null, "Passenger Name: "+textName);
                  textName = br.readLine();
                
              }
              JOptionPane.showMessageDialog(null, "Passenger Name, Age, Passport Number: " +showHistory);
              br.close();
              
          
              
              
              
          }
          catch(IOException e){
              System.out.println(e);
              System.out.println("Sorry, The file could not be read");
          }
            
    

    }//GEN-LAST:event_historyBtnActionPerformed

    private void ageTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextBoxActionPerformed
        String textAge = ageTextBox.getText();
    }//GEN-LAST:event_ageTextBoxActionPerformed

    private void passTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextBoxActionPerformed
        String textPass = passTextBox.getText();
    }//GEN-LAST:event_passTextBoxActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox FirstClassButton;
    private javax.swing.JCheckBox adultButton;
    private javax.swing.JTextField ageTextBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox childButton;
    private javax.swing.JCheckBox economyButton;
    private javax.swing.JButton historyBtn;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBoxDestination;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTotalCost;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextArea jTextReceipt;
    private javax.swing.JTextField nameTextBox;
    private javax.swing.JTextField passTextBox;
    private javax.swing.JButton receiptButton;
    private javax.swing.JCheckBox returnButton;
    private javax.swing.JCheckBox singleButton;
    private javax.swing.JCheckBox standardButton;
    private javax.swing.JLabel totalCostLabel;
    // End of variables declaration//GEN-END:variables
}
