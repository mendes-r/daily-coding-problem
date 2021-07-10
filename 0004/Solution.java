import static java.lang.Math.*;

import java.util.Arrays;

public class Solution {

    /**
     * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
     * For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
     * You can assume that the messages are decodable. For example, '001' is not allowed.
     * 
     * @param args
     */
    public static void main (String[] args){
        int[] codeOne = {1, 1, 1, 2};
        System.out.println("For " + Arrays.toString(codeOne) + " the answer should be 5: " + answer(codeOne));

        int[] codeTwo = {1, 1, 1};
        System.out.println("For " + Arrays.toString(codeTwo) + " the answer should be 3: " + answer(codeTwo));

        int[] codeThree = {7, 2, 9, 1};
        System.out.println("For " + Arrays.toString(codeThree) + " the answer should be 1: " + answer(codeThree));
    }

    public static int answer (int[] code){
        //start with one because all "single digit" number is a given possibility
        int result = 1;

        result += findCombinations(code);
        return result;
    }

    private static double findCombinations(int[] array){
        return findCombinationsStartingWithIndex(array, 0) + findCombinationsStartingWithIndex(array, 1);
    }

    /**
     * Finds the number of all possible combinations in an array given that all numbers from 1 to 26 are valid.
     * Example [1, 1, 1]: "1, 1, 1"; "11, 1" and "1, 11" are possible combinations because 11 is lower than 26, but "111" is higher than 26
     * 
     * @param array
     * @param index
     * @return
     */
    private static double findCombinationsStartingWithIndex (int[] array, int index){
        //number of letters in the alphabet
        final int RANGE = 26;
        int arrayLength = array.length;
        int doubleDigitNumber = 0;

        for (int i = index; i < arrayLength - 1; i++){
            if ((array[i]*10 + array[i+1]) <= RANGE){
                doubleDigitNumber ++;
                //next integer is the unit of the double digit number
                //so we pass to the next index
                i ++; 
            }
        }
        return pow(2, doubleDigitNumber) - 1;
    }
    
}
