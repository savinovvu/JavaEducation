package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if(args.length == 0) return;
        if (args[0].equals("-c")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String pathInFile = reader.readLine();
            reader.close();
            BufferedReader input = new BufferedReader(new FileReader(pathInFile));
            String line;
            List<Integer> idArr = new ArrayList<>();
            while ((line = input.readLine())!=null) {
                idArr.add(Integer.parseInt(line.substring(0, 8).trim()));
            }
            input.close();

            idArr.sort(Integer::compareTo);
            int maxId = idArr.get(idArr.size()-1);
            maxId++;
            String fullData = "\n" + String.format("%-8d%-30.30s%-8.8s%-4.4s", maxId, args[1], args[2], args[3]);
            System.out.println(fullData);
            BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(pathInFile, true));
            bufferWriter.write(fullData);
            bufferWriter.close();
        }
    }


}



