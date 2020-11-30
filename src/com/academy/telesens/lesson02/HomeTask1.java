package com.academy.telesens.lesson02;

public class HomeTask1 {
    public static void main(String[] args) {
        int q = Integer.MAX_VALUE;// макс. десятичное
        int g  = q + 2;           //минимальное десятичное
        int r = (q+g)/2;          // среднее значение

        System.out.println(q);
        System.out.println(g);
        System.out.println(r);
    }
}
