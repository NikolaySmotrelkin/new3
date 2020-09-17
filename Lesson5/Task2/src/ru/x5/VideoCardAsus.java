package ru.x5;

public class VideoCardAsus extends VideoCard {

    public VideoCardAsus(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType) {
        super(manufacturer, ramType, size, coolingType);
    }

    public String getAsusInfo() {
        return "Видеокарта Asus";
    }
}
