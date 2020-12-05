package com.academy.telesens.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double value = scanner.nextDouble();
//        System.out.println(value);

//        int anyIntNumber = scanner.nextInt();
//        String anyStringNumber = Interger.toString(anyIntNumber);//число превратили в строку
//        int sumAnyNumber = 0;
//
//        int n1 = 4;
//        int n2 = 2;
//
//        int actualResult = n1 + n2;//
//        int expexted = 9;// ожидаемый
//
//        assert actualResult == expexted;//показыаем что act должен быть равен expected
//        System.out.println("finish");
////        finish
//        System.out.println("********");

//      for(<инициализация> ; <условие выполнения> ;<шаг>){  //цикл for
        //         <тело цикла>
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.print("i = " + 1);
//
////            i = 1
////            i = 1
////                         9раз
////            i = 1
//
        System.out.println("********");

//          while (<условия выполнения>) { //пока выполняется цикл
//                <тело цикла>
//            }
//            int i = 0;
//            while (i < 10) {
//                System.out.println("i = " + i);
//                i++;
//            }
////        i = 0
////        i = 1
////        9раз
////        i = 9
//        System.out.println("********");
//
//     //с помощью цикла вывести на консоль значение от 1 до 100
//        int i = 1;
//        for (i = 1; i < 100; i+=2){
//            System.out.println("i = " + i);
//
//        }
//        System.out.println("********");
//       Посчитать и вывести на консоль сумму ряда от 1 до n (1+2+3+...+n)
//        int number = 10;
//        int sum = 0;
//
//        System.out.print("Sum numder " + number + " = ");

//        for (int i = 1; i <= number; i ++){
//            sum = sum + 1;
//            if ( i == number) {
//                System.out.print(i);
//            }else{
//                System.out.print(i + " + ");
//            }
//        }
//        Sum numder 10 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10

//        System.out.println("********");
//
//        int n = 10;
//        int sum = 0;
//        for ( int i = 1; i <= n; i ++){
//            sum += i;
//        }
//        System.out.println(sum);//55
//
//        System.out.println("********");

//**************************************************************************

        //МАССИВЫ

//        Type[] variable = new Type[size] //обьявление массива

//        int[] digits = new int [10]; // инициализация
//        String[] words = new String[10];// инициализация

        //для первоначальной инициализации

//        int[] digits = { 1,2,3,66,4};
//        String[] words = {"one", "two"};
//
//        int[] digits = new int []{ 1,2,3,66,4};; // инициализация
////      String[] words = new String[]{"one", "two"};


//        String[] words = new String[]{"one", "two", "three"};
//        System.out.println(words.length); // (3) длинна массива length
//        for (int i = 0; i < words.length; i++)//вывод на экран массива
//            System.out.println(words[i]);
//        one
//        two
//        three
//********************************************************************

//        int[] numbers = new int[10];
//        numbers[2] = 4; //в индекс под номером 2 мы положим 4
//        System.out.println(numbers);
////        [I@568db2f2
//
//        System.out.println(Arrays.toString(numbers));//если нужно вывести массив
        //       [0, 0, 4, 0, 0, 0, 0, 0, 0, 0]
//********************************************************************

        //вывести массив в обратном порядке
//        int[] numbers = new int[5];
//        //заполнить случацными числами
//        numbers[0] = 4;
//        numbers[1] = 9;
//        numbers[2] = 11;
//        numbers[3] = 45;
//        numbers[4] = 66;
//
//        //цикл с обратной последовательностью заполнения
//        for (int i = numbers.length - 1; i >= 0; i--){
//            System.out.println(numbers[i]);
//        }

        //возможность заполнить массив случайными значениями

//        Random random = new Random();//возможность заполнить массив случайными значениями
//        int[] numbers = new int[5];
//        numbers[2] = random.nextInt();// хотим в массив записать случайное рандомное
//        значение(от мин до макс)
//        numbers[2] = random.nextInt( bound:100);// ограничить сверху(от 0 до 100)
//        System.out.println(Arrays.toString(numbers);//хотим вывести массив

        //для doudle наполнить числами от 1 до 10 случайными

//        double[] doubleNumders = new double[10];
//        doubleNumders[0] = random.nextDouble();//генерирует дробные от 0.0 до 1.0
//        for (int i = doubleNumders.length-1; i >=0; i --){
//            doubleNumders[1] = random.nextDouble()*10
//        }
//        System.out.println("Array = " + Arrays.toString(doubleNumders));
//        System.out.println();

//        System.out.println("Random 10 - 100");
//        double[] numbersDouble2 = new double[8];
//
//        for (int i = numbersDouble2.length - 1; i >= 0; i--){
//            numbersDouble2[i] = 10 + random.nextDouble() * 90;
//        }
//        System.out.println("Array = " + Arrays.toString(numbersDouble2));
//
        //для ограничения рандома random.nextInt(bound: 100) только "ИНТ" щт 0 до 99 включительно

        //System.out.println(Arrays.toString(numbers));

//        int[][] array = new int[3][2];
//        array[1][0] = 5;
//        array[2][1] = 10;
//        System.out.println(Arrays.deepToString(array));//для вывода вложенных массивов
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array[i]));
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.println(array[i][j]);
//            }

        System.out.println("***************");

//            Random random = new Random();//возможность заполнить массив случайными значениями
//          int[] numbers = new int[5];//массив из 5 элементов
//            for(int i  = 0;i < numbers.length; i++){
//
////                System.out.println(numbers[i]);//обратиться к текушему элементу
//                numbers[i] = random.nextInt( bound: 100);//записываем в массив случайные значнения
////                от 0 до 99
//
    }
//        0
//        0
//        0
//        0
//        0

//            numbers[0] = random.nextInt();// хотим в массив записать случайное рандомное
//            значение(от мин до макс)
//            numbers[2] = random.nextInt( bound:100);// ограничить сверху(от 0 до 100)
//            System.out.println(Arrays.toString(numbers);//хотим вывести массив
}

