import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Введите целое 3-х значное число");
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();

            if (value < 0) {
                throw new Exception("Число должно быть положительным");
            }

            if (value > 999 || value < 100) {
                throw new Exception("Число должно быть 3-х значным");
            }

            int summ = 0;

            while (value > 0) {
                summ += value % 10;
                value = (value / 10);
            }

            System.out.println("Сумма цифр числа: " + summ);

        } catch (Exception e) {
            System.out.println("Ошибка выполнения программы: " + e.getMessage());
        }
    }
}
