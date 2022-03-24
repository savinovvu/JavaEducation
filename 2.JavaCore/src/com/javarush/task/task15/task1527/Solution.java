package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] listOfFirstFilter = url.split("\\?")[1].split("&");
        List<String> listOfParameters = new ArrayList<>();
        for (String s : listOfFirstFilter) {
            String[] listOfSecondFilter = s.split("=");
            System.out.print(listOfSecondFilter[0] + " ");
            if (listOfSecondFilter[0].contains("obj")) {
                listOfParameters.add(listOfSecondFilter[1]);
            }
        }
        reader.close();
        for (String s2 : listOfParameters) {
            try {
                alert(Double.parseDouble(s2));
            } catch (NumberFormatException e) {
                alert(s2);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("\n" + "double: " + value);
    }

    public static void alert(String value) {
        System.out.print("String: " + value);
    }
}
