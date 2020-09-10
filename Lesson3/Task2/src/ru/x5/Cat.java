package ru.x5;

public class Cat extends Animal {

    public Cat() {
        food = "мышь";
        location = "в доме";

        String catType = "Короткошерстная";
    }

    @Override
    public void makeNoice() {
        System.out.println("Кошка спит " + location);
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест " + food);
    }
}
