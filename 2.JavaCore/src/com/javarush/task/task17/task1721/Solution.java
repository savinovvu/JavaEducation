package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String pathFirsFile = reader.readLine();
            String pathSecondFile = reader.readLine();
            InputStream inFirstFile = new FileInputStream(pathFirsFile);
            Scanner scannerFirstFile = new Scanner(inFirstFile);
            while (scannerFirstFile.hasNext()) {
                allLines.add(scannerFirstFile.nextLine());
            }
            inFirstFile.close();
            InputStream inSecondFile = new FileInputStream(pathSecondFile);
            Scanner scannerSecondFile = new Scanner(inSecondFile);
            while (scannerSecondFile.hasNext()) {
                forRemoveLines.add(scannerSecondFile.nextLine());
            }
            inSecondFile.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }


    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
