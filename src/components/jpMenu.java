/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import data.EventMenuSelected;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import models.Model_Menu;

/**
 *
 * @author PC
 */
public class jpMenu extends javax.swing.JPanel {

    private EventMenuSelected event;

    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        lstMenu2.addEventMenuSelected(event);
    }
    
    public void addEventMenu2Selected(EventMenuSelected event) {
        this.event = event;
        lstMenu1.addEventMenuSelected(event);
    }
    /**
     * Creates new form jpMenu
     */
    public jpMenu() {
        initComponents();
        setOpaque(false);
        jpMoving.setOpaque(false);
        jpMov.setOpaque(false);
        lstMenu2.setOpaque(false);
        lstMenu1.setOpaque(false);
        init();
    }

    private void init() {
        lstMenu2.addItem(new Model_Menu("", "OPCIONES", Model_Menu.MenuType.TITLE));
        lstMenu2.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        lstMenu2.addItem(new Model_Menu("home", "Main Menu", Model_Menu.MenuType.MENU));
        lstMenu2.addItem(new Model_Menu("checklist", "Eventos", Model_Menu.MenuType.MENU));
        lstMenu2.addItem(new Model_Menu("users", "Personas", Model_Menu.MenuType.MENU));
        lstMenu2.addItem(new Model_Menu("file-plus", "Crear Evento", Model_Menu.MenuType.MENU));
        //lstMenu2.addItem(new Model_Menu("medal", "Mejores Alumnos", Model_Menu.MenuType.MENU));
        
        lstMenu1.addItem(new Model_Menu("logout", "Logout", Model_Menu.MenuType.MENU));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMoving = new javax.swing.JPanel();
        lstMenu1 = new models.LstMenu<>();
        jpMov = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lstMenu2 = new models.LstMenu<>();

        setPreferredSize(new java.awt.Dimension(220, 425));
        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/birthday-and-party (1).png"))); // NOI18N
        jLabel1.setText("Party Planner");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpMovLayout = new javax.swing.GroupLayout(jpMov);
        jpMov.setLayout(jpMovLayout);
        jpMovLayout.setHorizontalGroup(
            jpMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addGroup(jpMovLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMovLayout.setVerticalGroup(
            jpMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMovLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lstMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpMovingLayout = new javax.swing.GroupLayout(jpMoving);
        jpMoving.setLayout(jpMovingLayout);
        jpMovingLayout.setHorizontalGroup(
            jpMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpMovingLayout.setVerticalGroup(
            jpMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMovingLayout.createSequentialGroup()
                .addComponent(jpMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(lstMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jpMoving, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#de08a3"), 150, 750, Color.decode("#06e7ec"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    
    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        jpMov.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        jpMov.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpMov;
    private javax.swing.JPanel jpMoving;
    private models.LstMenu<String> lstMenu1;
    private models.LstMenu<String> lstMenu2;
    // End of variables declaration//GEN-END:variables
}
