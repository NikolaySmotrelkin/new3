import ru.x5.Student;
import ru.x5.Aspirant;

public class Task3 {

    public static void main(String[] args) {
        Student student = new Aspirant("Николай","Смотрелкин","1", 5.0, "Сферический конь в вакуме");

        System.out.println(" Фамилия: " + student.getLastName() +
                           " Средняя оценка: " + student.getAverageMark() +
                           " стипендия: " + student.getScholarship() +
                           " научная работа: " + ((Aspirant)student).getDegree());

        // Создаем массив объектов
        Student[] students = new Student[4];

        student = new Student("Василий", "Лоханкин","1", 5.0);
        students[0] = student;

        student = new Student("Иван","Иванов","1", 4.0);
        students[1] = student;

        student = new Aspirant("Петр", "Петров", "1", 5.0, "Сферический конь в вакуме");
        students[2] = student;

        student = new Aspirant("Сидр","Сидоров", "1", 4.0, "Коллизии алгоритмов хеширования");
        students[3] = student;

        for (Student st : students) {
            System.out.println(" Фамилия: " + st.getLastName() +
                               " Средняя оценка: " + st.getAverageMark() +
                               " Стипендия: " + st.getScholarship());

            // Для аспиранта выводим научную работу
            if (st instanceof Aspirant) {
                System.out.println("Научная работа: " + ((Aspirant)st).getDegree());
            }
        }
    }
}
