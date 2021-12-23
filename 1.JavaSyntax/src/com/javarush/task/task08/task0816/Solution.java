package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("MAY 1 2012"));
        map.put("Петров", dateFormat.parse("JULY 4 2015"));
        map.put("Сидоров", dateFormat.parse("JUNE 4 2015"));
        map.put("Кузнецов", dateFormat.parse("AUGUST 4 2015"));
        map.put("Симонов", dateFormat.parse("MAY 9 2012"));
        map.put("Оганов", dateFormat.parse("MAY 7 2012"));
        map.put("Пеганов", dateFormat.parse("MAY 5 2012"));
        map.put("Сечин", dateFormat.parse("MAY 3 2012"));
        map.put("Абрамов", dateFormat.parse("MAY 2 2012"));
    return map;
    }  //напишите тут ваш код


        public static void removeAllSummerPeople (Map < String, Date > map){
            //напишите тут ваш код
            Map<String, Date> copy = new HashMap<>(map);
            for (Map.Entry<String, Date> pair : copy.entrySet()) {
                if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                    map.remove(pair.getKey());
                }
            }

        }

        public static void main (String[]args){

        }
    }

