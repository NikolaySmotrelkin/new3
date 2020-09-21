import ru.x5.*;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) throws BoxCompatibilityException {
        // Коллекция коробок
        ArrayList<Box> boxes = new ArrayList<>();

        // 1-я Коробка с 3 яблоками
        Box box = new Box();
        box.add(new Apple());
        box.add(new Apple());
        box.add(new Apple());
        boxes.add(box);

        // 2-я Коробка с 2 яблоками
        box = new Box();
        box.add(new Apple());
        box.add(new Apple());
        boxes.add(box);

        // 3-я Коробка с 3 апельсинами
        box = new Box();
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        boxes.add(box);

        // 4-я Коробка с 2 апельсинами
        box = new Box();
        box.add(new Orange());
        box.add(new Orange());
        boxes.add(box);

        // Пересыпаем яблоки из первой коробки во вторую.
        boxes.get(0).pour(boxes.get(1));

        System.out.println("1-я Коробка: " + boxes.get(0).toString());
        System.out.println("2-я Коробка: " + boxes.get(1).toString());

        // Пересыпаем апельсинами из третьей коробки в четвертую.
        boxes.get(2).pour(boxes.get(3));

        System.out.println("3-я Коробка: " + boxes.get(2).toString());
        System.out.println("4-я Коробка: " + boxes.get(3).toString());

        if (boxes.get(1).compare(boxes.get(3))) {
            System.out.println("Коробка 2 и коробка 4 равны по весу");
        } else {
            System.out.println("Коробка 2 и коробка 4 не равны по весу");
        }
    }
}
