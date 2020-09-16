package ru.x5;

public class DbLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
