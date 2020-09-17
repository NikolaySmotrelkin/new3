package ru.x5;

public class Computer {

    private ComputerClass computerClass;
    private Processor processor;
    private Ram ram;
    private VideoCard videoCard;
    private Hdd hdd;
    private Monitor monitor;

    public Computer(ComputerClass computerClass, Processor processor, Ram ram, VideoCard videoCard, Hdd hdd, Monitor monitor) {
        this.computerClass = computerClass;
        this.processor = processor;
        this.ram = ram;
        this.videoCard = videoCard;
        this.hdd = hdd;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        String str = "";
        switch (computerClass) {
            case LAPTOP:
                str = "Ноутбук";
                break;
            case DESKTOP:
                str = "Стационарный ПК";
                break;
            case SERVER:
                str = "Сервер";
                break;
            default:
                str = "Не определен";
                break;
        }
        str =  " Класс: [" + str + "];";
        str += " Процессор: [" + processor.toString() + "];";
        str += " ОЗУ: [" + ram.toString() + "];";
        str += " Видеокарта: [" + videoCard.toString() + "];";
        str += " Жесткий диск: [" + hdd.toString() + "];";

        if (monitor != null) {
            str += " Монитор: [" + monitor.toString() + "];";
        } else {
            str += " Монитор: [Отсутствует]";
        }

        return str;
    }

    public ComputerClass getComputerClass() {
        return computerClass;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Hdd getHdd() {
        return hdd;
    }

}
