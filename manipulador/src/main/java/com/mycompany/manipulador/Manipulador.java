/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manipulador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 03016719
 */
public class Manipulador {

    public static void main(String[] args) {
        // 1. Create a folder with a text file named arquivo.txt
        File folder = new File("C:\\Users\\03016719\\projeto\\minhapasta");
        folder.mkdir();
        File file = new File(folder, "arquivo.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Write the multiplication table of 9 to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i <= 10; i++) {
                writer.write("9 x " + i + " = " + 9 * i + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Read the file and print to the console
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. Delete the file
        file.delete();
    }
}
