package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader inFile = new FileReader(args[0]);
        BufferedReader inFileReader = new BufferedReader(inFile);
        Map<String, Double> enrollment = new TreeMap<>();
        String[] buff = new String[2];
        while (inFileReader.ready()) {
            buff = inFileReader.readLine().split(" ");
            enrollment.merge(buff[0], Double.parseDouble(buff[1]), (oldVal, newVal) -> oldVal + newVal);
        }
        inFileReader.close();
        for(Map.Entry entry:enrollment.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
