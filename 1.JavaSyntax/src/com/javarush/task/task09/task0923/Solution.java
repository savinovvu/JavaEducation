package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();
        List strVowels = new ArrayList();
        List strConsonants = new ArrayList();
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                strVowels.add(ch + " ");
            } else if (ch != ' ') {
                strConsonants.add(ch + " ");
            }
        }
        strVowels.forEach(System.out::print);
        System.out.println("");
        strConsonants.forEach(System.out::print);
    }


    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}