package ru.x5_v2;

public class HDDFactory implements IHDDFactory {
    @Override
    public IHDD createIBM(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor, boolean doubleSpeed) {
        return new HDDIBM(manufacturer, size, hddType, formFactor, doubleSpeed);
    }

    @Override
    public IHDD createFujitsu(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor) {
        return new HDDFujitsu(manufacturer, size, hddType, formFactor);
    }
}
