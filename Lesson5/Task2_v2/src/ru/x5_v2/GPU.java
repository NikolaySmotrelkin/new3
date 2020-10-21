package ru.x5_v2;

// Общая реализация GPU
public class GPU implements IGPU {
    private String manufacturer;
    private RamTypes ramType;
    private int size;
    private CoolingTypes coolingType;

    public GPU(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType) {
        this.manufacturer = manufacturer;
        this.ramType = ramType;
        this.size = size;
        this.coolingType = coolingType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public RamTypes getRamType() {
        return ramType;
    }

    public int getSize() {
        return size;
    }

    public CoolingTypes getCoolingType() {
        return coolingType;
    }

    @Override
    public String toString() {
        String str = "";
        str += " Размер памяти (МБ): " + Integer.toString(size) + ",";
        str += " Производитель: " + manufacturer + ",";

        switch (ramType) {
            case DDR2:
                str += " Тип: DDR2,";
                break;
            case DDR3:
                 str += " Тип: DDR3,";
                 break;
            default:
                str += " Тип: не определен,";
                break;
        }

        switch (coolingType) {
            case ACTIVE:
                str += " Охлаждение: Активное";
                break;
            case PASSIVE:
                 str += " Охлаждение: Пассивное";
                 break;
            default:
                 str += " Охлаждение: не определено ";
                 break;
        }

        return str;
    }
}


