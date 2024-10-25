package country;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static country.NorthEast.*;
import static org.junit.jupiter.api.Assertions.*;

    public class GeoPoliticalTest {
        private GeoPolitical area;
        @BeforeEach
        public void testGeoPolitical() {
            area = new GeoPolitical();


        }

        @Test
        public void testGetStateInGeopolitical_Zone() {
            area.setgeopolitical_Zone("NorthEast");
            assertArrayEquals(new NorthEast[]{BORNO, YOBE, ADAMAWA, TARABA, GOMBE, BAUCHI},area.getState("NorthEast"));

        }
        @Test
        public void testExpectionIfWrongStateEntered() {
            area.setgeopolitical_Zone("NorthEast");
            assertThrows(IllegalArgumentException.class, () -> area.getState("NorthNorth"));
        }
    }



