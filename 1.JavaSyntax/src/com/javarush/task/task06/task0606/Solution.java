package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        if (x > 0) {
            while (x != 0) {
                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                x /= 10;
            }
        }
        reader.close();
        System.out.println("Even: " + even + " Odd: " +odd);
    }
}
