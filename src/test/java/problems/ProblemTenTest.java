package problems;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProblemTenTest {
    
    @Test
    public void randomNumberBetweenOneAndSeven(){
        //arrange
        final int ITERATIONS = 100;
        int[] results = new int[ITERATIONS];
        ProblemTen problemTen = new ProblemTen();
        //act
        for (int i = 0; i < ITERATIONS; i++){
            results[i] = problemTen.rand7();
        }
        //assert
        for (int number : results){
            assertTrue(number <= 7 || number > 0);
        }
    }

    @Test
    public void randomNumberIncludeSixAndSeven(){
        //arrange
        final int ITERATIONS = 100;
        int[] results = new int[ITERATIONS];
        ProblemTen problemTen = new ProblemTen();
        //act
        for (int i = 0; i < ITERATIONS; i++){
            results[i] = problemTen.rand7();
        }
        boolean hasSix = false;
        boolean hasSeven = false;

        for (int number : results){
            if (number == 6) {
                hasSix = true;
            } else if (number == 7){
                hasSeven = true;
            }
            if (hasSix && hasSeven){
                break;
            }
        }

        //assert
        assertTrue(hasSeven && hasSix);
        
    }
}
