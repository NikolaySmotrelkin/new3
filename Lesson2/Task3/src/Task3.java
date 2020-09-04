import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();

            if (value > 0) {
               value++;
            }

            System.out.println("Результат: " + value);

        } catch (Exception e) {
            System.out.println("Ошибка выполнения программы: " + e.getMessage());
        }
    }
}
