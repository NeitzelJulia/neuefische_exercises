import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    @Test
    void testTotalFoodNeedWithMultipleAnimals() {
        Species cat = new Species("Cat", 0.2);
        Owner owner = new Owner("Alice", 30, "Wonderland");
        Animal a1 = new Animal(1, "Whiskers", cat, 2, owner);
        Animal a2 = new Animal(2, "Mittens", cat, 4, owner);

        Zoo zoo = new Zoo(new ArrayList<>(List.of(a1, a2)));
        assertEquals(0.4, zoo.totalFoodNeed(), 1e-6);
    }
}