package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = reader.readLine();

        while (true) {
            switch (key) {
                case ("user") {
                    person = new Person.User();

                }
                case ("loser") {
                    person = new Person.Loser();a

                }
                case ("coder") {
                    person = new Person.Coder();

                }
                case ("proger") {
                    person = new Person.Proger();

                }
                default:
                    break;

            }
        }


        //тут цикл по чтению ключей, пункт 1
        {
            //создаем объект, пункт 2

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
    }
}
