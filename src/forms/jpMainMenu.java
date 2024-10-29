/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.time.LocalTime;

/**
 *
 * @author PC
 */
public class jpMainMenu extends javax.swing.JPanel {

    /**
     * Creates new form jpMainMenu
     */
    public jpMainMenu() {
        initComponents();
        

        LocalTime now = LocalTime.now();
        String saludo;
        if (now.isBefore(LocalTime.of(12, 0))) {
            saludo = "BUENOS DIAS!";
        } else if (now.isBefore(LocalTime.of(18, 0))) {
            saludo = "BUENAS TARDES!";
        } else {
            saludo = "BUENAS NOCHES!";
        }
        jlWelcome.setText(saludo);
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
        jpMarca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpContent = new javax.swing.JPanel();
        jlWelcome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlbbSh = new javax.swing.JLabel();
        jlbrtd = new javax.swing.JLabel();
        jl15 = new javax.swing.JLabel();
        jlbbSh3 = new javax.swing.JLabel();
        jlbbSh4 = new javax.swing.JLabel();
        jlbbSh5 = new javax.swing.JLabel();
        jlbbSh6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(760, 606));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jpMarca.setBackground(new java.awt.Color(255, 255, 255));
        jpMarca.setPreferredSize(new java.awt.Dimension(760, 32));
        jpMarca.setLayout(new java.awt.BorderLayout());

        jLabel1.setForeground(new java.awt.Color(225, 225, 225));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dalila & Daniel");
        jpMarca.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jpMarca, java.awt.BorderLayout.PAGE_END);

        jpContent.setBackground(new java.awt.Color(255, 255, 255));

        jlWelcome.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jlWelcome.setForeground(new java.awt.Color(0, 0, 0));
        jlWelcome.setText("WELCOME");

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));

        jlbbSh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbbSh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baby-shower.png"))); // NOI18N

        jlbrtd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbrtd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/happy-birthday.png"))); // NOI18N

        jl15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quinceanera.png"))); // NOI18N

        jlbbSh3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbbSh3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recien-casados.png"))); // NOI18N

        jlbbSh4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbbSh4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/graduacion.png"))); // NOI18N

        jlbbSh5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbbSh5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/copa-de-champan.png"))); // NOI18N

        jlbbSh6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbbSh6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cabina-de-dj.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setText("Crea un evento de manera profesional y endeudate con nosotros!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jlbbSh3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jlbbSh5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jlbbSh6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlbbSh, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jlbrtd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jl15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jlbbSh4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbrtd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbbSh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbbSh4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbbSh5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbbSh3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbbSh6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout jpContentLayout = new javax.swing.GroupLayout(jpContent);
        jpContent.setLayout(jpContentLayout);
        jpContentLayout.setHorizontalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        jpContentLayout.setVerticalGroup(
            jpContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jlWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jpContent, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jl15;
    private javax.swing.JLabel jlWelcome;
    private javax.swing.JLabel jlbbSh;
    private javax.swing.JLabel jlbbSh3;
    private javax.swing.JLabel jlbbSh4;
    private javax.swing.JLabel jlbbSh5;
    private javax.swing.JLabel jlbbSh6;
    private javax.swing.JLabel jlbrtd;
    private javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpMarca;
    // End of variables declaration//GEN-END:variables
}
