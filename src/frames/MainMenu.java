/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;


import data.EventMenuSelected;
import data.Student;
import forms.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JComponent;

/**
 *
 * @author Daniel
 */
public class MainMenu extends javax.swing.JFrame {

    private jpMainMenu MainM;
    private jpEvents alumnos;
    private jpPersons calif;

    
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        
        setBackground(new Color(0, 0, 0, 0));
        MainM = new jpMainMenu();
        alumnos = new jpEvents(this);
        calif = new jpPersons(this);

        
        jpMenu2.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 2) {
                    setForm(MainM);
                } else if (index == 3) {
                    setForm(alumnos);
                } else if (index == 4) {
                    setForm(calif);
                }
              
            }
        });
        
        jpMenu2.addEventMenu2Selected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    Logout();
                }
            }
        });
        //  set when system open start with home
        setForm(new jpMainMenu());
        
    }
    
    private void Logout(){
        Login log = new Login();
        log.show();
        this.setVisible(false);
    }
    
    private void setForm(JComponent com) {
        jpContentMain contentMain = new jpContentMain();
        contentMain.removeAll();
        contentMain.add(jpBarHeader, BorderLayout.NORTH);
        contentMain.add(com, BorderLayout.CENTER);
        contentMain.revalidate();
        contentMain.repaint();
        
        jpContent.removeAll();
        jpContent.add(contentMain, BorderLayout.CENTER);
        jpContent.revalidate();
        jpContent.repaint();
    }
    
    private int x;
    private int y;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBg = new javax.swing.JPanel();
        jpLeftMenu = new javax.swing.JPanel();
        jpMenu2 = new components.jpMenu();
        jpContent = new javax.swing.JPanel();
        jpBarHeader = new javax.swing.JPanel();
        jpBarClose = new javax.swing.JPanel();
        jpClose = new javax.swing.JPanel();
        jlClose = new javax.swing.JLabel();
        jpMin = new javax.swing.JPanel();
        jlMin = new javax.swing.JLabel();
        jpMax = new javax.swing.JPanel();
        jlMax = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(970, 640));
        setUndecorated(true);

        jpBg.setBackground(new java.awt.Color(255, 255, 255));
        jpBg.setLayout(new java.awt.BorderLayout());

        jpLeftMenu.setBackground(new java.awt.Color(102, 102, 102));
        jpLeftMenu.setMinimumSize(new java.awt.Dimension(200, 100));
        jpLeftMenu.setPreferredSize(new java.awt.Dimension(210, 484));
        jpLeftMenu.setLayout(new java.awt.BorderLayout());
        jpLeftMenu.add(jpMenu2, java.awt.BorderLayout.CENTER);

        jpBg.add(jpLeftMenu, java.awt.BorderLayout.LINE_START);

        jpContent.setBackground(new java.awt.Color(204, 204, 204));
        jpContent.setLayout(new java.awt.BorderLayout());

        jpBarHeader.setBackground(new java.awt.Color(255, 255, 255));
        jpBarHeader.setPreferredSize(new java.awt.Dimension(100, 34));
        jpBarHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpBarHeaderMouseDragged(evt);
            }
        });
        jpBarHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBarHeaderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBarHeaderMousePressed(evt);
            }
        });
        jpBarHeader.setLayout(new java.awt.BorderLayout());

        jpBarClose.setBackground(new java.awt.Color(255, 255, 255));
        jpBarClose.setPreferredSize(new java.awt.Dimension(102, 34));
        jpBarClose.setLayout(new java.awt.BorderLayout());

        jpClose.setBackground(new java.awt.Color(255, 255, 255));
        jpClose.setPreferredSize(new java.awt.Dimension(34, 34));
        jpClose.setLayout(new java.awt.BorderLayout());

        jlClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jlClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jpBarClose.add(jpClose, java.awt.BorderLayout.EAST);

        jpMin.setBackground(new java.awt.Color(255, 255, 255));
        jpMin.setPreferredSize(new java.awt.Dimension(34, 34));
        jpMin.setLayout(new java.awt.BorderLayout());

        jlMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
        jlMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlMinMouseExited(evt);
            }
        });
        jpMin.add(jlMin, java.awt.BorderLayout.CENTER);

        jpBarClose.add(jpMin, java.awt.BorderLayout.WEST);

        jpMax.setBackground(new java.awt.Color(255, 255, 255));
        jpMax.setLayout(new java.awt.BorderLayout());

        jlMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/squares.png"))); // NOI18N
        jlMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jpBarClose.add(jpMax, java.awt.BorderLayout.CENTER);

        jpBarHeader.add(jpBarClose, java.awt.BorderLayout.LINE_END);

        jpContent.add(jpBarHeader, java.awt.BorderLayout.PAGE_START);

        jpBg.add(jpContent, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpBg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlCloseMouseClicked

    private void jlCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseEntered
        jpClose.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jlCloseMouseEntered

    private void jlCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseExited
        jpClose.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jlCloseMouseExited

    private void jlMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMaxMouseEntered
        jpMax.setBackground(new Color(224, 224, 224));
    }//GEN-LAST:event_jlMaxMouseEntered

    private void jlMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMaxMouseExited
        jpMax.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jlMaxMouseExited

    private void jlMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinMouseEntered
        jpMin.setBackground(new Color (224, 224, 224));
    }//GEN-LAST:event_jlMinMouseEntered

    private void jlMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinMouseExited
        jpMin.setBackground(new Color (255, 255, 255));
    }//GEN-LAST:event_jlMinMouseExited

    private void jlMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMaxMouseClicked
        if(this.getExtendedState()!= MainMenu.MAXIMIZED_BOTH){
          this.setExtendedState(MainMenu.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(MainMenu.NORMAL);
        }
    }//GEN-LAST:event_jlMaxMouseClicked

    private void jlMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinMouseClicked
        if(this.getExtendedState()!= MainMenu.HIDE_ON_CLOSE){
          this.setExtendedState(MainMenu.HIDE_ON_CLOSE);
        }
    }//GEN-LAST:event_jlMinMouseClicked

    private int getX;
    private int getY;
    private void jpBarHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarHeaderMousePressed
        getX = evt.getX();
        getY = evt.getY();
    }//GEN-LAST:event_jpBarHeaderMousePressed

    private void jpBarHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarHeaderMouseDragged
        this.setLocation(evt.getXOnScreen() - getX, evt.getYOnScreen() - getY);
    }//GEN-LAST:event_jpBarHeaderMouseDragged

    private void jpBarHeaderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarHeaderMouseClicked
        if (evt.getClickCount()== 2){

        if(this.getExtendedState()!= MainMenu.MAXIMIZED_BOTH){
                  this.setExtendedState(MainMenu.MAXIMIZED_BOTH);
                }
                else{
                    this.setExtendedState(MainMenu.NORMAL);
            }
        }
    }//GEN-LAST:event_jpBarHeaderMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlClose;
    private javax.swing.JLabel jlMax;
    private javax.swing.JLabel jlMin;
    private javax.swing.JPanel jpBarClose;
    public javax.swing.JPanel jpBarHeader;
    private javax.swing.JPanel jpBg;
    private javax.swing.JPanel jpClose;
    public javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpLeftMenu;
    private javax.swing.JPanel jpMax;
    private components.jpMenu jpMenu2;
    private javax.swing.JPanel jpMin;
    // End of variables declaration//GEN-END:variables
}
