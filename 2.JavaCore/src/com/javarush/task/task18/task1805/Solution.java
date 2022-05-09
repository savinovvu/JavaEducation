package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFile = reader.readLine();
        reader.close();
        InputStream inFile = new FileInputStream(pathFile);
        TreeSet<Integer> bites = new TreeSet<>();
        while (inFile.available() > 0) {
            bites.add(inFile.read());
        }
        inFile.close();
        bites.stream().sorted().forEach(elem -> System.out.print(elem + " "));
    }
}
