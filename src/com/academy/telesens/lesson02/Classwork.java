package com.academy.telesens.lesson02;

import java.util.Scanner;

public class Classwork {

    public static void main(String[] arg) {
//        System.out.println("Введите ваш возраст");
//        Scanner scanner = new Scanner(System.in);
//        Integer age1 = scanner.nextInt();
//
//        if (age1 < 18) {
//            System.out.println("Child;");
//        } else if (age1 < 70) {
//            System.out.println("Adult");
//        } else {
//            System.out.println("Old");

            System.out.println("Введите ваш возраст");
            Scanner scanner = new Scanner(System.in);
            Integer age2 = scanner.nextInt();

            if (age2 == 0) {
                System.out.println("ошибка");
         //   } else if (age2 > 1 || age2 < 18) {
            } else if ( age2 <= 18) {
                System.out.println("Несовершеннолетний");
          //  } else if (age2 > 18 || age2 < 89) {
              } else if ( age2 <= 89) {
                System.out.println("Взрослый");
            } else if (age2 >= 90) {
                System.out.println("Долгожитель");


            }
        }
    }

