package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a==b || a==c) System.out.print(a+" ");
        if(b==a || b==c)System.out.print(b+" ");
        if(c==a || c==b)System.out.print(c+" ");
        //напишите тут ваш код

    }
}