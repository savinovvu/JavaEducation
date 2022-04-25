package com.javarush.task.task16.task1632;

import org.omg.CORBA.TRANSACTION_MODE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);


    static {
        threads.add(new InfinityTread());
        threads.add(new InterruptedTread());
        threads.add(new HurrahTread());
        threads.add(new MessageThread());
        threads.add(new SumThread());
    }


    public static class InfinityTread extends Thread {
        public void run() {
            while (true) {

            }
        }
    }

    public static class InterruptedTread extends Thread {
        public void run() {
            try {
                while (true) {
                    throw new InterruptedException();
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class HurrahTread extends Thread {

        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class MessageThread extends Thread implements Message {

        private boolean isCancelled = false;

        @Override
        public void showWarning() {
            isCancelled = true;
        }

        public void run() {
            while (!isCancelled) {
            }

        }

    }

    public static class SumThread extends Thread {
        int sum = 0;

        public void run() {
            try {

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String stop = reader.readLine();
                sum = Integer.parseInt(stop);
                while (!stop.equals("N")) {
                    int number = Integer.parseInt(reader.readLine());
                    sum = sum + number;
                }
                reader.close();
            } catch (Exception e) {
                System.out.println(sum);
            }
        }
    }


    public static void main(String[] args) {
    }
}