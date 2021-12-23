package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> multipleOfThree = new ArrayList<>();
        ArrayList<Integer> multipleOfTwo = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }
        reader.close();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 == 0 && numbers.get(i) % 2 == 0) {
                multipleOfThree.add(numbers.get(i));
                multipleOfTwo.add(numbers.get(i));
            } else if (numbers.get(i) % 3 == 0 && numbers.get(i) % 2 != 0) {
                multipleOfThree.add(numbers.get(i));
            } else if (numbers.get(i) % 3 != 0 && numbers.get(i) % 2 == 0) {
                multipleOfTwo.add(numbers.get(i));
            } else {
                other.add(numbers.get(i));
            }
        }
        printList((ArrayList<Integer>) multipleOfThree);
        printList((ArrayList<Integer>) multipleOfTwo);
        printList((ArrayList<Integer>) other);
    }


    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        list.forEach(System.out::println);

    }
}
