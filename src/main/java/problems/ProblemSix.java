package problems;

public class ProblemSix {
    
    /**
     * Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), 
     * find the minimum number of rooms required. 
     * For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
     * 
     * @param schedule
     * @return number of rooms needed
     */
    public int answer (int[][] schedule){
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

    private boolean isBetweenRange(int[] range, int[] classSchedule){
        boolean resultOne = classSchedule[0] < range[1] || classSchedule[1] < range[0];
        boolean resultTwo = classSchedule[0] > range[1] || classSchedule[1] > range[0];
        return  resultOne && resultTwo;
    }
}
