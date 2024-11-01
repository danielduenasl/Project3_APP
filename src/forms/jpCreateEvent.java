/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import data.ApiClient;
import data.JsonUtils;
import data.cEvents;
import data.cUsers;
import frames.MainMenu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.CENTER;

/**
 *
 * @author PC
 */
public class jpCreateEvent extends javax.swing.JPanel {

    private MainMenu mainMenu;
    private String nombre;
    public Date fechaEvent;
    public LocalTime horaEvent;
    private String Ubicacion;
    private String URL;
    private long idUser;
    private String TipoEv;
    private ApiClient API;
    private JsonUtils JSON;
    
    /**
     * Creates new form jpCreateEvent
     */
    public jpCreateEvent(MainMenu mainM, String opcion, String URLapi, long idusuario) {
        initComponents();
        
        this.mainMenu = mainM;
        URL = URLapi;
        idUser = idusuario;
        
        Eventoselec(opcion);
    }
    
    private DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    
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
        cbxEvnt = new models.CustomComboBox();
        jLabel3 = new javax.swing.JLabel();
        jlTipoEvent = new javax.swing.JLabel();
        txtNombre = new models.CustomTextField();
        jlUser = new javax.swing.JLabel();
        jlUser1 = new javax.swing.JLabel();
        txtFecha = new models.CustomDateFieldFutureOnly();
        jlUser2 = new javax.swing.JLabel();
        txtHora = new models.CustomTimeField();
        jlUser3 = new javax.swing.JLabel();
        cbxUbi = new models.CustomComboBox();
        jpBtnInfo = new javax.swing.JPanel();
        jlBtnInfo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(762, 606));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CREA UN EVENTO");

        cbxEvnt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BabyShower", "Cumpleaños", "Quinceaños", "Graduacion", "Boda", "Convivio", "Fiesta" }));
        cbxEvnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEvntActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("TIPO DE EVENTO");

        jlTipoEvent.setMaximumSize(new java.awt.Dimension(100, 100));
        jlTipoEvent.setMinimumSize(new java.awt.Dimension(100, 100));
        jlTipoEvent.setPreferredSize(new java.awt.Dimension(100, 100));

        txtNombre.setToolTipText("");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jlUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser.setForeground(new java.awt.Color(0, 0, 0));
        jlUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlUser.setText("NOMBRE DEL EVENTO");

        jlUser1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser1.setForeground(new java.awt.Color(0, 0, 0));
        jlUser1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlUser1.setText("UBICACION");

        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlUser2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser2.setForeground(new java.awt.Color(0, 0, 0));
        jlUser2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlUser2.setText("FECHA DEL EVENTO");

        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jlUser3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlUser3.setForeground(new java.awt.Color(0, 0, 0));
        jlUser3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlUser3.setText("HORA DEL EVENTO");

        cbxUbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUbiActionPerformed(evt);
            }
        });

        jpBtnInfo.setBackground(new java.awt.Color(222, 8, 163));
        jpBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jpBtnInfo.setLayout(new java.awt.BorderLayout());

        jlBtnInfo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jlBtnInfo.setForeground(new java.awt.Color(255, 255, 255));
        jlBtnInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBtnInfo.setText("CREAR EVENTO");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlUser1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(cbxUbi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(320, 320, 320)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlUser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jpBtnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTipoEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlUser, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxEvnt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEvnt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlTipoEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUser3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxUbi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpBtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
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
        } else if (evntoselec.equals("Convivio")){
            jlTipoEvent.setIcon(convv);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        } else if (evntoselec.equals("Fiesta")){
            jlTipoEvent.setIcon(party);
            jlTipoEvent.setHorizontalAlignment(CENTER);
            jlTipoEvent.setVerticalAlignment(CENTER);
        }
    }//GEN-LAST:event_cbxEvntActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed

    }//GEN-LAST:event_txtNombreKeyPressed

    private void cbxUbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUbiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUbiActionPerformed

    private void jlBtnInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseClicked
        nombre = txtNombre.getText();
        fechaEvent = obtenerFechaComoDate();
        horaEvent = txtHora.obtenerHoraComoLocalTime();
        Ubicacion = (String) cbxUbi.getSelectedItem();
        TipoEv = (String) cbxEvnt.getSelectedItem();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        String fechaFormateada = dateFormat.format(fechaEvent);
        LocalDateTime fechaActual = LocalDateTime.now();
        
        
        if (!nombre.isEmpty() && fechaEvent != null && horaEvent != null){
            cEvents evento = new cEvents();
            evento.setIdUser(idUser);
            evento.setDateEvent(fechaFormateada);
            evento.setEventName(nombre);
            evento.setTimEvent(horaEvent);
            evento.setIdLocation(1);
            evento.setStatus("Open");
            evento.setTipoEvent(TipoEv);
            evento.setEventCreated(fechaActual);
            String JSONPeticion = evento.toJSON();
            
            
            String Response = API.sendRequest(URL + "/Events/1","POST",JSONPeticion);
            System.out.println(Response);
            
            if (Response.contains("creada/actualizada")) {
                JOptionPane.showMessageDialog(null, "El evento se ha creado con exito.", "Mensaje", JOptionPane.PLAIN_MESSAGE); 
                txtNombre.setText("");
                txtFecha.setText("");
                txtHora.setText("");
            
            } else {
                System.out.println("No se pudo deserializar la respuesta JSON.");
                JOptionPane.showMessageDialog(null, "La ubicación y fecha seleccionadas ya están reservadas.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios, intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jlBtnInfoMouseClicked

    
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Date obtenerFechaComoDate() { 
        String fechaTexto = txtFecha.getText();
        try {
            // Convierte el texto a Date
            return dateFormat.parse(fechaTexto);
        } catch (ParseException e) {
            e.printStackTrace();
            return null; // O lanza una excepción según lo que necesites
        }
    }
    
    private void jlBtnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseEntered
        jpBtnInfo.setBackground(new Color (232, 50, 22));
    }//GEN-LAST:event_jlBtnInfoMouseEntered

    private void jlBtnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBtnInfoMouseExited
        jpBtnInfo.setBackground(new Color (222, 8, 163));
    }//GEN-LAST:event_jlBtnInfoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private models.CustomComboBox cbxEvnt;
    private models.CustomComboBox cbxUbi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlBtnInfo;
    private javax.swing.JLabel jlTipoEvent;
    private javax.swing.JLabel jlUser;
    private javax.swing.JLabel jlUser1;
    private javax.swing.JLabel jlUser2;
    private javax.swing.JLabel jlUser3;
    private javax.swing.JPanel jpBtnInfo;
    private models.CustomDateFieldFutureOnly txtFecha;
    private models.CustomTimeField txtHora;
    private models.CustomTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
