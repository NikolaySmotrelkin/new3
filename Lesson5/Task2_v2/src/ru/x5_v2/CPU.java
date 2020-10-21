package ru.x5_v2;

// Общий класс CPU
public class CPU implements ICPU {
    private int frequency;
    private int coreCount;
    private int cashRamSize;
    private String description;
    private String manufacturer;

    public CPU(int frequency, int coreCount, int cashRamSize, String description, String manufacturer) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.cashRamSize = cashRamSize;
        this.description = description;
        this.manufacturer = manufacturer;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public int getCashRamSize() {
        return cashRamSize;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String toString() {
        String str = "";
        str += " Частота (МГц): " + Integer.toString(frequency) + ",";
        str += " К-во ядер: " + Integer.toString(coreCount) + ",";
        str += " Память кэш (МБ): " + Integer.toString(cashRamSize) + ",";
        str += " Описание: " + description + ",";
        str += " Производитель: " + manufacturer;
        return str;
    }
}
