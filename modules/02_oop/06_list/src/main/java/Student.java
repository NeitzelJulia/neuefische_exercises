import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private String surname;
    private final int id;
    private List<Course>  courses;

    public Student(String firstName, String surname, int id) {
        this.firstName = firstName;
        this.surname = surname;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public void printStudent(){
        System.out.println(id + " " + firstName + " " + surname);
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
