
package vvproject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Developer: VINCENT VILLAFUERTE
 */
public class CharacterSelection extends javax.swing.JFrame {

    public CharacterSelection() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLuke = new javax.swing.JLabel();
        lblLucy = new javax.swing.JLabel();
        rbLuke = new javax.swing.JRadioButton();
        rbLucy = new javax.swing.JRadioButton();
        btnSelect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLuke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Luke.png"))); // NOI18N
        lblLuke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLukeMouseClicked(evt);
            }
        });
        jPanel1.add(lblLuke, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 510));

        lblLucy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/Lucy.png"))); // NOI18N
        lblLucy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLucyMouseClicked(evt);
            }
        });
        jPanel1.add(lblLucy, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, -1, -1));

        rbLuke.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rbLuke.setForeground(new java.awt.Color(0, 0, 255));
        rbLuke.setText("LUKE");
        rbLuke.setBorderPainted(true);
        rbLuke.setOpaque(false);
        rbLuke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLukeActionPerformed(evt);
            }
        });
        jPanel1.add(rbLuke, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, -1, -1));

        rbLucy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rbLucy.setForeground(new java.awt.Color(255, 51, 204));
        rbLucy.setText("LUCY");
        rbLucy.setBorderPainted(true);
        rbLucy.setOpaque(false);
        rbLucy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLucyActionPerformed(evt);
            }
        });
        jPanel1.add(rbLucy, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, -1, -1));

        btnSelect.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSelect.setText("SELECT");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/SelectLogo.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/icons8_female_36px_1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 560, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/icons8_male_36px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vvproject/CSBackground.gif"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLucyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLucyMouseClicked
        rbLucy.setSelected(true);
        if (rbLucy.isSelected()) {
            rbLuke.setSelected(false);
        }
    }//GEN-LAST:event_lblLucyMouseClicked

    private void lblLukeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLukeMouseClicked
        rbLuke.setSelected(true);
        if (rbLuke.isSelected()) {
            rbLucy.setSelected(false);
        }
    }//GEN-LAST:event_lblLukeMouseClicked

    private void rbLukeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLukeActionPerformed
        if (rbLuke.isSelected()) {
            rbLucy.setSelected(false);
        }
    }//GEN-LAST:event_rbLukeActionPerformed

    private void rbLucyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLucyActionPerformed
        if (rbLucy.isSelected()) {
            rbLuke.setSelected(false);
        }
    }//GEN-LAST:event_rbLucyActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        if (rbLucy.isSelected()) {
        JOptionPane.showMessageDialog(null, "Character Selected: Lucy");
        GameModeFemale start = new GameModeFemale();
        start.setVisible(true);
        start.setExtendedState(start.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.dispose();
        }
        else if (rbLuke.isSelected()) {
        JOptionPane.showMessageDialog(null, "Character Selected: Luke");
        GameModeMale start = new GameModeMale();
        start.setVisible(true);
        start.setExtendedState(start.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.dispose();    
        }
        else {
            JOptionPane.showMessageDialog(null, "PLEASE SELECT YOUT CHARACTER BEFORE YOU ENTER THE GAME!");
        }        
    }//GEN-LAST:event_btnSelectActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */ 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //Developer: VINCENT VILLAFUERTE
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //Developer: VINCENT VILLAFUERTE
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CharacterSelection myFrame = new CharacterSelection();
                myFrame.setVisible(true);
                myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLucy;
    private javax.swing.JLabel lblLuke;
    private javax.swing.JRadioButton rbLucy;
    private javax.swing.JRadioButton rbLuke;
    // End of variables declaration//GEN-END:variables
}
