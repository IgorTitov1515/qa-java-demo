package com.academy.telesens.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

/*
        Напишите программу, которая:
	- считывает строку
	- выводит исходную строку
	- выводит количество и список слов, которые заканчиваются
	 буквами 'ED'
 */

        //Artem1312(c)

   /*     Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = scanner.nextLine();
        System.out.println("Вы ввели строку : " + text);
      //  Вы ввели строку : WEED DEr RTed STED

        int count = 0;
        String[] words = text.split(" ");//разбиваю строку обрзоввывая массив
        //System.out.println(Arrays.toString(words));
        //[WEED, DEr, RTed, STED]
        System.out.println("Список слов которые заканчиваются на 'ED' :");

        for(int i = 0; i < words.length; i++){
            //проверяю что элеменнт массива заканчивается на ED (последний и предпоследний символ)
            if (words[i].charAt((words[i].length())-1)=='D' &&
                    words[i].charAt((words[i].length())-2)=='E'){
                count++;
                System.out.println(words[i]);
            }
        }
        System.out.println("Количество слов которые заканчиваються на 'ED': "+count);

//        WEED
//                STED*/

















    }
}
