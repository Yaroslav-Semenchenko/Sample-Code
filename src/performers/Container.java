package performers;

import model.Electronic;

import java.util.*;

//2. ������� ��������� ��� �������� �������. � ��� ������ ���� ����������� ������ Add, Count,
//����� ������� �� �������, ���������� �� ���� � ������ �����������.

class Container{
    public List<Electronic> prodList = new ArrayList<Electronic>();

    public void add(Electronic electronic){//����� add
        prodList.add(electronic);
    }

    public int count(){ //����� count
        return prodList.size();
    }

    public Electronic get(int index){ //����� ������� �� �������
        return prodList.get(index);
    }

    public void sortByPrice(){ //����������
        Collections.sort(prodList);
    }

    public void print(){ //������
        for(Electronic electronic : prodList)
            System.out.println(electronic);
    }
}