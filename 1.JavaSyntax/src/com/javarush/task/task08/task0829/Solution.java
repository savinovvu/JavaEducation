package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        HashMap<String, String> namesAndCities = new HashMap<>();
        while (true) {

            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            }
            namesAndCities.put(city, name);
        }

        String ifCity = reader.readLine();
        System.out.println(namesAndCities.get(ifCity));

       /* List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            list.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }*/
    }
}
