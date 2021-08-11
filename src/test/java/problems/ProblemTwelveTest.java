package problems;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ProblemTwelveTest {

    @Test
    public void sentence_divided_in_five_parts(){
        //arrange
        int k = 10;
        String s = "the quick brown fox jumps over the lazy dog";
        ProblemTwelve problemTwelve = new ProblemTwelve();
        String[] expected = {"the quick", "brown fox", "jumps over", "the lazy", "dog"};

        //act
        String[] result = problemTwelve.answer(s, k);

        //assert
        assertEquals(expected.length, result.length);
        assertArrayEquals(expected, result);
    }

    @Test
    public void sentence_division_not_possible(){
        //arrange
        int k = 10;
        String s = "the quick brown superhiperfox jumps over the lazy dog";
        ProblemTwelve problemTwelve = new ProblemTwelve();

        //act
        String[] result = problemTwelve.answer(s, k);

        //assert
        assertNull(result);
    }

    @Test
    public void sentence_division_not_possible_because_of_last_word(){
        //arrange
        int k = 10;
        String s = "the quick brown superhiperfox";
        ProblemTwelve problemTwelve = new ProblemTwelve();

        //act
        String[] result = problemTwelve.answer(s, k);

        //assert
        assertNull(result);
    }
    
}
