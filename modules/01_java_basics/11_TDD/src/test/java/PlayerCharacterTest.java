import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void testGetX_InitialPosition() {
        assertEquals(0,PlayerCharacter.getX());
    }


}