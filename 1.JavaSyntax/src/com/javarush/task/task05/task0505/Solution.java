package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Igor", 1, 3, 7);
        Cat cat2 = new Cat("Ysy", 3, 2, 1);
        Cat cat3 = new Cat("Rygiy", 7, 3, 9);
        cat1.fight(cat2);
        cat2.fight(cat3);
        cat3.fight(cat1);
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            if (score > 0) {
                System.out.println(this.name);
            } else {
                System.out.println(anotherCat.name);
            }
            return score > 0;

            // return score > 0 ? true : false;
        }
    }
}
