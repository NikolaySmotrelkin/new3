package ru.x5_v2;

// Реализация фабрики CPU
public class CPUFactory implements ICPUFactory {
    public ICPU createIntel(int frequency, int coreCount, int cashRam, String description, String manufacturer,
                              boolean hyperThreading) {
        return  new CPUIntel(frequency, coreCount, cashRam, description, manufacturer, hyperThreading);
    }

    public ICPU createAmd(int frequency, int coreCount, int cashRam, String description, String manufacturer,
                            boolean turboCore) {
        return new CPUAMD(frequency, coreCount, cashRam, description, manufacturer, turboCore);
    }
}
