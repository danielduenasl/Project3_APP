/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import forms.jpContentLogin;
import forms.jpContentMain;
import forms.jpLogin;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JComponent;

/**
 *
 * @author PC
 */
public class Login extends javax.swing.JFrame {

    private jpLogin login;
    private jpContentLogin contentLogin;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        login = new jpLogin(this);
        contentLogin = new jpContentLogin();
        
        
        
        setForm(login);
        //menuLogin2.initMoving(this);
    }
    
    private void setForm(JComponent com) {
        jpContentLogin contentLogin = new jpContentLogin();
        contentLogin.removeAll();
        contentLogin.add(jpHeaderBar, BorderLayout.NORTH);
        contentLogin.add(com, BorderLayout.CENTER);
        contentLogin.revalidate();
        contentLogin.repaint();
        
        jpContent.removeAll();
        jpContent.add(contentLogin, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBG = new javax.swing.JPanel();
        jpBGLeft = new javax.swing.JPanel();
        menuLogin1 = new components.MenuLogin();
        jpContent = new javax.swing.JPanel();
        jpHeaderBar = new javax.swing.JPanel();
        jpBtns = new javax.swing.JPanel();
        jpClose = new javax.swing.JPanel();
        jlClose = new javax.swing.JLabel();
        jpMax = new javax.swing.JPanel();
        jlMax = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(740, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(740, 600));
        setResizable(false);

        jpBG.setBackground(new java.awt.Color(255, 255, 255));
        jpBG.setLayout(new java.awt.BorderLayout());

        jpBGLeft.setPreferredSize(new java.awt.Dimension(208, 552));
        jpBGLeft.setLayout(new java.awt.BorderLayout());
        jpBGLeft.add(menuLogin1, java.awt.BorderLayout.CENTER);

        jpBG.add(jpBGLeft, java.awt.BorderLayout.LINE_START);

        jpContent.setBackground(new java.awt.Color(255, 255, 255));
        jpContent.setForeground(new java.awt.Color(204, 204, 204));
        jpContent.setLayout(new java.awt.BorderLayout());

        jpHeaderBar.setBackground(new java.awt.Color(255, 255, 255));
        jpHeaderBar.setPreferredSize(new java.awt.Dimension(490, 34));
        jpHeaderBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpHeaderBarMouseDragged(evt);
            }
        });
        jpHeaderBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpHeaderBarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpHeaderBarMousePressed(evt);
            }
        });
        jpHeaderBar.setLayout(new java.awt.BorderLayout());

        jpBtns.setBackground(new java.awt.Color(255, 255, 255));
        jpBtns.setPreferredSize(new java.awt.Dimension(68, 34));
        jpBtns.setLayout(new java.awt.BorderLayout());

        jpClose.setBackground(new java.awt.Color(255, 255, 255));
        jpClose.setPreferredSize(new java.awt.Dimension(34, 34));
        jpClose.setLayout(new java.awt.BorderLayout());

        jlClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jlClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCloseMouseExited(evt);
            }
        });
        jpClose.add(jlClose, java.awt.BorderLayout.CENTER);

        jpBtns.add(jpClose, java.awt.BorderLayout.LINE_END);

        jpMax.setBackground(new java.awt.Color(255, 255, 255));
        jpMax.setLayout(new java.awt.BorderLayout());

        jlMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        jlMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMaxMouseExited(evt);
            }
        });
        jpMax.add(jlMax, java.awt.BorderLayout.CENTER);

        jpBtns.add(jpMax, java.awt.BorderLayout.CENTER);

        jpHeaderBar.add(jpBtns, java.awt.BorderLayout.LINE_END);

        jpContent.add(jpHeaderBar, java.awt.BorderLayout.NORTH);

        jpBG.add(jpContent, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpBG, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int x;
    private int y;
    private void jpHeaderBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHeaderBarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jpHeaderBarMousePressed

    private void jpHeaderBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHeaderBarMouseDragged
        this.setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
    }//GEN-LAST:event_jpHeaderBarMouseDragged

    private void jlCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseEntered
        jpClose.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jlCloseMouseEntered

    private void jlCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseExited
        jpClose.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jlCloseMouseExited

    private void jlCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlCloseMouseClicked

    private void jlMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMaxMouseEntered
        jpMax.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jlMaxMouseEntered

    private void jlMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMaxMouseExited
        jpMax.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jlMaxMouseExited

    private void jlMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMaxMouseClicked
        if(this.getExtendedState()!= MainMenu.HIDE_ON_CLOSE){
          this.setExtendedState(MainMenu.HIDE_ON_CLOSE);
        }
    }//GEN-LAST:event_jlMaxMouseClicked

    private void jpHeaderBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHeaderBarMouseClicked

    }//GEN-LAST:event_jpHeaderBarMouseClicked
      
    public void tryConnection(){

            MainMenu MM = new MainMenu();
            MM.show();
            this.setVisible(false);

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlClose;
    private javax.swing.JLabel jlMax;
    private javax.swing.JPanel jpBG;
    private javax.swing.JPanel jpBGLeft;
    private javax.swing.JPanel jpBtns;
    private javax.swing.JPanel jpClose;
    public javax.swing.JPanel jpContent;
    public javax.swing.JPanel jpHeaderBar;
    private javax.swing.JPanel jpMax;
    private components.MenuLogin menuLogin1;
    // End of variables declaration//GEN-END:variables
}
