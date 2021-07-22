package problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class ProblemNineTest {
    
    @Test
    public void getPowerSetFromSetOne(){
        //arrange
        int[] set = {1, 2, 3};
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        ArrayList<Integer> subSet0 = new ArrayList<>();
        ArrayList<Integer> subSet1 = new ArrayList<>();
        subSet1.add(1);
        ArrayList<Integer> subSet2 = new ArrayList<>();
        subSet2.add(2);
        ArrayList<Integer> subSet3 = new ArrayList<>();
        subSet3.add(3);
        ArrayList<Integer> subSet4 = new ArrayList<>();
        subSet4.add(1);
        subSet4.add(2);
        ArrayList<Integer> subSet5 = new ArrayList<>();
        subSet5.add(1);
        subSet5.add(3);
        ArrayList<Integer> subSet6 = new ArrayList<>();
        subSet6.add(2);
        subSet6.add(3);
        ArrayList<Integer> subSet7 = new ArrayList<>();
        subSet7.add(1);
        subSet7.add(2);
        subSet7.add(3);
        
        expected.add(subSet0);
        expected.add(subSet1);
        expected.add(subSet2);
        expected.add(subSet3);
        expected.add(subSet4);
        expected.add(subSet5);
        expected.add(subSet6);
        expected.add(subSet7);

        ProblemNine problemNine = new ProblemNine();
        //act
        ArrayList<ArrayList<Integer>> result = problemNine.answer(set);
        //assert
        assertEquals(expected.size(), result.size());

        for(int i = 0; i < result.size(); i++){
            assertTrue(expected.contains(result.get(i)));
        }
    }
}
