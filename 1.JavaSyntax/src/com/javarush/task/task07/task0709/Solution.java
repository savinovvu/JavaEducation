package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {

    private static List<String> shortestStrings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String string = reader.readLine();
            strings.add(string);
        }
        reader.close();
        shortestStrings = new ArrayList<>();
        shortestStrings.add(0, strings.get(0));
        for (int i = 1; i < 5; i++) {
            if (strings.get(i).length() < shortestStrings.get(0).length()) {
                shortestStrings.subList(0, shortestStrings.size()).clear();
                shortestStrings.add(strings.get(i));
            } else if (strings.get(i).length() == shortestStrings.get(0).length()) {
                shortestStrings.add(strings.get(i));
            }

        }
        shortestStrings.forEach(System.out::println);
    }
}
