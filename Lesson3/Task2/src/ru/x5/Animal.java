package ru.x5;

abstract public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public String getFood() {
       return food;
    }
    public void sleep() {}
    abstract public void makeNoice();
    abstract public void eat();
}
