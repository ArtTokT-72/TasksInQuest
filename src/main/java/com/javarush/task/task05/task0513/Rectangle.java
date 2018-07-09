package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {

    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top) {

        this.top = 1;
        this.left = 2;
        this.width = 2;
        this.height = 5;

    }

    public void initialize(int top, int left) {

        this.top = 2;
        this.left = 2;
        this.width = width;
        this.height = height;

    }

    public void initialize(int top, int left, int width) {

        this.top = 2;
        this.left = 2;
        this.width = 2;
        this.height = width;
    }

    public void initialize(int top, int left, int width, int height) {

        this.top = 2;
        this.left = 2;
        this.width = 2;
        this.height = 5;
    }


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.initialize(2, 2, 3, 3);
    }
}
