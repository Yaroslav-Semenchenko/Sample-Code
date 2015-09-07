package model;

abstract public class Electronic implements Comparable<Electronic> { //����������� �����, ����������� ������ Electronic.

    protected String name; //������������ ���� ����� � ���������.
    protected double price;

    public String getName() {
        return name;
    } //������� � �������

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
    }//���������� ��������� ������������� �������

    public int compareTo(Electronic o) { //��������� ������������ �����
        return new Double(this.getPrice()).compareTo(o.getPrice());
    }
}