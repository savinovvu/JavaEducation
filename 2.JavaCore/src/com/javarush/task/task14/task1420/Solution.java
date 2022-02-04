package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static int gcd(int num1, int num2) {
        int max = Math.abs(num1);
        int min = Math.abs(num2);

        while (max > 0) {
            if (max < min) {
                int x = max;
                max = min;
                min = x;
            }
            max %= min;
        }
        return min;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNuber = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(gcd(firstNumber, secondNuber));
    }
}
