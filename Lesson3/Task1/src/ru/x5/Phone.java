package ru.x5;

public class Phone {

    private String number;
    private String model;
    private String weight;

    // Перегруженные конструкторы
    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    // Сеттеры
    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    // Геттеры
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }

    // Перегруженные методы
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phone) {
        System.out.println("Звонит " + name + " номер " + phone);
    }

    public void sendMessage(String...phones) {
        for (String tmp : phones) {
            System.out.println(tmp);
        }
    }

}
