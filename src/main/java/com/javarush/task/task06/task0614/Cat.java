package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/*
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            Cat.cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        for (int j = 0; j < cats.size(); j++) {
            System.out.println(cats.get(j));
        }
    }
}
