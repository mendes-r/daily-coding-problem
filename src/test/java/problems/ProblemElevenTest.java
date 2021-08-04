package problems;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProblemElevenTest {
    
    @Test
    public void just_one_cell_live(){
        //arrange
        int steps = 1;
        int[][] liveCell = {{1,1}};
        ProblemEleven problemEleven = new ProblemEleven();
        boolean[][] expected = {{false, false, false}, {false, false, false}, {false, false, false}};
        //act
        boolean[][] result = problemEleven.conwayGame(liveCell, steps);
        //assert
        assertEquals(expected.length, result.length);
        for(int i = 0; i < result.length; i++){
            assertEquals(expected[i], result[i]);
            for(int j = 0; j < result[i].length; j++){
                assertEquals(expected[i][j], result[i][j]);
            }
        }

    }
}
