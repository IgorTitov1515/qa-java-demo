package com.academy.telesens.lesson3;

public class HomeTask7 {
    public static void main(String[] args) {



//        Проинициализировать одномерный массив произвольными целыми числами
//        Вывести массив в виде,

        int[] digits =new int []{ 1, 100, 25, 330,77};

        System.out.println(digits.length);
        for (int i= 0; i < digits.length; i++){
            System.out.println(digits[i]);
        }
        System.out.println("****************");
        int i = 0;
  //      int[] digits =new int []{ 1, 100, 25, 330,77};
        while(i < digits.length){
            System.out.println(digits[i]);
            i++;
        }


    }

}
