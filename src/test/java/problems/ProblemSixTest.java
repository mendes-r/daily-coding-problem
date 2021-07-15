package problems;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProblemSixTest {
    
    @Test
    public void numberOfRoomsForScheduleOne(){
        //arrange
        int[][] schedule = {{30, 75}, {0, 50}, {60, 150}};
        int expected = 2;
        //act
        ProblemSix problemSix = new ProblemSix();
        int result = problemSix.answer(schedule);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void numberOfRoomsForScheduleTwo(){
        //arrange
        int[][] schedule = {{30, 75}, {0, 50}};
        int expected = 2;
        //act
        ProblemSix problemSix = new ProblemSix();
        int result = problemSix.answer(schedule);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void numberOfRoomsForScheduleFour(){
        //arrange
        int[][] schedule = {{80, 150}, {30, 75}};
        int expected = 1;
        //act
        ProblemSix problemSix = new ProblemSix();
        int result = problemSix.answer(schedule);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void numberOfRoomsForScheduleFive(){
        //arrange
        int[][] schedule = {{0, 50}, {30, 75}};
        int expected = 2;
        //act
        ProblemSix problemSix = new ProblemSix();
        int result = problemSix.answer(schedule);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void numberOfRoomsForScheduleSix(){
        //arrange
        int[][] schedule = {{0, 50}, {30, 75}, {60, 150}};
        int expected = 2;
        //act
        ProblemSix problemSix = new ProblemSix();
        int result = problemSix.answer(schedule);
        //assert
        assertEquals(expected, result);
    }

    @Test
    public void numberOfRoomsForScheduleSeven(){
        //arrange
        int[][] schedule = {{30, 75}, {0, 50}, {100, 200}, {60, 150}};
        int expected = 3;
        //act
        ProblemSix problemSix = new ProblemSix();
        int result = problemSix.answer(schedule);
        //assert
        assertEquals(expected, result);
    }
}
