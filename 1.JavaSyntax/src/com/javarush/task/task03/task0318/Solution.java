package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите число");
        String sAge = reader.readLine();
        System.out.println("введите имя");
        String name = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println(name+ " захватит мир через " + nAge+" лет. Му-ха-ха!");
    }
}
