package problems;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProblemOneTest {

    @Test
    public void sumIsPossible() {
        //arrange
        int[] array = {10, 15, 3, 7};
        int sum = 17;
        ProblemOne problemOne = new ProblemOne();
        //act
        boolean result = problemOne.answer(array, sum);
        //assert
        assertTrue(result);
    }

     @Test
    public void sumIsNotPossible() {
        //arrange
        int[] array = {10, 15, 3, 6};
        int sum = 17;
        ProblemOne problemOne = new ProblemOne();
        //act
        boolean result = problemOne.answer(array, sum);
        //assert
        assertFalse(result);
    }

    @Test
    public void sumIsNotPossibleSingleElementArray() {
        //arrange
        int[] array = {10};
        int sum = 17;
        ProblemOne problemOne = new ProblemOne();
        //act
        boolean result = problemOne.answer(array, sum);
        //assert
        assertFalse(result);
    }

    @Test
    public void sumIsNotPossibleSingleElementArrayButCorrect() {
        //arrange
        int[] array = {10};
        int sum = 10;
        ProblemOne problemOne = new ProblemOne();
        //act
        boolean result = problemOne.answer(array, sum);
        //assert
        assertFalse(result);
    } 

}
