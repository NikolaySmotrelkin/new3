import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        System.out.println("Введите код города");
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();
            double price;
            String state = "";

            switch (value) {
                case 905: price = 4.15;
                          state = "Москва";
                          break;
                case 194: price = 1.98;
                          state = "Ростов";
                          break;
                case 491: price = 2.69;
                          state = "Краснодар";
                          break;
                case 800: price = 5.0;
                          state = "Киров";
                          break;
                default:  price = -1.0;
                          break;
            }

            if (price < 0.0) {
                System.out.println("Указанного кода города не существует");
            } else {
                System.out.println(state + ". Стоимость разговора: " + price * 10);
            }

        } catch (Exception e) {
            System.out.println("Ошибка выполнения программы: " + e.getMessage());
        }
    }
}
