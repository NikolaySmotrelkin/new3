package ru.x5_v2;

// Абстракция фабрики GPU
public interface IGPUFactory {
    IGPU createRadeon(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType, boolean hbmTechnology);
    IGPU createAsus(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType, boolean asusDual);
}