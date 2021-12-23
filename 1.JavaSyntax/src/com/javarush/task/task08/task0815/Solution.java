package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            people.put("Family_" + i, "Name_" + i);
        }
        return people;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int counter = 0;
        for (String s : map.values()) {
            if (s.equals(name)) counter++;
        }
        return counter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код


        if (map.keySet().contains(lastName)) return 1;
        else return 0;
    }

    public static void main(String[] args) {

    }
}
