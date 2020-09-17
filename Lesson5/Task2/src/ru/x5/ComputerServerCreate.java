package ru.x5;

// Стратегия создания компьютеров класса Sever
public class ComputerServerCreate implements ComputerCreate {

    @Override
    public Computer create() {
        // Создаем через фабрику процессоров AMD, процессор с нужными характеристиками
        Processor processor = (new ProcessorAMDFactory())
                .createProcessor(4000, 8, 6, "AMD Athlon 4", "AMD");

        // Создаем через фабрику оперативок Samsung, ОЗУ с нужными характеристиками
        Ram ram = (new RamSumsungFactory())
                .createRam("Samsung", 64000, 800, RamTypes.DDR3);

        // Создаем через фабрику видюх Asus, карту с нужными характеристиками
        VideoCard videoCard = (new VideoCardAsusFactory())
                .createVideoCard("Asus", RamTypes.DDR2, 1000, CoolingTypes.PASSIVE);

        // Создаем через фабрику дисков Fujitsu, диск с нужными характеристиками
        Hdd hdd = (new HddFujitsuFactory())
                .createHdd("Fujitsu", 10000, HddTypes.SSD, HddFormFactorTypes.RIMM);

        // Для класса компьютеров Sever монитор не создаем
        Monitor monitor = null;

        // Собираем комп на основе выбранных комплектующих
        return new Computer(ComputerClass.SERVER, processor, ram, videoCard, hdd, monitor);
    }
}