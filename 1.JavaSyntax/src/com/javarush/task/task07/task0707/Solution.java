package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //List<String> collect = IntStream.range(0, 5).mapToObj(v -> "string").collect(Collectors.toList());
        //List <String>list = collect;
        ArrayList<String> list = new ArrayList<String>();
        String s = "string";
        for (int i = 0; i < 5; i++) {
          list.add(s);
        }
        int n = list.size();
        System.out.println(n);
        //for (int i = 0; i < list.size(); i++) {
          //  System.out.println(list.get(i));
        //}
        list.forEach(System.out::println);

    }
}
