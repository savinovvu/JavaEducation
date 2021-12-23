package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> list = new HashMap<>();
        while (true) {
            int id;
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                break;
            }
            String name = reader.readLine();
            list.put(name, id);
        }
        reader.close();

        for (Map.Entry entry : list.entrySet()) {
            System.out.println( entry.getValue() + " "+ entry.getKey());
        }

    }
}
