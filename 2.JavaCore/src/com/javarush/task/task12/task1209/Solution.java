package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int i, int y) {
        if (i < y) {
            return i;
        } else {
            return y;
        }
    }

    public static long min(long i, long y) {
        return (i < y) ? i : y;
    }

    public static double min(double i, double y) {
        return Math.min(i, y);
    }
    //Напишите тут ваши методы
}
