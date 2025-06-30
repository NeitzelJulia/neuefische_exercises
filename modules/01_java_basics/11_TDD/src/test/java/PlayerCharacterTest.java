import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void testGetX_InitialPosition() {
        assertEquals(0,PlayerCharacter.getX());
    }

    @Test
    void testGetY_InitialPosition() {
        assertEquals(0,PlayerCharacter.getX());
    }

    @Test
    void testMoveW() {
        int[] expected = {0,1};
        assertArrayEquals(expected, PlayerCharacter.moveW());
    }


}