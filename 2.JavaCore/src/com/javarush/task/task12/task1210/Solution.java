package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int i, int y) {
        if (i > y) {
            return i;
        } else {
            return y;
        }
    }

    public static long max(long i, long y) {
        return (i > y) ? i : y;
    }

    public static double max(double i, double y) {
        return Math.max(i, y);
    }
    //Напишите тут ваши методы
}
