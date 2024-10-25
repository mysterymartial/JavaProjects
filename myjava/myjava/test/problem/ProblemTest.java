package problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class PersonTest {
        Person person;
        @BeforeEach
        public void testSetup() {
            person = new Person();
        }
        @Test
        public void testaddProblem() {
            assertEquals(1,person.addProblem("hunger",Type.FINACIAL));
        }
        @Test
        public void testSolvedProblem() {
            Problem solvedprobs = person.solve("hunger",Type.FINACIAL,"isSolved");
            assertEquals(solvedprobs,person.solvedSize());
        }
    }


