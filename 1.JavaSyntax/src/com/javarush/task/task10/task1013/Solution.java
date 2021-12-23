package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int address;
        private String job;
        private String hobby;


        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Human(String name, int age, boolean sex, int  address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, int age, boolean sex, int  address, String job) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.job = job;
        }

        public Human(String name, int age, boolean sex, int  address, String job, String hobby) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.job = job;
            this.hobby = hobby;
        }
        public Human(int age, boolean sex, int  address, String job, String hobby) {
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.job = job;
            this.hobby = hobby;
        }

        public Human(String name, boolean sex, int  address, String job, String hobby) {
            this.name = name;
            this.sex = sex;
            this.address = address;
            this.job = job;
            this.hobby = hobby;
        }

        public Human(String name, int age, int  address, String job, String hobby) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.job = job;
            this.hobby = hobby;
        }


        public Human(String name, int age, boolean sex, String job, String hobby) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.job = job;
            this.hobby = hobby;
        }
        // Напишите тут ваши переменные и конструкторы
    }
}
