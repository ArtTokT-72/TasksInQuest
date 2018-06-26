package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputMas = new int [3];

        for (int i=0;i<inputMas.length;i++) {
            inputMas[i] = Integer.parseInt(br.readLine());
        }

        int a;
        for (int i=0;i<inputMas.length;i++) {
            a =0;
            for (int j=0;j<inputMas.length;j++) {
                if (inputMas[i]==inputMas[j] && i!=j && inputMas[i] != -1) {
                    System.out.print(inputMas[j]+" ");
                    inputMas[j] = -1;
                    a = 1;

                }
            }
            if (a ==1)
                System.out.print(inputMas[i]);
        }

    }
}