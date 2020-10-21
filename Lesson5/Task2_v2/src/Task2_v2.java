import ru.x5_v2.*;

import java.util.Scanner;

public class Task2_v2 {
    public static void main(String[] args) {
        System.out.println("Введите класс компьютера, который необходимо собрать: LAPTOP, DESKTOP, SERVER");
        Scanner scanner = new Scanner(System.in);
        ComputerCreate computerCreate = null;

        try {
            switch (ComputerClass.valueOf(scanner.nextLine()))  {
                case LAPTOP:
                    // Создаем стратегию сборки ноутбука
                    computerCreate = new ComputerLaptopCreate();
                    break;
                case DESKTOP:
                    // Создаем стратегию сборки стационарного ПК
                    computerCreate = new ComputerDesktopCreate();
                    break;
                case SERVER:
                    // Создаем стратегию сборки стационарного ПК (версия PRO)
                    computerCreate = new ComputerServerCreate();
                    break;
                default:
                    System.out.println("Указан некорректный класс компьютера.");
                    System.exit(1);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Указан некорректный класс компьютера.");
            System.exit(1);
        }

        // Создаем объект ComputerService, который на основании выбранной стратегии соберет нужный компьютер
        Computer computer = (new ComputerService()).create(computerCreate);

        // Выводим характеристики собранного компа
        System.out.println(computer.toString());
    }
}
