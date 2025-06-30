import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void testGetX_InitialPosition() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        assertEquals(0,PlayerCharacter.getX());
    }

    @Test
    void testGetY_InitialPosition() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        assertEquals(0,PlayerCharacter.getY());
    }

    @Test
    void testMoveW_fromStartPosition() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        int[] expected = {0,1};
        assertArrayEquals(expected, PlayerCharacter.moveW());
    }

    @ParameterizedTest
    @MethodSource("moveWProvider")
    void testMoveW_fromOtherPosition(int[] given, int[] expected) {
        PlayerCharacter.x = given[0];
        PlayerCharacter.y = given[1];
        assertArrayEquals(expected, PlayerCharacter.moveW());
    }

    static Stream<Arguments> moveWProvider() {
        return Stream.of(
                Arguments.of(new int[]{0, 0}, new int[]{0, 1}),
                Arguments.of(new int[]{2, 3}, new int[]{2, 4}),
                Arguments.of(new int[]{-1, -1}, new int[]{-1, 0})
        );
    }

    @Test
    void testMoveS_fromStartPosition() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        int[] expected = {0,-1};
        assertArrayEquals(expected, PlayerCharacter.moveS());
    }

    @ParameterizedTest
    @MethodSource("moveSProvider")
    void testMoveS_fromOtherPosition(int[] given, int[] expected) {
        PlayerCharacter.x = given[0];
        PlayerCharacter.y = given[1];
        assertArrayEquals(expected, PlayerCharacter.moveS());
    }

    static Stream<Arguments> moveSProvider() {
        return Stream.of(
                Arguments.of(new int[]{0, 0}, new int[]{0, -1}),
                Arguments.of(new int[]{2, 3}, new int[]{2, 2}),
                Arguments.of(new int[]{-1, -1}, new int[]{-1, -2})
        );
    }


    @Test
    void testMoveD_fromStartPosition() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        int[] expected = {1,0};
        assertArrayEquals(expected, PlayerCharacter.moveD());
    }

    @ParameterizedTest
    @MethodSource("moveDProvider")
    void testMoveD_fromOtherPosition(int[] given, int[] expected) {
        PlayerCharacter.x = given[0];
        PlayerCharacter.y = given[1];
        assertArrayEquals(expected, PlayerCharacter.moveD());
    }

    static Stream<Arguments> moveDProvider() {
        return Stream.of(
                Arguments.of(new int[]{0, 0}, new int[]{1, 0}),
                Arguments.of(new int[]{2, 3}, new int[]{3, 3}),
                Arguments.of(new int[]{-1, -1}, new int[]{0, -1})
        );
    }

    @Test
    void testMoveA_fromStartPosition() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        int[] expected = {-1,0};
        assertArrayEquals(expected, PlayerCharacter.moveA());
    }

    @ParameterizedTest
    @MethodSource("moveAProvider")
    void testMoveA_fromOtherPosition(int[] given, int[] expected) {
        PlayerCharacter.x = given[0];
        PlayerCharacter.y = given[1];
        assertArrayEquals(expected, PlayerCharacter.moveA());
    }

    static Stream<Arguments> moveAProvider() {
        return Stream.of(
                Arguments.of(new int[]{0, 0}, new int[]{-1, 0}),
                Arguments.of(new int[]{2, 3}, new int[]{1, 3}),
                Arguments.of(new int[]{-1, -1}, new int[]{-2, -1})
        );
    }


}