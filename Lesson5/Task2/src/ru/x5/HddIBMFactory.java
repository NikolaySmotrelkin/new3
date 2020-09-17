package ru.x5;

public class HddIBMFactory implements HddAbstractFactory {

    @Override
    public Hdd createHdd(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor) {
        return new HddIBM(manufacturer, size, hddType, formFactor);
    }
}
