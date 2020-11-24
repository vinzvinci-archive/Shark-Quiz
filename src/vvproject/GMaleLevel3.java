
package vvproject;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GMaleLevel3 extends javax.swing.JFrame {

    /*
    * Developer: Vincent Villafuerte
    */   
    
    public GMaleLevel3() {
        initComponents();
        txtAnswer.setEnabled(false);
        lblLocked.show();
        btnEnter.hide();
        btnNxtLevel.hide();
        lblHeroSave.hide();
        lblHeroDie.hide();
        lblWrong.hide();
        lblCorrect.hide();
        lblNum1.hide();
        lblPlus.hide();
        lblNum2.hide();
        lblResults.hide();
        txtAnswer.hide();
        lblLocked.hide();
    }
    int score=0, wrong=7;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlLevel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblPlus = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        lblWrong = new javax.swing.JLabel();
        lblCorrect = new javax.swing.JLabel();
        lblLocked = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        lblNum1 = new javax.swing.JLabel();
        lblResults = new javax.swing.JLabel();
        lblOver = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblHPWrong = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblScore = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblHP3 = new javax.swing.JLabel();
        lblHP2 = new javax.swing.JLabel();
        lblHP1 = new javax.swing.JLabel();
        lblHP4 = new javax.swing.JLabel();
        lblHP5 = new javax.swing.JLabel();
        lblHP6 = new javax.swing.JLabel();
        lblHP7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblSCT1 = new javax.swing.JLabel();
        lblHealth1 = new javax.swing.JLabel();
        PnlLvlHide = new javax.swing.JPanel();
        lblNxtLevel = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        lblNextLevel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnNxtLevel = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        lblLevel = new javax.swing.JLabel();
        lblHeroDie = new javax.swing.JLabel();
        lblHeroSave = new javax.swing.JLabel();
        lblMain = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlLevel1.setBackground(new java.awt.Color(0, 153, 153));
        PnlLevel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPlus.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblPlus.setForeground(new java.awt.Color(255, 255, 255));
        lblPlus.setText("*");
        jPanel2.add(lblPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 35, -1, 30));

        txtAnswer.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        txtAnswer.setMaximumSize(new java.awt.Dimension(4, 4));
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnswerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnswerKeyTyped(evt);
            }
        });
        jPanel2.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 50, 30));

        btnEnter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        jPanel2.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 70, 30));

        lblWrong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblWrong.setForeground(new java.awt.Color(204, 0, 0));
        lblWrong.setText("R");
        jPanel2.add(lblWrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, 30));

        lblCorrect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCorrect.setForeground(new java.awt.Color(51, 255, 0));
        lblCorrect.setText("R");
        jPanel2.add(lblCorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, 30));

        lblLocked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Locked.png"))); // NOI18N
        jPanel2.add(lblLocked, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 30, -1, 30));

        lblNum2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblNum2.setForeground(new java.awt.Color(255, 255, 255));
        lblNum2.setText("?");
        jPanel2.add(lblNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, 30));

        lblNum1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblNum1.setForeground(new java.awt.Color(255, 255, 255));
        lblNum1.setText("?");
        jPanel2.add(lblNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 30));

        lblResults.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblResults.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 180, 30));

        lblOver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOver.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 20));

        PnlLevel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 1370, 90));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 130, -1));

        lblHPWrong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHPWrong.setForeground(new java.awt.Color(255, 0, 0));
        lblHPWrong.setText("7");
        jPanel3.add(lblHPWrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 243));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblScore.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblScore.setForeground(new java.awt.Color(255, 255, 255));
        lblScore.setText("0");
        jPanel5.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, -1, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 40, 30));

        lblCount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCount.setForeground(new java.awt.Color(255, 0, 0));
        lblCount.setText("30");
        jPanel3.add(lblCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/FProfile.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Life.png"))); // NOI18N
        jPanel9.add(lblHP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 30));

        lblHP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Life.png"))); // NOI18N
        jPanel9.add(lblHP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 30));

        lblHP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Life.png"))); // NOI18N
        jPanel9.add(lblHP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        lblHP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Life.png"))); // NOI18N
        jPanel9.add(lblHP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 30));

        lblHP5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Life.png"))); // NOI18N
        jPanel9.add(lblHP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 30));

        lblHP6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Life.png"))); // NOI18N
        jPanel9.add(lblHP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 30));

        lblHP7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Life.png"))); // NOI18N
        jPanel9.add(lblHP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 30));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reach:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1268, 10, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Score:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, 30));

        jPanel11.setBackground(new java.awt.Color(153, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSCT1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblSCT1.setForeground(new java.awt.Color(255, 255, 255));
        lblSCT1.setText("10");
        jPanel11.add(lblSCT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 0, -1, 30));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 40, 30));

        lblHealth1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHealth1.setForeground(new java.awt.Color(255, 0, 0));
        lblHealth1.setText("HP");
        jPanel3.add(lblHealth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        PnlLevel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 50));

        PnlLvlHide.setOpaque(false);
        PnlLvlHide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNxtLevel.setBackground(new java.awt.Color(0, 102, 102));
        lblNxtLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNxtLevel.setForeground(new java.awt.Color(255, 255, 51));
        lblNxtLevel.setText("Final_Level");
        PnlLvlHide.add(lblNxtLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        PnlLevel1.add(PnlLvlHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 330, 90, -1));

        jPanel10.setBackground(new java.awt.Color(0, 255, 0));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setOpaque(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel10.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        PnlLevel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 590, 160, 50));

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNextLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNextLevel.setForeground(new java.awt.Color(255, 255, 0));
        lblNextLevel.setText("LEVEL_2");
        jPanel12.add(lblNextLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PnlLevel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(4146, 340, 70, 20));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNxtLevel.setBackground(new java.awt.Color(51, 255, 51));
        btnNxtLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNxtLevel.setForeground(new java.awt.Color(255, 255, 255));
        btnNxtLevel.setText("Next Level");
        btnNxtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNxtLevelActionPerformed(evt);
            }
        });
        jPanel8.add(btnNxtLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 100, -1));

        PnlLevel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 400, 120, 30));

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLevel.setBackground(new java.awt.Color(0, 102, 102));
        lblLevel.setFont(new java.awt.Font("Poplar Std", 0, 24)); // NOI18N
        lblLevel.setForeground(new java.awt.Color(0, 153, 153));
        lblLevel.setText("Level: 3");
        jPanel13.add(lblLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 10, -1, 20));

        PnlLevel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 100, -1));

        lblHeroDie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/MHeroDie.gif"))); // NOI18N
        PnlLevel1.add(lblHeroDie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        lblHeroSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/MHeroSave.gif"))); // NOI18N
        PnlLevel1.add(lblHeroSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        lblMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/MHeroesBGD.gif"))); // NOI18N
        PnlLevel1.add(lblMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Background.gif"))); // NOI18N
        PnlLevel1.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        getContentPane().add(PnlLevel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyPressed
        String ans = txtAnswer.getText();
        int answer = Integer.parseInt(ans);
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            if (txtAnswer.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please type your answer");
            }

            int num1 = Integer.parseInt(lblNum1.getText());
            int num2 = Integer.parseInt(lblNum2.getText());
            int sum=num1*num2;

            if(answer == sum){
                lblCorrect.show();
                lblCorrect.setText("Correct!");
                lblWrong.hide();
                score++;
                lblScore.setText("" + score);
            }
            else {
                wrong--;
                lblHPWrong.setText("" + wrong);
                lblWrong.setText("Wrong!");
                lblWrong.show();
                lblCorrect.hide();
            }
            
            if (wrong==6) {
                lblHP7.setEnabled(false);
            }
            if (wrong==5) {
                lblHP6.setEnabled(false);
            }
            if (wrong==4) {
                lblHP5.setEnabled(false);
            }
            if (wrong==3) {
                lblHP4.setEnabled(false);
            }
            if (wrong==2) {
                lblHP3.setEnabled(false);
            }
            if (wrong==1) {
                lblHP2.setEnabled(false);
            }
            if (wrong==0) {
                count.stop();
                lblCount.setEnabled(false);
                lblHP1.setEnabled(false);
                txtAnswer.setEnabled(false);
                lblHeroDie.show();
                ImageIcon icon = (ImageIcon) lblHeroDie.getIcon();
                Image img = icon.getImage();
                ImageIcon newIcon = new ImageIcon(img);
                img.flush();
                lblHeroDie.setIcon(newIcon);
                lblMain.hide();
                btnEnter.setEnabled(false);
                lblLocked.show();
                btnStart.hide();
                btnEnter.setEnabled(false);
                lblResults.setText("GAMEOVER!");
                lblResults.show();
                lblNum1.hide();
                lblPlus.hide();
                lblNum2.hide();
                over.start();
            }
            txtAnswer.setText("");

            if (score==10) {
                lblMain.hide();
                lblHeroSave.show();
                ImageIcon icon = (ImageIcon) lblHeroSave.getIcon();
                Image img = icon.getImage();
                ImageIcon newIcon = new ImageIcon(img);
                img.flush();
                lblHeroSave.setIcon(newIcon);
                count.stop();
                lblCount.setEnabled(false);
                txtAnswer.setEnabled(false);
                lblLocked.show();
                lblResults.setText("CONGRATS!");
                lblResults.show();
                lblNum1.hide();
                lblNum2.hide();
                lblPlus.hide();
                lblCorrect.hide();
                lblWrong.hide();
                PnlLvlHide.hide();
                btnNxtLevel.show();
                btnEnter.setEnabled(false);
            }
            int num_1 = (int) (Math.random() *10);
            lblNum1.setText("" + num_1);
            int num_2 = (int) (Math.random() *10);
            lblNum2.setText("" + num_2);
        }
    }//GEN-LAST:event_txtAnswerKeyPressed

    private void txtAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAnswerKeyTyped

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        String ans = txtAnswer.getText();
        int answer = Integer.parseInt(ans);
        if (txtAnswer.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please type your answer");
            }

            int num1 = Integer.parseInt(lblNum1.getText());
            int num2 = Integer.parseInt(lblNum2.getText());
            int sum=num1*num2;

            if(answer == sum){
                lblCorrect.show();
                lblCorrect.setText("Correct!");
                lblWrong.hide();
                score++;
                lblScore.setText("" + score);
            }
            else {
                wrong--;
                lblHPWrong.setText("" + wrong);
                lblWrong.setText("Wrong!");
                lblWrong.show();
                lblCorrect.hide();
            }
            
            if (wrong==6) {
                lblHP7.setEnabled(false);
            }
            if (wrong==5) {
                lblHP6.setEnabled(false);
            }
            if (wrong==4) {
                lblHP5.setEnabled(false);
            }
            if (wrong==3) {
                lblHP4.setEnabled(false);
            }
            if (wrong==2) {
                lblHP3.setEnabled(false);
            }
            if (wrong==1) {
                lblHP2.setEnabled(false);
            }
            if (wrong==0) {
                count.stop();
                lblCount.setEnabled(false);
                lblHP1.setEnabled(false);
                txtAnswer.setEnabled(false);
                lblHeroDie.show();
                ImageIcon icon = (ImageIcon) lblHeroDie.getIcon();
                Image img = icon.getImage();
                ImageIcon newIcon = new ImageIcon(img);
                img.flush();
                lblHeroDie.setIcon(newIcon);
                lblMain.hide();
                btnEnter.setEnabled(false);
                lblLocked.show();
                btnStart.hide();
                btnEnter.setEnabled(false);
                lblResults.setText("GAMEOVER!");
                lblResults.show();
                lblNum1.hide();
                lblPlus.hide();
                lblNum2.hide();
                over.start();
            }
            txtAnswer.setText("");

            if (score==10) {
                lblMain.hide();
                lblHeroSave.show();
                ImageIcon icon = (ImageIcon) lblHeroSave.getIcon();
                Image img = icon.getImage();
                ImageIcon newIcon = new ImageIcon(img);
                img.flush();
                lblHeroSave.setIcon(newIcon);
                count.stop();
                lblCount.setEnabled(false);
                txtAnswer.setEnabled(false);
                lblLocked.show();
                lblResults.setText("CONGRATS!");
                lblResults.show();
                lblNum1.hide();
                lblNum2.hide();
                lblPlus.hide();
                lblCorrect.hide();
                lblWrong.hide();
                PnlLvlHide.hide();
                btnNxtLevel.show();
                btnEnter.setEnabled(false);
            }
            int num_1 = (int) (Math.random() *10);
            lblNum1.setText("" + num_1);
            int num_2 = (int) (Math.random() *10);
            lblNum2.setText("" + num_2);
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        count.start();
        txtAnswer.setEnabled(true);
        lblLocked.hide();
        btnEnter.show();
        btnStart.hide();
        lblLocked.hide();
        lblNum1.show();
        lblPlus.show();
        lblNum2.show();
        txtAnswer.show();
        int num1 = (int) (Math.random() *10);
        lblNum1.setText("" + num1);
        int num2 = (int) (Math.random() *10);
        lblNum2.setText("" + num2);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnNxtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNxtLevelActionPerformed
        Levels nxt = Levels.Level_4;
        nxt.getLevel_4();
        this.dispose();
    }//GEN-LAST:event_btnNxtLevelActionPerformed

    enum Levels {
        Level_4;
       
    public static void getLevel_4() {
        lblNextLevel.setText("" + Levels.Level_4);
        GMaleLevel4 myFrame = new GMaleLevel4();
            myFrame.setVisible(true);
            myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    } 
   }
    
    int v=4;
        Timer over = new Timer(1000, new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        v--;
        
         if (v>=0)
            lblOver.setText(""+v); 
         
         if (v==0) {
             GameOverState cont = new GameOverState();
             cont.setVisible(true);
             cont.setExtendedState(cont.getExtendedState() | JFrame.MAXIMIZED_BOTH);
             dispose();
        }
        }
        });
    
    
    int i=20;
        Timer count = new Timer(1000, new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        i--;
        
         if (i>=0)
            lblCount.setText(""+i); 
         
         if (i==0) {
            lblHPWrong.setText("0");
            lblResults.setText("TIME'S UP!");
            lblResults.show();
            lblNum1.hide();
            lblPlus.hide();
            lblNum2.hide();
            lblHeroDie.show();
            ImageIcon icon = (ImageIcon) lblHeroDie.getIcon();
            Image img = icon.getImage();
            ImageIcon newIcon = new ImageIcon(img);
            img.flush();
            lblHeroDie.setIcon(newIcon);
            lblMain.hide();           
            lblHP1.setEnabled(false);
            lblHP2.setEnabled(false);
            lblHP3.setEnabled(false);
            lblHP4.setEnabled(false);
            lblHP5.setEnabled(false);
            lblHP6.setEnabled(false);
            lblHP7.setEnabled(false);
            txtAnswer.setEnabled(false);
            lblLocked.show();
            btnStart.hide();   
            btnEnter.setEnabled(false);
            over.start();
        }
        
        }          
        });
        
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
            java.util.logging.Logger.getLogger(GMaleLevel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GMaleLevel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GMaleLevel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GMaleLevel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GMaleLevel3 myFrame = new GMaleLevel3();
                myFrame.setVisible(true);
                myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlLevel1;
    private javax.swing.JPanel PnlLvlHide;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnNxtLevel;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCorrect;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblHP1;
    private javax.swing.JLabel lblHP2;
    private javax.swing.JLabel lblHP3;
    private javax.swing.JLabel lblHP4;
    private javax.swing.JLabel lblHP5;
    private javax.swing.JLabel lblHP6;
    private javax.swing.JLabel lblHP7;
    private javax.swing.JLabel lblHPWrong;
    private javax.swing.JLabel lblHealth1;
    public static javax.swing.JLabel lblHeroDie;
    private javax.swing.JLabel lblHeroSave;
    public static javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblLocked;
    private javax.swing.JLabel lblMain;
    public static javax.swing.JLabel lblNextLevel;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    public static javax.swing.JLabel lblNxtLevel;
    private javax.swing.JLabel lblOver;
    private javax.swing.JLabel lblPlus;
    private javax.swing.JLabel lblResults;
    private javax.swing.JLabel lblSCT1;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblWrong;
    private javax.swing.JTextField txtAnswer;
    // End of variables declaration//GEN-END:variables
}
