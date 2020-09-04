import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();
            String str = Integer.toString(value);
            char chr = str.charAt(str.length() - 1);
            System.out.println("Последняя цифра в числе: " + chr);
        } catch (Exception e) {
            System.out.println("Ошибка выполнения программы: " + e.getMessage());
        }
    }
}
