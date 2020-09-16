package ru.x5;

public class Dog extends Animal {

    // Предназначение собаки: охотничья, сторожевая
    private String dogType;
    public Dog(String food, String location, String dogType) {
        super(food, location);
        this.dogType = dogType;
    }

    @Override
    public void makeNoice() {
        System.out.println("Собака спит " + getLocation());
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + getFood());
    }

    public String getDogType() {
        return dogType;
    }
}
