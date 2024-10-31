/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project3;

/**
 *
 * @author Daniel
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConfigReader {

    public String ip;
    public int port;

    public void readConfigFile(String filePath) {
        String archivo = new File("").getAbsolutePath() + "\\src\\data\\" + filePath;
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            ip = reader.readLine().trim();
            port = Integer.parseInt(reader.readLine().trim());
            
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de configuración: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir el puerto a número: " + e.getMessage());
        }
    }
}
