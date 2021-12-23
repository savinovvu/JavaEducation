package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 4 2013")); //было изначальноJANUARY
    }
    public static boolean isDateOdd(String date) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        calendar.setTime(format.parse(date));
        int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);
        return day_of_year % 2 != 0;
    }
}
