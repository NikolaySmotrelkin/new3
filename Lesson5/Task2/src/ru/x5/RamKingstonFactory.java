package ru.x5;

public class RamKingstonFactory implements RamAbstractFactory {

    @Override
    public Ram createRam(String manufacturer, int size, int frequency, RamTypes ramType) {
        return new RamKingston(manufacturer, size, frequency, ramType);
    }
}
