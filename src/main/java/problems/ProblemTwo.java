package problems;

public class ProblemTwo {
    
    /**
     * Given an array of integers, return a new array such that each element at index i
     * of the new array is the product of all the numbers in the original array 
     * except the one at i.
     * 
     * @param array
     * @return
     */
    public int[] answer(int[] array){
        int[] resultArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            int result = 1;
            for(int j = 0; j < array.length; j++){
                if(j != i){
                    result *= array[j]; 
                }
            }
            resultArray[i] = result;
        }
        return resultArray;
    }
}
