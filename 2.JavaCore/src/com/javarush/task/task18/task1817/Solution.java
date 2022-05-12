package com.javarush.task.task18.task1817;

import java.io.*;
import java.text.DecimalFormat;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream(args[0]);
        int countOfSpace = 0;
        int countOfAllCharacters =0;
        while (inFile.available() > 0) {
            int bite = inFile.read();
            countOfAllCharacters++;
            if (bite == 32) {
                countOfSpace++;
            }

        }
        double ratioOfSpacesToAllCharacters = (double)countOfSpace/(double)countOfAllCharacters*100;
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        String result = decimalFormat.format(ratioOfSpacesToAllCharacters);
        System.out.println(result);
        inFile.close();
    }
}
