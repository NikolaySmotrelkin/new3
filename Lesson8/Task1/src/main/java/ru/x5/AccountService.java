package ru.x5;

import java.io.*;
import java.util.ArrayList;

public class AccountService implements IAccountService {
    private final String path;
    private final ArrayList<Account> list;

    public AccountService(String path) {
        this.path = path;
        list = new ArrayList<Account>();

        //Читаем данные из файла
        readFromFile();
    }

    private void readFromFile() {
        BufferedReader reader = null;

        try {
            try {
                reader = new BufferedReader(new FileReader(path));
                String line;

                while ((line = reader.readLine()) != null) {
                    String[] data = line.split("\\|");
                    list.add(new Account(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2])));
                }
            } finally {
                if (reader != null) { reader.close(); }
            }

        } catch (Exception e) {
            System.out.println("Ошибка чтения данных из файла: " + e.getMessage());
        }
    }

    private void writeToFile() {
        PrintWriter writer = null;

        try {
            try {
                writer = new PrintWriter(new FileWriter(path));
                for (Account account : list) {
                    writer.println(account.getId() + "|" + account.getHolder() + "|" + account.getAmount());
                }
            } finally {
                if (writer != null) { writer.close(); }
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи данных в файл: " + e.getMessage());
        }
    }

    //@Override
    public void withDraw(int accountID, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        boolean unknownAccount = true;

        for (int i = 0; i < list.size(); i++) {
            Account account = list.get(i);

            if (account.getId() == accountID) {
                unknownAccount = false;

                if (account.getAmount() < amount) {
                    throw new NotEnoughMoneyException("[accountID = " + accountID + "]");
                } else {
                    account.setAmount(account.getAmount() - amount);
                    break;
                }
            }
        }

        if (unknownAccount) {
            throw new UnknownAccountException("[accountID = " + accountID + "]");
        }

        // Записываем в файл
        writeToFile();
    }

    //@Override
    public void balance(int accountID) throws UnknownAccountException {
        boolean unknownAccount = true;

        for (int i = 0; i < list.size(); i++) {
            Account account = list.get(i);

            if (account.getId() == accountID) {
                unknownAccount = false;
                System.out.println(account.getHolder() + " BALANCE: " + account.getAmount());
            }
        }

        if (unknownAccount) {
            throw new UnknownAccountException("[accountID = " + accountID + "]");
        }
    }

    //@Override
    public void deposit(int accountID, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        boolean unknownAccount = true;

        for (int i = 0; i < list.size(); i++) {
            Account account = list.get(i);

            if (account.getId() == accountID) {
                unknownAccount = false;

                if (amount <= 0) {
                    throw new NotEnoughMoneyException("[accountID = " + accountID + "]");
                } else {
                    account.setAmount(account.getAmount() + amount);
                    break;
                }
            }
        }

        if (unknownAccount) {
            throw new UnknownAccountException("[accountID = " + accountID + "]");
        }

        // Записываем в файл
        writeToFile();
    }

    //@Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account fromAccount = null;
        Account toAccount = null;

        for (int i = 0; i < list.size(); i++) {
            Account account = list.get(i);

            if (account.getId() == from) {
                fromAccount = account;
            }

            if (account.getId() == to) {
                toAccount = account;
            }
        }

        if (fromAccount == null) {
            throw new UnknownAccountException("[accountID = " + from + "]");
        }

        if (toAccount == null) {
            throw new UnknownAccountException("[accountID = " + to + "]");
        }

        // Если пытаемся перевести сумму большую чем есть на счете
        if (fromAccount.getAmount() < amount) {
            throw new NotEnoughMoneyException("[accountID = " + from + "]");
        }

        // Переводим деньги со счета на счет
        fromAccount.setAmount(fromAccount.getAmount() - amount);
        toAccount.setAmount(toAccount.getAmount() + amount);

        // Записываем в файл
        writeToFile();
    }
}
