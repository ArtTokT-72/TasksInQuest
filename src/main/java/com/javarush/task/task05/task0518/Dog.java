package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    //напишите тут ваш код

    private String name;
    private int height;
    private String color;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int height) {
        this.height = height;
        this.name = name;
    }

    public Dog(String name, int height, String color) {
        this.height = height;
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
