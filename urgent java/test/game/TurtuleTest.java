package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TurtuleTest {
    @Test
    public void testPenIsUp() {
        Turtule turtule = new Turtule();
        assertTrue(turtule.penIsUp());

    }
    @Test
    public void testPenIsDown(){
        Turtule turtule = new Turtule();
        assertTrue(turtule.penIsUp());
        turtule.penState();
        assertFalse(turtule.penIsUp());
    }
    @Test
    public void testPenIsUpAfterPenBeingDown(){
        Turtule turtule = new Turtule();
        assertTrue(turtule.penIsUp());
        turtule.penState();
        assertFalse(turtule.penIsUp());
        turtule.penState();
        assertTrue(turtule.penIsUp());
    }
}
