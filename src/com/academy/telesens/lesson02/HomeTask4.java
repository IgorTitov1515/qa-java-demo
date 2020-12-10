package com.academy.telesens.lesson02;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
// exercise 4
// kasner-andrey(c)
/*
        В переменной n хранится натуральное двузначное число.
                Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
        (Натуральными называются целые положительные числа: 1, 2, 3,...)
        Пример:
        n = 23;
        sum = 5;  (2+3)
                - прочитать число с консоли
                - проверить, что число двузначное
        - вывести исходное число
        - вывести сумму цифр*/

      // kasner-andrey

      /* Scanner scanner = new Scanner( System.in);
        System.out.println("Enter two-digit natural number: ");
        int twoDigitNumber = scanner.nextInt();

        if(twoDigitNumber > 9 && twoDigitNumber < 100){
            double doubleNumber = twoDigitNumber;
            int firstDigit = (int) (doubleNumber / 10);
            int secondDigit = (int) Math.round(((doubleNumber / 10)
                    -firstDigit)*10);
            System.out.println("n = " + firstDigit + secondDigit);
            System.out.println("sum = " + (firstDigit + secondDigit));
        }else System.out.println("This is not two-digit natural number.");*/


    //AnTEQ1(c)

    /*  int sum = 0;
      Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число:");
        int a = scanner.nextInt();
        if (a >= 10 && a < 100) {
            System.out.println("Вы ввели число: " + a);
            for (int i = 0; i < 2; i++){
                sum += a % 10;
                a = a/10;
            }
            System.out.println("Сумма цифр исходного числа: " + sum);
        } else {
            System.out.println("Введеное значение не является двузначным");
        }*/

        //Artem1312(c)
        int a, b, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        n = scanner.nextInt();

        if(n/10 > 9 || n/10 == 0){
            //n -= n;
            System.out.println("Вы ввели не двухзначное число");
            //n +=scanner.nextInt();
        } else {  //(0 < n/10 && n/10 < 10)
            a = n/10;
            b = n%10;
            System.out.println("Исходное число : " + n);
            System.out.println("Сумма чисел : "+ (a+b));
        }



















 /*       Scanner.scanner = new Scanner(System.in);
        System.out.println("Enter two-digit natural number: ");
        int twoDigitNumber = scanner.nextInt();
        if (twoDigitNumber > 9 && twoDigitNumber < 100){
            double doubleNumber = twoDigitNumber*/






    }
}
