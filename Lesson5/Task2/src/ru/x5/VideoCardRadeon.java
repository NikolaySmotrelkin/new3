package ru.x5;

public class VideoCardRadeon extends VideoCard {

    public VideoCardRadeon(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType) {
        super(manufacturer, ramType, size, coolingType);
    }

    public String getRadeonInfo() {
        return "Видеокарта Radeon";
    }
}
