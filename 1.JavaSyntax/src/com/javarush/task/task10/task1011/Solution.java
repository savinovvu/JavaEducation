package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String text = "Я не хочу изучать Java, я хочу большую зарплату";
        System.out.println(text);
        for (int i = 1; i < 40; i++) {
            String tmp = text.substring(i);
            System.out.println(tmp);
        }
        //напишите тут ваш код
    }
}

