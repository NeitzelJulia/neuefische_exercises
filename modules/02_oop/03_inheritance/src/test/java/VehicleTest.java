import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void vehicleGetterShouldReturnConstructorValues() {
        Vehicle vehicle = new Vehicle("TestHersteller", "TestModell", 1999);
        assertEquals("TestHersteller", vehicle.getManufacturer());
        assertEquals("TestModell",      vehicle.getModel());
        assertEquals(1999,             vehicle.getYearOfManufacture());
    }

}