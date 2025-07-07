import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    void setUp(){
        student = new Student("Max", "Mustermann", 100001);
    }


    @Test
    void constructorAndGetters_ShouldInitializeFieldsCorrectly() {
        assertEquals("Max", student.getFirstName());
        assertEquals("Mustermann", student.getSurname());
        assertEquals(100001, student.getId());
    }

    @Test
    void testAddCourse() {
        assertEquals(0, student.getCourses().size());
        Course course = new Course("Mathe", "Müller", 123);
        student.addCourse(course);
        assertEquals(1, student.getCourses().size());
        assertTrue(student.getCourses().contains(course));
    }
}