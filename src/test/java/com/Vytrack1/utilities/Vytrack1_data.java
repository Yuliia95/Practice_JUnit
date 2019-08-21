package com.Vytrack1.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Vytrack1_data {
    private static Properties properties;
    /*

     */

    static {

        try {
            String path = "Vytrack1_data.properties";
            FileInputStream input = new FileInputStream(path);

            properties = new Properties();
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String get(String keyName) {
        return properties.getProperty(keyName);
    }
}