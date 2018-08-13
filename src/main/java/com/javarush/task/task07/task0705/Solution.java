package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int masOne[] = new int[20];
        for (int i = 0; i < masOne.length; i++) {
            masOne[i] = Integer.parseInt(br.readLine());
        }
        int masTwo[] = new int[10];
        int masThree[] = new int[10];

        for (int i = 0; i < masTwo.length; i++) {
            masTwo[i] = masOne[i];
        }
        for (int i = 0; i < masThree.length; i++) {
            masThree[i] = masOne[i + 10];
        }
        for (int i = 0; i < masThree.length; i++) {
            System.out.println(masThree[i]);
        }
    }
}
