package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    //напишите тут ваш код
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public void initialize(int centerX1, int centerY1, int radius1) {
        this.centerX = centerX1;
        this.centerY = centerY1;
        this.radius = radius1;
    }
    public void initialize(int centerX1, int centerY1, int radius1, int width1) {
        this.centerX = centerX1;
        this.centerY = centerY1;
        this.radius = radius1;
        this.width = width1;
    }
    public void initialize(int centerX1, int centerY1, int radius1, int width1, int color1) {
        this.centerX = centerX1;
        this.centerY = centerY1;
        this.radius = radius1;
        this.width = width1;
        this.color=color1;
    }


    public static void main(String[] args) {

    }
}
