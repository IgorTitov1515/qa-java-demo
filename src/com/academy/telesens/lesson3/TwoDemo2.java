package com.academy.telesens.lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDemo2 {
    public static void main(String[] args) {

        int[][] array = new int[3][2];//массив из 3 элем содерж 2
        array[1][0] = 5;
        array[2][1] = 7;

        // System.out.println(Arrays.toString(array)); //для вывода массивов
        // [[I@568db2f2, [I@378bf509, [I@5fd0d5ae]
        System.out.println(Arrays.deepToString(array));//для вывода вложенныхмассивов
        // [[0, 0], [5, 0], [0, 7]]

//**********************************************************
        //Перебрать вложенный массив
        System.out.println("***");
        for (int i = 0; i < array.length; i++) { //один for по наружному/внешнему
            // массиву с индексом i
           // System.out.println(array[i]);
            //[I@378bf509
             //       [I@5fd0d5ae
                //    [I@2d98a335

            System.out.println(Arrays.toString(array[i]));//применить к array
            // индекс один разя забераю у него элемент
//[0, 0]
//[5, 0]
//[0, 7]
            for (int j = 0; j < array[i].length; j++) {//цикл вложенный
                System.out.println(array[i][j]);
//                [0, 0]
//                0
//                0
//                        [5, 0]
//                5
//                0
//                        [0, 7]
//                0
//                7
            }
        }
    }
}