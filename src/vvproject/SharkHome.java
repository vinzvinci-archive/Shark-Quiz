
package vvproject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Developer: VINCENT VILLAFUERTE
 */
public class SharkHome extends javax.swing.JFrame {

    public SharkHome() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnStartgame = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStartgame.setBackground(new java.awt.Color(51, 153, 0));
        btnStartgame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnStartgame.setForeground(new java.awt.Color(255, 255, 255));
        btnStartgame.setText("START THE GAME");
        btnStartgame.setSelected(true);
        btnStartgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartgameActionPerformed(evt);
            }
        });
        jPanel1.add(btnStartgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 290, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/SharkQuizLogo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, 270));

        btnExit.setBackground(new java.awt.Color(51, 153, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/SharkQuizLogo.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 470, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/SharkHomeBgd.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartgameActionPerformed
            CharacterSelection select = new CharacterSelection();
            select.setVisible(true);
            select.setExtendedState(select.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            this.dispose();    
    }//GEN-LAST:event_btnStartgameActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit??", "", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    
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
            java.util.logging.Logger.getLogger(SharkHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SharkHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SharkHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SharkHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SharkHome myFrame = new SharkHome();
                myFrame.setVisible(true);
                myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            }
        });    
    }
    //Developer: VINCENT VILLAFUERTE
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnStartgame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
