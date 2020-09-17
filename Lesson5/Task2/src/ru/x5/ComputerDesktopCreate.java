package ru.x5;

// Стратегия создания компьютеров класса Desktop
public class ComputerDesktopCreate implements ComputerCreate {

    @Override
    public Computer create() {
        // Создаем через фабрику процессоров AMD, процессор с нужными характеристиками
        Processor processor = (new ProcessorAMDFactory())
                .createProcessor(4000, 4, 2, "AMD Athlon 2", "AMD");

        // Создаем через фабрику оперативок Samsung, ОЗУ с нужными характеристиками
        Ram ram = (new RamSumsungFactory())
                .createRam("Samsung", 12000, 600, RamTypes.DDR3);

        // Создаем через фабрику видюх Radeon, карту с нужными характеристиками
        VideoCard videoCard = (new VideoCardRadeonFactory())
                .createVideoCard("Radeon", RamTypes.DDR3, 8000, CoolingTypes.ACTIVE);

        // Создаем через фабрику дисков Fujitsu, диск с нужными характеристиками
        Hdd hdd = (new HddFujitsuFactory())
                .createHdd("Fujitsu", 1000, HddTypes.SSD, HddFormFactorTypes.SIMM);

        // Создаем через фабрику мониторов монитор, с нужными характеристиками
        Monitor monitor = (new MonitorFactory())
                .createMonitor(24.0, "HP");

        // Собираем комп на основе выбранных комплектующих
        return new Computer(ComputerClass.DESKTOP, processor, ram, videoCard, hdd, monitor);
    }
}
