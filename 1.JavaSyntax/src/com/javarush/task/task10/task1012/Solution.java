package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character x : alphabet) {
            map.put(x, 0);
        }
        Set<Character> keys = map.keySet();
        for (String s : list) {
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++)
                for (Character key : keys) {
                    if (arr[i] == key) {
                        map.put(key, map.get(key) + 1);
                    }
                }
        }
        for (Character key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        // напишите тут ваш код
    }
}
