import ru.x5.Animal;
import ru.x5.Cat;
import ru.x5.Dog;
import ru.x5.Horse;
import ru.x5.Veterinarian;

public class Task2 {

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();

        Animal[] animal = new Animal[3];

        animal[0] = new Cat();
        animal[1] = new Dog();
        animal[2] = new Horse();

        for (Animal anim : animal) {
            anim.makeNoice();
            anim.eat();

            veterinarian.treatAnimal(anim);
        }

    }
}
