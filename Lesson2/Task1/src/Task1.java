import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = bufReader.readLine();
            char chr = str.charAt(str.length() - 1);
            System.out.println("Последняя цифра в числе: " + chr);
        } catch (Exception e) {
            System.out.println("Ошибка выполнения программы: " + e.getMessage());
        }
    }
}
