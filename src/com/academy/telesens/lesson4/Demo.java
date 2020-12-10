package com.academy.telesens.lesson4;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
      /*  //вывести массив
        String[] words = {"one", "two", "three"};
        for (int i = 0; i < words.length; i++)
            System.out.println(words[i]);
*/
//*****************************************************
//Вывести все символы от 'a' до 'z'
   /*    System.out.println("1 Вывести массив строк" );

          // 1 Вывести массив строк ["One", "Two", "Three"]
        String[] words_bad = new String[3];//плохой вариант
        words_bad[0] = "One";
        words_bad[2] = "Two";
        // ...
        words_bad = new String[] {"One", "Two", "Three"};//плохой вариант

        String[] words = {"One", "Two", "Three"};//инициализация массива из  строк
        for (int i=0; i < words.length; i++) {//Вывести массив строк
            System.out.println(words[i]);
        }

        System.out.println("***for each***");
        for (String word : words) {       // иногда работает такая запись
            System.out.println(word);
        }
//**************************************************************************
        // 2 Вывести все символы от 'a' до 'z'
        System.out.println("2 Вывести все символы от 'a' до 'z'");
        char first = 'a';  //обьявить переменную типа символ
        char last = 'z';
        System.out.println(first); //выввести первый символ
        System.out.println((int)first);//привести первый символ к числовому значению
        System.out.println(last);//вывести последний символ
        System.out.println((int)last);
        System.out.println("****");
//        a
//        97
//        z
//        122
        for(char symb = 'a'; symb <= 'z'; symb++) {//1.перебрать все символы
            System.out.print(symb);
            System.out.print(" ");
        }//a b c d e f g h i j k l m n o p q r s t u v w x y z

        System.out.println("****");
        System.out.println();
        for(int i = 'a'; i <= 'z'; i++) {//2.перебрать все символы(более прилично)
          // System.out.print( i);//выведит числа 97...122
            System.out.print((char) i);//Операция приведения типов (из цифр в символы)
            System.out.print(" ");
        }//a b c d e f g h i j k l m n o p q r s t u v w x y z*/

//**********************************************************************************
        // методы работы с массивами

        //System.out.println(Arrays.toString(numbers));//если нужно вывести массив
//*****
       //System.out.println(Arrays.deepToString(array));//для вывода вложенных массивов
//*********
    /*    System.out.println("***sort***");//метод сортитровки
        String[] words = {"One", "Two", "Three"};
        Arrays.sort(words);//сортировать по алф
      //  Arrays.sort(words, fromIndex1, toIndex3);//сортировать
        // от 1 индекса до 3 (3 не включается)(редко)
        System.out.println(Arrays.toString(words));
//   [One, Three, Two]отсортированны по алфавиту*/

//*************************************************
/*
       System.out.println("***equals***");// сравнение

        String[] words1 = {"One", "Two", "Three"};
        String[] words2 = {"One", "Two", "Three"};
        System.out.println(Arrays.equals(words1, words2));//сравнивает(true если равны)
        //true
        words2[0] = "Hello";
        System.out.println(Arrays.equals(words1, words2));
        //false*/
//****************************************************
      /*   //ОБЕРТКИ
        int n1 = 12;//примитивный тип(n1 только значения)
        Integer n2 = 12;//ссылочный тип (n2-дополнительно базовые
        // методы позволяюшие его преврашать)

        long l1 = 123L;
        Long l2 = 123L;//ссылочный

        L1 = l2;//они обратимы
        l2 = L1;

        //над примитивными

        l1 = n1;//можно(в широкое более узкое)
        n1 = l1;//нельзя
        n1 =(int)l1;//операция привидения


        // над примитивными
        l1 = n1;
        n1 = (int)l1;

//***********

        // Операция привидения над обертками

        // расширяем
        l2 = n2.longValue();//1 способ длинная запись(longValue)
        l2 = (long)n2;      //короткая запись

        // сужаем
        n2 = l2.intValue(); //2способ

        //статический
        l2 = l1;
        l2 = Long.valueOf(l1); // 3, Статичесткий способ (длинная запись)
        // Java автоматически его делает
        l1 = l2;*/

//**************

     /*  System.out.println("***Character***"); //(ссылочный)

        Character symb1 = 'a';
        Character symb2 = '5';
        System.out.println(Character.isAlphabetic(symb1));//проверяет является ли
        // символ симовлом алфавита
        System.out.println(Character.isDigit(symb2));//проверяет является ли
        // символ симовлом цифры
//        true
//        true*/

