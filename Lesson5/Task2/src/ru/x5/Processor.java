package ru.x5;

public class Processor {
    private int frequency;
    private int coreCount;
    private int cashRamSize;
    private String description;
    private String manufacturer;

    public Processor(int frequency, int coreCount, int cashRam, String description, String manufacturer) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.cashRamSize = cashRam;
        this.description = description;
        this.manufacturer = manufacturer;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public int getCashRam() {
        return cashRamSize;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
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
