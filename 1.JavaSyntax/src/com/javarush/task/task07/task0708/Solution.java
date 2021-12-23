package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;
    private static List<String> longestStrings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String string = reader.readLine();
            strings.add(string);
        }
        reader.close();
        longestStrings = new ArrayList<>();
        longestStrings.add(0, strings.get(0));
        for (int i = 1; i < 5; i++) {
            if (strings.get(i).length() > longestStrings.get(0).length()) {
                longestStrings.subList(0, longestStrings.size()).clear();
                longestStrings.add(strings.get(i));
            } else if (strings.get(i).length() == longestStrings.get(0).length()) {
                longestStrings.add(strings.get(i));
            }

        }
        longestStrings.forEach(System.out::println);
    }
}
