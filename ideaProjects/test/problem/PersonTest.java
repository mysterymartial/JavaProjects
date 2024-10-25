package problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static problem.Type.FINACIAL;

    public class ProblemTest {
        private Problem problem;
        @BeforeEach
        public void setProblemtest() {
            problem = new Problem(FINACIAL,"hunger","isSolved");



        }
        @Test
        public void testSetProblemName() {
            assertThrows(IllegalArgumentException.class, () -> {problem.setName("123");},"enter only letters");
        }
        @Test
        public void testgetProblemName() {
            assertEquals("hunger", problem.getName());
        }
        @Test
        public void testSetProblemType() {
            assertEquals(FINACIAL,problem.getType());
        }
        @Test
        public void testIsSolvedMethod() {
            assertEquals(true, problem.setIsSolved("yes"));
        }
        @Test
        public void testAddAProblem() {
            assertEquals(problem.addProblem("hunger",FINACIAL), problem.addProblem("hunger",FINACIAL));
        }




    }


