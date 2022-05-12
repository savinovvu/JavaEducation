package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathOutFile = reader.readLine();
        String pathInFileFirst = reader.readLine();
        String pathInFileSecond = reader.readLine();
        reader.close();
        InputStream inFileFirst = new FileInputStream(pathInFileFirst);
        InputStream inFileSecond = new FileInputStream(pathInFileSecond);
        OutputStream outFile = new FileOutputStream(pathOutFile, true);
        while (inFileFirst.available() > 0) {
            outFile.write(inFileFirst.read());
        }
        while (inFileSecond.available() > 0) {
            outFile.write(inFileSecond.read());
        }
        inFileFirst.close();
        inFileSecond.close();
        outFile.close();
    }
}
