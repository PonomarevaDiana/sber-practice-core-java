package org.example;

import java.io.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Borodino.txt"));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                while(line.contains("  ")) {
                    String replace = line.replace("  ", " ");
                    line=replace;
                }
                try {
                    FileWriter writer = new FileWriter("fileForWrite.txt", true);

                    writer.write(line); // Hello, Hexlet!
                    writer.write("\n");
                    writer.close();

                } catch (IOException e) {
                    System.out.println("Возникла ошибка во время записи, проверьте данные.");
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}