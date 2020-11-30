package com.academy.telesens.lesson01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.print("Введите имя:\n");
        Scanner scanner = new Scanner(System.in);
        String name =  scanner .nextLine();

        System.out.print("Введите фамилию:\n");
        String twoName =  scanner .nextLine();

        System.out.print("Введите Отчество:\n");
        String threeName =  scanner .nextLine();

        System.out.print("Введите пол (м/ж):\n");
        String male =  scanner .nextLine();

        System.out.print("Введите Возраст:\n");
        Integer age = scanner.nextInt();

        System.out.print("Введите Номер (10цифр):\n");
        Integer fourName = scanner.nextInt();

        System.out.print("---Абонент---\n");
        System.out.println(String.format("Имя: %s",name));
        System.out.println(String.format("фамилию: %s",twoName));
        System.out.println(String.format("Отчество: %s",threeName));
        System.out.println(String.format("Пол: %s",male));
        System.out.println(String.format("Возраст: %d",age));
        System.out.println(String.format("номер: %d",fourName));
    }
    // comment for push
}
