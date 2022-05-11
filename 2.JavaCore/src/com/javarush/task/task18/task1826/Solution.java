package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {
        switch (args[0]) {
            case ("-e"): {
                try {
                    InputStream inFile = new FileInputStream(args[1]);
                    OutputStream outFile = new FileOutputStream(args[2]);
                    while (inFile.available() > 0) {
                        int rw = inFile.read();
                        outFile.write(encryption(rw));
                    }
                    inFile.close();
                    outFile.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case ("-d"): {
                try {
                    InputStream inFile = new FileInputStream(args[1]);
                    OutputStream outFile = new FileOutputStream(args[2]);
                    while (inFile.available() > 0) {
                        int rw = inFile.read();
                        outFile.write(decryption(rw));
                    }
                    inFile.close();
                    outFile.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public static int encryption(int bite) {
        return ~bite;
    }

    public static int decryption(int bite) {
        return ~bite;
    }
}
