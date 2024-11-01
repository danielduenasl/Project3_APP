/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author PC
 */
import data.cPersons;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.List;

public class CustomTable extends JTable {

    private DefaultTableModel tableModel;
    
    public CustomTable() {
        // Configuración inicial con columnas y datos de ejemplo sin botón
        tableModel = new DefaultTableModel(
            new Object[][] {
                {"--", "--", "--", "--", "--", "--"}
            },
            new String[] {"Nombre", "Apellido", "Email", "Numero", "Edad", "Genero"}
        );
        
        setModel(tableModel);
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
    
    public void loadEventData(List<cPersons> persons) {
        if (tableModel == null) {
            throw new IllegalStateException("tableModel no está inicializado.");
        }

        tableModel.setRowCount(0);

        for (cPersons person : persons) {
            tableModel.addRow(new Object[]{
                person.getName(),
                person.getLastName(),
                person.getEmail(),
                person.getContacNumber(),
                person.getAge(),
                person.getGender()
            });
        }

    }

    
}
