package ru.x5_v2;

// Стратегия создания компьютеров класса Sever
public class ComputerServerCreate implements ComputerCreate {
    @Override
    public Computer create() {
        // Создаем процессор AMD с нужными характеристиками
        ICPU cpu = (new Factory())
                   .createCPUFactory()
                   .createAmd(4000, 8, 6, "AMD Athlon 4", "AMD", false);

        // Создаем оперативку Samsung с нужными характеристиками
        IRAM ram = (new Factory())
                   .createRAMFactory()
                   .createSamsung("Samsung", 64000, 800, RamTypes.DDR3, true);

        // Создаем видюху Asus с нужными характеристиками
        IGPU gpu = (new Factory())
                   .createGPUFactory()
                   .createAsus("Asus", RamTypes.DDR2, 1000, CoolingTypes.PASSIVE, true);

        // Создаем диск Fujitsu с нужными характеристиками
        IHDD hdd = (new Factory())
                   .createHDDFactory()
                   .createFujitsu("Fujitsu", 10000, HddTypes.SSD, HddFormFactorTypes.RIMM);

        // Для класса компьютеров Sever монитор не создаем
        IMonitor monitor = null;

        // Собираем комп на основе выбранных комплектующих
        return new Computer(ComputerClass.SERVER, cpu, ram, gpu, hdd, monitor);
    }
}
