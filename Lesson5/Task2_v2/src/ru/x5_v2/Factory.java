package ru.x5_v2;

// Реализация создателя фабрик
public class Factory implements IFactory {
    @Override
    public ICPUFactory createCPUFactory() {
        return new CPUFactory();
    }

    @Override
    public IGPUFactory createGPUFactory() {
        return new GPUFactory();
    }

    @Override
    public IRAMFactory createRAMFactory() {
        return new RAMFactory();
    }

    @Override
    public IHDDFactory createHDDFactory() {
        return new HDDFactory();
    }

    @Override
    public IMonitorFactory createMonitorFactory() {
        return new MonitorFactory();
    }
}
