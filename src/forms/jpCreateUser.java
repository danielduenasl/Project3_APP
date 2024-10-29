/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import frames.Login;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class jpCreateUser extends javax.swing.JPanel {

    private Login loog;
    private String userName;
    private String password;
    private String confirmPass;
    /**
     * Creates new form jpCreateUser
     */
    public jpCreateUser(Login login) {
        initComponents();
        
        loog = login;
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
        jLabel1 = new javax.swing.JLabel();
        jlUser = new javax.swing.JLabel();
        txtUser = new models.CustomTextField();
        jlPass = new javax.swing.JLabel();
        txtpassword = new models.CustomPassField();
        txtpassword1 = new models.CustomPassField();
        jlPassC = new javax.swing.JLabel();
        jpBtn = new javax.swing.JPanel();
        jlogin = new javax.swing.JLabel();
        jlPass1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(532, 566));
        setPreferredSize(new java.awt.Dimension(532, 566));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREAR USUARIO");

        jlUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUser.setText("USER");

        txtUser.setToolTipText("Ingrese su usuario");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        jlPass.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPass.setText("PASSWORD");

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });

        txtpassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassword1KeyPressed(evt);
            }
        });

        jlPassC.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlPassC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPassC.setText("CONFIRM PASSWORD");

        jpBtn.setBackground(new java.awt.Color(255, 51, 153));
        jpBtn.setLayout(new java.awt.BorderLayout());

        jlogin.setBackground(new java.awt.Color(255, 255, 255));
        jlogin.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlogin.setForeground(new java.awt.Color(255, 255, 255));
        jlogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlogin.setText("CREAR USUARIO");
        jlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jloginMouseExited(evt);
            }
        });
        jlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jloginKeyPressed(evt);
            }
        });
        jpBtn.add(jlogin, java.awt.BorderLayout.CENTER);

        jlPass1.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jlPass1.setForeground(new java.awt.Color(204, 204, 204));
        jlPass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPass1.setText("If you already have an account, please Login. ");
        jlPass1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlPass1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jlUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jlPassC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpassword1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jlPass1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81)))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jlUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPassC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed

    }//GEN-LAST:event_txtUserKeyPressed

    private void txtpassword1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassword1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassword1KeyPressed

    private void jloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jloginMouseClicked
        userName = txtUser.getText();
        password = String.valueOf(txtpassword.getPassword());
        confirmPass = String.valueOf(txtpassword1.getPassword());
        
        
        JOptionPane.showMessageDialog(null, "El usuario se ha creado con exito.", "Mensaje", JOptionPane.PLAIN_MESSAGE);
        
        jpLogin logIN = new jpLogin(loog);
        logIN.setSize(600, 566);
        logIN.setLocation(0, 0);

        jpContentLogin contentLogin = new jpContentLogin();
        contentLogin.removeAll();
        contentLogin.add(loog.jpHeaderBar, BorderLayout.NORTH);
        contentLogin.add(logIN, BorderLayout.CENTER);
        contentLogin.revalidate();
        contentLogin.repaint();

        loog.jpContent.removeAll();
        loog.jpContent.add(contentLogin, BorderLayout.CENTER);
        loog.jpContent.revalidate();
        loog.jpContent.repaint();

        jpBtn.setBackground(new Color (255,51,153));
    }//GEN-LAST:event_jloginMouseClicked

    private void jloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jloginMouseEntered
        jpBtn.setBackground(new Color (255,51,51));
    }//GEN-LAST:event_jloginMouseEntered

    private void jloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jloginMouseExited
        jpBtn.setBackground(new Color (255,51,153));
    }//GEN-LAST:event_jloginMouseExited

    private void jloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jloginKeyPressed

    }//GEN-LAST:event_jloginKeyPressed

    private void jlPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPass1MouseClicked

        jpLogin logIN = new jpLogin(loog);
        logIN.setSize(600, 566);
        logIN.setLocation(0, 0);

        jpContentLogin contentLogin = new jpContentLogin();
        contentLogin.removeAll();
        contentLogin.add(loog.jpHeaderBar, BorderLayout.NORTH);
        contentLogin.add(logIN, BorderLayout.CENTER);
        contentLogin.revalidate();
        contentLogin.repaint();

        loog.jpContent.removeAll();
        loog.jpContent.add(contentLogin, BorderLayout.CENTER);
        loog.jpContent.revalidate();
        loog.jpContent.repaint();

        jpBtn.setBackground(new Color (255,51,153));
    }//GEN-LAST:event_jlPass1MouseClicked

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed

    }//GEN-LAST:event_txtpasswordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlPass;
    private javax.swing.JLabel jlPass1;
    private javax.swing.JLabel jlPassC;
    private javax.swing.JLabel jlUser;
    private javax.swing.JLabel jlogin;
    private javax.swing.JPanel jpBtn;
    private models.CustomTextField txtUser;
    private models.CustomPassField txtpassword;
    private models.CustomPassField txtpassword1;
    // End of variables declaration//GEN-END:variables
}
