package ru.x5;

public class VideoCardRadeonFactory implements VideoCardAbstractFactory {

    @Override
    public VideoCard createVideoCard(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType) {
        return new VideoCardRadeon(manufacturer, ramType, size, coolingType);
    }
}
