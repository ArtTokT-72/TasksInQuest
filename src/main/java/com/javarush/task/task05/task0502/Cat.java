package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {

    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if (this.age < anotherCat.age)
            return true;
        if (this.weight < anotherCat.weight) {
            return true;
        }
        if (this.strength < anotherCat.strength) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.age = 1;
        cat2.age = 2;

        cat1.weight = 2;
        cat2.weight = 3;

        cat1.strength = 3;
        cat2.strength = 4;

    }
}
