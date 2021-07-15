package problems;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProblemFourTest {
    
    @Test
    public void solutionsToCodeOne(){
        //arrange
        int[] codeOne = {1, 1, 1, 2};
        int expected = 5;
        //act
        ProblemFour problemFour = new ProblemFour();
        int result = problemFour.answer(codeOne);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void solutionsToCodeTwo(){
        //arrange
        int[] codeTwo = {1, 1, 1};
        int expected = 3;
        //act
        ProblemFour problemFour = new ProblemFour();
        int result = problemFour.answer(codeTwo);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void solutionsToCodeThree(){
        //arrange
        int[] codeThree = {1, 2, 1, 2, 1, 2};
        int expected = 13;
        //act
        ProblemFour problemFour = new ProblemFour();
        int result = problemFour.answer(codeThree);
        //assert
        assertEquals(expected, result);
    }
}
