package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Family_" + i, "Name_" + i);
        }

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy2 = new HashMap<>(map);//напишите тут ваш код
        for (String value : copy2.values()) {
            int i = Collections.frequency(copy2.values(), value);
            if (i >= 2) {
                removeItemFromMapByValue(map, value);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy3 = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy3.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}

