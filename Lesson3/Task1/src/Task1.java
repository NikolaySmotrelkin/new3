import ru.x5.Phone;

public class Task1 {

    public static void main(String[] args) {
        // Массив из 3 объектов класса Phone
        Phone[] phones = new Phone[3];

        // Инстанцируем класс при помощи конструктора с одним параметром
        Phone phone = new Phone();
        phone.setModel("Xiaomi");
        phone.setNumber("3575707");
        phone.setWeight("125г.");
        phones[0] = phone;

        // Инстанцируем класс при помощи конструктора с двумя параметрами
        phone = new Phone("2500128", "Samsung");
        phone.setWeight("100г.");
        phones[1] = phone;

        // Инстанцируем класс при помощи конструктора с тремя параметрами
        phone = new Phone("1534253", "IPhone", "250г.");
        phones[2] = phone;

        // Выводим данные в консоль из всех объектов массива
        for (Phone ph : phones) {
            System.out.println("Модель: " + ph.getModel());
            System.out.println("Номер: " + ph.getNumber());
            System.out.println("Вес: " + ph.getWeight());

            ph.receiveCall("Николай Смотрелкин");
            ph.receiveCall("Николай Смотрелкин", ph.getNumber());

            ph.sendMessage("3575707", "2500128", "1534253");
        }
    }
}
