package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine();
        int number = Integer.parseInt(b);
        if (number>0) number=number*2;
        else if (number<0) number=number+1;
        else if (number==0) number=0;
        System.out.println(number);
        //напишите тут ваш код4

    }

}