package ru.x5;

import java.util.Scanner;

public class AccountManager {
    AccountService accountService;

    public AccountManager(String path) {
        // Создаем класс реализующий логику работы со счетами
        accountService = new AccountService(path);
        printInfo();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        // Цикл обработки команд из конслои
        while (run) {
            String[] args = scanner.nextLine().split("\\s+");

            switch (args[0]) {
                case "exit":
                    run = false;
                    break;
                case "balance":
                    balance(args);
                    break;
                case "withdraw":
                    withdraw(args);
                    break;
                case "deposite":
                    deposite(args);
                    break;
                case "transfer":
                    transfer(args);
                    break;
                default:
                    badCommand();
                    break;
            }
        }
    }

    private void balance(String[] args) {
        // Проверяем корректность ввода команды
        if (!checkArgumentCount(2, args)) {
            printArgumentError(1);
            return;
        }

        // Запрашиваем баланс
        try {
            accountService.balance(Integer.parseInt(args[1]));
        } catch (UnknownAccountException e) {
            System.out.println("Аккаунт не найден: " + e.getMessage());
        }
    }

    private void withdraw(String[] args) {
        // Проверяем корректностьввода команды
        if (!checkArgumentCount(3, args)) {
            printArgumentError(2);
            return;
        }

        // Проводим снятие
        try {
            accountService.withDraw(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } catch (UnknownAccountException e) {
            System.out.println("Аккаунт не найден: " + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("Не достаточно денег на счете: " + e.getMessage());
        }
    }

    private void deposite(String[] args) {
        // Проверяем корректностьввода команды
        if (!checkArgumentCount(3, args)) {
            printArgumentError(2);
            return;
        }

        // Проводим поплнение
        try {
            accountService.deposit(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } catch (UnknownAccountException e) {
            System.out.println("Аккаунт не найден: " + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("Некорректная сумма: " + e.getMessage());
        }
    }

    private void transfer(String[] args) {
        // Проверяем корректностьввода команды
        if (!checkArgumentCount(4, args)) {
            printArgumentError(3);
            return;
        }

        // Делаем перевод
        try {
            accountService.transfer(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        } catch (UnknownAccountException e) {
            System.out.println("Аккаунт не найден: " + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("Сумма перевода больше чем сумма счета: " + e.getMessage());
        }
    }

    private boolean checkArgumentCount(int count, String[] args) {
        return (args.length == count);
    }

    private void printArgumentError(int count) {
        System.out.println("У команды некорректное количество аргументов. Должно быть: " + count);
    }

    private void badCommand() {
        System.out.println("Некорректная команда!");
        printInfo();
    }

    private void printInfo() {
        System.out.println("Доступные команды:");
        System.out.println("balance [id] - баланс");
        System.out.println("withdraw [id] [ammount] - снять");
        System.out.println("deposite [id] [ammount] - внести");
        System.out.println("transfer [from] [to] [ammount] - перевести");
        System.out.println("exit - выход");
    }
}
