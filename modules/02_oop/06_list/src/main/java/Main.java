import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.add(new Student("Max", "Mustermann", 100001));
        students.add(new Student("Anna", "Müller", 100002));
        students.add(new Student("Jonas", "Schmidt", 100003));
        students.add(new Student("Lena", "Fischer", 100004));

        School school = new School();
        for (Student student : students){
            school.addStudent(student);
        }

        Student student = school.findStudentById(100003);
        student.printStudent();
        System.out.println();

        school.removeStudentById(100003);
        school.printAllStudents();
    }

}
