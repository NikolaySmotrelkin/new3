package ru.x5;

abstract public class Animal {
    protected String food;
    protected String location;

    abstract public void makeNoice();
    abstract public void eat();
    public void sleep() {}
}
