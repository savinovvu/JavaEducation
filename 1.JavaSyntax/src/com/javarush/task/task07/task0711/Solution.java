package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();// валидатор не принимает List
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String string = reader.readLine();
            strings.add(string);
        }
        reader.close();
        for (int y = 0; y < 13; y++){
            strings.add(0, strings.get(4));
            strings.remove(5);
        }
       strings.forEach(System.out::println);
        //напишите тут ваш код
    }
}
