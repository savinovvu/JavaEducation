package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human liza = new Human("Liza", false, 10);
        Human katy = new Human("Katy", false, 3);
        Human mark = new Human("Mark", true, 15);
        Human artem = new Human("Artem", true, 31, liza,mark,katy);
        Human rita = new Human("Rita", false, 24, liza,mark,katy);
        Human nikolay = new Human("Nikolay", true, 55, rita);
        Human inga = new Human("Inga", false, 50, rita);
        Human oleg = new Human("Oleg", true, 50, artem);
        Human elena = new Human("Elena", false, 50, artem);

        //напишите тут ваш код
        System.out.println(elena.toString());
        System.out.println(inga.toString());
        System.out.println(oleg.toString());
        System.out.println(nikolay.toString());
        System.out.println(rita.toString());
        System.out.println(artem.toString());
        System.out.println(liza.toString());
        System.out.println(katy.toString());
        System.out.println(mark.toString());




    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age,  Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
