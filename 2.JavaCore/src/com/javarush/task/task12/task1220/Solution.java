package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

//import org.omg.CORBA.PUBLIC_MEMBER;

public class Solution {
    public static void main(String[] args) {

    }

    interface CanRun {
        void run();
    }

    interface CanSwim {
        void swim();
    }

    public static abstract class Human implements CanRun, CanSwim {

    }
    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
}
