/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 *
 * @author Daniel
 */

public class JsonUtils {

    private static final Gson gson = new Gson();

    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return gson.fromJson(json, clazz);
        } catch (JsonSyntaxException e) {
            System.out.println("Error en la deserialización del JSON: " + e.getMessage());
            return null;
        }
    }
}
