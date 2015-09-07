package model;

abstract public class Electronic implements Comparable<Electronic> { //Абстрактный класс, описывающий товара Electronic.

    protected String name; //обязательные поля «цена» и «название».
    protected double price;

    public String getName() {
        return name;
    } //геттеры и сеттеры

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return this.name + " = " + this.price;
    }//возвращаем строковое представление объекта

    public int compareTo(Electronic o) { //сравнение вещественных чисел
        return new Double(this.getPrice()).compareTo(o.getPrice());
    }
}