package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) {
        boolean isExit = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        try {

            while (!isExit) {
                fileName = reader.readLine();
                InputStream inFile = null;
                try {
                    inFile = new FileInputStream(fileName);
                    inFile.close();
                } catch (FileNotFoundException e) {
                    System.out.println(fileName);
                    isExit = true;
                }
            }
            reader.close();
        } catch (IOException e) {

        }

    }
}
