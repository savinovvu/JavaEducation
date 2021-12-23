package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        System.out.println(name + " получает "+s1+" через "+s2+" лет.");
    }
}
