package com.javarush.task.task13.task1318;

import javafx.scene.shape.Path;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        InputStream inStream = new FileInputStream(path);
        int i;
        while((i = inStream.read())!= -1){

            System.out.print((char)i);
        }
        inStream.close();
        reader.close();
    }
    //D:\test.txt
}