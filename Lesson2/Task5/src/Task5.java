import java.util.Scanner;


public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr =  new int[3];

        try {
            System.out.println("Введите первое целое число");
            arr[0] = scanner.nextInt();

            System.out.println("Введите второе целое число");
            arr[1] = scanner.nextInt();

            System.out.println("Введите третье целое число");
            arr[2] = scanner.nextInt();

            int min = arr[0];

            for (int j : arr) {
                if (j < min) {
                    min = j;
                }
            }

            System.out.println("Наименьшее из чисел: " + min);

        } catch (Exception e) {
            System.out.println("Ошибка выполнения программы: " + e.getMessage());
        }
    }
}
