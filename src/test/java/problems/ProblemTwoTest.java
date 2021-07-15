package problems;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProblemTwoTest {
    
    @Test
    public void newArraySuccessful(){
        //arrange
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {120, 60, 40, 30, 24};
        //act
        ProblemTwo problemTwo = new ProblemTwo();
        int[] result = problemTwo.answer(array);
        //assert
        assertArrayEquals(expected, result);
    }
}
