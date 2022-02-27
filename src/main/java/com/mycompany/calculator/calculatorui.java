
package com.mycompany.calculator;

import java.awt.Color;
import static java.lang.Integer.parseInt;

/**
 *
 * @author USER
 */
public class calculatorui extends javax.swing.JFrame {

   
    
    public calculatorui() {
        initComponents();
          this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitbtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        input = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        eight = new javax.swing.JLabel();
        nine = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        dot = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        percentage = new javax.swing.JLabel();
        division = new javax.swing.JLabel();
        multiply = new javax.swing.JLabel();
        clearbtn = new javax.swing.JLabel();
        percentbtn = new javax.swing.JLabel();
        seven = new javax.swing.JLabel();
        btn9 = new javax.swing.JLabel();
        btn8 = new javax.swing.JLabel();
        five = new javax.swing.JLabel();
        btn7 = new javax.swing.JLabel();
        six = new javax.swing.JLabel();
        btn6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn5 = new javax.swing.JLabel();
        three = new javax.swing.JLabel();
        four = new javax.swing.JLabel();
        btn4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        two = new javax.swing.JLabel();
        btn2 = new javax.swing.JLabel();
        btn3 = new javax.swing.JLabel();
        one = new javax.swing.JLabel();
        btn1 = new javax.swing.JLabel();
        equal1 = new javax.swing.JLabel();
        btndot = new javax.swing.JLabel();
        divisionbtn = new javax.swing.JLabel();
        multiplybtn = new javax.swing.JLabel();
        minusbtn = new javax.swing.JLabel();
        plusbtn = new javax.swing.JLabel();
        equalbtn = new javax.swing.JLabel();
        zero = new javax.swing.JLabel();
        btn0 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sans titre — 29 août à 20.28.15.png"))); // NOI18N
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
        });
        jPanel1.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sans titre — 29 août à 20.31.34.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 22, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 390, -1));

        input.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        jPanel1.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 290, 70));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 290, 10));

        eight.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        eight.setText("8");
        jPanel1.add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        nine.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nine.setText("9");
        jPanel1.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        minus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        minus.setText("-");
        jPanel1.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 350, 20, -1));

        plus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        plus.setText("+");
        jPanel1.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        dot.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        dot.setText(".");
        jPanel1.add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 607, 20, 30));

        clear.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        clear.setText("AC");
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        percentage.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        percentage.setText("%");
        jPanel1.add(percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        division.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        division.setText("/");
        jPanel1.add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 270, 20, -1));

        multiply.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        multiply.setText("*");
        jPanel1.add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 280, 20, -1));

        clearbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });
        jPanel1.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, 80));

        percentbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        percentbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                percentbtnMouseClicked(evt);
            }
        });
        jPanel1.add(percentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 90, 80));

        seven.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        seven.setText("7");
        jPanel1.add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 90, 80));

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 90, 80));

        five.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        five.setText("5");
        jPanel1.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 30, -1));

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, 80));

        six.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        six.setText("6");
        jPanel1.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 90, 80));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setText("3");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 90, 80));

        three.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        three.setText("3");
        jPanel1.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, -1, -1));

        four.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        four.setText("4");
        jPanel1.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, 80));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        two.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        two.setText("2");
        jPanel1.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 90, 80));

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 90, 80));

        one.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        one.setText("1");
        jPanel1.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 90, 80));

        equal1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        equal1.setText("=");
        jPanel1.add(equal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, -1));

        btndot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        btndot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndotMouseClicked(evt);
            }
        });
        jPanel1.add(btndot, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 90, 80));

        divisionbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        divisionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisionbtnMouseClicked(evt);
            }
        });
        jPanel1.add(divisionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 90, 80));

        multiplybtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        multiplybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplybtnMouseClicked(evt);
            }
        });
        jPanel1.add(multiplybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 90, 80));

        minusbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        minusbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusbtnMouseClicked(evt);
            }
        });
        jPanel1.add(minusbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 90, 80));

        plusbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        plusbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusbtnMouseClicked(evt);
            }
        });
        jPanel1.add(plusbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 90, 80));

        equalbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Rectangle 4.png"))); // NOI18N
        equalbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalbtnMouseClicked(evt);
            }
        });
        jPanel1.add(equalbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 90, 160));

        zero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        zero.setText("0");
        jPanel1.add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Rectangle 3.png"))); // NOI18N
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });
        jPanel1.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 170, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Rectangle 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 710));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
         System.exit(0);   
    }//GEN-LAST:event_exitbtnMouseClicked

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
       
    }//GEN-LAST:event_inputActionPerformed

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
       input.setText(input.getText()+String.valueOf(1));
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
       input.setText(input.getText()+String.valueOf(2));
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
       input.setText(input.getText()+String.valueOf(3));
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
   input.setText(input.getText()+String.valueOf(4));
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
       input.setText(input.getText()+String.valueOf(5));
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
   input.setText(input.getText()+String.valueOf(6));
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        input.setText(input.getText()+String.valueOf(7));
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
       input.setText(input.getText()+String.valueOf(8));
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
      input.setText(input.getText()+String.valueOf(9));
    }//GEN-LAST:event_btn9MouseClicked

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseClicked
       input.setText(input.getText()+String.valueOf(0));
    }//GEN-LAST:event_btn0MouseClicked

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
       input.setText("");
    }//GEN-LAST:event_clearbtnMouseClicked

    private void plusbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusbtnMouseClicked
        
         if(!(input.getText().isEmpty())){
             operator = "plus";
             value1= Double.parseDouble(input.getText());
        input.setText(input.getText()+ "+");
        
        }
    }//GEN-LAST:event_plusbtnMouseClicked

    private void equalbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalbtnMouseClicked
        if(operator == "plus"){
            String value=input.getText();
           String[] splitString = value.split("\\+");
         String r= splitString[0];
          value2= Double.parseDouble(splitString[1]);
          
             answer = value1 + value2;
        }
         if(operator == "minus"){
            String value=input.getText();
           String[] splitString = value.split("\\-");
         String r= splitString[0];
          value2= Double.parseDouble(splitString[1]);
          
             answer = value1 - value2;
        }
         if(operator == "multiply"){
            String value=input.getText();
           String[] splitString = value.split("\\*");
         String r= splitString[0];
          value2= Double.parseDouble(splitString[1]);
          
             answer = value1 * value2;
        }
          if(operator == "divide"){
            String value=input.getText();
           String[] splitString = value.split("\\/");
         String r= splitString[0];
          value2= Double.parseDouble(splitString[1]);
          
             answer = value1 / (double)  value2;
        }
           if(operator == "percent"){
            String value=input.getText();
           String[] splitString = value.split("\\%");
         String r= splitString[0];
         // value2= Double.parseDouble(splitString[1]);
          
             answer = value1 /100;
        }
         input.setText(String.valueOf(answer));
    }//GEN-LAST:event_equalbtnMouseClicked

    private void btndotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndotMouseClicked
        input.setText(input.getText()+String.valueOf("."));
    }//GEN-LAST:event_btndotMouseClicked

    private void minusbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusbtnMouseClicked
         if(!(input.getText().isEmpty())){
             operator = "minus";
             value1= Double.parseDouble(input.getText());
        input.setText(input.getText()+ "-");
        
        }
    }//GEN-LAST:event_minusbtnMouseClicked

    private void multiplybtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplybtnMouseClicked
          if(!(input.getText().isEmpty())){
             operator = "multiply";
             value1= Double.parseDouble(input.getText());
        input.setText(input.getText()+ "*");
        
        }
    }//GEN-LAST:event_multiplybtnMouseClicked

    private void divisionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionbtnMouseClicked
          if(!(input.getText().isEmpty())){
             operator = "divide";
             value1= Double.parseDouble(input.getText());
        input.setText(input.getText()+ "/");
        
        }
    }//GEN-LAST:event_divisionbtnMouseClicked

    private void percentbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_percentbtnMouseClicked
        if(!(input.getText().isEmpty())){
             operator = "percent";
             value1= Double.parseDouble(input.getText());
        input.setText(input.getText()+ "%");
        
        }
    }//GEN-LAST:event_percentbtnMouseClicked

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
            java.util.logging.Logger.getLogger(calculatorui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculatorui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculatorui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculatorui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculatorui().setVisible(true);
            }
        });
    }
  static double value1;
