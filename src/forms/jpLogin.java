/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import data.ApiClient;
import data.JsonUtils;
import data.cUsers;
import frames.Login;
import frames.MainMenu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class jpLogin extends javax.swing.JPanel {

    private Login loog;
    private String userName;
    private String password;
    private String URL;
    private ApiClient API;
    private JsonUtils JSON;
    /**
     * Creates new form jpLogin
     */
    public jpLogin(Login login, String URLapi) {
        initComponents();
        
        API = new ApiClient();
        loog = login;
        URL = URLapi;
        JSON = new JsonUtils();
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
        jpBtn = new javax.swing.JPanel();
        jlogin = new javax.swing.JLabel();
        jlPass = new javax.swing.JLabel();
        jlUser = new javax.swing.JLabel();
        txtUser = new models.CustomTextField();
        txtpassword = new models.CustomPassField();
        jlPass1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setMinimumSize(new java.awt.Dimension(532, 566));
        setPreferredSize(new java.awt.Dimension(532, 566));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        jpBtn.setBackground(new java.awt.Color(255, 51, 153));
        jpBtn.setLayout(new java.awt.BorderLayout());

        jlogin.setBackground(new java.awt.Color(255, 255, 255));
        jlogin.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlogin.setForeground(new java.awt.Color(255, 255, 255));
        jlogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlogin.setText("LOGIN");
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

        jlPass.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPass.setText("PASSWORD");

        jlUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUser.setText("USER");

        txtUser.setToolTipText("Ingrese su usuario");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });

        jlPass1.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jlPass1.setForeground(new java.awt.Color(204, 204, 204));
        jlPass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPass1.setText("Don’t have an account? Create one now.");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jlPass, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jlPass1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(165, 165, 165))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jlUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jlPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jloginMouseClicked
        userName = txtUser.getText();
        password = String.valueOf(txtpassword.getPassword());
        
        if (!userName.isEmpty() && !password.isEmpty()){
            String Response = API.sendRequest(URL + "/Users/" + userName,"GET",null);
            cUsers user = JsonUtils.fromJson(Response, cUsers.class);
            if (user != null) {
                System.out.println("Usuario: " + user);
            } else {
                System.out.println("No se pudo deserializar la respuesta JSON.");
            }
            
            if (userName.equals(user.getUserName()) && password.equals(user.getPassword())){
                MainMenu mainM = new MainMenu(user);
                mainM.show();
                loog.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos, intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);

            }
            
        }
        else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios, intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);

        }
               
    }//GEN-LAST:event_jloginMouseClicked

    private void jloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jloginMouseEntered
        jpBtn.setBackground(new Color (255,51,51));
    }//GEN-LAST:event_jloginMouseEntered

    private void jloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jloginMouseExited
        jpBtn.setBackground(new Color (255,51,153));
    }//GEN-LAST:event_jloginMouseExited

    private void jloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jloginKeyPressed

    }//GEN-LAST:event_jloginKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_TAB) {
            txtpassword.requestFocus();
        } 
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed

    }//GEN-LAST:event_txtpasswordKeyPressed

    private void jlPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlPass1MouseClicked
       
        jpCreateUser createUser = new jpCreateUser(loog, URL);
        createUser.setSize(600, 566);
        createUser.setLocation(0, 0);
        
        jpContentLogin contentLogin = new jpContentLogin();
        contentLogin.removeAll();
        contentLogin.add(loog.jpHeaderBar, BorderLayout.NORTH);
        contentLogin.add(createUser, BorderLayout.CENTER);
        contentLogin.revalidate();
        contentLogin.repaint();
        
        loog.jpContent.removeAll();
        loog.jpContent.add(contentLogin, BorderLayout.CENTER);
        loog.jpContent.revalidate();
        loog.jpContent.repaint();
        
        jpBtn.setBackground(new Color (255,51,153));
    }//GEN-LAST:event_jlPass1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlPass;
    private javax.swing.JLabel jlPass1;
    private javax.swing.JLabel jlUser;
    private javax.swing.JLabel jlogin;
    private javax.swing.JPanel jpBtn;
    private models.CustomTextField txtUser;
    private models.CustomPassField txtpassword;
    // End of variables declaration//GEN-END:variables
}
