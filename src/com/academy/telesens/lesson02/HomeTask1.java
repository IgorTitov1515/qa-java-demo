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

    }
}
