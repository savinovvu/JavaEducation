package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int e = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int l = Integer.parseInt(reader.readLine());
        if(e>=m && e>=n && e>=l) System.out.println(e);
        else if(m>=n && m>=l) System.out.println(m);
        else if (n>=l) System.out.println(n);
        else  System.out.println(l);
}}
