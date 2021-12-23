package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
System.out.println(convertEurToUsd(4,3));
        System.out.println(convertEurToUsd(5,6));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double usd = eur * exchangeRate;
        return usd;
        //напишите тут ваш код

    }
}
