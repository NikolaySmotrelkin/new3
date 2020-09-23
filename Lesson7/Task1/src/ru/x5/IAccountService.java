package ru.x5;

public interface IAccountService {
    void withDraw(int accountID, int amount) throws NotEnoughMoneyException, UnknownAccountException;
    void balance(int accountID) throws UnknownAccountException;
    void deposit(int accountID, int amount) throws NotEnoughMoneyException, UnknownAccountException;
    void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException;
 }
