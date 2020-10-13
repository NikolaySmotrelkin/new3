package ru.x5;

public class Calculator {

    // Ссылка на класс логера
    private Logger logger;

    public Calculator(Logger logger) {
        if (logger == null) {
            // Если логгер не указан, то создаем дефолтовый логгер (файловый)
            this.logger = (new FileLoggerFactory()).createLogger();
        } else {
            this.logger = logger;
        }
    }
    public Logger getLogger() {
        return logger;
    }
    public Double plus(Double a, Double b) {
        Double result = a + b;
        logger.log(a + " + " + b + " = " + result);
        return result;
    }
    public Double minus(Double a, Double b) {
        Double result = a - b;
        logger.log(a + " - " + b + " = " + result);
        return result;
    }
    public Double div(Double a, Double b) {
        Double result = a / b;
        logger.log(a + " / " + b + " = " + result);
        return result;
    }
    public Double multiply(Double a, Double b) {
        Double result = a * b;
        logger.log(a + " * " + b + " = " + result);
        return result;
    }
}
