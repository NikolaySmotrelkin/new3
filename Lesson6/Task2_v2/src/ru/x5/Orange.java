package ru.x5;

public class Orange extends Fruit{
    public Orange(Double weight) {
        super(weight);
    }

    public Orange() {
        super(1.5);
    }

    @Override
    public String toString() {
        return "Апельсин";
    }

    @Override
    public int hashCode() {
        return 2;
    }
}