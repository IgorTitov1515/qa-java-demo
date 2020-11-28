 package com.academy.telesens.lesson01;

import java.util.Scanner;

public class Demo {
    public  static  void method() {
        System.out.println("***Static method***");
    }

    public  static  void method2() {
        System.out.println("No Static method");
    }


    public static void main(String[] args) {
        // Вывод на консоль с переносом строки
        System.out.println("Привет Мир!");
        System.out.println("Привет Мир2!");
        System.out.println("Привет Мир3!");

        // Вывод на консоль. Курсор остается на текушей строке
        System.out.print("one");
        System.out.print("two");
        System.out.print("three\n");

        // Форматированние строк 1 способ (устаревший)
        System.out.printf("My name is %s; My address %s%n",
                "Helen","Kharkov");

        // Форматированние строк 2 способ (более правильный)
        System.out.println(String.format("My name is %s; My address %s; age: %d",
                "Helen","Kharkov", 28));

        // Вывод с консоли
        System.out.print("Введите ваше имя:");
        Scanner scanner = new Scanner(System.in); //Настраиваем сканер
        String name =  scanner .nextLine(); //Считываем имя с консоли
        Integer age = scanner.nextInt(); //Вводим фелое число
        System.out.println(String.format("Привет %s!",name));//Выводим приветствие



        Demo.method();
        Demo demo = new Demo();
        Demo.method2();






    }
}


