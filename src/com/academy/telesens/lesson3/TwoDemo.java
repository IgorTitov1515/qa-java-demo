package com.academy.telesens.lesson3;

import java.util.Arrays;
import java.util.Random;

public class TwoDemo {
    public static void main(String[] args) {

 /*      //Вывести массив в обратном порядке
        System.out.println("Reversed");

      int[] numbers = new  int[5];//инициализация массива
        //Заполнить случайнымми цифрами
        numbers[0] = 4;
        numbers[1] = 9;
        numbers[2] = 11;
        numbers[3] = 45;
        numbers[4] = 66;
        // Вывести массив на консоль с обратной последовательностью

        for (int i = numbers.length-1; i >=0; i--){
            System.out.println(numbers[i]);
//            66
//            45
//            11
//            9
           }*/

//********************************************************************
    //Заполнить массив случайными значениями

 /*       Random random = new Random();//вспомогательный класс
        // создает возможность заполнить массив случайными значениями
        int[] numbers = new int[5];
        numbers[2] = random.nextInt();//хотим в массив записать
        // случайное рандомное значение от мин до макс
       // numbers[2] = random.nextInt( bound:100); //от 0 до 100
        System.out.println("Origin array");
        System.out.println(Arrays.toString(numbers));
//     [0, 0, 1978707904, 0, 0]*/


//*******************************************************************

 /*       //заполнить массив для double случайными числами от 0 до 10

        Random random = new Random();
        double[] doubleNumbers = new double[10];
        doubleNumbers[0] = random.nextDouble();//случайные числа от 0,0 до 1,0

        for (int i = doubleNumbers.length-1; i >= 0; i--);{
            doubleNumbers[1] = random.nextDouble()*10;
        }
        System.out.println("Arrays = " + Arrays.toString(doubleNumbers));
  //      Arrays = [0.6946503585718287, 9.944050941682391, 0.0, 0.0, 0.0,
        //      0.0, 0.0, 0.0, 0.0, 0.0]*/

//***********************************************************************

  /*      //заполнить массив для double случайными числами от 10 до 100
        System.out.println("Random 10-100");

        Random random = new Random();
        double[] doubleNumbers2 = new double[8];
        for (int i = doubleNumbers2.length - 1; i >=0; i--){
            numbersDouble2[i] = 10 + randome.nextDouble()*90;
        }
        System.out.println("Arrays = " + Arrays.toString(numbersDouble2));

 //       System.out.println(String.format("double value %f", 1.1));//стринг формат для double

*/
//*************************************************************


 /*       Random random = new Random();
        int[] numbers = new  int[5];//инициализация массива
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);//обратиться к текушему элементу
        }
//        0
//        0
//        0
//        0
//        0*/
//****************************************************************
/*        //запишем в этот массив случайные текушие значения
         //  number[0] = random.nextInt(100)

        Random random = new Random();
        int[] numbers = new  int[5];//инициализация массива
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt( bound:100); //записыаваем в массив
            // случайные значения от 0 до 99
        }
*/
//*******************************************************************

//Вывести массив на оборот
        Random random = new Random();
        int[] numbers = new  int[5];
        System.out.println("Origin array");
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
           // System.out.println(numbers[numbers.length - i-1] );
            System.out.println(numbers[i] );
            System.out.println("");
        }

//**************************************************************

        //заполнить массив для double случайными числами от 0 до 10


        double[] doubleNumbers = new double[30];
        doubleNumbers[0] = random.nextDouble();//от (0.0 до 1,0)
        //от 0.0 до 10.0
        for(int i = 0; i < doubleNumbers.length; i++){
            doubleNumbers[i] =10*  random.nextDouble();//ратсягивается диапозон
        }
        System.out.println(Arrays.toString(doubleNumbers));

//[1.5054926419424242, 5.530698692406084, 8.79460382310318, 5.52400290626921,

//****************************************************************
        //от 10 до 100

       // double[] doubleNumbers = new double[30];
        //doubleNumbers[0] = random.nextDouble();//от (0.0 до 1,0)
        //от 0.0 до 10.0
        for(int i = 0; i < doubleNumbers.length; i++){
            doubleNumbers[i] =10 + 90 * random.nextDouble();//ратсягивается диапозон
        }
        System.out.println(Arrays.toString(doubleNumbers));

//******************************************************************
    }
}