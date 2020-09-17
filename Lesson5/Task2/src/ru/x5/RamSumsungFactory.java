package ru.x5;

public class RamSumsungFactory implements RamAbstractFactory {

    @Override
    public Ram createRam(String manufacturer, int size, int frequency, RamTypes ramType) {
        return new RamSamsung(manufacturer, size, frequency, ramType);
    }
}
