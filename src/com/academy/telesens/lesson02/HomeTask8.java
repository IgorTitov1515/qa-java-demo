package com.academy.telesens.lesson02;

import java.util.Scanner;

public class HomeTask8 {
    public static void main(String[] args) {

       // Нарисовать квадрат заданного размера. Пример для размера 4:

      //  kasner-andrey(c)

 /*       System.out.print("Enter size square: ");
        Scanner scanner = new Scanner(System.in);
        int sizeSquare = scanner.nextInt();
        String[][] square = new String[sizeSquare][sizeSquare];

        for (int i = 0; i < square.length; i++){
            System.out.println();
            for (int j = 0; j < square.length; j++){
                if(i == 0 || i == square.length - 1){
                    square[i][j] = "*";
                } else if(j == 0 || j == square.length - 1){
                    square[i][j] = "*";
                } else {
                    square[i][j] = " ";
                }
                System.out.print(square[i][j]);
            }
        }
        */

        //AnTEQ1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер квадрата:");
        int squareSize = scanner.nextInt();
        for (int i = 0; i < squareSize; i++){ //Цикл для наполнения строк
            System.out.print("*"); //Первым элементом каждой строки будет *
            for (int j = 1; j < squareSize-1; j++){ //Цикл наполнения столбцов
                if (i == 0 || i==squareSize-1){ // Если находимся в первой или последней строке то
                    System.out.print("*"); // заполняем столбцы *
                } else {
                    System.out.print(" "); // иначе пробелами
                }
            }
            System.out.println("*"); // последний символ каждой строки
        }

    }
}
