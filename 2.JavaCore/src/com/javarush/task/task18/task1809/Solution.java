package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathInFile = reader.readLine();
        String pathOutFile = reader.readLine();
        reader.close();
        InputStream inFile = new FileInputStream(pathInFile);
        OutputStream outFileFirst = new FileOutputStream(pathOutFile);
        List<Integer> bites = new ArrayList<>();
        while (inFile.available() > 0) {
            bites.add(inFile.read());
        }
        inFile.close();
        Collections.reverse(bites);
        for (Integer bite : bites) {
            outFileFirst.write(bite);
        }
        outFileFirst.close();
    }
}
