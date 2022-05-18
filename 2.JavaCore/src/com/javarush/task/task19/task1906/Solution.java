package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathInFile = reader.readLine();
        String pathOutFile = reader.readLine();
        reader.close();
        FileReader inFile = new FileReader(pathInFile);
        FileWriter outFile = new FileWriter(pathOutFile);
        int count = 0;
        while (inFile.ready()) {
            count++;
            int data = inFile.read();
            if (count % 2 == 0) {
                outFile.write(data);
            }
        }
        inFile.close();
        outFile.close();
    }
}
