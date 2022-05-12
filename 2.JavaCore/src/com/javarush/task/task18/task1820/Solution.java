package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFirstFile = reader.readLine();
        String pathSecondFile = reader.readLine();
        OutputStream outFile = new FileOutputStream(pathSecondFile);
        BufferedReader input = new BufferedReader(new FileReader(pathFirstFile));
        String line;
        String[] inputLine = null;
        while ((line = input.readLine()) != null) {
            inputLine = line.split("\\s+");
        }
        String result = "";
        for (String elem : inputLine) {
            result += String.valueOf((Math.round(Double.parseDouble(elem)))) + " ";
        }
        byte[] buffer = result.getBytes();
        outFile.write(buffer, 0, buffer.length);
        input.close();
        outFile.close();
    }
}
