package ru.x5;

import java.util.ArrayList;

public class Box {
    private final ArrayList<Fruit> list;
    private BoxType boxType;

    public Box() {
        list = new ArrayList<>();
        // Тип коробки не определен, пока туда не положат первый фрукт. Затем она обретает тип
        boxType = BoxType.NONE;
    }

    public void add(Fruit fruit) throws BoxCompatibilityException {
        // Если коробка пуста
        if (boxType == BoxType.NONE) {
            // Задаем тип коробки
            if (fruit instanceof Apple) {
                boxType = BoxType.APPLE;
            } else if (fruit instanceof Orange) {
                boxType = BoxType.ORANGE;
            } else {
                throw new BoxCompatibilityException("В эту коробку можно класть только Яблоки или Апельсины");
            }
        } else {
            // Если коробка не пуста, то проверяем можем ли мы туда положить фрукт
            switch (boxType) {
                case APPLE:
                    if (!(fruit instanceof Apple)) {
                        throw new BoxCompatibilityException("В эту коробку можно класть только Яблоки");
                    }
                    break;
                case ORANGE:
                    if (!(fruit instanceof Orange)) {
                        throw new BoxCompatibilityException("В эту коробку можно класть только Апельсины");
                    }
                    break;
                default:
                    throw new BoxCompatibilityException("В эту коробку можно класть только Яблоки или Апельсины");
            }
        }

        // Добавляем фрукт в коробку
        list.add(fruit);
    }

    public BoxType getType() {
        return boxType;
    }

    public Double getWeight() {
        Double weight = 0.0;

        for (Fruit frut : list) {
            weight += frut.getWeight();
        }

        return weight;
    }

    public boolean compare(Box box) {
        return Double.compare(getWeight(), box.getWeight()) == 0;
    }

    public void pour(Box box) {
        try {
            // Пересыпаем из текущей коробки в другую
            for (Fruit fruit : list) {
                box.add(fruit);
            }

            // Очищаем текущую коробку
            list.clear();

            // Поскольку коробка пустая, то ставим ей тип NONE. Т.О. в нее можно класть уже другой тип фруктов
            boxType = BoxType.NONE;
        } catch (BoxCompatibilityException e) {
            // В случае несовместимости типов коробок выводим сообщение об ошибке
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        String str = "Тип: ";

        switch (boxType) {
            case ORANGE:
                str += "Апельсины, ";
                break;
            case APPLE:
                str += "Яблоки, ";
                break;
            case NONE:
                str += "Пустая, ";
                break;
        }

        str += "Количество: " + list.size() + ", ";
        str += "Вес: " + Double.toString(getWeight());

        return str;
    }
}
