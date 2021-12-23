package com.javarush.task.task13.task1326;

import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        InputStream inStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inStream);
        List<Integer> list = new ArrayList<Integer>();
        while (scanner.hasNext()) {
            list.add(  scanner.nextInt());
        }
        reader.close();
        inStream.close();
        Collections.sort(list);
        for (int ell : list){
            if (ell%2==0){
                System.out.println(ell);
            }
        }
    }

}
//D:\test.txt

