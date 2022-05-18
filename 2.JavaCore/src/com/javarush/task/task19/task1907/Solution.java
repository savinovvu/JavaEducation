package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathInFile = reader.readLine();
        reader.close();
        FileReader inFile = new FileReader(pathInFile);
        BufferedReader inFileReader = new BufferedReader(inFile);
        String[] parts = null;
        int countOfWorld = 0;
        while (inFileReader.ready()) {
            parts = inFileReader.readLine().split("[\\W]");
            for (String s: parts){
                if (s.equals("world")){
                    countOfWorld++;
                }
            }
        }
        inFileReader.close();
        System.out.println(countOfWorld);
    }
}
