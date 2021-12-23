package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human Vany = new Human("Vany", true, 65);
        Human Vity = new Human("Vity", true, 70);
        Human Ira = new Human("Ira", false, 55);
        Human Vary = new Human("Vary", false, 50);
        Human Igor = new Human("Igor", true, 35, Vany, Vary);
        Human Nina = new Human("Nina", false, 30, Vity, Ira);
        Human Any = new Human("Any", false, 9, Vity, Ira);
        Human Liza = new Human("Liza", false, 8, Vity, Ira);
        Human Georg = new Human("Grorg", true, 10, Igor, Nina);
        System.out.println(Vany);
        System.out.println(Vity);
        System.out.println(Ira);
        System.out.println(Vary);
        System.out.println(Igor);
        System.out.println(Nina);
        System.out.println(Any);
        System.out.println(Liza);
        System.out.println(Georg);
    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human mother;
        private Human father;

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}