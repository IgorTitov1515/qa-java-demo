package com.academy.telesens.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


            /*1) Напишите программу, которая:
        - считывает строку
                - выводит исходную строку
        - выводит количество и список слов, которые начинаются на букву 'd'*/

       /*/   //Artem1312(c)

        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Ваша строка: " + text);

    //    String text = "Wsd hal def cnm da";

        int count = 0;
        String[] words = text.split (" "); //разбиваю строку обрзоввывая массив
        //System.out.println(Arrays.toString (words));
        // [Wsd, hal, def, cnm, da]
        for(int i=0; i < words.length; i++){
            if(words[i].charAt(0) == 'd'){//проверяю что элемент массива начинаеться на 'd'
                count++;
                System.out.println(words[i]);

            }
        }*/



    }
}
