package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int numbers[] = new int[15];
        int even = 0;
        int odd = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        for (int i = 0; i < 15; i += 2) {
            even += numbers[i];

        }
        for (int i = 1; i < 15; i += 2) {
            odd += numbers[i];
        }
        if (even < odd) {
            String a = "В домах с нечетными номерами проживает больше жителей.";
            System.out.println(a);
        } else if (even > odd) {
            String a = "В домах с четными номерами проживает больше жителей.";
            System.out.println(a);
        }



    }
}
