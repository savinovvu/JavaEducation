package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathInFile = reader.readLine();
        reader.close();
        BufferedReader input = new BufferedReader(new FileReader(pathInFile));
        List<String> fileData = new ArrayList<>();
        String line;
        while ((line = input.readLine()) != null) {
            fileData.add(line);
        }
        input.close();
        String id = args[0];

        for (int i = 0; i < fileData.size(); i++) {
            String[] parts = fileData.get(i).split(" ");
            String res = parts[0];
            if (res.equals(id)) {
                System.out.println(fileData.get(i));
            }
        }
    }

}
