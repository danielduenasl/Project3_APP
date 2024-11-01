/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import data.cEvents;
import frames.AddPersons;
import java.awt.Color;
import javax.swing.ImageIcon;
import static javax.swing.SwingConstants.CENTER;

/**
 *
 * @author PC
 */
public class jpInfoEvent extends javax.swing.JPanel {

    private String URL;
    private long idUser;
    private cEvents eventoA;
    /**
     * Creates new form jpInfoEvent
     */
    public jpInfoEvent(String URLapi, long idusuario, cEvents evtns) {
        initComponents();
        
        ImageIcon bbshow = new ImageIcon(getClass().getResource("/images/baby-shower.png"));
        
        jlTipoEvent.setIcon(bbshow);
        jlTipoEvent.setHorizontalAlignment(CENTER);
        jlTipoEvent.setVerticalAlignment(CENTER);
        
        eventoA = evtns;
        
        txtNombre.setText(eventoA.getEventName());
        txtFecha.setText(eventoA.getDateEvent());
        txtHora.setText(String.valueOf(eventoA.getTimEvent()));
        
        URL = URLapi;
        idUser = idusuario;
        Eventoselec(eventoA.getTipoEvent());
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
        jlTipoEvent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxEvnt = new models.CustomComboBox();
        jlUser = new javax.swing.JLabel();
        txtNombre = new models.CustomTextField();
        jlUser2 = new javax.swing.JLabel();
        txtFecha = new models.CustomDateFieldFutureOnly();
        jlUser1 = new javax.swing.JLabel();
        cbxEvnt1 = new models.CustomComboBox();
        jlUser3 = new javax.swing.JLabel();
        txtHora = new models.CustomTimeField();
        jlUser4 = new javax.swing.JLabel();
        jpBtnInfo = new javax.swing.JPanel();
        jlBtnInfo = new javax.swing.JLabel();
        cbxEstado = new models.CustomComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        customTable1 = new models.CustomTable();

        setMinimumSize(new java.awt.Dimension(762, 606));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INFORMACION DEL EVENTO");

        jlTipoEvent.setMaximumSize(new java.awt.Dimension(100, 100));
        jlTipoEvent.setMinimumSize(new java.awt.Dimension(100, 100));
        jlTipoEvent.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("TIPO DE EVENTO");

        cbxEvnt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BabyShower", "Cumpleaños", "Quinceaños", "Graduacion", "Boda", "Convivio", "Fiesta" }));
        cbxEvnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEvntActionPerformed(evt);
            }
        });

        jlUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser.setForeground(new java.awt.Color(0, 0, 0));
        jlUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlUser.setText("NOMBRE DEL EVENTO");

        txtNombre.setToolTipText("");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jlUser2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser2.setForeground(new java.awt.Color(0, 0, 0));
        jlUser2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlUser2.setText("FECHA DEL EVENTO");

        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlUser1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser1.setForeground(new java.awt.Color(0, 0, 0));
        jlUser1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlUser1.setText("UBICACION");

        cbxEvnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEvnt1ActionPerformed(evt);
            }
        });

        jlUser3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser3.setForeground(new java.awt.Color(0, 0, 0));
        jlUser3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlUser3.setText("HORA DEL EVENTO");

        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlUser4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser4.setForeground(new java.awt.Color(0, 0, 0));
        jlUser4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlUser4.setText("ESTADO DEL EVENTO");

        jpBtnInfo.setBackground(new java.awt.Color(222, 8, 163));
        jpBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jpBtnInfo.setLayout(new java.awt.BorderLayout());

        jlBtnInfo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jlBtnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnInfo.setText("AGREGAR PERSONAS");
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

        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(customTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlUser4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlTipoEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbxEvnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxEvnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlUser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlUser3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(8, 8, 8)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTipoEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxEvnt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlUser3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlUser4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxEvnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEvntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEvntActionPerformed
        String evntoselec = (String) cbxEvnt.getSelectedItem();

        ImageIcon bbshow = new ImageIcon(getClass().getResource("/images/baby-shower.png"));
        ImageIcon cumple = new ImageIcon(getClass().getResource("/images/happy-birthday.png"));
        ImageIcon quince = new ImageIcon(getClass().getResource("/images/quinceanera.png"));
        ImageIcon gradua = new ImageIcon(getClass().getResource("/images/graduacion.png"));
        ImageIcon wedding = new ImageIcon(getClass().getResource("/images/recien-casados.png"));
        ImageIcon convv = new ImageIcon(getClass().getResource("/images/copa-de-champan.png"));
        ImageIcon party = new ImageIcon(getClass().getResource("/images/cabina-de-dj.png"));

        if (evntoselec.equals("BabyShower")){
            jlTipoEvent.setIcon(bbshow);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        } else if (evntoselec.equals("Cumpleaños")){
            jlTipoEvent.setIcon(cumple);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        } else if (evntoselec.equals("Quinceaños")){
            jlTipoEvent.setIcon(quince);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        } else if (evntoselec.equals("Graduacion")){
            jlTipoEvent.setIcon(gradua);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        } else if (evntoselec.equals("Boda")){
            jlTipoEvent.setIcon(wedding);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        }else if (evntoselec.equals("Convivio")){
            jlTipoEvent.setIcon(convv);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        }else if (evntoselec.equals("Fiesta")){
            jlTipoEvent.setIcon(party);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        }
    }//GEN-LAST:event_cbxEvntActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed

    }//GEN-LAST:event_txtNombreKeyPressed

    private void cbxEvnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEvnt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEvnt1ActionPerformed

    private void jlBtnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseClicked
        AddPersons addPersons = new AddPersons();
        addPersons.show();
    }//GEN-LAST:event_jlBtnInfoMouseClicked

    private void jlBtnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseEntered
        jpBtnInfo.setBackground(new Color (232, 50, 22));
    }//GEN-LAST:event_jlBtnInfoMouseEntered

    private void jlBtnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseExited
        jpBtnInfo.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnInfoMouseExited

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed

    
    private void Eventoselec(String opcn){

        ImageIcon bbshow = new ImageIcon(getClass().getResource("/images/baby-shower.png"));
        ImageIcon cumple = new ImageIcon(getClass().getResource("/images/happy-birthday.png"));
        ImageIcon quince = new ImageIcon(getClass().getResource("/images/quinceanera.png"));
        ImageIcon gradua = new ImageIcon(getClass().getResource("/images/graduacion.png"));
        ImageIcon wedding = new ImageIcon(getClass().getResource("/images/recien-casados.png"));
        ImageIcon convv = new ImageIcon(getClass().getResource("/images/copa-de-champan.png"));
        ImageIcon party = new ImageIcon(getClass().getResource("/images/cabina-de-dj.png"));
        
        if (opcn.equals("BabyShower")){
            cbxEvnt.setSelectedIndex(0);
            jlTipoEvent.setIcon(bbshow);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        } else if (opcn.equals("Cumpleaños")){
            cbxEvnt.setSelectedIndex(1);
            jlTipoEvent.setIcon(cumple);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        } else if (opcn.equals("Quinceaños")){
            cbxEvnt.setSelectedIndex(2);
            jlTipoEvent.setIcon(quince);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        } else if (opcn.equals("Graduacion")){
            cbxEvnt.setSelectedIndex(3);
            jlTipoEvent.setIcon(gradua);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        } else if (opcn.equals("Boda")){
            cbxEvnt.setSelectedIndex(4);
            jlTipoEvent.setIcon(wedding);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        }else if (opcn.equals("Convivio")){
            cbxEvnt.setSelectedIndex(5);
            jlTipoEvent.setIcon(convv);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        }else if (opcn.equals("Fiesta")){
            cbxEvnt.setSelectedIndex(6);
            jlTipoEvent.setIcon(party);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        } else {
            cbxEvnt.setSelectedIndex(0);
            jlTipoEvent.setIcon(bbshow);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private models.CustomComboBox cbxEstado;
    private models.CustomComboBox cbxEvnt;
    private models.CustomComboBox cbxEvnt1;
    private models.CustomTable customTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlBtnInfo;
    private javax.swing.JLabel jlTipoEvent;
    private javax.swing.JLabel jlUser;
    private javax.swing.JLabel jlUser1;
    private javax.swing.JLabel jlUser2;
    private javax.swing.JLabel jlUser3;
    private javax.swing.JLabel jlUser4;
    private javax.swing.JPanel jpBtnInfo;
    private models.CustomDateFieldFutureOnly txtFecha;
    private models.CustomTimeField txtHora;
    private models.CustomTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
