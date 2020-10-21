package ru.x5_v2;

// CPU Intel
public class CPUIntel extends CPU {
    // Поддержка гипертрединга
    private boolean hyperThreading;

    public CPUIntel(int frequency, int coreCount, int cashRam, String description, String manufacturer, boolean hyperThreading) {
        super(frequency, coreCount, cashRam, description, manufacturer);
        this.hyperThreading = hyperThreading;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += ", Гипертрединг: ";
        str += (hyperThreading) ? "поддерживает" : "не поддерживает";
        return str;
    }

    public boolean isHyperThreading() {
        return hyperThreading;
    }
}
