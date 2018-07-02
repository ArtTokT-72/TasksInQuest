package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int otr = 0;
        int pol = 0;

        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a > 0)
                pol += 1;
            if (a < 0)
                otr += 1;
        }
        System.out.println("количество отрицательных чисел: " + otr);
        System.out.println("количество положительных чисел: " + pol);
    }
}
