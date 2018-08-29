package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
            list.add(br.readLine());

        int min = list.get(0).length(),
                max = min;
        for (String s : list) {
            if (s.length() > max)
                max = s.length();
            if (s.length() < min)
                min = s.length();
        }
        for (String s : list)
            if (s.length() == max || s.length() == min) {
                System.out.println(s);
                break;
            }
    }
}
