import java.util.Arrays;

public class Solution {
    
    /**
     * Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), 
     * find the minimum number of rooms required. 
     * For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
     * 
     * @param args
     */
    public static void main (String[] args){

        int[][] scheduleOne = {{30, 75}, {0, 50}, {60, 150}};
        int solutionOne = answer(scheduleOne);
        System.out.println("For this schedule - " + Arrays.deepToString(scheduleOne) + " - " + solutionOne + " room(s) needed.");
        System.out.println(solutionOne == 2);
        System.out.println();
        
        int[][] scheduleTwo = {{30, 75}, {0, 50}};
        int solutionTwo = answer(scheduleTwo);
        System.out.println("For this schedule - " + Arrays.deepToString(scheduleTwo) + " - " + solutionTwo + " room(s) needed.");
        System.out.println(solutionTwo == 2);
        System.out.println();

        int[][] scheduleThree = {{30, 75}, {80, 150}};
        int solutionThree = answer(scheduleThree);
        System.out.println("For this schedule - " + Arrays.deepToString(scheduleThree) + " - " + solutionThree + " room(s) needed.");
        System.out.println(solutionThree == 1);
        System.out.println();

        int[][] scheduleFour = {{80, 150}, {30, 75}};
        int solutionFour = answer(scheduleFour);
        System.out.println("For this schedule - " + Arrays.deepToString(scheduleFour) + " - " + solutionFour + " room(s) needed.");
        System.out.println(solutionFour == 1);
        System.out.println();

        int[][] scheduleFive = {{0, 50}, {30, 75}};
        int solutionFive = answer(scheduleFive);
        System.out.println("For this schedule - " + Arrays.deepToString(scheduleFive) + " - " + solutionFive + " room(s) needed.");
        System.out.println(solutionFive == 2);
        System.out.println();

        int[][] scheduleSix = {{0, 50}, {30, 75}, {60, 150}};
        int solutionSix = answer(scheduleSix);
        System.out.println("For this schedule - " + Arrays.deepToString(scheduleSix) + " - " + solutionSix + " room(s) needed.");
        System.out.println(solutionSix == 2);
        System.out.println();

        int[][] scheduleSeven = {{30, 75}, {0, 50}, {100, 200}, {60, 150}};
        int solutionSeven = answer(scheduleSeven);
        System.out.println("For this schedule - " + Arrays.deepToString(scheduleSeven) + " - " + solutionSeven + " room(s) needed.");
        System.out.println(solutionSeven == 3);
        System.out.println();
    }

    public static int answer (int[][] schedule){
        int numberOfClasses = schedule.length;
        //one room is always needed
        int rooms = 1;
        //see how many intersection there are between the previous ranges
        for (int i = 1; i < numberOfClasses; i++){
            int tempResult = 1;
            for (int j = 0; j < i; j++){
                if (isBetweenRange(schedule[j], schedule[i])){
                    tempResult ++;
                }
            }
            //if there are more intersection than previous, update the number of rooms. We have a new max.
            if (tempResult > rooms){
                rooms = tempResult;
            }
        }
        return rooms;
    }

    private static boolean isBetweenRange(int[] range, int[] classSchedule){
        boolean resultOne = classSchedule[0] < range[1] || classSchedule[1] < range[0];
        boolean resultTwo = classSchedule[0] > range[1] || classSchedule[1] > range[0];
        return  resultOne && resultTwo;
    }
}
