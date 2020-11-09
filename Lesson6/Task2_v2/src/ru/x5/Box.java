package ru.x5;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T item) {
        list.add(item);
    }

    public T get(int index) {
        return list.get(index);
    }

    public Double getWeight() {
        Double weight = 0.0;

        for (T item : list)  {
            weight += item.getWeight();
        }

        return weight;
    }

    public boolean compare(Object box) {
        return Double.compare(this.getWeight(), ((Box<Fruit>)box).getWeight()) == 0;
    }

    public boolean checkPour(Object box) {
        Box<Fruit> bx = (Box<Fruit>)box;

       // Если ящик пустой или содержит совместимые по типу фрукты, то разрешаем туда пересыпать
       if ((bx.getWeight() == 0) || (list.get(0).hashCode() == bx.get(0).hashCode())) {
           return true;
       }

       return false;
    }

    public void pour(Object box) {
        if (!checkPour(box)) {
            System.out.println("Ошибка. Ящики должны быть одного типа!");
            return;
        }

        for (T item : list) {
            ((Box<Fruit>)box).add(item);
        }

        list.clear();
    }

    @Override
    public String toString() {
        String str = "";
        str += "Количество: " + list.size() + ", ";
        str += "Вес: " + Double.toString(getWeight());

        return str;
    }
}
