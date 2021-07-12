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

        int[] codeThree = {1, 2, 1, 2, 1, 2};
        System.out.println("For " + Arrays.toString(codeThree) + " the answer should be 13: " + answer(codeThree));
    }

    public static int answer (int[] code){
        return allCombinations(code, 0);
    }

    private static int allCombinations(int[] code, int index){
        final int RANGE = 26;
        int result = 0;
        int codeSize = code.length;
        //base case
        if (index >= codeSize){
            return 1;
        }
        //first two digits give a number smaller than RANGE
        if (index < (codeSize - 1) && ((code[index] * 10) + code[index + 1]) <= RANGE){
            result += allCombinations(code, index + 2);
        }
        //second and third digits give a number smaller than RANGE
        if (index < (codeSize - 2) && ((code[index + 1] * 10) + code[index + 2]) <= RANGE){
            result += allCombinations(code, index + 3);
        }  
        //or jump two digits
        return (result += allCombinations(code, index + 2));
    }
    
}
