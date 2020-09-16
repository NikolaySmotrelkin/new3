package ru.x5;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Log into console: {" + message + "}");
    }
}
