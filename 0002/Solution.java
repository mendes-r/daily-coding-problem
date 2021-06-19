import java.util.Arrays;

public class Solution {
    
    /**
     * Given an array of integers, return a new array such that each element at index i
     * of the new array is the product of all the numbers in the original array 
     * except the one at i.
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5};
        int[] solution = {120, 60, 40, 30, 24};

        int[] resultArrayOne = answerOne(array);
        boolean equal = Arrays.equals(solution, resultArrayOne);

        System.out.println("Result from method #1: " + Arrays.toString(resultArrayOne) + " <- " + equal);
    
    }

    private static int[] answerOne(int[] array){
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
