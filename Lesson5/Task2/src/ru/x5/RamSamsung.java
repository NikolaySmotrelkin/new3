package ru.x5;

public class RamSamsung extends Ram{

    public RamSamsung(String manufacturer, int size, int frequency, RamTypes ramType) {
        super(manufacturer, size, frequency, ramType);
    }

    public String getSamsungInfo() {
        return "ОЗУ Samsung";
    }
}
