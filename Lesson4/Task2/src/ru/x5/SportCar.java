package ru.x5;

public class SportCar extends Car {
    // Предельная скорость
    public int maxSpeed;

    public SportCar(String model, String carClass, int weight, int maxSpeed) {
        super(model, carClass, weight);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("Спорткар поехал");
    }

    @Override
    public void stop() {
        System.out.println("Спорткар остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Двигатель - производитель: " + engine.manufacturer);
        System.out.println("Двигатель - мощность: " + engine.power);
        System.out.println("Модель: " + model);
        System.out.println("Класс: " + carClass);
        System.out.println("Вес: " + weight);
        System.out.println("Предельная скорость: " + maxSpeed);
    }
}
