package problems;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProblemFiveTest {
    
    @Test
    public void wellFormed(){
        //arrange
        String brackets = "([])[]({})";
        //act
        ProblemFive problemFive = new ProblemFive();
        boolean result = problemFive.answer(brackets);
        //assert
        assertTrue(result);
    }

    @Test
    public void notWellFormed(){
        //arrange
        String brackets = "([)]";
        //act
        ProblemFive problemFive = new ProblemFive();
        boolean result = problemFive.answer(brackets);
        //assert
        assertFalse(result);
    }
}
