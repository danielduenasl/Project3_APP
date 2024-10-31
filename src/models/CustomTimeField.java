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
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CustomTimeField extends JTextField {
    private final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

    public CustomTimeField() {
        // Configuración inicial
        setPreferredSize(new Dimension(100, 30));
        setFont(new Font("Arial", Font.BOLD, 14));
//        setForeground(new Color(0x06e7ec));
//        setBackground(Color.WHITE);
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.DARK_GRAY);
        setBorder(new EmptyBorder(5, 5, 5, 5));

        // Validación de tiempo
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                validateTime();
            }
        });
    }

    // Método para validar el formato de tiempo
    private void validateTime() {
        String input = getText().trim();
        if (!input.isEmpty()) {
            try {
                timeFormat.setLenient(false);
                timeFormat.parse(input);
            } catch (ParseException e) {
                // Si el formato es incorrecto, muestra un mensaje y limpia el campo
                JOptionPane.showMessageDialog(this, "Por favor, ingresa un tiempo en formato HH:mm", "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
                setText("");
            }
        }
    }
}
