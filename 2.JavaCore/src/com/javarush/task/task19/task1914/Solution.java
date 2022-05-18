package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String task = outputStream.toString();
        System.setOut(consoleStream);
        String[] parts = task.split(" ");
        int result = 0;
        switch (parts[1]) {
            case "+":
                result = Integer.parseInt(parts[0]) + Integer.parseInt(parts[2]);
                break;
            case "-":
                result = Integer.parseInt(parts[0]) - Integer.parseInt(parts[2]);
                break;
            case "*":
                result = Integer.parseInt(parts[0]) * Integer.parseInt(parts[2]);
                break;

        }
        System.out.println(task.trim() + " " + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

