package ru.x5;

public class VideoCardAsusFactory implements VideoCardAbstractFactory {

    @Override
    public VideoCard createVideoCard(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType) {
        return new VideoCardAsus(manufacturer, ramType, size, coolingType);
    }
}
