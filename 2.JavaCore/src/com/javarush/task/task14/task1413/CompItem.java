package com.javarush.task.task14.task1413;

public interface CompItem {
    public default String getName(){
        return this.getClass().getSimpleName();
    }
}
