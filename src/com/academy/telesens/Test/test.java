package com.academy.telesens.Test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int a, b, n ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        n = scanner.nextInt();

        if(n/10 > 9 || n/10 == 0){
            //n -= n;
            System.out.print("Вы ввели не двухзначное число");
            //n += scanner.nextInt();
        } else {    //(0 < n/10 && n/10 < 10)
            a = n/10;
            b = n%10;
            System.out.println("Исходное число: "+n);
            System.out.println("Сумма чисел: "+ (a+b));
    }
}}


