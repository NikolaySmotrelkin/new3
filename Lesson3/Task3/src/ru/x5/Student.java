package ru.x5;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public double getScholarship() {
       if (averageMark == 5.0f) {
          return 100.0f;
       } else {
         return 80.0f;
       }
    }
}
