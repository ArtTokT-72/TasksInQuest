package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код top, left, width, height

    private int top, left, width, height;

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
    }
    public Rectangle( int left) {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int left, int width, int height) {
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2,2,2,2);

    }
}
