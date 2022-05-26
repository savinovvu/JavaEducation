package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathFile = reader.readLine();
        reader.close();
        FileReader file = new FileReader(pathFile);
        BufferedReader fileReader = new BufferedReader(file);
        StringBuffer strBuffer = new StringBuffer();
        while (fileReader.ready()) {
            String line = fileReader.readLine().replaceAll("[\\n\\r]", "");
            strBuffer.append(line);
        }
        fileReader.close();
        Elements tags = Jsoup.parse(strBuffer.toString(), "", Parser.xmlParser()).select(args[0]);
        System.out.println(tags.toString());
    }
}

