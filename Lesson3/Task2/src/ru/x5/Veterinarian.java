package ru.x5;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("food: " + animal.getFood());
        System.out.println("location: " + animal.getLocation());
    }
}
