package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathInFile = reader.readLine();
        String pathOutFileFirst = reader.readLine();
        String pathOutFileSecond = reader.readLine();
        reader.close();
        InputStream inFile = new FileInputStream(pathInFile);
        OutputStream outFileFirst = new FileOutputStream(pathOutFileFirst);
        OutputStream outFileSecond = new FileOutputStream(pathOutFileSecond);
        int halfOfFile = (inFile.available() + 1) / 2;
        int numberOfByte = 0;
        while (inFile.available() > 0) {
            if (numberOfByte < halfOfFile) {
                outFileFirst.write(inFile.read());
                numberOfByte++;
            } else {
                outFileSecond.write(inFile.read());
            }
        }
        inFile.close();
        outFileFirst.close();
        outFileSecond.close();
    }
}
