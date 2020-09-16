package ru.x5;

public abstract class Car {

    // Модель
    private String model;
    // класс
    private String carClass;
    // Вес
    private int weight;
    // Мотор
    private Engine engine;

    public Car(String model, String carClass, int weight, int enginePower, String engineManufacturer) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = new Engine(enginePower, engineManufacturer);
    }

    public abstract void start();
    public abstract void stop();
    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }
    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String getModel() {
        return model;
    }

    public String getCarClass() {
        return carClass;
    }

    public int getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }
}
