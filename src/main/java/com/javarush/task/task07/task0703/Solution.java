package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String[] strMas = new String[10];

        int[] numberMas = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strMas.length; i++) {
            strMas[i] = br.readLine();
        }
        for (int i = 0; i < strMas.length; i++) {
            numberMas[i] = strMas[i].length();
        }
        for (int i = 0; i < numberMas.length; i++) {
            System.out.println(numberMas[i]);
        }
    }
}
