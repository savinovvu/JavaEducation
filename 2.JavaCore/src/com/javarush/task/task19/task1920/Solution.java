package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
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
        Double maxValueInMap = (Collections.max(enrollment.values()));
        enrollment.entrySet().stream()
                .filter(e -> e.getValue().equals(maxValueInMap))
                .forEach(e -> System.out.println(e.getKey()));
    }
}
