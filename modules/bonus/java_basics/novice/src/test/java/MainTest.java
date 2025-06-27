import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testIsPositivNumber() {
        assertTrue(Main.isPositivNumber(1));
        assertFalse(Main.isPositivNumber(0));
        assertFalse(Main.isPositivNumber(-1));
    }

    @Test
    void testSquare(){
        assertEquals(25, Main.square(5));
        assertEquals(0, Main.square(0));
        assertEquals(9, Main.square(-3));
    }

}