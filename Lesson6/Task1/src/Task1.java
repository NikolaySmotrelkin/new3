public class Task1 {
    public static void main(String[] args) {
        CustomCollection<String> collection = new CustomCollection<>(5);

        collection.add("Иванов");
        collection.add("Петров");
        collection.add("Сидоров");
        collection.add("Смотрелкин");
        collection.add("Ботылев");
        collection.add("Чевтайкин");
        System.out.println(collection.size());
        System.out.println(collection.toString());

        collection.remove(0);
        collection.remove("Чевтайкин");
        System.out.println(collection.size());
        System.out.println(collection.toString());
        System.out.println(collection.get(collection.size() - 1).toString());

        collection.clear();
        System.out.println(collection.size());
        System.out.println(collection.toString());


        CustomLinkedCollection<String> linkedCollection = new CustomLinkedCollection<>();

        linkedCollection.add("красный");
        linkedCollection.add("Оранжевый");
        linkedCollection.add("Желтый");
        linkedCollection.add("Зеленый");
        linkedCollection.add("Голубой");
        linkedCollection.add("Синий");
        linkedCollection.add("Фиолетовый");
        System.out.println(linkedCollection.size());
        System.out.println(linkedCollection.toString());

        linkedCollection.remove(3);
        linkedCollection.remove("Фиолетовый");
        System.out.println(linkedCollection.size());
        System.out.println(linkedCollection.toString());
        System.out.println(linkedCollection.get(linkedCollection.size() - 1).toString());

        linkedCollection.clear();
        System.out.println(linkedCollection.size());
        System.out.println(linkedCollection.toString());
    }
}
