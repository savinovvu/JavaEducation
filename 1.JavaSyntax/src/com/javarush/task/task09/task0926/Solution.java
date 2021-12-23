package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int first[] = {5, 6, 7, 8, 9};
        int second[] = {3, 5};
        int third[] = {5, 7, 8, 9};
        int fourth[] = {5, 6, 7, 8, 9, 3, 3};
        int fifth[] = {};
        ArrayList<int[]> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
