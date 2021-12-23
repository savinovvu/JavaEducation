package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        reader.close();
        Boolean up = true;
        for (char c : string.toCharArray()) {
            if (up) c = Character.toUpperCase(c);
            up = false;
            if (c == ' ') {
                up = true;
            }
            System.out.print(c);
        }


        //напишите тут ваш код
    }
}
