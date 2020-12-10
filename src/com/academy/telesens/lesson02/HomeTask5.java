package com.academy.telesens.lesson02;

import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {

         /* В переменной n хранится натуральное трёхзначное число.
        Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
        Пример:
        n = 234;
        sum = 9;  (2+3+4)
        - прочитать число с консоли
        - проверить, что число трезначное
        - вывести исходное число
        - вывести сумму цифр*/


      /*  //Artem1312(c)
        int a, b, c, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выведите трехзначное число :");
        n =scanner.nextInt();

        if((n/10 <= 9) || (n/10 >= 100)) {
            System.out.println("Вы ввели не трехзначное число");
        } else {
            a = (n/100)%10;
            b = (n/10)%10;
            c = n%10;
            System.out.println("Исходное число" + n);
            System.out.println("Сумма чисел:" +(a+b+c));
        }*/

        //kasner-andrey

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three-digit natural number :");
        int threeDigitNumber = scanner.nextInt();

        if(threeDigitNumber > 99 && threeDigitNumber <1000){
            double doubleNumber = threeDigitNumber;
            int firstDigit = (int) (doubleNumber/100);
            int secondDigit = (int) ((doubleNumber/10) - firstDigit*10);
            int threeDigit = (int) (doubleNumber - (firstDigit*100) - (secondDigit*10));
            System.out.println("n = "+ firstDigit +secondDigit + threeDigit);
            System.out.println("sum = "+ (firstDigit + secondDigit + threeDigit));

        }else System.out.println("This is not three-digit natural number.");









    }
}
