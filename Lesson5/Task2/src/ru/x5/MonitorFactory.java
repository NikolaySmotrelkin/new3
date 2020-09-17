package ru.x5;

public class MonitorFactory implements MonitorAbstractFactory{

    @Override
    public Monitor createMonitor(Double diagonal, String manufacturer) {
        return new Monitor(diagonal, manufacturer);
    }
}
