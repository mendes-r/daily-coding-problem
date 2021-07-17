package problems;

public class ProblemSeven {

    /**
     * You are given an array of non-negative integers that represents a two-dimensional elevation map where
     * each element is unit-width wall and the integer is the height.
     * Suppose it will rain and all spots between two walls get filled up.
     * Compute how many units of water remain trapped on the map in O(N) time and O(1) space.
     * For example, given the input [2, 1, 2], we can hold 1 unit of water in the middle.
     *
     * @return
     */
    public int answer(int[] array){
        int arraySize = array.length;
        int result = 0;
        int tempResult = 0;
        int tempLevel = 0;
        boolean flag = true;
        for (int i = 0; i < arraySize - 1; i++){
            if (flag) tempLevel = array[i];
            int difference = tempLevel - array[i+1];
            if(difference > 0){
                //store result temporary
                tempResult += difference;
                //and maintain tempLevel
                flag = false;
            } else {
                //a vessel is identified
                //now we can store the result
                result += tempResult;
                tempResult = 0;
                flag = true;  
            }
        } 
        return result;
    }
}