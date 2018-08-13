package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int mas[] = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(br.readLine());
        }
        int tmp = 0;
        int i = 0;
        int j = mas.length-1;
        while (i!=j+1) {
            tmp = mas[i];
            mas[i] = mas [j];
            mas [j] = tmp;
            i++;
            j--;
        }

        for (int e = 0;e<mas.length; e++) {
            System.out.println(mas[e]);

        }
    }
}

