package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }
        reader.close();
        int longS = strings.get(0).length();
        int longestIndex = 0;
        for (int i = 1; i < 10; i++) {
            if (strings.get(i).length() > longS) {
                longS = strings.get(i).length();
                longestIndex = i;
            }
        }
        int shortS = strings.get(0).length();
        int shertestIndex = 0;
        for (int i = 1; i < 10; i++) {
            if (strings.get(i).length() < shortS) {
                shortS = strings.get(i).length();
                shertestIndex = i;
            }

        }
        System.out.println((longestIndex <= shertestIndex) ? strings.get(longestIndex) : strings.get(shertestIndex));
    }
}
