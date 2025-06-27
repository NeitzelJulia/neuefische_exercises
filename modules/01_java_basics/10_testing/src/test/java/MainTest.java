import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Tests für add(int, int)
    @Test
    void testAddPositiveNumbers(){
        assertEquals(5, Main.add(2, 3));
    }

    @Test
    void testAddWithZero(){
        assertEquals(7, Main.add(7, 0));
        assertEquals(11, Main.add(0, 11));
    }

    @Test
    void testAddNegativeNumbers(){
        assertEquals(-5, Main.add(-2, -3));
    }

    @Test
    void testMultiplyNegativeNumbers() {
        assertEquals(6, Main.multiply(-2, -3));
        assertEquals(-6, Main.multiply(-2, 3));
    }

    // Tests für isEven(int)
    @Test
    void testIsEvenWithEvenNumber() {
        assertTrue(Main.isEven(4));
    }

    @Test
    void testIsEvenWithOddNumber() {
        assertFalse(Main.isEven(5));
    }

    @Test
    void testIsEvenWithZero() {
        assertTrue(Main.isEven(0));
    }

    // Tests für multiply(int, int)
    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(6, Main.multiply(2, 3));
    }

    @Test
    void testMultiplyWithZero() {
        assertEquals(0, Main.multiply(5, 0));
        assertEquals(0, Main.multiply(0, 5));
    }

    // Tests für toUpperCase(String)
    @Test
    void testToUpperCaseRegular() {
        assertEquals("HALLO", Main.toUpperCase("Hallo"));
    }

    @Test
    void testToUpperCaseAlreadyUpper() {
        assertEquals("TEST", Main.toUpperCase("TEST"));
    }

    @Test
    void testToUpperCaseEmpty() {
        assertEquals("", Main.toUpperCase(""));
    }

    @Test
    void testToUpperCaseNull() {
        assertThrows(NullPointerException.class, () -> Main.toUpperCase(null));
    }

    // Tests für isPositive(int)
    @Test
    void testIsPositiveWithPositiveNumber() {
        assertTrue(Main.isPositive(10));
    }

    @Test
    void testIsPositiveWithZero() {
        assertFalse(Main.isPositive(0));
    }

    @Test
    void testIsPositiveWithNegativeNumber() {
        assertFalse(Main.isPositive(-5));
    }
}