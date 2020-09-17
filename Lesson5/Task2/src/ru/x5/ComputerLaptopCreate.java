package ru.x5;

// Стратегия создания компьютеров класса Laptop
public class ComputerLaptopCreate implements ComputerCreate {

    @Override
    public Computer create() {
        // Создаем через фабрику процессоров INTEL, процессор с нужными характеристиками
        Processor processor = (new ProcessorIntelFactory())
                .createProcessor(2000, 2, 1, "INTEL Core I5", "INTEL");

        // Создаем через фабрику оперативок Kingston, ОЗУ с нужными характеристиками
        Ram ram = (new RamKingstonFactory())
                .createRam("Kingston", 4000, 300, RamTypes.DDR2);

        // Создаем через фабрику видюх Asus, карту с нужными характеристиками
        VideoCard videoCard = (new VideoCardAsusFactory())
                .createVideoCard("Asus", RamTypes.DDR2, 2000, CoolingTypes.PASSIVE);

        // Создаем через фабрику дисков IBM, диск с нужными характеристиками
        Hdd hdd = (new HddIBMFactory())
                .createHdd("IBM", 250, HddTypes.HDD, HddFormFactorTypes.DIMM);

        // Для класса Laptop монитор не создаем
        Monitor monitor = null;

        // Собираем комп на основе выбранных комплектующих
        return new Computer(ComputerClass.LAPTOP, processor, ram, videoCard, hdd, monitor);
    }
}
