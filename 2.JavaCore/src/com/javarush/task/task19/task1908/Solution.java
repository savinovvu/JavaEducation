package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathInFile = reader.readLine();
        String pathOutFile = reader.readLine();
        reader.close();
        FileReader inFile = new FileReader(pathInFile);
        BufferedReader inFileReader = new BufferedReader(inFile);
        FileWriter outFile = new FileWriter(pathOutFile);
        BufferedWriter outFileWriter = new BufferedWriter(outFile);
        String[] parts = null;
        while (inFileReader.ready()) {
            parts = inFileReader.readLine().split(" ");
            for (String part : parts) {
                if (part.matches("^\\d+$")) {
                    outFileWriter.write(part + " ");
                }
            }
        }

        inFileReader.close();
        outFileWriter.close();

    }
}
