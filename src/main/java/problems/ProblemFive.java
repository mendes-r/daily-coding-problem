package problems;

import java.util.ArrayList;
import java.util.List;

public class ProblemFive {

    /**
     * Given a string of round, curly, and square open and closing brackets, 
     * return whether the brackets are balanced (well-formed).
     * 
     * @param brackets
     * @return
     */
    public boolean answer(String brackets){
        char[] bracketsString = brackets.toCharArray();
        int stringSize = bracketsString.length;
        List<Character> checkList = new ArrayList<>();
        //start with something to check... in this case is the first char in the array
        checkList.add(bracketsString[0]);
        //solution needs always to iterate through all the elements of the array
        for (int i = 1; i < stringSize; i++){
            if (getLastElement(checkList) == invertBracket(bracketsString[i])){
                removeLastElement(checkList);
            } else {
                checkList.add(bracketsString[i]);
            } 
        }
        return checkList.isEmpty();
    }
    
    private char getLastElement(List<Character> list){
        if(list.isEmpty()){
            return ' ';
        }
        return list.get(list.size() - 1);
    }

    private char removeLastElement(List<Character> list){
        return list.remove(list.size() - 1);
    }

    private char invertBracket(char bracket){
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
