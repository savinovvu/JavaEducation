package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();// валидатор не принимает List
        for (int i = 0; i < 5; i++) {
            String string = reader.readLine();
            strings.add(0, string);
        }
        reader.close();
        strings.remove(2);
        strings.forEach(System.out::println);

    }
}
