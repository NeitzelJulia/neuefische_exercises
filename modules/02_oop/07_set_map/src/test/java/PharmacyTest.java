import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PharmacyTest {

    private Pharmacy pharmacy;
    private Medication aspirin;
    private Medication ibuprofen;

    @BeforeEach
    void setUp() {
        pharmacy  = new Pharmacy();
        aspirin   = new Medication("Aspirin",    5.0, true);
        ibuprofen = new Medication("Ibuprofen",  7.5, false);
    }

    @Test
    void testGetCountInitiallyZero() {
        assertEquals(0, pharmacy.getCount());
    }

    @Test
    void testSaveIncreasesCount() {
        pharmacy.save(aspirin);
        assertEquals(1, pharmacy.getCount());
        pharmacy.save(ibuprofen);
        assertEquals(2, pharmacy.getCount());
    }

    @Test
    void testFindExisting() {
        pharmacy.save(aspirin);
        Medication found = pharmacy.find("Aspirin");
        assertNotNull(found);
        assertEquals("Aspirin", found.getName());
        assertEquals(5.0, found.getPrice());
        assertTrue(found.isAvailable());
    }

    @Test
    void testFindNonExistingReturnsNull() {
        assertNull(pharmacy.find("Paracetamol"));
    }

    @Test
    void testDeleteRemovesEntry() {
        pharmacy.save(ibuprofen);
        assertEquals(1, pharmacy.getCount());
        pharmacy.delete("Ibuprofen");
        assertEquals(0, pharmacy.getCount());
        assertNull(pharmacy.find("Ibuprofen"));
    }

    @Test
    void testSaveOverridesExisting() {
        Medication aspirinCheaper = new Medication("Aspirin", 3.0, true);
        pharmacy.save(aspirin);
        pharmacy.save(aspirinCheaper);
        assertEquals(1, pharmacy.getCount());
        assertEquals(3.0, pharmacy.find("Aspirin").getPrice());
    }
}