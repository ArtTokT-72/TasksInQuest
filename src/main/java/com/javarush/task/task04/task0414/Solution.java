package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println("количество дней в году: "+daysInTheYear (a));
    }
    public static int daysInTheYear (int a) {
        int b = a % 400;
        int c = a % 100;
        int d = a % 4;
        int res = 365;

        if (d == 0) {
            res = 366;
        }

        if (c == 0 && b != 0) {
            res = 365;
        }

        return res;
    }
}