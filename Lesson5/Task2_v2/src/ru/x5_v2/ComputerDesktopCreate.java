package ru.x5_v2;

// Стратегия создания компьютеров класса Desktop
public class ComputerDesktopCreate implements ComputerCreate {
    @Override
    public Computer create() {
        // Создаем процессор AMD с нужными характеристиками
        ICPU cpu =(new Factory())
                 .createCPUFactory()
                 .createAmd(4000, 4, 2, "AMD Athlon 2", "AMD", true);

        // Создаем оперативку Samsung с нужными характеристиками
        IRAM ram = (new Factory())
                 .createRAMFactory()
                 .createSamsung("Samsung", 12000, 600, RamTypes.DDR3, false);

        // Создаем видюху Radeon, с нужными характеристиками
        IGPU gpu = (new Factory())
                 .createGPUFactory()
                 .createRadeon("Radeon", RamTypes.DDR3, 8000, CoolingTypes.ACTIVE, true);

        // Создаем диск Fujitsu с нужными характеристиками
        IHDD hdd = (new Factory())
                 .createHDDFactory()
                .createFujitsu("Fujitsu", 1000, HddTypes.SSD, HddFormFactorTypes.SIMM);

        // Создаем монитор с нужными характеристиками
        IMonitor monitor = (new Factory())
                 .createMonitorFactory()
                 .createMonitor(24.0, "HP");

        // Собираем комп на основе выбранных комплектующих
        return new Computer(ComputerClass.DESKTOP, cpu, ram, gpu, hdd, monitor);
    }
}
