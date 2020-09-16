package ru.x5;

public class ConsoleLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
