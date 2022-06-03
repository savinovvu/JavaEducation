package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.frequency;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathInFile = reader.readLine();
        reader.close();
        FileReader inFile = new FileReader(pathInFile);
        BufferedReader inFileReader = new BufferedReader(inFile);
        while (inFileReader.ready()) {
            String line = inFileReader.readLine();
            List<String> wordsOfLine;
            wordsOfLine = Arrays.asList(line.split(" "));
            long countOfRepeat = wordsOfLine.stream().filter(words::contains).count();
            if (countOfRepeat == 2) {
                System.out.println(line);
            }
        }
        inFileReader.close();
    }
}
