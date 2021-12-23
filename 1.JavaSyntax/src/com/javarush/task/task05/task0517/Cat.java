package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(String name) {
        this.name = name;
        this.age = 5;
        this.weight = 3;
        this.color = "black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }


    public static void main(String[] args) {

    }
}
