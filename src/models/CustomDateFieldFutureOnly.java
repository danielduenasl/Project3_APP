/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateFieldFutureOnly extends JTextField {
    public final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public CustomDateFieldFutureOnly() {
        // Configuración inicial
        setPreferredSize(new Dimension(120, 30));
        setFont(new Font("Arial", Font.BOLD, 14));
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.DARK_GRAY);
        setBorder(new EmptyBorder(5, 5, 5, 5));

        // Configura el formato para que no acepte fechas inválidas
        dateFormat.setLenient(false);

        // Validación de fecha futura
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                validateFutureDate();
            }
        });
    }

    private void validateFutureDate() {
        String input = getText().trim();
        if (!input.isEmpty()) {
            try {
                Date date = dateFormat.parse(input);
                Date today = new Date();

                if (!date.after(today)) {
                    JOptionPane.showMessageDialog(this, "Solo se permiten fechas futuras.", "Fecha Inválida", JOptionPane.ERROR_MESSAGE);
                    setText("");
                } else {
                    setText(dateFormat.format(date)); // Formato yyyy-MM-dd
                }
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa una fecha en formato yyyy-MM-dd", "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
                setText("");
            }
        }
    }

    @Override
    public String getText() {
        String input = super.getText().trim();
        if (!input.isEmpty()) {
            try {
                Date date = dateFormat.parse(input);
                return dateFormat.format(date); // Devuelve en formato yyyy-MM-dd
            } catch (ParseException e) {
                return "";
            }
        }
        return input;
    }
}
