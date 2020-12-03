package com.academy.telesens.shild;

public class Chapters2 {
    public static void main(String[] args) {
// Демонстрация использования операции%
        int iresult, irem;
        iresult = 10/3;
        irem = 10 % 3;

        double dresult = 10.0 / 3.0;
        double drem = 10.0 % 3.0;

        System.out.println("Результат и остаток от деления 10 / 3: "
                + iresult + " " + irem);

        System.out.println("Результат и остаток от деления 10,0 / 3,0 :" + dresult + " " + drem);

//        Результат и остаток от деления 10 / 3: 3 1
//        Результат и остаток от деления 10,0 / 3,0 :3.3333333333333335 1.0

        System.out.println("***********************");

        //Операции инкремента и декремента
       // х = 10;
        //у= ++х;//y = 11 x = 11
       // х = 10;
       // у= х++;//y = 10 x = 11
        System.out.println("***********************");


        // Демонстрация использования операций сравнения
        // и логических операций

        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("это не будет выполненно");
        if (i >= j) System.out.println("это не будет выполненно");
        if (i > j) System.out.println("это не будет выполненно");

        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("это не будет выполненно");
        if(b1 & b2) System.out.println("!(b1 & b2): true");//true и false
        if(b1 | b2) System.out.println("!(b1 | b2): true");//или
        if(b1 ^ b2) System.out.println("!(b1 ^ b2): true");//исключающее или
//        i < j
//        i <= j
//        i != j
//        !(b1 | b2): true
//        !(b1 ^ b2): true

        System.out.println("***********************");

// Демонстрация использования укороченных логических операций
        int n, d, f;

        n = 10;
        d = 2;
        if(d != 0 && (n % d) ==0)//Укороченная операция
            // предотвращает деnенне на нуnь
            System.out.println(d + " является делителем " + n);

        d = 0; //установить для d нулевое значение
        //Второй операнд не вычисляется, поскольку значение
        //переменной d равно нулю
        if (d !=0 && (n % d) ==0)
            System.out.println(d + " является делителем " + n);


//        А теперь те же самые действия выполняются без использования
//        укороченного логического оператора. В результате возникнет
//        ошибка "деление на нуль"./ by zero
//        if(d !=0 & (n % d) == 0) //Теперь вычисnяются о6а выражения,
//            // в резуnьтате чеrо будет производиться деnение на нуnь
//            System.out.println(d + " является делителем " + n );
       System.out.println("***********************");
        // Демонстрация роли побочных эффектов

        int l;
        l = 0;
        /* Значение переменной l инкрементируется, несмотря
на то что проверяемое условие в операторе if ложно */
        if(false & (++l <100))
            System.out.println("эта строка не будет отражаться");
        System.out.println("Оператор if выполняется: " +l);//отображается 1

        System.out.println("*");
        /* В данном случае значение переменной i не инкрементируется,
         поскольку второй операнд укороченного логического оператора
         не вычисляется, а следовательно, инкремент пропускается */

        if(false && (++l <100))
            System.out.println("эта строка не будет отражаться");
        System.out.println("Оператор if выполняется: " +l);//по-прежнему отображается 1

        System.out.println("***********************");

        // Демонстрация автоматического преобразования типа long в тип douЫe

        long L;
        double D;

        L = 100123285L;//Автоматнческое nреобразование тнnа long в тнn douЫe
        D = L;//Автоматнческое nреобразование тнnа long в тнn douЫe
        System.out.println("L и D: " + L + " " + D);
       // L и D: 100123285 1.00123285E8

       /* //Эта программа не пройдет компиляцию
        D = 100123285.0;
        L = D;// Ошибка!!! Тнn douЫe не преобразуется автоматнческн в тнn long
        System.out.println("L и D: " + L + " " + D);*/
        System.out.println("***********************");

        // Демонстрация приведения типов
        double s, v;
        byte w;
        int k;
        char ch;

        s = 10.0;
        v = 3.0;
        k = (int) (s / v);// привести тип douЫe к типу int
       // в данном сnучае теряется дробная часть чисnа
        System.out.println("Целочисленный результат деления s / v: "+k);

        k = 100;
        w = (byte) i;//А в этом сnучае информацня не теряется.
        //Тип Ьуtе может содержать значение lОО
        System.out.println("Значение k:" + k);

        k = 257;
        w = (byte) k;//На этот роз информацня теряются.
        //Тип byte не может содержать значение 257
        System.out.println("Значение k:" + k);

        w = 88;//Представление символа Х в коде ASCII
        ch = (char) w;//Явное приведение несовместимых типов
        System.out.println("ch: " + ch);

//        Целочисленный результат деления s / v: 3//потерю
//         дробной части
//        Значение k:100
//        Значение k:257//снова происходит потеря данных,
//        ch: X//данные не теряются, но явное приведение типов все же требуется.

        System.out.println("***********************");

// Упражнение 2.2
        // Отображение таблицы истинности для логических операций

        boolean p, q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");//обеспечить выравнивание столбцов таблицы, в каждую выводимую
        //строку следует ввести символы \ t.
         //P	Q	AND	OR	XOR	NOT

        p = true; q = true;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
//        P	Q	AND	OR	XOR	NOT
//        true	true
//        true	true
//        false	false

        p = true; q = false;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        //P	Q	AND	OR	XOR	NOT
//        true	false
//        false	true
//        true	false
//
        p = false; q = true;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.println(p + "\t" + q + "\t");
        System.out.println((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

//        P	Q	AND	OR	XOR	NOT
//        true	true
//        true	true
//        false	false
//        true	false
//        false	true
//        true	false
//        false	true
//        false	true
//        true	true
//        false	false
//        false	false
//        false	true

        System.out.println("***********************");

// Неожиданный результат повьпnения типов!

        byte t;
        int r;

        t = 10;
        r = t * t;//Приведение типов не требуется, так как тнn уже nовыwен да int

        t = 10;
        t = (byte)(t * t);//Здесь дnя присваивания значения int переменной
        // типа byte требуется приведение тнnов
        System.out.println("r and t: " + r + " " + t);
        //r and t: 100 100
        System.out.println("***********************");








    }
}
