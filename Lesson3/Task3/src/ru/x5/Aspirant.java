package ru.x5;

public class Aspirant extends Student {

    // Научная работа
    private String degree;

    public Aspirant(String firstName, String lastName, String group, Double averageMark, String degree) {
        super(firstName, lastName, group, averageMark);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public double getScholarship() {
        if (getAverageMark() == 5.0) {
            return 200.0;
        } else {
            return 180.0;
        }
    }
}
