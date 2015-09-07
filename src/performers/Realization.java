package performers;

import model.Electronic;
import model.MobilePhone;
import model.TV;

import java.awt.*;

/**
 Created by nsemenchenko on 23.07.2015.

 1. Создать 3 класса, описывающие 2 типа некоего товара. Один из классов – базовый,
 второй и третий – описывают типы товаров. В первом – обязательны поля «цена» и «название».
 В наследниках должны быть объявлены новые поля.
 1.1. В классах должны быть два конструктора: пустой и параметризованный, методы get set  для каждого поля,
 метод public String toString(), возвращающий строковое представление объекта.
 1.2. Базовый класс должен быть абстрактным.
 1.3. При помощи статических полей и метода найти и отпечатать среднюю цену товара.
 2. Создать контейнер для хранения товаров. В нем должны быть реализованы методы Add, Count,
 метод доступа по индексу, сортировки по цене и печати содержимого.
 3. Заполнить контейнер, распечатать, отсортировать, распечатать.
 */

public class Realization {
    static double sumOfPricesForTv;
    static int amountTv;

    static double sumOfPricesForMobPh;
    static int amountMobPh;

    static Electronic buildTv(String name, double price, int amount, String manufacturer, String diagonal){
        sumOfPricesForTv += price * amount;
        amountTv += amount;
        return new TV (name, price, amount, manufacturer, diagonal);
    }

    static Electronic buildMobPhone(String name, double price, int amount, String manufacturer){
        sumOfPricesForMobPh += price * amount;
        amountMobPh += amount;
        return new MobilePhone(name, price, amount, manufacturer);
    }

    public static double getSumOfPricesForTv() {
        return sumOfPricesForTv;
    }

    public static int getAmountTv() {
        return amountTv;
    }

    public static double getSumOfPricesForMbPh() {
        return sumOfPricesForMobPh;
    }

    public static int getAmountMobPh() {
        return amountMobPh;
    }

    public static void main(String[] args) {
        Electronic tv1 = buildTv("UE40H6350", 518, 2, "Sumsung", "40"); //создаем объекты
        Electronic tv2 = buildTv("48PFS8109/12 ", 1012, 1, "Philips", "48");
        Electronic tv3 = buildTv("42LB620V", 403, 5, "LG", "42");
        System.out.println("Average price = " + sumOfPricesForTv / amountTv);

        Electronic mobPhone1 = buildMobPhone("Galaxy", 211, 7, "Sumsung");
        Electronic mobPhone2 = buildMobPhone("Note", 305.5, 3, "Sumsung");
        System.out.println("Average price = " + sumOfPricesForMobPh / amountMobPh);//средняя стоимость
        System.out.println("");

        System.out.println(mobPhone1); //печатаем объекты для наглядности
        System.out.println(mobPhone2);
        System.out.println("");
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println("");

        Container conteiner = new Container();//создаем новый контейнер
        conteiner.add(mobPhone1); //заполняем контейнер
        conteiner.add(mobPhone2);
        conteiner.add(tv1);
        conteiner.add(tv2);
        conteiner.add(tv3);
        conteiner.print(); //печатаем
        System.out.println("");

        conteiner.sortByPrice(); //сортируем
        conteiner.print(); //печатаем
        System.out.println("");
    }
}




