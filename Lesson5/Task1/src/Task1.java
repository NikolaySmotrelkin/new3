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

        System.out.println("Введите выражение. Например: 2+3 и нажмите Enter.");
        String value = scanner.nextLine();
        String[] data = value.split("[+-/*]");

        try {
            double firstOperand = Double.parseDouble(data[0]);
            double secondOperand = Double.parseDouble(data[1]);
            double result = 0;

            if (value.indexOf("+") > 0) {
                result = firstOperand + secondOperand;
            } else if (value.indexOf("-") > 0) {
                result = firstOperand - secondOperand;
            } else if (value.indexOf("/") > 0) {
                result = firstOperand / secondOperand;
            } else if (value.indexOf("*") > 0) {
                result = firstOperand * secondOperand;
            } else {
                throw new Exception("недопустимое математическое действие. Используйте только +, -, /, *");
            }

            logger.log(Double.toString(result));

        } catch (Exception e) {
            System.out.println("Ошибка вычисления: " + e.getMessage());
        }
    }
}
