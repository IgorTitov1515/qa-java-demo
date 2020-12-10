package com.academy.telesens.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


       /* Напишите программу, которая:
        - считывает строку
                - считывает подстроку
                - выводит исходные строку
                 и подстроку и выводит кол-во вхождений строки в подстроку*/


        //Artem1312(c)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку : ");
        String text = scanner.nextLine();
        System.out.println("Введите подстроку : ");
        String subText = scanner. nextLine();

        System.out.println("Вы ввели строку: " + text);
        System.out.println("Вы ввели подстроку : " +subText);

        String temp;
        int count = 0;

        for(int i = 0; i < text.length(); i++){
            if(i+subText.length() <= text.length()){
                temp = text. substring(i, i + subText.length());
            }else break;
           // System.out.println(temp);
            if (temp.equals(subText)){
                count++;
            }else continue;
        }
        System.out.println(count);










    }
}
