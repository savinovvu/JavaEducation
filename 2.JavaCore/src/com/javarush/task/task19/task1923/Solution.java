package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader inFile = new FileReader(args[0]);
        BufferedReader inFileReader = new BufferedReader(inFile);
        FileWriter outFile = new FileWriter(args[1]);
        BufferedWriter outFileWriter = new BufferedWriter(outFile);
        String[] words = null;
        while (inFileReader.ready()) {
            words = inFileReader.readLine().split(" ");
            for (String word : words) {
                if (word.matches(".*\\d+.*")) {
                    outFileWriter.write(word + " ");
                }
            }
        }
        inFileReader.close();
        outFileWriter.close();
    }
}
