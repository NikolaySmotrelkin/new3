package ru.x5;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AccountDBService implements IAccountService {
    public void withDraw(int accountID, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Connection connection = null;
        PreparedStatement statement = null;

        // Проверим существование аккаунта через функцию проверки баланса
        // Если аккаунт не существует то произойдет UnknownAccountException
        balance(accountID, false);

        try {
            try {
                connection = DriverManager.getConnection("jdbc:h2:~/test");
                String sql = "UPDATE ACCOUNTS SET AMOUNT = AMOUNT - ? WHERE ID = ? AND AMOUNT >= ?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, amount);
                statement.setInt(2, accountID);
                statement.setInt(3, amount);
                statement.executeUpdate();

                if (statement.getUpdateCount() == 0) {
                    throw new NotEnoughMoneyException("[accountID = " + accountID + "]");
                }
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                }  catch (Exception e) {}


                try {
                    if (connection != null)  {
                        connection.close();
                    }
                } catch (Exception e) {}
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void balance(int accountID, boolean showMessage) throws UnknownAccountException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            try {
                connection = DriverManager.getConnection("jdbc:h2:~/test");
                String sql = "SELECT * FROM ACCOUNTS WHERE ID=?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, accountID);
                ResultSet resultSet = statement.executeQuery();

                if (!resultSet.next()) {
                    throw new UnknownAccountException("[accountID = " + accountID + "]");
                }

                String holder = resultSet.getString(2);
                int amount = resultSet.getInt(3);

                if (showMessage) {
                    System.out.println(holder + " BALANCE: " + amount);
                }
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                }  catch (Exception e) {}


                try {
                    if (connection != null)  {
                        connection.close();
                    }
                } catch (Exception e) {}
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void balance(int accountID) throws UnknownAccountException {
        balance(accountID, true);
    }

    public void deposit(int accountID, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            try {
                if (amount <= 0) {
                    throw new NotEnoughMoneyException("[accountID = " + accountID + "]");
                }

                connection = DriverManager.getConnection("jdbc:h2:~/test");
                String sql = "UPDATE ACCOUNTS SET AMOUNT = AMOUNT + ? WHERE ID = ?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, amount);
                statement.setInt(2, accountID);
                statement.executeUpdate();

                if (statement.getUpdateCount() == 0) {
                    throw new UnknownAccountException("[accountID = " + accountID + "]");
                }
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                }  catch (Exception e) {}


                try {
                    if (connection != null)  {
                        connection.close();
                    }
                } catch (Exception e) {}
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Connection connection = null;
        PreparedStatement statement = null;

        // Проверим существование аккаунта через функцию проверки баланса
        // Если аккаунт не существует то произойдет UnknownAccountException
        balance(from, false);
        balance(to, false);

        try {
            try {
                connection = DriverManager.getConnection("jdbc:h2:~/test");
                connection.setAutoCommit(false);
                String sql = "UPDATE ACCOUNTS SET AMOUNT = AMOUNT - ? WHERE ID = ? AND AMOUNT >= ?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, amount);
                statement.setInt(2, from);
                statement.setInt(3, amount);
                statement.executeUpdate();

                if (statement.getUpdateCount() == 0) {
                    connection.rollback();
                    throw new NotEnoughMoneyException("[accountID = " + from + "]");
                }

                sql = "UPDATE ACCOUNTS SET AMOUNT = AMOUNT + ? WHERE ID = ?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, amount);
                statement.setInt(2, to);
                statement.executeUpdate();

                connection.commit();
                connection.setAutoCommit(true);

            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                }  catch (Exception e) {}


                try {
                    if (connection != null)  {
                        connection.close();
                    }
                } catch (Exception e) {}
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
