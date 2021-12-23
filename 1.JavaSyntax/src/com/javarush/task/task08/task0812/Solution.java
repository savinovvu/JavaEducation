package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        reader.close();
        //int subsequenceNumber = 1;
        //List<Integer> subsequenceNumber1 = new ArrayList<>();
        //for (int i = 0; i < 9; i++) {
        // if (list.get(i).equals(list.get(i + 1))) {
        //  subsequenceNumber++;
        // subsequenceNumber1.add(subsequenceNumber);
        // } else {
        //   subsequenceNumber = 1;
        //   subsequenceNumber1.add(subsequenceNumber);
        // }
        // }
        //Второй вариант
        int subsequenceNumber = 1;
        int subsequenceNumberMax = 1;
        for (int i = 0; i < 9; i++) {
            if (list.get(i)==(list.get(i + 1))) {
                subsequenceNumber++;
                if (subsequenceNumber > subsequenceNumberMax) {
                    subsequenceNumberMax = subsequenceNumber;
                } }
                else {
                    subsequenceNumber = 1;
                }

        }
        System.out.println(subsequenceNumberMax);
    }
}