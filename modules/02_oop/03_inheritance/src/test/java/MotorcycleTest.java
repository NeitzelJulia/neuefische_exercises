import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void motorcycleGetterShouldReturnAllValues() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2020, 689, "Sportbike");
        assertEquals("Yamaha",    motorcycle.getManufacturer());
        assertEquals("MT-07",     motorcycle.getModel());
        assertEquals(2020,        motorcycle.getYearOfManufacture());
        assertEquals(689,         motorcycle.getEngineCapacity());
        assertEquals("Sportbike", motorcycle.getMotorcycleType());
    }

    @Test
    void motorcycleIsInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2020, 689, "Sportbike");
        assertTrue(motorcycle instanceof Vehicle);
    }

}