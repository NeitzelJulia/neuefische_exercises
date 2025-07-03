import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void carGetterShouldReturnAllValues() {
        Car car = new Car("Ford", "Mustang", 1965, 2);
        assertEquals("Ford",   car.getManufacturer());
        assertEquals("Mustang",car.getModel());
        assertEquals(1965,     car.getYearOfManufacture());
        assertEquals(2,        car.getNumberOfDoors());
    }

    @Test
    void carIsInstanceOfVehicle() {
        Car car = new Car("VW", "Golf", 2022, 4);
        assertTrue(car instanceof Vehicle);
    }

}