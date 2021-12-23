package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float i = 0;
        float a = 0;
        float average = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) {
                break;
            } else {
                a += number;
                i++;
            }

        }
        reader.close();
        average = a / i;
        System.out.println(average);
    }
}

