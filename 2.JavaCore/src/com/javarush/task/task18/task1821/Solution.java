package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream(args[0]);
        List<Byte> bytes = new ArrayList<>();
        while (inFile.available() > 0) {
            bytes.add((byte) inFile.read());
        }
        inFile.close();
        HashMap<Byte, Integer> repeaties = new HashMap<>();
        for (Byte byte1 : bytes) {
            repeaties.put(byte1, Collections.frequency(bytes, byte1));
        }
        Map<Byte, Integer> sortRepeaties = new TreeMap<Byte, Integer>(repeaties);
        Set<Map.Entry<Byte, Integer>> entries = sortRepeaties.entrySet();
        for (Map.Entry<Byte, Integer> pair : entries) {
            System.out.println((char) (byte) pair.getKey() + " " + pair.getValue());
        }


    }
}
