package ru.x5;

public class Dog extends Animal {

    public Dog() {
        food = "кость";
        location = "в конуре";
    }

    @Override
    public void makeNoice() {
        System.out.println("Собака спит " + location);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + food);
    }
}
