package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Artem", 26, "Lenina");
        Man man1 = new Man("Petr", 28, "Tena");
        Woman woman = new Woman("Rita", 24, "Lermontova");
        Woman woman1 = new Woman("Rita", 24, "Lermontova");
        System.out.println(man.toString());
        System.out.println(man1.toString());
        System.out.println(woman.toString());
        System.out.println(woman1.toString());
                //напишите тут ваш код
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    //напишите тут ваш код
}
