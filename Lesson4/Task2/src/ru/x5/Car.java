package ru.x5;

public abstract class Car {
    // Модель
    public String model;
    // класс
    public String carClass;
    // Вес
    public int weight;
    // Мотор
    public Engine engine;

    public abstract void start();
    public abstract void stop();
    public abstract void printInfo();

    public Car(String model, String carClass, int weight) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }
    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}
