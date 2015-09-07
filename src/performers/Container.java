package performers;

import model.Electronic;

import java.util.*;

//2. Создать контейнер для хранения товаров. В нем должны быть реализованы методы Add, Count,
//метод доступа по индексу, сортировки по цене и печати содержимого.

class Container{
    public List<Electronic> prodList = new ArrayList<Electronic>();

    public void add(Electronic electronic){//метод add
        prodList.add(electronic);
    }

    public int count(){ //метод count
        return prodList.size();
    }

    public Electronic get(int index){ //метод доступа по индексу
        return prodList.get(index);
    }

    public void sortByPrice(){ //сортировка
        Collections.sort(prodList);
    }

    public void print(){ //печать
        for(Electronic electronic : prodList)
            System.out.println(electronic);
    }
}