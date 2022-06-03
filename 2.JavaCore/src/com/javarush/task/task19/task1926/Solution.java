package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathInFile = reader.readLine();
        reader.close();
        FileReader inFile = new FileReader(pathInFile);
        BufferedReader inFileReader = new BufferedReader(inFile);
        while (inFileReader.ready()) {
            System.out.println(new StringBuffer(inFileReader.readLine()).reverse().toString());
        }
        inFileReader.close();
    }
}
