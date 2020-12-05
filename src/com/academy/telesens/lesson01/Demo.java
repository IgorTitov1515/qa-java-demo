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

//        // Вывод с консоли
//        System.out.print("Введите ваше имя:");
//        Scanner scanner = new Scanner(System.in); //Настраиваем сканер
//        String name =  scanner .nextLine(); //Считываем имя с консоли
//        Integer age = scanner.nextInt(); //Вводим фелое число
//        System.out.println(String.format("Привет %s!",name));//Выводим приветствие



        Demo.method();
        Demo demo = new Demo();
        Demo.method2();

            /*
Демонстрация использования переменных.
Присвойте файлу с исходным кодом имя Example2.java.
*/
        int var1, var2; // обе переменные объявляются в одном операторе
        //int var1; //обьявляется переменная(Обьявление переменных)
        //int var2; //объявляется еще одна переменная

        var1 = 1024; //переменной var1 присваивается значение 1024
        System.out.println("Переменная var1 содержит" +var1);/*   + указывает на то, что после символьной строки должно быть
выведено значение переменной varl.*/
        var2 = var1 /2;

        System.out.println("Переменная var2 содержит var1 / 2;");
        System.out.println(var2);





    }
}


