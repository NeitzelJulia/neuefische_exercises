import java.util.ArrayList;
import java.util.List;

public class School {
    public List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudentById(int id) {
        try {
            this.students.remove(findStudentById(id));
        } catch (Exception e) {
            throw e;
        }
    }

    public Student findStudentById(int id) {
        for (Student student : this.students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student with id " + id + " not found");
    }

    public List<Course> getCoursesOfStudentByStudentId(int id) {
        return findStudentById(id).getCourses();
    }

    public void printAllStudents() {
        for (Student student : this.students) {
            student.printStudent();
        }
    }
}
