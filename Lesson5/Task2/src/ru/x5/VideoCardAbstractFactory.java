package ru.x5;

public interface VideoCardAbstractFactory {

    VideoCard createVideoCard(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType);
}
