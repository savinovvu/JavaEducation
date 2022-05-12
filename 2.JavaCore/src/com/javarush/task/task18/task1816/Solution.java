package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream(args[0]);
        int countOfEnglishCharacters = 0;
        while (inFile.available() > 0) {
            int bite = inFile.read();
            if (bite >= 65 && bite <= 90 || bite >= 97 && bite <= 122) {
                countOfEnglishCharacters++;
            }
        }
        System.out.println(countOfEnglishCharacters);
        inFile.close();
    }
}
