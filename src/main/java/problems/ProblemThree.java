package problems;

public class ProblemThree {
 
    /**
     * Given an array of integers, find the first missing positive integer in linear time and constant space. 
     * In other words, find the lowest positive integer that does not exist in the array. 
     * The array can contain duplicates and negative numbers as well.
     * 
     * @param array giver integers
     * @return integer with solution
     */
    public int answer(int[] array){
        int arrayLength = array.length;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < arrayLength; i++){
            int intMinusOne = array[i] - 1;
            int intPlusOne = array[i] + 1;

            if (intMinusOne > 0 && array[i] != result){
                if (intMinusOne < result) {
                    result = intMinusOne;
                }
            } else if (array[i] > 0){
                result = intPlusOne;
            }
        }
        return result;
    }
    
}
