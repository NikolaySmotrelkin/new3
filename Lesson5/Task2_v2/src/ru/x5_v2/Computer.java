package ru.x5_v2;

public class Computer {

    private ComputerClass computerClass;
    private ICPU cpu;
    private IRAM ram;
    private IGPU gpu;
    private IHDD hdd;
    private IMonitor monitor;

    public Computer(ComputerClass computerClass, ICPU cpu, IRAM ram, IGPU gpu, IHDD hdd, IMonitor monitor) {
        this.computerClass = computerClass;
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
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
        str += " Процессор: [" + cpu.toString() + "];";
        str += " ОЗУ: [" + ram.toString() + "];";
        str += " Видеокарта: [" + gpu.toString() + "];";
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

    public ICPU getProcessor() {
        return cpu;
    }

    public IRAM getRam() {
        return ram;
    }

    public IGPU getVideoCard() {
        return gpu;
    }

    public IMonitor getMonitor() {
        return monitor;
    }

    public IHDD getHdd() {
        return hdd;
    }

}
