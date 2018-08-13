package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] mas = new int[15];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        int sumTwo = 0;
        for (int i = 0; i < mas.length; i++) {
            if ((i % 2) == 0)
                sum += mas[i];
            else
                sumTwo += mas[i];
        }

        if (sum > sumTwo)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }

}
