package com.academy.telesens.lesson4;

public class Demo {
    public static void main(String[] args) {
//        //вывести массив
//        String[] words = {"one", "two", "three"};
//        for (int i = 0; i < words.length; i++)
//            System.out.println(words[i]);




//*****************************************************

//Вывести все символы от 'a' до 'z'
         System.out.println();

          // 1 Вывести массив строк ["One", "Two", "Three"]
        String[] words_bad = new String[3];
        words_bad[0] = "One";
        words_bad[2] = "Two";
        // ...
        words_bad = new String[] {"One", "Two", "Three"};

        String[] words = {"One", "Two", "Three"};
        for (int i=0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("***for each***");
        for (String word : words) {
            System.out.println(word);
        }

        // 2 Вывести все символы от 'a' до 'z'
        System.out.println("2 Вывести все символы от 'a' до 'z'");
        char first = 'a';
        char last = 'z';
        System.out.println(first);
        System.out.println((int)first);
        System.out.println(last);
        System.out.println((int)last);
        System.out.println("****");
        for(char symb = 'a'; symb <= 'z'; symb++) {
            System.out.print(symb);
            System.out.print(" ");
        }
        System.out.println();
        for(int i = 'a'; i <= 'z'; i++) {
            System.out.print((char)i);
            System.out.print(" ");
        }
    }
}