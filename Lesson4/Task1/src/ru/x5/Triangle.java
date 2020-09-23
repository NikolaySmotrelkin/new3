package ru.x5;

public class Triangle implements Shape {
    private final int sideOne;
    private final int sideTwo;
    private final int sideThree;

    public Triangle(int sideOne, int sideTwo, int sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double square() {
        double p = (sideOne + sideTwo + sideThree) / 2d;
        p = p * (p - sideOne) * (p - sideTwo) * (p - sideThree);
        return Math.round(Math.sqrt(p) * 100d) / 100d;
    }
}
