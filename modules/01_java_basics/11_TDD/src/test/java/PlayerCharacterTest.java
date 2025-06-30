import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void testGetX_InitialPosition() {
        assertEquals(0,PlayerCharacter.getX());
    }

    @Test
    void testGetY_InitialPosition() {
        assertEquals(0,PlayerCharacter.getY());
    }

    @Test
    void testMoveW() {
        int[] expected = {0,1};
        assertArrayEquals(expected, PlayerCharacter.moveW());
    }

    @Test
    void testMoveS() {
        int[] expected = {0,-1};
        assertArrayEquals(expected, PlayerCharacter.moveS());
    }


    @Test
    void testMoveD() {
        int[] expected = {1,0};
        assertArrayEquals(expected, PlayerCharacter.moveD());
    }

    @Test
    void testMoveA() {
        int[] expected = {-1,0};
        assertArrayEquals(expected, PlayerCharacter.moveA());
    }


}