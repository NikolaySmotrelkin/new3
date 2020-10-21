package ru.x5_v2;

// Реализация RAM
public class RAM implements IRAM {
    private String manufacturer;
    private int size;
    private int frequency;
    private RamTypes ramType;

    public RAM(String manufacturer, int size, int frequency, RamTypes ramType) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.frequency = frequency;
        this.ramType = ramType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public int getFrequency() {
        return frequency;
    }

    public RamTypes getRamType() {
        return ramType;
    }

    @Override
    public String toString() {
        String str = "";
        str += " Частота (МГц): " + Integer.toString(frequency) + ",";
        str += " Размер памяти (МБ): " + Integer.toString(size) + ",";
        str += " Производитель: " + manufacturer + ",";

        switch (ramType) {
            case DDR2:
                str += " Тип: DDR2";
                break;
            case DDR3:
                str += " Тип: DDR3";
                break;
            default:
                str += " Тип: не определен ";
                break;
        }

        return str;
    }
}
