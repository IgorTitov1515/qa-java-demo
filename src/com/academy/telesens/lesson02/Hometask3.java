package com.academy.telesens.lesson02;

import java.util.Scanner;

public class Hometask3 {
    public static void main(String[] args) {

        /* exercise 3
         */
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        Integer onetnumber = scanner.nextInt();

        System.out.println("Введите второе число:");
        Scanner scanner1 = new Scanner(System.in);// Почему здесь нужен scanner1 ? просто сканер не пропускает.
        Integer twotnumber = scanner1.nextInt();

        int a =onetnumber/twotnumber;
        System.out.println( String.format("Результат целочисленного деления : %s ",a));

        int b =  onetnumber%twotnumber;
        System.out.println( String.format("Остаток от деления : %s ",b));







    }
}
