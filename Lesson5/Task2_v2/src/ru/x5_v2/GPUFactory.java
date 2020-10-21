package ru.x5_v2;

public class GPUFactory implements IGPUFactory{

    @Override
    public IGPU createRadeon(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType,
                               boolean hbmTechnology) {
        return new GPURadeon(manufacturer, ramType, size, coolingType, hbmTechnology);
    }

    @Override
    public IGPU createAsus(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType,
                             boolean asusDual) {
        return new GPUAsus(manufacturer, ramType, size, coolingType, asusDual);
    }
}
