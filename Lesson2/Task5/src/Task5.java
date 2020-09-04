import java.util.Scanner;


public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите первое целое число");
            int value1 = scanner.nextInt();

            System.out.println("Введите второе целое число");
            int value2 = scanner.nextInt();

            System.out.println("Введите третье целое число");
            int value3 = scanner.nextInt();

            int min = Math.min(value1, value2);
            min = Math.min(min, value3);

            System.out.println("Наименьшее из чисел: " + min);

        } catch (Exception e) {
            System.out.println("Ошибка выполнения программы: " + e.getMessage());
        }
    }
}
