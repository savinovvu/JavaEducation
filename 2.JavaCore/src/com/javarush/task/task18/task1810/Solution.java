package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {

        try {
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String pathInFile = reader.readLine();
                InputStream inFile = new FileInputStream(pathInFile);
                int count = inFile.available();
                inFile.close();
                if (count < 1000) {
                    throw new DownloadException();
                }
            }
        } catch (IOException e) {
        }
    }

    public static class DownloadException extends Exception {

    }
}
