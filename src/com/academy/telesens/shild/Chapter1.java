package com.academy.telesens.shild;

public class Chapter1 {
    public static void main(String args []){
        /*
Демонстрация использования переменных.
Присвойте файлу с исходным кодом имя Example2.java.
*/
        int var1, var2; // обе переменные объявляются в одном операторе
        //int var1; //обьявляется переменная(Обьявление переменных)
        //int var2; //объявляется еще одна переменная

        var1 = 1024; //переменной var1 присваивается значение 1024
        System.out.println("Переменная var1 содержит" +var1);/*   + указывает на то, что после символьной строки должно быть
выведено значение переменной varl.*/
        var2 = var1 /2;

        System.out.println("Переменная var2 содержит var1 / 2;");
        System.out.println(var2);

/*
Демонстрация различий между типами int и douЫe.
*/
        int var;// объявить целочисленную переменную
        double x;// объявить переменную с плавающей точкой
        var = 10;// присвоить переменной var значение 10
        x =10.0; // присвоить переменной х значение 10.О

        System.out.println("Haчaльнoe значение переменной var:" +var);
        System.out.println("Haчaльнoe значение переменной x:" +x);
        System.out.println();// Вывод пустой строки

        // Разделить значения обеих переменных на 4
        var = var / 4;
        x = x / 4;

        System.out.println("Знaчeниe переменной var после деления:" + var);
        System.out.println("Знaчeниe переменной x после деления:" + x);


//Упражнение 1 .1 Преобразование rаллонов в литры
        double gallons;// в этой переменной хранится значение,
                      // выражающее объем жидкости в галлонах
        double liters;//в этой переменной хранится значение,
                      // выражающее объем жидкости в литрах
        gallons = 10; // начальное значение соответствует 10 галлонам
        liters = gallons * 3.7854;//перевести в литры
        System.out.println(gallons + " галлонам соответствует " +
                liters + " литров");

        //Оператор if

         if(10<11) System.out.println("1O меньше 11");
        if(10 < 9) System.out.println("Этa строка не отобразится");

        System.out.println("****************");
        //Демонстрация применения оператора if.

        int a, b, c;/*если требуется несколько переменных одного типа, их
                     можно объявить в одной инструкции.*/
        a = 2;
        b = 3;
        if(a < b) System.out.println("a меньше b");
        // Следующая строка никогда не может быть выведена
        if(a == b) System.out.println("ы не должны увидеть этот текст");

        System.out.println();

        c = a - b; //переменная "с" содержит значение -1
        System.out.println("с содержит -1");
        if(c >=0) System.out.println("c -не отрицательное число");
        if(c < 0) System.out.println("c -отрицательное число");
        System.out.println();

         c = b - a;
        System.out.println("С содержит 1");
        if(c >=0) System.out.println("c -не отрицфтельное число");
        if(c < 0) System.out.println("c -отрицательное число");


        System.out.println("****************");
       //Цикл for
        //fоr(инициализация; условие; итерация) оператор;
        //Демонстрация применения цикла for.

        int count;
        for (count = 0; count < 5; count = count + 1)  //Этот цнкя выnоnняет пять итераций
            System.out.println("Знaчeниe счетчика: " + count);
        System.out.println("Готово!");








    }
}
