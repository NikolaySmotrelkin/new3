package ru.x5;

import ru.x5.Car;

public class Lorry extends Car {
    // Гузоподъемность
    public int carrying;

    public Lorry(String model, String carClass, int weight, int carrying) {
        super(model, carClass, weight);
        this.carrying = carrying;
    }

    @Override
    public void start() {
        System.out.println("Грузоваик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузоваик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Двигатель - производитель: " + engine.manufacturer);
        System.out.println("Двигатель - мощность: " + engine.power);
        System.out.println("Модель: " + model);
        System.out.println("Класс: " + carClass);
        System.out.println("Вес: " + weight);
        System.out.println("Гузоподъемность: " + carrying);
    }
}
