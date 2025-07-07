import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MedicationTest {

    @Test
    void testConstructorAndGetters() {
        Medication med = new Medication("TestMed", 9.99, true);

        assertEquals("TestMed", med.getName());
        assertEquals(9.99, med.getPrice());
        assertTrue(med.isAvailable());
    }
}