package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        int a = list.size();
        System.out.println(a);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
