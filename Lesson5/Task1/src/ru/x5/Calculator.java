package ru.x5;

public class Calculator {

    // Ссылка на класс логера
    private Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }
    public Logger getLogger() {
        return logger;
    }
    public Double plus(Double a, Double b) {
        Double result = a + b;
        if (logger != null) {
            logger.log(a + " + " + b + " = " + result);
        }
        return result;
    }
    public Double minus(Double a, Double b) {
        Double result = a - b;
        if (logger != null) {
            logger.log(a + " - " + b + " = " + result);
        }
        return result;
    }
    public Double div(Double a, Double b) {
        Double result = a / b;
        if (logger != null) {
            logger.log(a + " / " + b + " = " + result);
        }
        return result;
    }
    public Double multiply(Double a, Double b) {
        Double result = a * b;
        if (logger != null) {
            logger.log(a + " * " + b + " = " + result);
        }
        return result;
    }
}
