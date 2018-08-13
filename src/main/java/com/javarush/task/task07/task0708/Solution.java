package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static List<String> getStrings() {
        return strings;
    }

    public static void setStrings(List<String> strings) {
        Solution.strings = strings;
    }

    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<String>();

        Solution solution = new Solution();
        solution.setStrings(strings);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int strMax = 0;
        String tmp;
        int tmpLen;

        for (int i = 0; i < 5; i++) {
            tmp = br.readLine();
            tmpLen = tmp.length();

            if (tmpLen > strMax)
                strMax = tmpLen;

            strings.add(tmp);
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == strMax)
                System.out.println(strings.get(i));
        }
    }
}

