public class Solution {

    /**
     * Given a list of numbers and a number k, 
     * return whether any two numbers from the list add up to k.
     * 
     * @param args
     */
    public static void main (String[] args){
        int[] array = {10, 15, 3, 7};
        int sum = 17;

        boolean resultOne = answerOne(array, sum);

        System.out.println("Result from method #1: " + resultOne);
    }

    private static boolean answerOne(int[] array, int sum){
        boolean flag = false;

        for(int i = 0; i < array.length; i++ ){
           for(int j = i+1; j < array.length; j++){
                if((array[i]+array[j]) == sum){
                    flag = true;
                    break;
                }
           }
        }
        return flag;
    }
}