package ru.x5_v2;

// Стратегия создания компьютеров класса Laptop
public class ComputerLaptopCreate implements ComputerCreate {
    @Override
    public Computer create() {
        // Создаем процессор INTEL с нужными характеристиками
        ICPU cpu = (new Factory())
                  .createCPUFactory()
                  .createIntel(2000, 2, 1, "INTEL Core I5", "INTEL", false);

        // Создаем оперативку Kingston с нужными характеристиками
        IRAM ram = (new Factory())
                  .createRAMFactory()
                  .createKingston("Kingston", 4000, 300, RamTypes.DDR2);

        // Создаем видюху Asus с нужными характеристиками
        IGPU gpu = (new Factory())
                   .createGPUFactory()
                   .createAsus("Asus", RamTypes.DDR2, 2000, CoolingTypes.PASSIVE, false);

        // Создаем диск IBM с нужными характеристиками
        IHDD hdd = (new Factory())
                .createHDDFactory()
                .createIBM("IBM", 250, HddTypes.HDD, HddFormFactorTypes.DIMM, true);

        // Для класса Laptop монитор не создаем
        IMonitor monitor = null;

        // Собираем комп на основе выбранных комплектующих
        return new Computer(ComputerClass.LAPTOP, cpu, ram, gpu, hdd, monitor);
    }
}
