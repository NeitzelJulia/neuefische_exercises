import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    private School school;
    private Student s1, s2;

    @BeforeEach
    void setUp() {
        school = new School();
        s1 = new Student("Max", "Mustermann", 100001);
        s2 = new Student("Anna", "Müller", 100002);
    }

    @Test
    void testAddStudent() {
        assertEquals(0, school.students.size());
        school.addStudent(s1);
        assertEquals(1, school.students.size());
        assertTrue(school.students.contains(s1));
    }

    @Test
    void findStudentById_ShouldReturnStudent_WhenExists() {
        school.addStudent(s1);
        school.addStudent(s2);
        Student found = school.findStudentById(100002);
        assertSame(s2, found);
    }

    @Test
    void removeStudentById_ShouldRemoveStudent_WhenExists() {
        school.addStudent(s1);
        school.addStudent(s2);
        assertEquals(2, school.students.size());
        school.removeStudentById(100001);
        assertEquals(1, school.students.size());
        assertFalse(school.students.contains(s1));
    }

    @Test
    void getCoursesOfStudentByStudentId_ShouldReturnCourses_WhenStudentHasCourses() {

        school.addStudent(s1);

        Course math = new Course("Mathe", "Müller", 123);
        Course physics = new Course("Physik", "Meier", 124);
        s1.addCourse(math);
        s1.addCourse(physics);

        List<Course> courses = school.getCoursesOfStudentByStudentId(100001);

        assertEquals(2, courses.size());
        assertTrue(courses.contains(math));
        assertTrue(courses.contains(physics));
    }

}