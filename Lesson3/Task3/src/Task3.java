import ru.x5.Student;
import ru.x5.Aspirant;

public class Task3 {

    public static void main(String[] args) {
        Student student = new Aspirant();

        student.firstName = "Николай";
        student.lastName = "Смотрелкин";
        student.group = "1";
        student.averageMark = 5.0f;

        System.out.println(student.lastName + " стипендия: " + student.getScholarship());

        Student[] students = new Student[4];

        student = new Student();
        student.firstName = "Василий";
        student.lastName = "Лоханкин";
        student.group = "1";
        student.averageMark = 5.0f;
        students[0] = student;

        student = new Student();
        student.firstName = "Иван";
        student.lastName = "Иванов";
        student.group = "1";
        student.averageMark = 4.0f;
        students[1] = student;

        student = new Aspirant();
        student.firstName = "Петр";
        student.lastName = "Петров";
        student.group = "1";
        student.averageMark = 5.0f;
        students[2] = student;

        student = new Aspirant();
        student.firstName = "Сидр";
        student.lastName = "Сидоров";
        student.group = "1";
        student.averageMark = 4.0f;
        students[3] = student;

        for (Student st : students) {
            System.out.println(st.lastName + " стипендия: " + st.getScholarship());
        }
    }
}
