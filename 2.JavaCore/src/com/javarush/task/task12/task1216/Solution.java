package com.javarush.task.task12.task1216;

/* 
Летать охота
*/

import java.sql.Driver;

public class Solution {
    public static void main(String[] args) {

    }

    //add an interface here - добавь интерфейс тут
    public interface CanFly {
        void fly(String newAddress);

        void drive(Driver driver);
    }
}
