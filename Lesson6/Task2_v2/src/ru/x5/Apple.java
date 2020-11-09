package ru.x5;

public class Apple extends  Fruit {
    public Apple(Double weight) {
        super(weight);
    }

    public Apple() {
        super(1.0);
    }

    @Override
    public String toString() {
        return "Яблоко";
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