static double value2;
static String operator;
double answer ;

         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn0;
    private javax.swing.JLabel btn1;
    private javax.swing.JLabel btn2;
    private javax.swing.JLabel btn3;
    private javax.swing.JLabel btn4;
    private javax.swing.JLabel btn5;
    private javax.swing.JLabel btn6;
    private javax.swing.JLabel btn7;
    private javax.swing.JLabel btn8;
    private javax.swing.JLabel btn9;
    private javax.swing.JLabel btndot;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel clearbtn;
    private javax.swing.JLabel division;
    private javax.swing.JLabel divisionbtn;
    private javax.swing.JLabel dot;
    private javax.swing.JLabel eight;
    private javax.swing.JLabel equal1;
    private javax.swing.JLabel equalbtn;
    private javax.swing.JLabel exitbtn;
    private javax.swing.JLabel five;
    private javax.swing.JLabel four;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel minus;
    private javax.swing.JLabel minusbtn;
    private javax.swing.JLabel multiply;
    private javax.swing.JLabel multiplybtn;
    private javax.swing.JLabel nine;
    private javax.swing.JLabel one;
    private javax.swing.JLabel percentage;
    private javax.swing.JLabel percentbtn;
    private javax.swing.JLabel plus;
    private javax.swing.JLabel plusbtn;
    private javax.swing.JLabel seven;
    private javax.swing.JLabel six;
    private javax.swing.JLabel three;
    private javax.swing.JLabel two;
    private javax.swing.JLabel zero;
    // End of variables declaration//GEN-END:variables
}
