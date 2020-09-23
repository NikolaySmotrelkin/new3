import ru.x5.AccountManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task1 {
    private final static String path = "FileStorage.txt";

    public static void main(String[] args) {
        // Создаем файловое хранилище
        createFileStorage();

        // Запускаем обработку команд с конслои
        (new AccountManager(path)).run();
    }

    public static void createFileStorage() {
        File file = new File(path);

        // Если файл существует, то выходим
        if (file.exists() && !file.isDirectory()) {
            return;
        }

        // Если файл не существует, то создаем его и заполняем тестовыми данными
        try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
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
        } catch (IOException e) {
            System.out.println("Ошибка создания файлового хранилища: " + e.getMessage());
            System.exit(1);
        }
    }
}
