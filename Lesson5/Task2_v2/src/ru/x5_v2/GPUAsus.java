package ru.x5_v2;

// Реализация для Asus
public class GPUAsus extends GPU {
    // Использование технологии HBM
    private boolean asusDual;

    public GPUAsus(String manufacturer, RamTypes ramType, int size, CoolingTypes coolingType, boolean asusDual) {
        super(manufacturer, ramType, size, coolingType);
        this.asusDual = asusDual;
    }

    public boolean isHbmTechnology() {
        return asusDual;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += ", Технология asusDual: ";
        str += (asusDual) ? "поддерживает" : "не поддерживает";
        return str;
    }
}
