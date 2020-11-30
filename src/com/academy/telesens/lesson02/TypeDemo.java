package com.academy.telesens.lesson02;

              //   LESSON2

public class TypeDemo {

    public static void main(String[] args) {
        String str = "Привет мир";
        System.out.println(str);

        int number =1234;
        System.out.println(number);
       // number = 5;
        number = Integer .parseInt("123");// Из строки сделать число
        System.out.println(number);

        int maxValue = Integer.MAX_VALUE; //получить максимальное значение MAX_VALUE
        //int maxValue2  = maxValue ; //2147483647
        //int maxValue2  = maxValue + 1; //-2147483648
        //int maxValue2  = maxValue + 2; // -2147483647
        //long maxValue2  = maxValue + 2; // -2147483647 хотя тип по больше
       //long maxValue2  = maxValue + 2L; // 2147483649  2L - тип long
        long maxValue2  = (long) maxValue + 2; // 2147483649  Привести к типу long

        System.out.println(maxValue);
        System.out.println(maxValue2);

       double d = 1234.345;//Дробная
       System.out.println(d);

       // char
        char symbol = 'a';//a одиночное число-одиночная кавычка
        //char symbol = 'a'+ 1254;//Շ
        //char symbol = 'a'+1;//b
        //char symbol = 'a'+'b';//Ã
        char symbol2 = 72;//(H по номеру в юникоде) На практике так не надо

        System.out.println(symbol);
        System.out.println(symbol2);

        long bigValue = 2147483649L;//Все цифры типа long
        System.out.println(bigValue);

        boolean logic = true;// true или false
        System.out.println(logic);

        //int phoneNumber = 9900;// 9900
       //int phoneNumber = 01;//1
        //int phoneNumber = 0123;//83 //Вычисления в десятичной системе
        //int phoneNumber = 0123;//123  // В восьмеричной системе
        int phoneNumber = 072341;//ноль в начале- восьмеричная система
        System.out.println(phoneNumber);


        //Приведение типов

        int intValue = 1234;
        long longValue = intValue;//Приведение типа из int в long (без приведения)
        System.out.println(longValue);

        long longValue2 = 1234L;//1234
        //long longValue2 = 123443452255641L;//1797201305(как-то обрезано после приведения)
        int intValue2 = (int)longValue2;//Приведение типа из long(большее) в int(меньшее) (в ручную)
        System.out.println(intValue2);

        //Упражнение
        double x = 1.1;//
        double y = 3;//
        double z = 5;//
       double result= z - y -x;//0.8999999999999999
       // System.out.println(x);
       // System.out.println(y);
       // System.out.println(z);
        System.out.println(result);
       double p = 0.9;//0.9
        System.out.println(p);
        System.out.println(5-3-1.1);//0.8999999999999999
        System.out.println((5-3-1.1)*10/10);//0,9 решение с помощью лайфхака (костыля)

        var str2 = "msg"; //string
        var namber2 = 123;//int
        //namber2 = str2; //строка не является числом


        int n1 = 10;
        int n2 = 3;
        int result3 = n1/n2;//3 Для корректного отображения надо перевести все типы на double
        System.out.println(result3);
        //System.out.println(1/0);// возникает ошибка
        System.out.println(1.0/0);// Infinity
        //System.out.println(0/1);// 0 Ноль

        System.out.println(10%2);//0
        System.out.println(10%3);//1
        System.out.println(1%3);//1
        System.out.println(10%20);//10

        int value =1;
        value++;//2(увеличение на 1) value= value+1; value+=1
       // value+=3;//4 value = value+3; value +=3 (увеличение на 3)

        System.out.println(value);//2

        System.out.println("********");
        //++value; //увеличивает значение value на 1, сохр это же значение в самом value
        int value2 =1;
       // System.out.println(++value2);//2
        //System.out.println(value2);//2
        System.out.println(value2++);//1
        System.out.println(value2);//2

        //System.out.println(--value2);//1
        //System.out.println(value2);//1
        System.out.println(value2--);//2
        System.out.println(value2);//1


        // Сравнение

        System.out.println(2==2);// true/false
        System.out.println(2==3);// false
        System.out.println(2!=3);// true (НЕ РАВНО ли?)
        System.out.println(2>=3);// false
        System.out.println(2<=3);// true

        System.out.println("**********");
        int n = 2;
        System.out.println(n < 3);//true
        System.out.println(n < 1);//false
        System.out.println(n > 1 && n < 3);//true //  && "И" "запинается на лжи"
        System.out.println(n > 2 && n < 3);//false
        System.out.println(n > 2 || n < 3);//true/  || "Или" "запинается на правде"
        System.out.println(n > 2 || n == 0);//false/  || "Или" "запинается на правде"
        System.out.println(!true);//false/  ! "НЕ"

        //Операторы присваивания
        int m = 2;
        m *= 3; //6
        m = m * 3; //6

        //Ключевое слово final
        //final  int z = 10;//final запрешает изменения значений переменных
       // final  int z;
        //z = 10;//final запрешает изменения значений переменных
        //char s = z; //приводить к любому типу можно

        //Ветвление if
        //int age = 10;//child
        int age = 80;// Old

        if (age < 18){
            System.out.println("Child;");
        } else if (age <70){
            System.out.println("Adult");
        } else {
            System.out.println("Old");
        }

        //  Оператор Switch ("zero", "one", "default")



    }
}
