package ru.x5;

public class ComputerService {

    public Computer create(ComputerCreate computerCreate) {
        return computerCreate.create();
    }
}
