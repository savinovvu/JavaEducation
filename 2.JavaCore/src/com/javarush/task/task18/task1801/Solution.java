package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFile = reader.readLine();
        InputStream inFile = new FileInputStream(pathFile);
        int maxBite = inFile.read();
        while (inFile.available() > 0) {
            int data = inFile.read();
            if (data > maxBite) {
                maxBite = data;
            }
        }
        inFile.close();
        System.out.println(maxBite);
    }
}
