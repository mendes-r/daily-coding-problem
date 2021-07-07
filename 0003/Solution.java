public class Solution {

    /**
     * Given an array of integers, find the first missing positive integer in linear time and constant space. 
     * In other words, find the lowest positive integer that does not exist in the array. 
     * The array can contain duplicates and negative numbers as well.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] arrayOne = {3, 4, -1, 1};
        int[] arrayTwo = {1, 2, 0};
        int[] arrayThree = {4, 5, 1};

        int solutionOne = 2;
        int solutionTwo = 3;
        int solutionThree = 2;

        int resultArrayOne = answer(arrayOne);
        int resultArrayTwo = answer(arrayTwo);
        int resultArrayThree = answer(arrayThree);
        
        System.out.println("Solution to array one is " + (solutionOne == resultArrayOne));
        System.out.println("result: " + resultArrayOne + ", solution: " + solutionOne + "\n");
        System.out.println("Solution to array two is " + (solutionTwo == resultArrayTwo));
        System.out.println("result: " + resultArrayTwo + ", solution: " + solutionTwo + "\n");
        System.out.println("Solution to array three is " + (solutionThree == resultArrayThree));
        System.out.println("result: " + resultArrayThree + ", solution: " + solutionThree + "\n");
    }

    private static int answer(int[] array){
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
