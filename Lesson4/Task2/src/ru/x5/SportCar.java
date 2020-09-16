package ru.x5;

public class SportCar extends Car {

    // Предельная скорость
    private int maxSpeed;

    public SportCar(String model, String carClass, int weight, int enginePower, String engineManufacturer, int maxSpeed) {
        super(model, carClass, weight, enginePower, engineManufacturer);
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
        System.out.println("Класс: " + getCarClass());
        System.out.println("Модель: " + getModel());
        System.out.println("Вес: " + getWeight());
        System.out.println("Двигатель - производитель: " + getEngine().getManufacturer());
        System.out.println("Двигатель - мощность: " + getEngine().getPower());
        System.out.println("Предельная скорость: " + maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
