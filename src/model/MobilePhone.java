package model;

public class MobilePhone extends Electronic {
    private String manufacturer;
    private int amount;

    public MobilePhone(String name, double price, int amount, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.amount = amount;
    }

    public void mobile () { //параметризованный конструктор
        this.name = "";
        this.price = 1;
        this.manufacturer = "";
        this.amount = 1;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String name) {
        this.manufacturer = manufacturer;
    }

    public String toString(){ //строковое представление объекта
        return manufacturer + " | " + this.name + " | " + this.price + " | " + amount;
    }
}