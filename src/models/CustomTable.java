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

public class CustomTable extends JTable {

    public CustomTable() {
        // Configuración inicial con columnas y datos de ejemplo sin botón
        setModel(new DefaultTableModel(
            new Object[][] {
                {"1", "Elemento 1", "Una descripción", "10", "$20"},
                {"2", "Elemento 2", "Otra descripción", "5", "$50"},
                {"3", "Elemento 3", "Más detalles", "3", "$100"}
            },
            new String[] {"ID", "Nombre", "Descripción", "Cantidad", "Precio"}
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

        // Centrar texto en todas las columnas
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < getColumnCount(); i++) {
            getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
}
