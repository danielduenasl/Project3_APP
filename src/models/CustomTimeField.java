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
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CustomTimeField extends JTextField {
    private final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    public CustomTimeField() {

        setPreferredSize(new Dimension(100, 30));
        setFont(new Font("Arial", Font.BOLD, 14));
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.DARK_GRAY);
        setBorder(new EmptyBorder(5, 5, 5, 5));

        addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                validateTime();
            }
        });
    }

    private void validateTime() {
        String input = getText().trim();
        if (!input.isEmpty()) {
            try {
                timeFormat.setLenient(false);
                timeFormat.parse(input);
            } catch (ParseException e) {

                JOptionPane.showMessageDialog(this, "Por favor, ingresa un tiempo en formato HH:mm", "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
                setText("");
            }
        }
    }

    public LocalTime obtenerHoraComoLocalTime() {
        String timeText = getText().trim();
        if (!timeText.isEmpty()) {
            try {
                return LocalTime.parse(timeText, timeFormatter); // Convierte el texto a LocalTime
            } catch (DateTimeParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
