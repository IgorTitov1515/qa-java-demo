package com.academy.telesens.lesson01;

public class Home {
    public static void main(String[] args) {

//      Задание 1
//      Написать Java программу, которая выводит на консоль фигуру
        System.out.println("*"); //
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

//      Задание 2

        //Вывод данных
        //Вариант1
        System.out.print("-----");
        System.out.print("Абонент");
        System.out.print("-----\n");
        System.out.print("Имя:");
        System.out.print("Алексей\n");
        System.out.print("Фамилия:");
        System.out.print("Петров\n");
        System.out.print("Отчество:");
        System.out.print("Федорович\n");
        System.out.print("Возраст:");
        System.out.print("25\n");
        System.out.print("Пол:");
        System.out.print("М\n");
        System.out.print("Номер:");
        System.out.print("0961236547\n");


        //Вариант2
        System.out.println(String.format("-----Абонент----\n;Имя: %s;\nФамилия: %s;\nОтчество: %s;\nВозраст: %d;\nПол: %s;\nНомер %s;\n",
                "Алексей", "Сидоров", "Игорев", 30, "м", "0991234567"));

        //Вариант3
        System.out.print("-----");
        System.out.print("Абонент");
        System.out.print("-----\n");

        System.out.println(String.format("Имя: %s;\nФамилия: %s;\nОтчество: %s;\nВозраст: %d;\nПол: %s;\nНомер %s;\n",
                "Алексей", "Сидоров", "Игорев", 45, "м", "0991234567"));


    }
}
