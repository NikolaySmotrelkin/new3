import ru.x5.Engine;
import ru.x5.Lorry;
import ru.x5.Car;
import ru.x5.SportCar;

public class Task2 {

    public static void main(String[] args) {
        // Объявляем массив машин
        Car[] cars = new Car[2];

        // Создаем и инициализируем класс грузовика
        cars[0] = new Lorry("K740.10", "грузовик", 5320, 8000);
        cars[0].engine = new Engine(210, "Камаз");

        // Создаем и инициализируем класс спорткара
        cars[1] = new SportCar("Porsche Cayenne", "спорткар", 2500, 280);
        cars[1].engine = new Engine(600, "Porsche");

        // Выводим данные о машинах
        for (Car car : cars) {
            car.printInfo();
            car.start();
            car.turnLeft();
            car.turnRight();
            car.stop();
            System.out.println("---");
        }
    }
}
