package ru.x5;

public class ProcessorIntelFactory implements ProcessorAbstractFactory {

    @Override
    public Processor createProcessor(int frequency, int coreCount, int cashRam, String description, String manufacturer) {
        return new ProcessorIntel(frequency, coreCount, cashRam, description, manufacturer);
    }
}
