package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemSevenTest {

    @Test
    public void testOne() {
        //arrange
        int[] array = {2, 1, 2};
        int expected = 1;
        //act
        ProblemSeven problemSeven = new ProblemSeven();
        int result = problemSeven.answer(array);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testTwo() {
        //arrange
        int[] array = {2, 1, 3, 0, 5};
        int expected = 4;
        //act
        ProblemSeven problemSeven = new ProblemSeven();
        int result = problemSeven.answer(array);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testThree() {
        //arrange
        int[] array = {2, 4, 2, 1, 0};
        int expected = 0;
        //act
        ProblemSeven problemSeven = new ProblemSeven();
        int result = problemSeven.answer(array);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testFour() {
        //arrange
        int[] array = {0, 0, 0};
        int expected = 0;
        //act
        ProblemSeven problemSeven = new ProblemSeven();
        int result = problemSeven.answer(array);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void testFive() {
        //arrange
        int[] array = {4, 0, 3, 2};
        int expected = 3;
        //act
        ProblemSeven problemSeven = new ProblemSeven();
        int result = problemSeven.answer(array);
        //assert
        assertEquals(expected, result);
    }
    
}
