package ru.x5_v2;

// Реализация HDD IBM
public class HDDIBM extends HDD {
    private boolean doubleSpeed;

    public HDDIBM(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor, boolean doubleSpeed) {
        super(manufacturer, size, hddType, formFactor);
        this.doubleSpeed = doubleSpeed;
    }

    public boolean isDoubleSpeed() {
        return doubleSpeed;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += ", Double Speed Технология: ";
        str += (doubleSpeed) ? "поддерживает" : "не поддерживает";
        return str;
    }
}
