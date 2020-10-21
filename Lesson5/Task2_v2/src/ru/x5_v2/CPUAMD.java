package ru.x5_v2;

// CPU AMD
public class CPUAMD extends CPU {
    // Поддержка TurboCore
    private boolean turboCore;

    public CPUAMD(int frequency, int coreCount, int cashRam, String description, String manufacturer, boolean turboCore) {
        super(frequency, coreCount, cashRam, description, manufacturer);
        this.turboCore = turboCore;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += ", TurboCore: ";
        str += (turboCore) ? "поддерживает" : "не поддерживает";
        return str;
    }

    public boolean isTurboCore() {
        return turboCore;
    }
}
