package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        String text;
        while (!(text = reader.readLine()).equals("exit")) {
            bw.write(text + "\n");
            bw.flush();
        }
        bw.write("exit"+ "\n");
        bw.flush();
        reader.close();
        bw.close();
    }
    // D:\test.txt
}
