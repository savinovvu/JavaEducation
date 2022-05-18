package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException {
            String dataAboutAPerson = fileScanner.nextLine();
            String[] segregatedDataAboutAPerson = dataAboutAPerson.split(" ");
            String strBirthDate= segregatedDataAboutAPerson[5]+"/"+segregatedDataAboutAPerson[4]+"/"+segregatedDataAboutAPerson[3];
            SimpleDateFormat objDf = new SimpleDateFormat("yyyy/MM/dd");
            Date birthDate = null;
            try {
                birthDate = objDf.parse(strBirthDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(segregatedDataAboutAPerson[1],segregatedDataAboutAPerson[2],segregatedDataAboutAPerson[0],birthDate);

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
