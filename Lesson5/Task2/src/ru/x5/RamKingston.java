package ru.x5;

public class RamKingston extends Ram {

    public RamKingston(String manufacturer, int size, int frequency, RamTypes ramType) {
        super(manufacturer, size, frequency, ramType);
    }

    public String getKingstonInfo() {
        return "ОЗУ Kingston";
    }
}
