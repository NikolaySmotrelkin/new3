package ru.x5;

public class Horse extends Animal{

    public Horse() {
        food = "сено";
        location = "в стойле";

        String horseType = "ездовая";
    }

    @Override
    public void makeNoice() {
        System.out.println("лошадь спит " + location);
    }

    @Override
    public void eat() {
        System.out.println("лошадь ест " + food);
    }
}
