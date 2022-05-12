package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
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
        if (args.length > 0) {
            for (int i = 0; i < fileData.size(); i++) {
                String id = fileData.get(i).substring(0, 8).trim();
                if (id.equals(args[1]) && args[0].equals("-d")) {
                    fileData.remove(i);
                }
                if (id.equals(args[1]) && args[0].equals("-u")) {
                    fileData.set(i, String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]));
                }

            }
        }
        BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(pathInFile));
        for (String product : fileData) {
            bufferWriter.write(product + "\n");
        }
        bufferWriter.close();

    }

}

