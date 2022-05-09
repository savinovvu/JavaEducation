package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
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
        for (Integer maxBite : Bites) {
            repeaties.put(maxBite, Collections.frequency(Bites, maxBite));
        }
        int maxValue = Collections.max(repeaties.values());
        Set<Map.Entry<Integer, Integer>> entries = repeaties.entrySet();
        for (Map.Entry<Integer, Integer> pair : entries) {
            if (pair.getValue().equals(maxValue)) {
                System.out.print(pair.getKey() + " ");
            }
        }


    }
}
