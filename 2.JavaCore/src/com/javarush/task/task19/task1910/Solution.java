package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
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
        while (inFileReader.ready()) {
            String line = inFileReader.readLine().replaceAll("\\p{P}", "");
            outFileWriter.write(line);
        }

        inFileReader.close();
        outFileWriter.close();
    }
}
