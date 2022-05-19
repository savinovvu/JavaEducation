package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Formattable;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFirstFile = reader.readLine();
        String pathSecondFile = reader.readLine();
        reader.close();
        FileReader firstFile = new FileReader(pathFirstFile);
        BufferedReader firstFileReader = new BufferedReader(firstFile);
        FileReader secondFile = new FileReader(pathSecondFile);
        BufferedReader secondFileReader = new BufferedReader(secondFile);
        List<String> firstFileLines = new ArrayList<>();
        List<String> secondFileLines = new ArrayList<>();
        while (firstFileReader.ready()) {
            firstFileLines.add(firstFileReader.readLine());
        }
        while (secondFileReader.ready()) {
            secondFileLines.add(secondFileReader.readLine());
        }
        firstFileReader.close();
        secondFileReader.close();
        while (!firstFileLines.isEmpty() && !secondFileLines.isEmpty()) {
            if (firstFileLines.get(0).equals(secondFileLines.get(0))) {
                lines.add(new LineItem(Type.SAME, firstFileLines.get(0)));
                firstFileLines.remove(0);
                secondFileLines.remove(0);
            }
            else if (firstFileLines.get(1).equals(secondFileLines.get(0))){
                lines.add(new LineItem(Type.REMOVED, firstFileLines.get(0)));
                firstFileLines.remove(0);
            }
            else {
                lines.add(new LineItem(Type.ADDED, secondFileLines.get(0)));
                secondFileLines.remove(0);
            }
        }
        if(firstFileLines.isEmpty()){
            while (!secondFileLines.isEmpty()){
                lines.add(new LineItem(Type.ADDED, secondFileLines.get(0)));
                secondFileLines.remove(0);
            }
        }
        else {
            while (!firstFileLines.isEmpty()){
                lines.add(new LineItem(Type.REMOVED, firstFileLines.get(0)));
                firstFileLines.remove(0);
            }
        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
