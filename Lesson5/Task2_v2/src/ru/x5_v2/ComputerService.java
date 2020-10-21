package ru.x5_v2;

public class ComputerService {

    public Computer create(ComputerCreate computerCreate) {
        return computerCreate.create();
    }
}

