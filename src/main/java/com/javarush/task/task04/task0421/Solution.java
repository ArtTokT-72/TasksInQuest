package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        String name1 = br.readLine();

        if (name.equals(name1)) {
            System.out.println("Имена идентичны");

        } else

            if (name.length() == (name1.length())) {
            System.out.println("Длины имен равны");
        }
    }
}
