package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double t = Double.parseDouble(br.readLine());

        int a = (int) t;
        int rez = a % 5;
        if (rez == 3) {
            System.out.println("желтый");
            return;
        }
        if (rez == 4) {
            System.out.println("красный");
            return;
        }
        System.out.println("зеленый");
    }
}