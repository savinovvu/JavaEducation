package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static class Cat {
        public String name;

    }

    public static Cat cat;

    static {
        cat = new Cat();
        System.out.println(cat.name = "Kot");
    }

    public static void main(String[] args) {

    }
}
