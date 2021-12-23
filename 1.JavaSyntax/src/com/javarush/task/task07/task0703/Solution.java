package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        String list[] = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list[i] = reader.readLine();
        }
        reader.close();
        int number[] = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = list[i].length();
            System.out.println(number[i]);
        }

    }
}
