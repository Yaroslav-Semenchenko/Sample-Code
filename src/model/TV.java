package model;

public class TV extends Electronic{

    private String manufacturer;
    private String diagonal;
    private int amount;

    public TV (String name, double price, int amount, String manufacturer, String diagonal) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.diagonal = diagonal;
        this.amount = amount;
    }

    public void television () { //параметризованный конструктор
        this.name = "";
        this.price = 1;
        this.manufacturer = "";
        this.diagonal = "";
        this.amount = 1;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String toString(){ //строковое представление объекта
        return manufacturer + " | " + this.name + " | " + diagonal + "\"" + " | " + this.price + " | " + amount;
    }
}

