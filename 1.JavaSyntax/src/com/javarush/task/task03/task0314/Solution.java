package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 1;
        int b = 1;

        while (a!=11){
            for (int i = 1; i<=10;i++){
                b=a*i;
                System.out.print(b+" ");
            }
            System.out.println();
            a++;
        }

    }
}
