package survey;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class SurveyTest {
        private Survey survey;
        @BeforeEach
        public void test_the_survey_array(){
            survey = new Survey();
        }
        @Test
        public void test_the_survey_array_length(){
            assertEquals(5, survey.topics_length());
        }
        @Test
        public void test_the_survey_array_is_not_empty(){
            assertEquals("social", survey.issues("0"));
        }
        @Test
        public void test_the_response_array_length(){
            int[] expected = {5,10};
            assertArrayEquals(expected,survey.responses_length());

        }
        @Test
        @DisplayName("counting the how many times a specific rate is entered")
        public void test_the_response_array_is_counting_feedback(){
            survey.increasRating(1,5);
            survey.increasRating(1,5);
            int firstResponse = survey.getTable(1,5);
            survey.increasRating(2,5);
            int secondResponse = survey.getTable(2,5);

            assertEquals(2,firstResponse);
            assertEquals(1,secondResponse);



        }



    }


