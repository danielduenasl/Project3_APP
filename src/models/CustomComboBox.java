/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.*;
import java.awt.*;

public class CustomComboBox extends JComboBox<Object> {

    public CustomComboBox() {
        super();
        initUI();
    }

    public CustomComboBox(Object[] items) {
        super(items);
        initUI();
    }

    private void initUI() {
        setBorder(BorderFactory.createEmptyBorder());
        
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.DARK_GRAY);
        setFont(new Font("Segoe UI", Font.BOLD, 14));
        
        setUI(new CustomComboBoxUI());
    }

    private static class CustomComboBoxUI extends javax.swing.plaf.basic.BasicComboBoxUI {

        @Override
        protected JButton createArrowButton() {
            JButton arrowButton = super.createArrowButton();
            arrowButton.setBackground(new Color(222, 8, 163));
            return arrowButton;
        }

        @Override
        public void installUI(JComponent c) {
            super.installUI(c);
            JComboBox comboBox = (JComboBox) c;
            comboBox.setOpaque(true);
            comboBox.setBackground(new Color(222, 8, 163));
            comboBox.setForeground(Color.DARK_GRAY);
        }

        @Override
        protected ListCellRenderer<Object> createRenderer() {
            return new DefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                    JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                    label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                    if (isSelected) {
                        label.setBackground(new Color(222, 8, 163));
                        label.setForeground(Color.WHITE);
                    } else {
                        label.setBackground(new Color(232, 50, 22));
                        label.setForeground(Color.WHITE);
                    }
                    return label;
                }
            };
        }
    }
}
