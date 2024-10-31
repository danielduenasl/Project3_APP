/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import java.awt.Color;

/**
 *
 * @author PC
 */
public class AddPersons extends javax.swing.JFrame {

    /**
     * Creates new form DatosModif
     */
    public AddPersons() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpBar = new javax.swing.JPanel();
        jpClose = new javax.swing.JPanel();
        jlClose = new javax.swing.JLabel();
        jpMin = new javax.swing.JPanel();
        jlMin = new javax.swing.JLabel();
        jpContent = new javax.swing.JPanel();
        jpBtnInfo = new javax.swing.JPanel();
        jlBtnInfo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customTableWithStyledButton1 = new models.CustomTableWithStyledButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(580, 370));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(580, 34));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new java.awt.BorderLayout());

        jpBar.setPreferredSize(new java.awt.Dimension(68, 34));
        jpBar.setLayout(new java.awt.BorderLayout());

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

        jpBar.add(jpClose, java.awt.BorderLayout.LINE_END);

        jpMin.setBackground(new java.awt.Color(255, 255, 255));
        jpMin.setLayout(new java.awt.BorderLayout());

        jlMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
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

        jpBar.add(jpMin, java.awt.BorderLayout.CENTER);

        jPanel2.add(jpBar, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jpContent.setBackground(new java.awt.Color(255, 255, 255));

        jpBtnInfo.setBackground(new java.awt.Color(222, 8, 163));
        jpBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jpBtnInfo.setLayout(new java.awt.BorderLayout());

        jlBtnInfo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jlBtnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnInfo.setText("GUARDAR DATOS");
        jlBtnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlBtnInfoMouseExited(evt);
            }
        });
        jpBtnInfo.add(jlBtnInfo, java.awt.BorderLayout.CENTER);

        jScrollPane2.setViewportView(customTableWithStyledButton1);

        javax.swing.GroupLayout jpContentLayout = new javax.swing.GroupLayout(jpContent);
        jpContent.setLayout(jpContentLayout);
        jpContentLayout.setHorizontalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpContentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpContentLayout.setVerticalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jpContent, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jlCloseMouseClicked

    private int getX;
    private int getY;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        getX = evt.getX();
        getY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(evt.getXOnScreen() - getX, evt.getYOnScreen() - getY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jlCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseEntered
        jpClose.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jlCloseMouseEntered

    private void jlCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCloseMouseExited
        jpClose.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jlCloseMouseExited

    private void jlMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinMouseClicked
       if(this.getExtendedState()!= MainMenu.HIDE_ON_CLOSE){
          this.setExtendedState(MainMenu.HIDE_ON_CLOSE);
        }
    }//GEN-LAST:event_jlMinMouseClicked

    private void jlMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinMouseEntered
        jpMin.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_jlMinMouseEntered

    private void jlMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinMouseExited
        jpMin.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jlMinMouseExited

    private void jlBtnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseClicked

        jpBtnInfo.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnInfoMouseClicked

    private void jlBtnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseEntered
        jpBtnInfo.setBackground(new Color (232, 50, 22));
    }//GEN-LAST:event_jlBtnInfoMouseEntered

    private void jlBtnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseExited
        jpBtnInfo.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnInfoMouseExited

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
            java.util.logging.Logger.getLogger(AddPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPersons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private models.CustomTableWithStyledButton customTableWithStyledButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlBtnInfo;
    private javax.swing.JLabel jlClose;
    private javax.swing.JLabel jlMin;
    private javax.swing.JPanel jpBar;
    private javax.swing.JPanel jpBtnInfo;
    private javax.swing.JPanel jpClose;
    private javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpMin;
    // End of variables declaration//GEN-END:variables
}