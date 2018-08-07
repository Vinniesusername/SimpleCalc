package simplecalc;

import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Primary author Vinnie
 * @author Msukan
 */
public class GUI extends javax.swing.JFrame {

   private double num1;
   private double num2;
   private int mode; // this decides what action is taken in the switch statement
   public GUI() {
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {
   
      jButton2 = new javax.swing.JButton();
      jButton1 = new javax.swing.JButton();
      addButton = new javax.swing.JButton();
      equalsButton = new javax.swing.JButton();
      resultField = new javax.swing.JTextField();
      oneButton = new javax.swing.JButton();
      twoButton = new javax.swing.JButton();
      threeButton = new javax.swing.JButton();
      fourButton = new javax.swing.JButton();
      fiveButton = new javax.swing.JButton();
      sixButton = new javax.swing.JButton();
      sevenButton = new javax.swing.JButton();
      eightButton = new javax.swing.JButton();
      nineButton = new javax.swing.JButton();
      zeroButton = new javax.swing.JButton();
      clearButton = new javax.swing.JButton();
      minusButton = new javax.swing.JButton();
      multiButton = new javax.swing.JButton();
      divideButton = new javax.swing.JButton();
      exptButton = new javax.swing.JButton();
      sinButton = new javax.swing.JButton();
      cosButton = new javax.swing.JButton();
      decButton = new javax.swing.JButton();
      negateButton = new javax.swing.JButton();
      rootButton = new javax.swing.JButton();
      lnButton = new javax.swing.JButton();
      logButton = new javax.swing.JButton();
      expressionLabel = new javax.swing.JLabel();
      CE = new javax.swing.JButton();
   
      jButton2.setText("jButton2");
   
      jButton1.setText("jButton1");
   
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("OpenCalc");
      setResizable(false);
      addKeyListener(
         new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
               formKeyPressed(evt);
            }
         });
   
