import java.sql.*;
import ru.x5.AccountManager;
import ru.x5.StorageType;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private final static String path = "FileStorage.txt";

    public static void main(String[] args) {
        // Запрашиваем у пользователя тип хранилища
        StorageType storageType = getStorageType();

        switch (storageType) {
            case FILE:
                // Создаем файловое хранилище
                createFileStorage();
                break;
            case DB:
                // Создаем в качестве хранилища БД
                createDBStorage();
                break;
            default:
                System.out.println("Выбран некорректный тип хранилища");
                System.exit(1);
        }

        // Запускаем обработку команд с конслои
        (new AccountManager(path, storageType)).run();
    }

    public static void createFileStorage() {
        File file = new File(path);

        // Если файл существует, то выходим
        if (file.exists() && !file.isDirectory()) {
            return;
        }

        PrintWriter writer = null;
        // Если файл не существует, то создаем его и заполняем тестовыми данными
        try {
            try {
                writer = new PrintWriter(new FileWriter(path));
                // id | holder | amount
                writer.println("1|Иванов Иван|10000");
                writer.println("2|Петров Петр|50000");
                writer.println("3|Сидоров Сидр|1000");
                writer.println("4|Смотрелкин Николай|500");
                writer.println("5|Ботылев Евгений|100");
                writer.println("6|Чевтайкин Арсений|700");
                writer.println("7|Марченко Артем|12000");
                writer.println("8|Тараканов Александр|100");
                writer.println("9|Юдин Данила|4500");
                writer.println("10|Хлысталова Людмила|7000");
            } finally {
                try {
                    if (writer != null)  {
                        writer.close();
                    }
               } catch (Exception e) {}
            }
        } catch (IOException e) {
            System.out.println("Ошибка создания файлового хранилища: " + e.getMessage());
            System.exit(1);
        }
    }

    public static void createDBStorage() {
        // Проверяем наличие нужного драйвера БД H2
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Создаем БД в памяти и заполняем ее тестовыми данными
        Connection connection = null;
        try {
            try {
                //connection = DriverManager.getConnection("jdbc:h2:mem:test;INIT=RUNSCRIPT FROM './schema.sql'\\;RUNSCRIPT FROM './data.sql'");
                connection = DriverManager.getConnection("jdbc:h2:file:~/test;INIT=RUNSCRIPT FROM './schema.sql'\\;RUNSCRIPT FROM './data.sql'");
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {}
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static StorageType getStorageType() {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("Выбирите тип хранилища FILE или DB");
            String line = scanner.nextLine();

            if (line.equals("DB")) {
                return StorageType.DB;
            } else if (line.equals("FILE")) {
                return StorageType.FILE;
            }

            System.out.println("Введен некорректный тип хранилища");
        }
    }
}
