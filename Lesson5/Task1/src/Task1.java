import ru.x5.*;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите тип логирования: FILE, DB, CONSOLE");

        LoggerType logType = null;
        LoggerFactory logFactory = null;
        Logger logger = null;

        Scanner scanner = new Scanner(System.in);

        try {
            logType = LoggerType.valueOf(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка. Некорректно указан тип логирования. Программа завершает работу.");
            System.exit(1);
        }

        switch (logType) {
            case FILE:
                logFactory = new FileLoggerFactory();
                break;
            case DB:
                logFactory = new DbLoggerFactory();
                break;
            case CONSOLE:
                logFactory = new ConsoleLoggerFactory();
                break;
            default:
                System.out.println("Ошибка. Некорректно указан тип логирования. Программа завершает работу.");
                System.exit(1);
        }

        logger = logFactory.createLogger();
        Calculator calculator = new Calculator(logger);

        Double plus = calculator.plus(2.0, 3.0);
        Double minus = calculator.minus(2.0, 3.0);
        Double div = calculator.div(2.0,3.0);
        Double multiply = calculator.multiply(2.0,3.0);
    }
}