//********************************************************
  /*               //СТРОКИ
        // Создание
        String firstName = "Peter";
        String lastName = "Ivanov";

        // Конкатенация - склеивание
        String fullName = firstName + " " + lastName;
        System.out.println(fullName); // => Peter Ivanov

        // Форматирование
        String profile = String.format("First name %s, last %s, age %d",
                firstName, lastName, 25);

        System.out.println(profile); // => First name Peter, last Ivanov, age 25

//****************************************

        System.out.println("a" + " " + "b");//строка + пробел +строка
       // a b
        System.out.println('a' + ' ' + 'b');//символ символ символ
        //227
        System.out.println((char)('a' + ' ' + 'b'));//перевод в символ
        //ã
        System.out.println('a' + " " + 'b');//чтобы нарушить работу с
        // кодами один операнд делаем сторокой
        //a b*/
//************************************************
/*
        System.out.println("*****Пример 1****");

        String hello = "Hello World!!!";//создание строки
       // String hello = "Hello"  + "World!!!";//создание строки

        System.out.println(hello.length());//метод length опр-е длины строки
        //13
        System.out.println(hello.charAt(2)); // метод charAt взятия символа
        // по индексу (третий символ- с нуля)
        //l
        String world = hello.substring(6); // метод substring - взятия подстроки
        // начиная с символа 7
        System.out.println(world);
        //World!!!
        String onlyWorld = hello.substring(6, 11);//если надо извлечь часть
        // строки (последний символ на учитывается не войдет в подстроку)
        System.out.println(onlyWorld); // подстрока начиная с 7 по 11 символ
        //World

        System.out.println("*****Пример 2****");

        String item = "id24_12349_vtr_234";//строка состоит из маркерных символов

        int firstIndex = item.indexOf("_");//метод indexOf- узнать индекс какого-то
        // символа первого (пробела)

        int lastIndex = item.indexOf("_", 5);//индекс последнего элемента
        // начиная с пробела(5)
        System.out.println(firstIndex);//4
        System.out.println(lastIndex);//10

       // String numberPart = item.substring(firstIndex + 1);//метод substring
        // позволяет взять подстроку (извлечь)(+1 чтобы не захватывать первый символ)
       // 12349_vtr_234
        String numberPart = item.substring(firstIndex + 1, lastIndex);//метод substring
        // позволяет взять подстроку (извлечь)(с 4 по 10 (где 10 захвачен не будет)) результат
         будет занесен в новую переменную (старая строка остается неизменной)
        System.out.println(numberPart);
        //12349

        int index = "123dfbas".indexOf("_");//извлечь индекс с подстроки которая в этой
        // строке не содержится, будет возврашено сообщение -1
        System.out.println(index);
        //-1//подстрока не найдена*/

 //*****************************************************************

     /*  System.out.println("****Сравнение строк****");

        String str1 = new String("hello");//обьявление строки
        //String str1 = "hello";
        //String str2 = "hello";
        String str2 = "he" + "llo";
        String str3 = "hello world";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //hello
        //hello
        //hello world
        System.out.println(str1 == str2); // так сравнивать строки нельзя т.к если
        // тип не примитивный то сравнивается не значение,  сравнивается ссылка, на что указывает этот тип
        //false
        System.out.println(str1.equals(str2)); //метод equals корректное сравнение по значению
        //true
        System.out.println(str1.equals(str3));
        //false*/
//*************************************************************************
    /*    System.out.println("Сравнение чисел");
        //int m1 = 200;//сравнение примитивных чисел
        //int m2 = 200;
        //System.out.println(m1 == m2);
        //true
       Integer m1 = 200;//сравнение ссылочного типа
       Integer m2 = 200;
        System.out.println(m1 == m2);
        //false
        System.out.println(m1.equals(m2));//метод equals для сравнения
        // ссылочного типа чисел(Java все числа от 1 до 127 она кеширует на специальном кеше)
        //true*/
