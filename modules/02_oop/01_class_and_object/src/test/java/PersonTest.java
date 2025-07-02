import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testConstructorForInitialValues() {
        Person person = new Person("Max", 35, Person.Gender.MALE);

        assertEquals("Max", person.getName());
        assertEquals(35, person.getAge());
        assertEquals(Person.Gender.MALE, person.getGender());
    }

}