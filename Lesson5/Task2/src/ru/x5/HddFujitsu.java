package ru.x5;

public class HddFujitsu extends Hdd {

    public HddFujitsu(String manufacturer, int size, HddTypes hddType, HddFormFactorTypes formFactor) {
        super(manufacturer, size, hddType, formFactor);
    }

    public String getFujitsuInfo() {
        return "Жесткий диск Fujitsu";
    }
}
