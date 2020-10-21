package ru.x5_v2;

// Абстракция фабрики CPU
public interface ICPUFactory {
    ICPU createIntel(int frequency, int coreCount, int cashRam, String description, String manufacturer,
                       boolean hyperThreading);
    ICPU createAmd(int frequency, int coreCount, int cashRam, String description, String manufacturer,
                     boolean turboCore);
}
