package com.academy.telesens.lesson02;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.println("Ведите ваш земной вес");
        Scanner scanner = new Scanner (System.in);
        Integer weight = scanner.nextInt();
        double weight2 = weight*17/100;

        System.out.println(String.format("Ваш лунный вес %s", weight2));//Вариант1

        //System.out.println( "Ваш лунный вес:");// Вариант 2
        //System.out.println( weight2);


//
//        double earthweight; // weight on earth
//        double moonweight; // weight on moon
//
//        earthweight = 165;
//
//        moonweight = earthweight * 0.17;
//
//        System.out.println(earthweight + " earth-pounds is equivalent to " +
//                moonweight + " moon-pounds.");

    }
}
