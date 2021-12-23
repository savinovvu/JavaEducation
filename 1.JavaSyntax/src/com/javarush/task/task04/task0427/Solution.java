package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int num2 = Integer.parseInt(num);
        int count = num.length();
        if (num2>0 && num2<1000) {
         if (num2 % 2 == 0 && count == 1) System.out.println("четное однозначное число");
            else if (!(num2 % 2 == 0) && count == 1) System.out.println("нечетное однозначное число");
            else if (num2 % 2 == 0 && count == 2) System.out.println("четное двузначное число");
            else if (!(num2 % 2 == 0) && count == 2) System.out.println("нечетное двузначное число");
            else if (num2 % 2 == 0 && count == 3) System.out.println("четное трехзначное число");
            else if (!(num2 % 2 == 0) && count == 3) System.out.println("нечетное трехзначное число");
        }


    }
}
