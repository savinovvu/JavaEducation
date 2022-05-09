package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFile = reader.readLine();
        reader.close();
        InputStream inFile = new FileInputStream(pathFile);
        List<Integer> Bites = new ArrayList<>();
        while (inFile.available() > 0) {
            Bites.add(inFile.read());
        }
        inFile.close();
        HashMap<Integer, Integer> repeaties = new HashMap<>();

        for (Integer minBite : Bites) {
            repeaties.put(minBite, Collections.frequency(Bites, minBite));
        }

        int minValue = Collections.min(repeaties.values());
        Set<Map.Entry<Integer, Integer>> entries = repeaties.entrySet();
        for (Map.Entry<Integer, Integer> pair : entries) {
            if (pair.getValue().equals(minValue)) {
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
