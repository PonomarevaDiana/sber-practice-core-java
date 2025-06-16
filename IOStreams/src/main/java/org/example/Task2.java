package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) throws Exception{
            BufferedReader reader = new BufferedReader(new FileReader("listNames.txt"));
            String line = reader.readLine();
            String[] lines = line.split(", ");
            FileWriter writer = new FileWriter("fileForWrite1.txt", true);
            int i;
            Arrays.sort(lines);
            for (i=0; i<lines.length; i++) {
                writer.write(lines[i]+"\n");
            }
            writer.close();
            reader.close();
    }
}