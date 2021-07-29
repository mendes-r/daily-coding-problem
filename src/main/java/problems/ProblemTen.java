package problems;

public class ProblemTen {

    /**
     * Using a function rand5() that returns an integer from 1 to 5 (inclusive) 
     * with uniform probability, implement a function rand7() 
     * that returns an integer from 1 to 7 (inclusive).
     * 
     * @return an integer between 1 and 7
     */
    public int rand7(){
        int number = 21;
        while (number >= 21) number = 5 * rand5() + rand5() - 5;
        return (number % 7) + 1;
    }

    private int rand5(){
        int number = (int) (Math.random() * 5);
        return number + 1;
    }
    
}
