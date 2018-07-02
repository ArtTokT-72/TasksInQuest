package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int rez = Math.abs(a) % 2;

        if (a < 1 || a > 999)
            return;

        if (a < 10 && rez == 0)
            System.out.println("четное однозначное число");

        if (a < 10 && rez == 1)
            System.out.println("нечетное однозначное число");

        if (a > 9 && a < 100 && rez == 0)
            System.out.println("четное двузначное число");

        if (a > 9 && a < 100 && rez == 1)
            System.out.println("нечетное двузначное число");


        if (a > 99 && a < 1000 && rez == 0)
            System.out.println("четное трехзначное число");

        if (a > 99 && a < 1000 && rez == 1)
            System.out.println("нечетное трехзначное число");

    }

}
