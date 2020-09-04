import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();

            if (value > 0) {
                value++;
            } else if (value < 0) {
                value -= 2;
            } else {
                value = 10;
            }

            System.out.println("Результат: " + value);

        } catch (Exception e) {
            System.out.println("Ошибка выполнения программы: " + e.getMessage());
        }
    }
}