//******************************************************
/*
        System.out.println("****Замена подстроки****");

        String msg = "   Hello, Helen!!!   ";
        String changedMsg = msg.replaceAll("!!!", "!");//метод replaceAll если
        // хотим что-то поменять в нашей строке(3!!! на1!) результат
        // будет занесен в новую переменную (старая строка остается неизменной)
       //String changedMsg = msg.replaceFirst("!!!", "!");//метод replaceFirst если
        // хотим поменять часть строки на другую
        System.out.println(msg);
        //Hello, Helen!!!
        System.out.println(changedMsg);
        //Hello, Helen!
//***************************************************
        System.out.println(msg.toLowerCase());//метод toLowerCase всю строку перевести в нижний регистр
        //hello, helen!!!
        System.out.println(msg.toUpperCase());//метод toUpperCase всю строку перевести в верхний регистр
        //HELLO, HELEN!!!

        System.out.println("'" + msg + "'");
        //  '   Hello, Helen!!!   '
        System.out.println("'" + msg.trim() + "'"); //метод trim убирает пробелы в начале и конце
        //   'Hello, Helen!!!'
//********
        String demoString = "One,Two,Three";
        String[] parts = demoString.split(",");//метод split позволяет из строки получить массив этих частей
        // (при наличии четкого разделителя(например запятой)), который будет четко бить строку на части
        System.out.println(Arrays.toString(parts));//вывести массив
        //[One, Two, Three]

        String tmp = Arrays.toString(parts);//строка промежуточный результат полученная методом Arrays.toString
        System.out.println(Arrays.toString(parts));
        //[One, Two, Three]
        String joined = tmp
                .replaceAll("\\[", "")//скобку заменим на пустую строку
                .replaceAll("\\]", "")//скобку заменим на пустую строку
                .replaceAll(" ", "");//все пробелы заменим на пустую строку
        System.out.println(joined);
        //One,Two,Three*/
//*************************************************************

        /*  // методы
        String emptyStr = "";
        String str = "Hello World!";
        System.out.println(str.contains("ell")); //=> true//Проверить содержит ли
        // строка в себе другую

        System.out.println(str.length()); //=> 12//Позволяет узнать длинну строки
        System.out.println(str.compareTo("Bye")); //=> 6

        System.out.println(str.toLowerCase()); //=> "hello world!"
        System.out.println(str.toUpperCase()); //=> "HELLO WORLD!"

        char ch1 = str.charAt(0); // => 'H'//Можем взять отдельный символ по индексу
        char ch2 = str.charAt(1); // => 'e'
        char chLast = str.charAt(str.length()-1); // => '!'

        System.out.println(str.substring(6)); // => "World!"//взять подстроку
        System.out.println(str.substring(0, 5)); // => "Hello"

        System.out.println(str.isEmpty());      // => false
        System.out.println(emptyStr.isEmpty()); // => true

        System.out.println(str.startsWith("Hell")); // => true
        System.out.println(str.startsWith("ell", 1)); // => true
        System.out.println(str.endsWith("rld!")); // => true

        String str2 = "  Hello World! ";
        System.out.println(str2.trim()); // => "Hello World!"

        System.out.println(str.equalsIgnoreCase("heLLo woRlD!")); // => true;//сравнить методы игнорируя регистр
        System.out.println(str.indexOf("o")); // => 4// проверить какой индекс является у индекса такогото
        System.out.println(str.indexOf("o", 5)); // => 7

        System.out.println(str.lastIndexOf("orl")); // => 7
        System.out.println(str.replace("Hello", "Bye")); // => Bye World!
        System.out.println(str.replaceAll("l", "л")); // => "Heллo Worлd!"
        String[] words = str.split(" "); // => ["Hello", "World!"]
        char chars[] = str.toCharArray(); // => ['H', 'e', 'l', 'l', 'o', ' ',...]//получить массив символов и строки
        System.out.println(str.repeat(2)); // =>  Hello World!Hello World!*/

        /*System.out.println("Сравнение чисел");
        Integer m1 = 200;
        Integer m2 = 200;
        System.out.println(m1.equals(m2));

      /*  System.out.println("***sort***");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("***equals***");
    String[] words1 = {"One", "Two", "Three"};
    String[] words2 = {"One", "Two", "Three"};
        System.out.println(Arrays.equals(words1, words2));
    words2[0] = "Hello";
        System.out.println(Arrays.equals(words1, words2));

        System.out.println("Сравнение чисел");
    Integer m1 = 200;
    Integer m2 = 200;
        System.out.println(m1.equals(m2));*/
//************************************************************

        //имея массив вывести на консоль все треки от 10 до 15


        String[] tracks={//есть массив треков
                "track_01", "track_03", "track_21", "track_15",
                "track_12", "track_99", "track_11", "track_10"};

        // Перебираем все треки (циклом for)
        // Извлекаем для каждого номер и выводим на консоль номера (oт 10 до 15)
        for (int i=0; i < tracks.length; i++) {
            int indexStart = tracks[i].indexOf('_'); // извлечь номер который соответствует индекс символа '_'
            String digits = tracks[i].substring(indexStart + 1); // извлекаем подстроку цифр
            int number = Integer.parseInt(digits); // цифры из строки приводим к целому (числовому) типу
            if (number >= 10 && number <= 15) // проверяем на диапазон
                System.out.println(tracks[i]);
        }
//        track_15
//                track_12
//        track_11
//                track_10
   }
}