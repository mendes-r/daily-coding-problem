package problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemElevenTest {
    
    @Test
    public void just_one_cell_live(){
        //arrange
        int steps = 1;
        int[][] liveCell = {{1,1}};
        ProblemEleven problemEleven = new ProblemEleven();
        boolean[][] expected = {{false}};
        //act
        boolean[][] result = problemEleven.conwayGame(liveCell, steps);
        //assert
        assertEquals(expected.length, result.length);
        for(int i = 0; i < result.length; i++){
            assertEquals(expected[i].length, result[i].length);
            for(int j = 0; j < result[i].length; j++){
                assertEquals(expected[i][j], result[i][j]);
            }
        }
    }

    @Test
    public void replicator_returns_to_same_config(){
        //arrange
        int steps = 4;
        int[][] liveCell = {{0,1}, {1,2}, {2,0}, {2,1}, {2,2}};
        ProblemEleven problemEleven = new ProblemEleven();
        boolean[][] expected = {
            {false, false, false, false, false},
            {false, false, true, false, false},
            {false, false, false, true, false},
            {false, true, true, true, false},
            {false, false, false, false, false},
        };
        //act
        boolean[][] result = problemEleven.conwayGame(liveCell, steps);
        //assert
        assertEquals(expected.length, result.length);
        for(int i = 0; i < result.length; i++){
            assertEquals(expected[i].length, result[i].length);
            for(int j = 0; j < result[i].length; j++){
                assertEquals(expected[i][j], result[i][j]);
            }
        }
    }

    @Test
    public void replicator_after_one_step(){
        //arrange
        int steps = 1;
        int[][] liveCell = {{0,1}, {1,2}, {2,0}, {2,1}, {2,2}};
        ProblemEleven problemEleven = new ProblemEleven();
        boolean[][] expected = {
            {false, false, false, false, false},
            {false, true, false, true, false},
            {false, false, true, true, false},
            {false, false, true, false, false},
            {false, false, false, false, false},
        };
        //act
        boolean[][] result = problemEleven.conwayGame(liveCell, steps);
        //assert
        assertEquals(expected.length, result.length);
        for(int i = 0; i < result.length; i++){
            assertEquals(expected[i].length, result[i].length);
            for(int j = 0; j < result[i].length; j++){
                assertEquals(expected[i][j], result[i][j]);
            }
        }
    }

    @Test
    public void replicator_after_two_steps(){
        //arrange
        int steps = 2;
        int[][] liveCell = {{0,0}, {0,1}, {0,2}, {1,0}, {1,2}, {2,0}, {2,1}, {2,2}, {0,6}, {0,7}, {0,8}, {1,6}, {1,8}, {2,6}, {2,7}, {2,8}};
        ProblemEleven problemEleven = new ProblemEleven();
        boolean[][] expected = {
            {false, false, false, false, false, false, false, false, false, false, false, false, false},
            {false, false, false, true, false, false, false, false, false, true, false, false, false},
            {false, false, true, true, true, false, false, false, true, true, true, false, false},
            {false, true, true, false, true, true, false, true, true, false, true, true, false},
            {false, false, true, true, true, false, false, false, true, true, true, false, false},
            {false, false, false, true, false, false, false, false, false, true, false, false, false},
            {false, false, false, false, false, false, false, false, false, false, false, false, false}
        };
        //act
        boolean[][] result = problemEleven.conwayGame(liveCell, steps);
        //assert
        assertEquals(expected.length, result.length);
        for(int i = 0; i < result.length; i++){
            assertEquals(expected[i].length, result[i].length);
            for(int j = 0; j < result[i].length; j++){
                assertEquals(expected[i][j], result[i][j]);
            }
        }
    }
}
