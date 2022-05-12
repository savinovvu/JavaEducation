package com.javarush.task.task18.task1819;

import java.io.*;
import java.nio.Buffer;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFirstFile = reader.readLine();
        String pathSecondFile = reader.readLine();
        InputStream inFileFirst = new FileInputStream(pathFirstFile);
        byte[] bufferOfFitstFile = new byte[inFileFirst.available()];
        inFileFirst.read(bufferOfFitstFile);
        inFileFirst.close();

        InputStream inFileSecond = new FileInputStream(pathSecondFile);
        byte[] bufferOfSecondFile = new byte[inFileSecond.available()];
        inFileSecond.read(bufferOfSecondFile);
        inFileSecond.close();

        OutputStream outFitstFile = new FileOutputStream(pathFirstFile);
        outFitstFile.write(bufferOfSecondFile);
        outFitstFile.write(bufferOfFitstFile);
        outFitstFile.close();

    }
}

