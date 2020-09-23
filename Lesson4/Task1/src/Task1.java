import ru.x5.Circle;
import ru.x5.Rectangle;
import ru.x5.Shape;
import ru.x5.Triangle;

public class Task1 {

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        shape[0] = new Triangle(3,4, 5);
        shape[1] = new Circle(5);
        shape[2] = new Rectangle(5,10);

        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}
