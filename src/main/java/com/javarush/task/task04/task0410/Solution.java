package com.javarush.task.task04.task0410;
/*
Напишите метод checkInterval. Метод должен проверять попало ли целое число в интервал от 50 до 100
и сообщить результат на экран в следующем виде: "Число а не содержится в интервале." или "Число
а содержится в интервале.", где а - аргумент метода.
 */

public class Solution {

    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        //напишите тут ваш код
        if(a >= 50 & a < 100);
        {
            System.out.println("Число а содержится в интервале.");
        }
            System.out.println("Число а не содержится в интервале.");
        }
        }

