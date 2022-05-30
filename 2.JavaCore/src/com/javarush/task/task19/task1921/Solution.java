package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        FileReader inFile = new FileReader(args[0]);
        BufferedReader inFileReader = new BufferedReader(inFile);
        while (inFileReader.ready()) {
            String line = inFileReader.readLine();
            String[] lineаForDate = line.split(" ");
            String name = line.replaceAll("\\w|\\d", "").trim();
            String birthdayLine = lineаForDate[lineаForDate.length - 3] + " " + lineаForDate[lineаForDate.length - 2] + " " + lineаForDate[lineаForDate.length - 1];
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
            Date birthday = formatter.parse(birthdayLine);
            PEOPLE.add(new Person(name, birthday));
        }
        inFileReader.close();
    }
}
