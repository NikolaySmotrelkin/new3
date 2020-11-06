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

    public Double getWeight() {
        Double weight = 0.0;

        for (T item : list)  {
            weight += item.getWeight();
        }

        return weight;
    }

    public boolean compare(Box<T> box) {
        return Double.compare(this.getWeight(), box.getWeight()) == 0;
    }

    public void pour(Box<T> box) {
        if (box.getClass() != this.getClass()) {
            System.out.println("Ошибка. Коробки должны быть одного типа.");
            return;
        }

        for (T item : list) {
            box.add(item);
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
