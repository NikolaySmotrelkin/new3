package ru.x5_v2;

// Реализация для Radeon
public class GPURadeon extends GPU {
    // Использование технологии HBM
    private boolean hbmTechnology;

    public GPURadeon(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType, boolean hbmTechnology) {
        super(manufacturer, ramType, size, coolingType);
        this.hbmTechnology = hbmTechnology;
    }

    public boolean isHbmTechnology() {
        return hbmTechnology;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += ", Технология HBM: ";
        str += (hbmTechnology) ? "поддерживает" : "не поддерживает";
        return str;
    }
}
