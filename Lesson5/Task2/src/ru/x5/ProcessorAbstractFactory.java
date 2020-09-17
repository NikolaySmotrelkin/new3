package ru.x5;

public interface ProcessorAbstractFactory {

    Processor createProcessor(int frequency, int coreCount, int cashRam, String description, String manufacturer);
}
