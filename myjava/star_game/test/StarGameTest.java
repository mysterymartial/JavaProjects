import game.StarGame;
import org.junit.jupiter.api.Test;

import static game.StarGame.starArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StarGameTest {
    @Test
    public void testStarGameArray() {

        int[] [] input = {{1,0,1},{1,1,0,},{0,1,0}};
        String [] [] output = {{"*"," ","*"},{"*","*"," "},{" ","*"," "}};
        assertArrayEquals(output, starArray(input) );



    }
    @Test
    public void testThatTheArrayLengthMustNotBeMustNotBeGreaterThanThree() {
        int[][] input = {{1,0,1,0,0},{1,1,0,0,1},{1,1,0,0,1},{1,1,0,0,1}};
        assertThrows(IllegalArgumentException.class, () -> starArray(input));

    }



}
