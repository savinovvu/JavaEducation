package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Z1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Z2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Z3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Z4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Z5";

        Protoss Protoss1 = new Protoss();
        Protoss1.name = "Pro1";
        Protoss Protoss2 = new Protoss();
        Protoss2.name = "Pro2";
        Protoss Protoss3 = new Protoss();
        Protoss3.name = "Pro3";

        Terran terran1 = new Terran();
        terran1.name = "T1";
        Terran terran2 = new Terran();
        terran2.name = "T2";
        Terran terran3 = new Terran();
        terran3.name = "T3";
        Terran terran4 = new Terran();
        terran4.name = "T4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
