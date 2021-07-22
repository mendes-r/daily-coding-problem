import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProblemEightTest {
    
    @Test
    public void getPi(){
        //arrange
        double expected = 3.14;
        double errorMargin = 0.005;
        ProblemEight problemEight = new ProblemEight();
        //act
        double result =problemEight.answer();
        //assert
        assertTrue(result > expected && result < (expected + errorMargin));
    }
}
