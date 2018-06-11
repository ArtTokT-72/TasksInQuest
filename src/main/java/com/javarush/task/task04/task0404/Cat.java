package com.javarush.task.task04.task0404;

/*
Напишите метод setCatsCount. Метод должен устанавливать количество котов (catsCount).
 */
public class Cat {

    private static int catsCount = 0;

    public static void addNewCat() {

        Cat.catsCount = +1;
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.addNewCat();

    }
}
