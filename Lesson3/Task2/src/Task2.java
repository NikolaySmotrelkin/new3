import ru.x5.Animal;
import ru.x5.Cat;
import ru.x5.Dog;
import ru.x5.Horse;
import ru.x5.Veterinarian;

public class Task2 {

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();

        Animal[] animal = new Animal[3];

        animal[0] = new Cat("мышь", "в доме", "короткошерстная");
        animal[1] = new Dog("кость", "в конуре", "охотничья");
        animal[2] = new Horse("сено", "в стойле", "ездовая");

        for (Animal anim : animal) {
            anim.makeNoice();
            anim.eat();

            // Вывод специфицеских для объекта свойств
            if (anim instanceof Cat) {
                System.out.println(((Cat)anim).getCatType());
            } else if(anim instanceof Dog) {
                System.out.println(((Dog)anim).getDogType());
            } else {
                System.out.println(((Horse)anim).getHorseType());
            }

            // Идем к ветеренару
            veterinarian.treatAnimal(anim);
        }

    }
}
