package ru.x5;

public class ProcessorAMDFactory implements ProcessorAbstractFactory {

    @Override
    public Processor createProcessor(int frequency, int coreCount, int cashRam, String description, String manufacturer) {
        return new ProcessorAMD(frequency, coreCount, cashRam, description, manufacturer);
    }
}
