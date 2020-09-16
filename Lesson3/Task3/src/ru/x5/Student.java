package ru.x5;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, Double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGroup() {
        return group;
    }
    public Double getAverageMark() {
       return averageMark;
    }

    public double getScholarship() {
       if (averageMark == 5.0) {
          return 100.0;
       } else {
         return 80.0;
       }
    }
}
