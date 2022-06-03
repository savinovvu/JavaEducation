package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader inFile = new FileReader(args[0]);
        BufferedReader inFileReader = new BufferedReader(inFile);
        FileWriter outFile = new FileWriter(args[1]);
        BufferedWriter outFileWriter = new BufferedWriter(outFile);
        String d = "";
        while (inFileReader.ready()) {
            for (String s : inFileReader.readLine().split(" "))
                if (s.length() > 6) {
                    outFileWriter.write(d + s);
                    d = ",";
                }
        }
        inFileReader.close();
        outFileWriter.close();
    }
}

