package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int x = 0;
        int y = 0;

        if (a > 0)
            x ++;
        else if (a<0)
            y ++;
        if (b > 0)
            x++;
        else if (b<0)
            y ++;
        if (c > 0)
            x++;
        else if (c<0)
            y ++;
        System.out.println("количество отрицательных чисел: "+y);
        System.out.println("количество положительных чисел: "+x);

    }
}
