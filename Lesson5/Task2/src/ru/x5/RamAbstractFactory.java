package ru.x5;

public interface RamAbstractFactory {

    Ram createRam(String manufacturer, int size, int frequency, RamTypes ramType);
}
