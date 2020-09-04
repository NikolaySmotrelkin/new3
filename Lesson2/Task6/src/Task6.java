import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        String str = "";

        try {
            int value = scanner.nextInt();

            if (value == 0) {
                str = "Нулевое";
            } else {

                if (value > 0) {
                    str += "положительное";
                } else {
                    str += "отрицательное";
                }

                if (value % 2 == 0) {
                    str += " четное";
                } else {
                    str += " нечетное";
                }
            }

            System.out.println(str + " число");

        } catch (Exception e) {
            System.out.println("Ошибка выполнения программы: " + e.getMessage());
        }
    }
}