      addButton.setText("+");
      addButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               addButtonActionPerformed(evt);
            }
         });
      addButton.addKeyListener(
         new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
               addButtonKeyPressed(evt);
            }
         });
   
      equalsButton.setText("=");
      equalsButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               equalsButtonActionPerformed(evt);
            }
         });
   
      resultField.setFocusCycleRoot(true);
      resultField.setFocusTraversalPolicyProvider(true);
   
      oneButton.setText("1");
      oneButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               oneButtonActionPerformed(evt);
            }
         });
   
      twoButton.setText("2");
      twoButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               twoButtonActionPerformed(evt);
            }
         });
   
      threeButton.setText("3");
      threeButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               threeButtonActionPerformed(evt);
            }
         });
   
      fourButton.setText("4");
      fourButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               fourButtonActionPerformed(evt);
            }
         });
   
      fiveButton.setText("5");
      fiveButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               fiveButtonActionPerformed(evt);
            }
         });
   
      sixButton.setText("6");
      sixButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               sixButtonActionPerformed(evt);
            }
         });
   
      sevenButton.setText("7");
      sevenButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               sevenButtonActionPerformed(evt);
            }
         });
   
      eightButton.setText("8");
      eightButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               eightButtonActionPerformed(evt);
            }
         });
   
      nineButton.setText("9");
      nineButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               nineButtonActionPerformed(evt);
            }
         });
   
      zeroButton.setText("0");
      zeroButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               zeroButtonActionPerformed(evt);
            }
         });
   
      clearButton.setText("Clear");
      clearButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               clearButtonActionPerformed(evt);
            }
         });
   
      minusButton.setText("-");
      minusButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               minusButtonActionPerformed(evt);
            }
         });
   
      multiButton.setText("*");
      multiButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               multiButtonActionPerformed(evt);
            }
         });
   
      divideButton.setText("/");
      divideButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               divideButtonActionPerformed(evt);
            }
         });
   
      exptButton.setText("x**n");
      exptButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               exptButtonActionPerformed(evt);
            }
         });
   
      sinButton.setText("Sin(x)");
      sinButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               sinButtonActionPerformed(evt);
            }
         });
   
      cosButton.setText("Cos(x)");
      cosButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               cosButtonActionPerformed(evt);
            }
         });
   
      decButton.setText(".");
      decButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               decButtonActionPerformed(evt);
            }
         });
   
      negateButton.setText("+/-");
      negateButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               negateButtonActionPerformed(evt);
            }
         });
   
      rootButton.setText("sqrt");
      rootButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               rootButtonActionPerformed(evt);
            }
         });
   
      lnButton.setText("ln(x)");
      lnButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               lnButtonActionPerformed(evt);
            }
         });
   
      logButton.setText("log(x)");
      logButton.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               logButtonActionPerformed(evt);
            }
         });
   
      CE.setText("CE");
      CE.addActionListener(
         new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               CEActionPerformed(evt);
            }
         });
   
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(resultField, javax.swing.GroupLayout.Alignment.TRAILING)
         .addGroup(layout.createSequentialGroup()
             .addGap(26, 26, 26)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(layout.createSequentialGroup()
                     .addGap(43, 43, 43)
                     .addComponent(expressionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                 .addGroup(layout.createSequentialGroup()
                     .addComponent(addButton)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addComponent(minusButton)
                     .addGap(14, 14, 14)
                     .addComponent(multiButton)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(divideButton)
                     .addGap(14, 14, 14)
                     .addComponent(equalsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                 .addGroup(layout.createSequentialGroup()
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addGroup(layout.createSequentialGroup()
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                 .addGroup(layout.createSequentialGroup()
                                     .addComponent(decButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                     .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                     .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                 .addGroup(layout.createSequentialGroup()
                                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                         .addComponent(negateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                         .addComponent(rootButton, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                         .addGroup(layout.createSequentialGroup()
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                             .addGap(6, 6, 6)
                                             .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                             .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                             .addGap(0, 0, Short.MAX_VALUE))
                         .addGroup(layout.createSequentialGroup()
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addGroup(layout.createSequentialGroup()
                                     .addComponent(logButton)
                                     .addGap(0, 0, Short.MAX_VALUE))
                                 .addComponent(lnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                 .addGroup(layout.createSequentialGroup()
                                     .addComponent(exptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                     .addComponent(sinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                 .addGroup(layout.createSequentialGroup()
                                     .addComponent(CE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                     .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addComponent(cosButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(fourButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(oneButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(sevenButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(zeroButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
         );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
             .addContainerGap()
             .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(expressionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
             .addGap(18, 18, 18)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(addButton)
                 .addComponent(minusButton)
                 .addComponent(multiButton)
                 .addComponent(divideButton)
                 .addComponent(equalsButton))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(exptButton)
                 .addComponent(sinButton)
                 .addComponent(cosButton)
                 .addComponent(logButton))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(zeroButton)
                 .addComponent(clearButton)
                 .addComponent(lnButton)
                 .addComponent(CE))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(sevenButton)
                 .addComponent(eightButton)
                 .addComponent(nineButton)
                 .addComponent(rootButton))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(fourButton)
                 .addComponent(fiveButton)
                 .addComponent(sixButton)
                 .addComponent(negateButton))
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
             .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                 .addComponent(oneButton)
                 .addComponent(threeButton)
                 .addComponent(twoButton)
                 .addComponent(decButton))
             .addContainerGap())
         );
   
      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>                        

   private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
   
      num1 = Double.parseDouble(resultField.getText());
      expressionLabel.setText(expressionLabel.getText() + "+");
      resultField.setText("");
      mode = 0;   
   }                                         

   private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
      if(mode == 5 || mode == 6 || mode == 7 || mode == 8 || mode ==9)
      {
         num2 = 0;
      }
      else
      {
         num2 = Double.parseDouble(resultField.getText());
      }
             
      resultField.setText("");
     
      double sum;
      
      switch(mode)
      {
         case(0):
            sum = num1+num2;
            
            if ((num1 == (int)num1) &&(num2 == (int)num2 ))   {//If integers
            resultField.setText(String.valueOf((int)sum));//Result is integer
            } 
            
            else{
               resultField.setText(String.valueOf(sum));
            }
           
            break;
         case(1):
         sum = num1-num2;
            
            if ((num1 == (int)num1) &&(num2 == (int)num2 ))   { 
            resultField.setText(String.valueOf((int)sum));   
            } 
            
            else{
               resultField.setText(String.valueOf(sum));
            }
            
            break;
         case(2):
            sum = num1*num2;
            
            if ((num1 == (int)num1) &&(num2 == (int)num2 ))   { 
            resultField.setText(String.valueOf((int)sum));   
            } 
            
            else{
               resultField.setText(String.valueOf(sum));
            }
            
            break;
         case(3):
            sum = num1/num2;
            if(num2 == 0)
            {
               resultField.setText("Divide by Zero - Error. Clear and try again");
               break;
            }
            
            if  (sum- (int)sum == 0)  { //If answer is an integer
            resultField.setText(String.valueOf((int)sum));   
            } 
            
            else{
               resultField.setText(String.valueOf(sum));
            }
            
            break;
                  
         case(4):
            
         
            sum = (Math.pow(num1, num2));
            if (((num1  == (int)num1))  && ((num2  == (int)num2)))  {//If integer
                resultField.setText(String.valueOf((int)sum));        
            }
            else
            {
            resultField.setText(""+ sum +"");
            }
            break;
            
         case(5):
            resultField.setText(String.valueOf(Math.sin(num1)));
            break;
         case(6):
            resultField.setText(String.valueOf(Math.cos(num1)));
            break;
         case(7):
         
         
            sum = (Math.sqrt(num1));
            if (((num1  == (int)num1))  && ((sum  == (int)sum)))  {//If integer
               sum = (int)sum;
            resultField.setText(String.valueOf((int)sum));        
            }
            else
            {
            resultField.setText(""+ sum +"");
            }
          break;
         case(8):
            resultField.setText(String.valueOf(Math.log10(num1)));
            break;
         case(9):
            resultField.setText(String.valueOf(Math.log(num1)));
            break;
         default:
            resultField.setText("Error: mode = " + mode);      
          }
   }                                            

   private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
      resultField.setText(resultField.getText() + "3");
      expressionLabel.setText(expressionLabel.getText() + "3");
   }                                           

   private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
      resultField.setText(resultField.getText() + "0");
      expressionLabel.setText(expressionLabel.getText() + "0");
   }                                          

   private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
      resultField.setText(resultField.getText() + "9");
      expressionLabel.setText(expressionLabel.getText() + "9");
   }                                          

   private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
      resultField.setText(resultField.getText() + "8");
      expressionLabel.setText(expressionLabel.getText() + "8");
   }                                           

   private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
      resultField.setText(resultField.getText() + "7");
      expressionLabel.setText(expressionLabel.getText() + "7");
   }                                           

   private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
      resultField.setText(resultField.getText() + "6");
      expressionLabel.setText(expressionLabel.getText() + "6");
   }                                         

   private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
      resultField.setText(resultField.getText() + "5");
      expressionLabel.setText(expressionLabel.getText() + "5");
   }                                          

   private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
      resultField.setText(resultField.getText() + "4");
      expressionLabel.setText(expressionLabel.getText() + "4");
   }                                          

   private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
      resultField.setText(resultField.getText() + "2");
      expressionLabel.setText(expressionLabel.getText() + "2");
   }                                         

   private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
      resultField.setText(resultField.getText() + "1");
      expressionLabel.setText(expressionLabel.getText() + "1");
   }                                         

   private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
      resultField.setText("");
      expressionLabel.setText("");
      num1 =0; num2 =0; mode = -1;
   }                                           

   private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
      num1 = Double.parseDouble(resultField.getText());
      resultField.setText("");
      expressionLabel.setText(expressionLabel.getText() + "- ");
      mode = 1;
   }                                           

   private void multiButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
      num1 = Double.parseDouble(resultField.getText());
      resultField.setText("");
      expressionLabel.setText(expressionLabel.getText() + "* ");
      mode = 2;
   }                                           

   private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
      num1 = Double.parseDouble(resultField.getText());
      resultField.setText("");
      expressionLabel.setText(expressionLabel.getText() + "/ ");
      mode = 3;
   }                                            

   private void addButtonKeyPressed(java.awt.event.KeyEvent evt) {                                     
      
   }                                    

   private void exptButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
      num1 = Double.parseDouble(resultField.getText());
      resultField.setText("");
      expressionLabel.setText( expressionLabel.getText() + "^");
      mode = 4;
   }                                          

   private void sinButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
      num1 = Double.parseDouble(resultField.getText());
      resultField.setText("");
      expressionLabel.setText("sin(" + num1 + ")");
      mode = 5;
   }                                         

   private void cosButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
      num1 = Double.parseDouble(resultField.getText());
      resultField.setText("");
      expressionLabel.setText("cos(" + num1 + ")");
      mode = 6;
   }                                         

   private void decButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
      resultField.setText(resultField.getText() + ".");
      expressionLabel.setText(expressionLabel.getText()+"." );
   }                                         


   private void negateButtonActionPerformed(java.awt.event.ActionEvent evt) {
   
   
      num1 = Double.parseDouble(resultField.getText());
      num1 = num1 * (-1);
   
   if ((num1  == (int)num1))     {//If integer
          
         num1 = ((int)num1);
                      
         expressionLabel.setText(""+((int)num1)+"" );
         resultField.setText(""+((int)num1)+"" ); 
      }
      
      else
      {
      num1 = Double.parseDouble(resultField.getText()) * -1;
         resultField.setText(""+ num1+ "");
         expressionLabel.setText(""+ num1 +"" );
         expressionLabel.setText(resultField.getText());
      }                                             
    }                                            

   private void rootButtonActionPerformed(java.awt.event.ActionEvent evt) { 
                                             
      num1 = Double.parseDouble(resultField.getText());
      if( num1 == (int)num1)
      {
         num1 = (int)num1;
         expressionLabel.setText("sqrt(" + (int)num1 + ")");
         resultField.setText("");
         mode = 7; 
         
      }
      else{
       
         resultField.setText("");
      expressionLabel.setText("sqrt(" + num1 + ")");
         mode = 7;  
      }
   }                                          

   private void formKeyPressed(java.awt.event.KeyEvent evt) {                                
      if(evt.getKeyCode() == KeyEvent.VK_PLUS)
      {
         num1 = Double.parseDouble(resultField.getText());
         resultField.setText("");
         mode = 0;
      }
   }                               

   private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
      mode = 8;
      num1 = Double.parseDouble(resultField.getText());
      resultField.setText("");
      expressionLabel.setText("log(" + num1 + ")");
   }   
                                            

   private void lnButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
      mode = 9;
      num1 = Double.parseDouble(resultField.getText());
      resultField.setText("");
      expressionLabel.setText("ln(" + num1 + ")");
   }                                        

   private void CEActionPerformed(java.awt.event.ActionEvent evt) {                                   
       
      num2 = 0;
      mode = -1;
     
      if ((num1  == (int)num1))     {//If integer
            
         expressionLabel.setText(""+(int)num1+"" );
         resultField.setText(String.valueOf((int)num1));
      }
      
      else
      {
      expressionLabel.setText(""+num1+"" );
         resultField.setText(String.valueOf(num1));
      }
      
   }                                  
        
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
      java.awt.EventQueue.invokeLater(
         new Runnable() {
            public void run() {
               new GUI().setVisible(true);
            }
         });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JButton CE;
   private javax.swing.JButton addButton;
   private javax.swing.JButton clearButton;
   private javax.swing.JButton cosButton;
   private javax.swing.JButton decButton;
   private javax.swing.JButton divideButton;
   private javax.swing.JButton eightButton;
   private javax.swing.JButton equalsButton;
   private javax.swing.JLabel expressionLabel;
   private javax.swing.JButton exptButton;
   private javax.swing.JButton fiveButton;
   private javax.swing.JButton fourButton;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton lnButton;
   private javax.swing.JButton logButton;
   private javax.swing.JButton minusButton;
   private javax.swing.JButton multiButton;
   private javax.swing.JButton negateButton;
   private javax.swing.JButton nineButton;
   private javax.swing.JButton oneButton;
   private javax.swing.JTextField resultField;
   private javax.swing.JButton rootButton;
   private javax.swing.JButton sevenButton;
   private javax.swing.JButton sinButton;
   private javax.swing.JButton sixButton;
   private javax.swing.JButton threeButton;
   private javax.swing.JButton twoButton;
   private javax.swing.JButton zeroButton;
   // End of variables declaration                   
}
