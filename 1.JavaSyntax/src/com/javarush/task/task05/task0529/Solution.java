package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumCoin = 0;
        while (true) {
            String coin = reader.readLine();
            if (coin.equals("сумма"))
                break;
            int nCoin = Integer.parseInt(coin);
            sumCoin += nCoin;
        }
        reader.close();
        System.out.println(sumCoin);
    }
}
