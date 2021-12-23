package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.*;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> Mam = new ArrayList<>();
        Collections.addAll(Mam, "мама", "мыла", "раму");
        for (int i = 1; i < Mam.size() + 1; i += 2)
            Mam.add(i, "именно");
        Mam.forEach(System.out::println);
    }
}
