package ru.x5;

public class FileLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
