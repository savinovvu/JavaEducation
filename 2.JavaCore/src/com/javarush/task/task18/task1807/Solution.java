package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFile = reader.readLine();
        reader.close();
        InputStream inFile = new FileInputStream(pathFile);
        int countOfComma = 0;
        while (inFile.available() > 0) {
            int data = inFile.read();
            if (data == 44) {
                countOfComma++;
            }
        }
        inFile.close();
        System.out.println(countOfComma);

    }
}
