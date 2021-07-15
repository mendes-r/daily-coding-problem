package problems;

public class ProblemOne {

    /**
     * Given a list of numbers and a number k,
     * return whether any two numbers from the list add up to k.
     *
     * @param array of integers
     * @param k - the end sum
     * @return boolean, true if a sum is possible
     */
    public boolean answer(int[] array, int k){
        boolean flag = false;

        for(int i = 0; i < array.length; i++ ){
           for(int j = i+1; j < array.length; j++){
                if((array[i]+array[j]) == k){
                    flag = true;
                    break;
                }
           }
        }
        return flag;
    }
}