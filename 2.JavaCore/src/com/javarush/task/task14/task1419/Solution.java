package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
//напишите тут ваш код
        try {
            throw new ArrayStoreException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new FileNotFoundException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NumberFormatException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ConcurrentModificationException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new EmptyStackException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
//1. java.lang.ArithmeticException: / by zero
//2. java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 1
//            3. java.io.FileNotFoundException: C:\txtxtx (Не удается найти указанный файл)
//4. java.lang.NullPointerException: Exception: s is null!
//            5. java.lang.NumberFormatException: null
//            6. java.lang.IllegalArgumentException: obj не может быть равно null
//            7. java.lang.ClassCastException: class com.javarush.task.task14.task1419.Fox cannot be cast to class com.javarush.task.task14.task1419.notFox (com.javarush.task.task14.task1419.Fox and com.javarush.task.task14.task1419.notFox are in unnamed module of loader 'app')
//            8. java.lang.ArrayStoreException: java.lang.Integer
//9. java.util.ConcurrentModificationException
//10. java.util.EmptyStackException
}
