package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int[] array = getInts();
        Arrays.sort(array);
        int maximum = array[array.length - 1];
        int minimum = array[0];

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        return arr;
    }//напишите тут ваш код
}
