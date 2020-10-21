package ru.x5_v2;

// Абстракция создателя фабрик
public interface IFactory {
    ICPUFactory createCPUFactory();
    IGPUFactory createGPUFactory();
    IRAMFactory createRAMFactory();
    IHDDFactory createHDDFactory();
    IMonitorFactory createMonitorFactory();
}
