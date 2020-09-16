package ru.x5;

public class Horse extends Animal{

    // Функциональное предназначение лошади: ездовая, скаковая, тягловая
    private String horseType;
    public Horse(String food, String location, String horseType) {
        super(food, location);
        this.horseType = "ездовая";
    }

    @Override
    public void makeNoice() {
        System.out.println("лошадь спит " + getLocation());
    }

    @Override
    public void eat() {
        System.out.println("лошадь ест " + getFood());
    }

    public String getHorseType() {
        return horseType;
    }
}
