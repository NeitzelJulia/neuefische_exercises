import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void testConstructorForInitialValues() {
        Car car = new Car("VW", "Golf", "blue", 2020);

        assertEquals("VW", car.getBrand());
        assertEquals("Golf", car.getModel());
        assertEquals("blue", car.getColor());
        assertEquals(2020, car.getYearOfManufacture());
        assertEquals(0, car.getSpeed());
        assertFalse(car.isEngineIsRunning());
    }

    @Test
    void testStartEngine_noEngineRunning() {
        Car car = new Car("VW", "Golf", "blue", 2020);
        car.startEngine();
        assertTrue(car.isEngineIsRunning());
    }

    @Test
    void testStartEngine_withEngineRunning() {
        Car car = new Car("VW", "Golf", "blue", 2020);
        car.startEngine();
        assertThrows(IllegalStateException.class, car::startEngine);
    }

    @Test
    void testAccelerate_noEngineRunning() {
        Car car = new Car("VW", "Golf", "blue", 2020);
        assertThrows(IllegalStateException.class, () -> car.accelerate(10));
    }

    @Test
    void testAccelerate_withEngineRunning() {
        Car car = new Car("VW", "Golf", "blue", 2020);
        car.startEngine();
        car.accelerate(10);
        assertEquals(10, car.getSpeed());
    }

    @Test
    void testAccelerate_withEngineRunningAndSpeed() {
        Car car = new Car("VW", "Golf", "blue", 2020);
        car.startEngine();
        car.accelerate(20);
        car.accelerate(30);
        assertEquals(50, car.getSpeed());
    }
}
