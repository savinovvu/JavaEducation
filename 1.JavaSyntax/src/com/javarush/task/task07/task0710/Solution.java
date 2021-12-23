package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();// валидатор не принимает List
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(0, string);
        }
        reader.close();
        strings.forEach(System.out::println);

    }
}
