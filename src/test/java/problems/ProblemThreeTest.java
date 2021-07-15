package problems;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProblemThreeTest {
    
    @Test
    public void solutionToArrayOne(){
        //arrange
        int[] array = {3, 4, -1, 1};
        int expected = 2;
        //act
        ProblemThree problemThree = new ProblemThree();
        int result = problemThree.answer(array);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void solutionToArrayTwo(){
        //arrange
        int[] array = {1, 2, 0};
        int expected = 3;
        //act
        ProblemThree problemThree = new ProblemThree();
        int result = problemThree.answer(array);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void solutionToArrayThree(){
        //arrange
        int[] array = {4, 5, 1};
        int expected = 2;
        //act
        ProblemThree problemThree = new ProblemThree();
        int result = problemThree.answer(array);
        //assert
        assertEquals(expected, result);
    }
}
