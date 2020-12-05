package com.academy.telesens.lesson02;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {

        //exercise 1



//Выбрать из трех чисел максимальное ,минимальное и среднее.
        System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();

        System.out.print("Введите второе число: ");
        Integer y = scanner.nextInt();

        System.out.print("Введите третье число: ");
        Integer z = scanner.nextInt();

        System.out.println();
        if(x > y && x > z )
            System.out.println("Максимальное число: " + x);
        if(y > x && y > z )
            System.out.println("Максимальное число: " + y);
        if(z > y && z > x )
            System.out.println("Максимальное число: " + z);

        if(x < y && x < z )
            System.out.println("Минимальное число: " + x);
        if(y < x && y < z )
            System.out.println("Минимальное число: " + y);
        if(z < y && z < x )
            System.out.println("Минимальное число: " + z);

        if(x < y && x > z )
            System.out.println("Cреднее число: " + x);
        if(y > x && y < z )
            System.out.println("Cреднее число: " + y);
        if(z > y && z < x )
            System.out.println("Cреднее число: " + z);

        //Не работает с double

        System.out.println("************");
        // Artem1312(c)
        //
        int a, b, c, max, min;
        Scanner scanner1 = new Scanner(System.in) ;

        System.out.println("Введите число 1: ");
        a = scanner.nextInt();
        System.out.println("Введите число 2: ");
        b = scanner.nextInt();
        System.out.println("Введите число 3: ");
        c = scanner.nextInt();


        //находим максимум
        if (a > b) {
            if(a > c){
                max = a;
            } else max = c;
        } else if(b > c){
            max = b;
        } else max = c;

        System.out.println("max = " + max);
         //находим минимум
        if (a <b && a<c){
            min = a;
        }else if(b < a && b < c){
            min = b;
        }else min = c;

        System.out.println("Min = " + min);
        double avr = (min + max)/2;
        System.out.println("avr = " + avr);

    }
}
