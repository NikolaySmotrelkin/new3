package ru.x5;

public interface HddAbstractFactory {
    Hdd createHdd(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor);
}
