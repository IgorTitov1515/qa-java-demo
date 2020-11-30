package com.academy.telesens.lesson02;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        //double weight;//На выводе ошибка
        System.out.println("Ведите ваш земной вес");
        Scanner scanner = new Scanner (System.in);
        //double weight;//На выводе ошибка
        Integer weight = scanner.nextInt();/*Сканер почемуто округляет до целого числа
        вес с запятой не проходит*/
       //double weight;//На выводе ошибка
        double weight2 = weight*0.17;
        //double weight2 = weight*(17/100);//Почему так не вычисляет?

        System.out.println(String.format("Ваш лунный вес %s", weight2));//Вариант1

        //  Вариант 2
          //System.out.println( "Ваш лунный вес:");
          // System.out.println( weight2);


//Задача не решена, ввод возможен только целых чисел

    }
}
