package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;

    public void initialize(String name2) {
        this.name = name2;
    }

    public void initialize(String name2, int age2) {
        this.name = name2;
        this.age = age2;
    }

    public void initialize(String name2, int age2, char sex2) {
        this.name = name2;
        this.age = age2;
        this.sex = sex2;

    }

    public static void main(String[] args) {

    }
}
