package ru.x5_v2;

// Реализация фабрики RAM
public class RAMFactory implements IRAMFactory {
    @Override
    public IRAM createSamsung(String manufacturer, int size, int frequency, RamTypes ramType, boolean doubleDataRate) {
        return new RAMSamsung(manufacturer, size, frequency, ramType, doubleDataRate);
    }

    @Override
    public IRAM createKingston(String manufacturer, int size, int frequency, RamTypes ramType) {
        return new RAMKingston(manufacturer, size, frequency, ramType);
    }
}
