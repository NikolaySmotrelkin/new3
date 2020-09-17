package ru.x5;

public class HddIBM extends Hdd {

    public HddIBM(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor) {
        super(manufacturer, size, hddType, formFactor);
    }

    public String getIBMInfo() {
        return "Жесткий диск IBM";
    }
}
