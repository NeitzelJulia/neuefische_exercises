import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testIsReversed(){
        assertEquals("tset", Main.revertString("test"));
    }

    @Test
    void testSortArray(){
        int[] unsortedArray = {6, 2, 8, 3, 9, 6};
        int[] sortedArray = {2, 3, 6, 6, 8, 9};
        assertArrayEquals(sortedArray, Main.sortArray(unsortedArray));
    }

    @Test
    void testBubbleSort(){
        int[] unsortedArray = {6, 2, 8, 3, 9, 6};
        int[] sortedArray = {2, 3, 6, 6, 8, 9};
        assertArrayEquals(sortedArray, Main.bubbleSort(unsortedArray));
    }

    @Test
    void testSplitString(){
        String unsplitString = "dies, ist ein,test";
        String[] splitStrings = {"dies", " ist ein", "test"};
        assertArrayEquals(splitStrings, Main.splitString(unsplitString));
    }

    @ParameterizedTest
    @CsvSource({"0,0", "5,5", "-7,7", "12345,15", "-9876,30"})
    void testCheckSum(int input, int expected){
        assertEquals(expected, Main.checksum(input));
    }

    @ParameterizedTest
    @CsvSource({"1,I", "23,XXIII", "4,IV", "9,IX", "14,XIV", "100,C", "99,XCIX", "44,XLIV", "58,LVIII"})
    void testRomanNumber(int input, String expected){
        assertEquals(expected, Main.romanNumber(input));
    }
}