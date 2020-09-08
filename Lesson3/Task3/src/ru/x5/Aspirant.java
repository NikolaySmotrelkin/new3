package ru.x5;

public class Aspirant extends Student {

    // Научная работа
    public String degree;

    @Override
    public double getScholarship() {
        if (averageMark == 5.0f) {
            return 200.0f;
        } else {
            return 180.0f;
        }
    }
}
