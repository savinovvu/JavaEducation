package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName;
        TreeMap<Integer, String> files = new TreeMap<>();

        while (!(inputFileName = reader.readLine()).equals("end")) {
            int numOfPart = Integer.parseInt(inputFileName.substring(inputFileName.indexOf("part") + 4));
            files.put(numOfPart, inputFileName);
        }
        reader.close();

        OutputStream outFile = new FileOutputStream(files.firstEntry().getValue().split(".part")[0]);
        for (Map.Entry<Integer, String> entry : files.entrySet()) {
            InputStream inFile = new FileInputStream(entry.getValue());
            byte[] bufferFile = new byte[inFile.available()];
            inFile.read(bufferFile);
            outFile.write(bufferFile);
            inFile.close();
        }
        outFile.close();
    }
}
