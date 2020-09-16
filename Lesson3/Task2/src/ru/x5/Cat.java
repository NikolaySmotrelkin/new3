package ru.x5;

public class Cat extends Animal {

    // Тип кошки: короткошерстная, длинношерстная
    private String catType;
    public Cat(String food, String location, String catType) {
        super(food, location);
        this.catType = catType;
    }

    @Override
    public void makeNoice() {
        System.out.println("Кошка спит " + getLocation());
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест " + getFood());
    }

    public String getCatType() {
        return catType;
    }
}
