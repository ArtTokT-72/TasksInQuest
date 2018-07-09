package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int count = 0;
        double sum = 0;
        while (a != -1) {
            a = Integer.parseInt(br.readLine());
            sum += a;
            count++;
        }
        double avg = (sum + 1) / (count - 1);
        System.out.println(avg);
    }
}

