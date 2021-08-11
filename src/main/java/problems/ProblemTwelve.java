package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class ProblemTwelve {

    public static void main(String[] args) {
        String phrase = "the quick brown fox jumps over the lazy dog";
        ProblemTwelve problemTwelve = new ProblemTwelve();
        String[] parts = problemTwelve.answer(phrase, 10);
        System.out.println(Arrays.toString(parts));
    }
    
    /**
     * Given a string s and an integer k, 
     * break up the string into multiple lines such that each line has a length of k or less. 
     * You must break it up so that words don't break across lines. 
     * Each line has to have the maximum possible amount of words. 
     * If there's no way to break the text up, then return null.
     * 
     * @param string
     * @return
     */
    public String[] answer(String s, int k){

        ArrayList<String> result = new ArrayList<>();
        char[] array = s.toCharArray();
        int start = 0;
        int end = 0;
        int arrayLength = array.length;

        for(int i = 0; i < arrayLength; i++){
            if(array[i] == ' '){
                if((i - start) <= k){
                    end = i;
                }else {
                    // if the word as more letters than k, we return a null
                    if((end - start) <= 0) return null;
                    result.add(String.copyValueOf(array, start, end - start));
                    start = end + 1;
                }
            }
        }

        // save last possible sub-strings
        if((end - start) <= 0) return null;
        result.add(String.copyValueOf(array, start, end - start));
        start = end + 1;
        end = arrayLength;
        result.add(String.copyValueOf(array, start, end - start));
        
        return result.toArray(new String[0]);
    }

}
