/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomTableWithStyledButton extends JTable {
    private JTable table;
    private ActionListener customActionListener; // ActionListener personalizado

    public CustomTableWithStyledButton() {
        // Configuración inicial con más columnas y datos de ejemplo
        setModel(new DefaultTableModel(
            new Object[][] {
                {"Elemento 1", "Una descripción", "10", "$20", "Ver Más"},
                {"Elemento 2", "Otra descripción", "5", "$50", "Ver Más"},
                {"Elemento 3", "Más detalles", "3", "$100", "Ver Más"}
            },
            new String[] {"Nombre", "Fecha", "Hora", "Ubicación", "Información"}
        ));
        
        initUI();
    }

    private void initUI() {
        setRowHeight(40);
        setFillsViewportHeight(true);
        setBackground(Color.WHITE);
        setGridColor(Color.WHITE);
        setShowGrid(false);

        setForeground(new Color(0xde08a3));
        setFont(new Font("Arial", Font.PLAIN, 14));

        JTableHeader header = getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 16));
        header.setBackground(new Color(0xde08a3));
        header.setForeground(Color.WHITE);

        // Aplicar renderizador de botón en la última columna
        TableColumn buttonColumn = getColumnModel().getColumn(4); // Columna de "Acciones"
        buttonColumn.setCellRenderer(new ButtonRenderer());
        buttonColumn.setCellEditor(new ButtonEditor(new JCheckBox()));

        // Centrar texto en todas las columnas excepto la del botón
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < getColumnCount() - 1; i++) { // Aplica a todas las columnas menos la última
            getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    // Método para asignar el ActionListener personalizado
    public void setButtonActionListener(ActionListener actionListener) {
        this.customActionListener = actionListener;
    }

    private class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
            setBackground(new Color(0x8464c4));
            setForeground(Color.WHITE);
            setBorderPainted(false);
            setFocusPainted(false);
            setFont(new Font("Arial", Font.BOLD, 12));
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "Ver Más" : value.toString());
            return this;
        }
    }

    private class ButtonEditor extends DefaultCellEditor {
        private JButton button;
        private String label;
        private boolean isPushed;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.setBackground(new Color(0x06e7ec));
            button.setForeground(Color.WHITE);
            button.setBorderPainted(false);
            button.setFocusPainted(false);
            button.setFont(new Font("Arial", Font.BOLD, 12));

            // Usar el ActionListener personalizado si está definido
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (customActionListener != null) {
                        customActionListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "CustomAction"));
                    } else {
                        JOptionPane.showMessageDialog(button, "Acción para la fila " + (getEditingRow() + 1));
                    }
                    fireEditingStopped();
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            label = (value == null) ? "Ver Más" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            isPushed = false;
            return label;
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }
}
