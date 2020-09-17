package ru.x5;

public class ProcessorIntel extends Processor {

    public ProcessorIntel(int frequency, int coreCount, int cashRam, String description, String manufacturer) {
        super(frequency, coreCount, cashRam, description, manufacturer);
    }

    public String getIntelInfo() {
        return "Процессор Intel";
    }
}
