package ru.x5;

import ru.x5.Car;

public class Lorry extends Car {

    // Гузоподъемность
    private int carrying;

    public Lorry(String model, String carClass, int weight, int enginePower, String engineManufacturer, int carrying) {
        super(model, carClass, weight, enginePower, engineManufacturer);
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
        System.out.println("Класс: " + getCarClass());
        System.out.println("Модель: " + getModel());
        System.out.println("Вес: " + getWeight());
        System.out.println("Двигатель - производитель: " + getEngine().getManufacturer());
        System.out.println("Двигатель - мощность: " + getEngine().getPower());
        System.out.println("Гузоподъемность: " + carrying);
    }

    public int getCarrying() {
        return carrying;
    }
}
