package ru.x5;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return (Math.round(Math.PI * Math.pow(radius, 2) * 100d) / 100d);
    }
}
