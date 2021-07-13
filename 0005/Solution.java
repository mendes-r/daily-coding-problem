import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main (String[] args){
        String bracketsOne = "([])[]({})";
        String bracketsTwo = "([)]";

        System.out.println("Are this brackets - " + bracketsOne + " - well formed: " + answer(bracketsOne));
        System.out.println("Are this brackets - " + bracketsTwo + " - well formed: " + answer(bracketsTwo));
    }

    /**
     * Given a string of round, curly, and square open and closing brackets, 
     * return whether the brackets are balanced (well-formed).
     * 
     * @param brackets
     * @return
     */
    public static boolean answer(String brackets){
        char[] bracketsString = brackets.toCharArray();
        int stringSize = bracketsString.length;
        List<Character> checkList = new ArrayList<>();
        //start with something to check... in this case is the first char in the array
        checkList.add(bracketsString[0]);
        //solution needs allway to iterate through all the elements of the array
        for (int i = 1; i < stringSize; i++){
            if (getLastElement(checkList) == invertBracket(bracketsString[i])){
                removeLastElement(checkList);
            } else {
                checkList.add(bracketsString[i]);
            } 
        }
        return checkList.isEmpty();
    }
    
    private static char getLastElement(List<Character> list){
        if(list.isEmpty()){
            return ' ';
        }
        return list.get(list.size() - 1);
    }

    private static char removeLastElement(List<Character> list){
        return list.remove(list.size() - 1);
    }

    private static char invertBracket(char bracket){
        switch (bracket) {
            case '(':
                return ')';
            case ')':
                return '(';
            case '{':
                return '}';
            case '}':
                return '{';
            case '[':
                return ']';
            case ']':
                return '[';
            default:
                throw new IllegalArgumentException();
        }
    }
}
