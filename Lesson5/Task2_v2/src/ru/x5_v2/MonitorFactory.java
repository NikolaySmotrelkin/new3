package ru.x5_v2;

public class MonitorFactory implements  IMonitorFactory {
    @Override
    public IMonitor createMonitor(Double diagonal, String manufacturer) {
        return new Monitor(diagonal, manufacturer);
    }
}
