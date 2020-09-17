package ru.x5;

public class HddFujitsuFactory implements HddAbstractFactory {

    @Override
    public Hdd createHdd(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor) {
        return new HddFujitsu(manufacturer, size, hddType, formFactor);
    }
}
