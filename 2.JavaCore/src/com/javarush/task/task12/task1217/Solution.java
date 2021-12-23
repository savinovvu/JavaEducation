package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

    //add interfaces here - добавь интерфейсы тут
    public interface CanFly {
        void fly(String newAddress);
    }

    public interface CanRun {
        void run(String newAddress);
    }

    public interface CanSwim {
        void swim(String newAddress);
    }
}
