package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 400;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
