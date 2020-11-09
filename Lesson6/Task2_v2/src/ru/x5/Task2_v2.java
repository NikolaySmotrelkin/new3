package ru.x5;

import java.util.ArrayList;

public class Task2_v2 {
    public static void main(String[] args) {
        // 1-я Коробка с 3 яблоками
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());

        // 2-я Коробка с 2 яблоками
        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());

        // 3-я Коробка с 3 апельсинами
        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        // 4-я Коробка с 1 апельсином
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.add(new Orange());

        // Пересыпаем яблоки из первой коробки во вторую.
        appleBox1.pour(appleBox2);

        System.out.println("1-я Коробка яблок: " + appleBox1.toString());
        System.out.println("2-я Коробка яблок: " + appleBox2.toString());

        // Сравниваем по весу коробки 1 и 2
        if (appleBox1.compare(appleBox2)) {
            System.out.println("Коробка 1 и коробка 2 равны по весу");
        } else {
            System.out.println("Коробка 1 и коробка 2 не равны по весу");
        }

        // Пересыпаем апельсины из 3-й коробки в 4-ю.
        orangeBox1.pour(orangeBox2);

        System.out.println("3-я Коробка апельсинов: " + orangeBox1.toString());
        System.out.println("4-я Коробка апельсинов: " + orangeBox2.toString());

        // Сравниваем коробу с апельсинами и яблоками по весу
        if (appleBox2.compare(orangeBox2)) {
            System.out.println("Коробка с апельсинами и яблоками равны по весу");
        } else {
            System.out.println("Коробка с апельсинами отличается по весу от коробки с яблоками");
        }

        // Перекладываем из ящика с яблоками в ящик с апельсинами и получаем сообщение с ошибкой
        appleBox2.pour(orangeBox2);
    }
}
