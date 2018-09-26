
import java.awt.Color;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sandesh
 */
public class tic extends javax.swing.JFrame {
  
    /**
     * Creates new form tic
     */
    private String whosetrun = "X";
    private String playerone = "Player One";
    private String playertwo = "Player Two";
    private int onecount = 0;
    private int twocount = 0;
    private String  playermove = "";
    
    
    public tic() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        getplayername();
        playermove();
       // setscore();
        
    }
    
  /*  private void setscore()
    {
        score.setText(playerone +"'s score is: "+ String.valueOf(onecount) +"\t    "+ playertwo
        +"'s score is: "+ String.valueOf(twocount));
    }*/
    private void playermove()
    {
        if(whosetrun.equalsIgnoreCase("X"))
            playermove = playerone;
        else
            playermove = playertwo;
        
        score.setText(playerone +"'s score is: "+ String.valueOf(onecount) +" "+ playermove+"'s Turn   "+ playertwo
        +"'s score is: "+ String.valueOf(twocount));
        
    }
    private void getplayername()
    {
        playerone = JOptionPane.showInputDialog(this, 
                "Player One Name",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        
        playertwo = JOptionPane.showInputDialog(this, 
                "Player Two Name",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        
        if (playerone.equals(""))
        {
            playerone = "Player One";
        }
        if (playertwo.equals(""))
        {
            playertwo = "Player Two";
        }
    }
    private void reset()
     {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        playermove();
        
    }
    
    private void determinewhosetrun()
    {
        if(whosetrun.equalsIgnoreCase("X"))
            whosetrun =  "O";
        else
            whosetrun =  "X";
    }
    private void xwins()
    {
        JOptionPane.showMessageDialog( this,
                "Winner Winner Chicken Dinner " + playerone,
         "Player One(X) wins",JOptionPane.INFORMATION_MESSAGE);
        onecount++;
        reset();
        
    }
    
    private void owins()
    {
        JOptionPane.showMessageDialog( this,
                "Winner Winner Chicken Dinner "+ playertwo,
         "Player two(O) wins",JOptionPane.INFORMATION_MESSAGE);
        twocount++;
        reset();
        
    }
    
    private void determinewin()
    {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        if(one == "X" && two == "X" && three == "X")
        {
            xwins();
        }
        if(four == "X" && five == "X" && six == "X")
        {
            xwins();
        }
        if(seven == "X" && eight == "X" && nine == "X")
        {
            xwins();
        }
        if(one == "X" && four == "X" && seven == "X")
        {
            xwins();
        }
        if(two == "X" && five == "X" && eight == "X")
        {
            xwins();
        }
        if(three == "X" && six == "X" && nine == "X")
        {
            xwins();
        }
        if(one == "X" && five == "X" && nine == "X")
        {
            xwins();
        }
        if(three == "X" && five == "X" && seven == "X")
        {
            xwins();
        }
        
        // if O wins
        if(one == "O" && two == "O" && three == "O")
        {
            owins();
        }
        if(four == "O" && five == "O" && six == "O")
        {
            owins();
        }
        if(seven == "O" && eight == "O" && nine == "O")
        {
            owins();
        }
        if(one == "O" && four == "O" && seven == "O")
        {
            owins();
        }
        if(two == "O" && five == "O" && eight == "O")
        {
            owins();
        }
        if(three == "O" && six == "O" && nine == "O")
        {
            owins();
        }
        if(one == "O" && five == "O" && nine == "O")
        {
            owins();
        }
        if(three == "O" && five == "O" && seven == "O")
        {
            owins();
        }
    }
    
    private void gamedraw()
    {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        if(one != "" && two != "" && three != "" && four != "" && five != "" && six != "" && seven != "" && eight != "" &&
                nine != "")
        {
            JOptionPane.showMessageDialog(this, "Game is Draw", 
                    "Tie Game",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        score = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tic1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        tic2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        tic3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        tic4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        tic5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        tic6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        tic7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        tic8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        tic9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setFocusableWindowState(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.BorderLayout());

        score.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("Score");
        jPanel1.add(score, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        tic1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        tic1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(tic1);

        tic2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        tic2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(tic2);

        tic3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Forte", 0, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        tic3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(tic3);

        tic4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        tic4.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(tic4);

        tic5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        tic5.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(tic5);

        tic6.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        tic6.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(tic6);

        tic7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        tic7.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(tic7);

        tic8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        tic8.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(tic8);

        tic9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        tic9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(tic9);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if(jButton1.getText() == ""){
            jButton1.setText(whosetrun);
            
            if(whosetrun.equalsIgnoreCase("X"))
            {
                jButton1.setForeground(new Color(25, 181, 254));
                
            }
            else 
            {
                jButton1.setForeground(new Color(207, 0, 15));
                
            }
            determinewhosetrun();
            determinewin();
            gamedraw();
            playermove();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if(jButton2.getText() == ""){
            jButton2.setText(whosetrun);
            if(whosetrun.equalsIgnoreCase("X"))
           {
               jButton2.setForeground(new Color(25, 181, 254));
           }
           else 
           {
               jButton2.setForeground(new Color(207, 0, 15));
           }
           determinewhosetrun();
           determinewin();
           gamedraw();
            playermove();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if(jButton3.getText() == ""){
            jButton3.setText(whosetrun);
            if(whosetrun.equalsIgnoreCase("X"))            
            {
                jButton3.setForeground(new Color(25, 181, 254));
            }
            else 
            {
                jButton3.setForeground(new Color(207, 0, 15));
            }
            determinewhosetrun();
            determinewin();
            gamedraw();
             playermove();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if(jButton4.getText() == ""){
            jButton4.setText(whosetrun);
           if(whosetrun.equalsIgnoreCase("X"))
           {
               jButton4.setForeground(new Color(25, 181, 254));
           }
           else 
           {
               jButton4.setForeground(new Color(207, 0, 15));
           }
           determinewhosetrun();
           determinewin();
           gamedraw();
            playermove();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jButton5.getText() == ""){
            jButton5.setText(whosetrun);
            jButton5.setText(whosetrun);
            if(whosetrun.equalsIgnoreCase("X"))
            {
               jButton5.setForeground(new Color(25, 181, 254));
            }
            else 
            {
               jButton5.setForeground(new Color(207, 0, 15));
            }
            determinewhosetrun();
            determinewin();
            gamedraw();
             playermove();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if(jButton6.getText() == ""){
            jButton6.setText(whosetrun);
            if(whosetrun.equalsIgnoreCase("X"))
           {
               jButton6.setForeground(new Color(25, 181, 254));               
           }
           else 
           {
               jButton6.setForeground(new Color(207, 0, 15)); 
           }
           determinewhosetrun();
           determinewin();
           gamedraw();
            playermove();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(jButton7.getText() == ""){
          jButton7.setText(whosetrun);
          if(whosetrun.equalsIgnoreCase("X"))
          {
              jButton7.setForeground(new Color(25, 181, 254));
          }
          else 
          {
              jButton7.setForeground(new Color(207, 0, 15));
          }
          determinewhosetrun();
          determinewin();
          gamedraw();
           playermove();
     }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      if(jButton8.getText() == ""){
            jButton8.setText(whosetrun);
            if(whosetrun.equalsIgnoreCase("X"))
           {
               jButton8.setForeground(new Color(25, 181, 254));
               
           }
           else 
           {
               jButton8.setForeground(new Color(207, 0, 15));   
           }
           determinewhosetrun();
           determinewin();
           gamedraw();
            playermove();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      if(jButton9.getText() == ""){
            jButton9.setText(whosetrun);
            if(whosetrun.equalsIgnoreCase("X"))
           {
               jButton9.setForeground(new Color(25, 181, 254));   
           }
           else 
           {
               jButton9.setForeground(new Color(207, 0, 15));   
           }
           determinewhosetrun();
           determinewin();
           gamedraw();
            playermove();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel score;
    private javax.swing.JPanel tic1;
    private javax.swing.JPanel tic2;
    private javax.swing.JPanel tic3;
    private javax.swing.JPanel tic4;
    private javax.swing.JPanel tic5;
    private javax.swing.JPanel tic6;
    private javax.swing.JPanel tic7;
    private javax.swing.JPanel tic8;
    private javax.swing.JPanel tic9;
    // End of variables declaration//GEN-END:variables
}
