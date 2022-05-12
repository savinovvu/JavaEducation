package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public volatile static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName = reader.readLine()).equals("exit")) {
            new ReadThread(fileName).start();
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            try {

                {
                    InputStream inFile = new FileInputStream(fileName);
                    List<Integer> Bites = new ArrayList<>();
                    while (inFile.available() > 0) {
                        Bites.add(inFile.read());
                    }
                    inFile.close();
                    HashMap<Integer, Integer> repeaties = new HashMap<>();
                    for (Integer maxBite : Bites) {
                        repeaties.put(maxBite, Collections.frequency(Bites, maxBite));
                    }
                    int maxValue = Collections.max(repeaties.values());
                    Set<Map.Entry<Integer, Integer>> entries = repeaties.entrySet();
                    for (Map.Entry<Integer, Integer> pair : entries) {
                        if (pair.getValue().equals(maxValue)) {
                            resultMap.put(fileName, pair.getKey());
                        }
                    }
                }

            } catch (IOException e) {

            }
        }
    }

}

