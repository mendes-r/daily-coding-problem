package problems;

public class ProblemSeven {

    /**
     * You are given an array of non-negative integers that represents a two-dimensional elevation map where
     * each element is unit-width wall and the integer is the height.
     * Suppose it will rain and all spots between two walls get filled up.
     * Compute how many units of water remain trapped on the map in O(N) time and O(1) space.
     * For example, given the input [2, 1, 2], we can hold 1 unit of water in the middle.
     *
     * @return
     */
    public int answer(int[] array){
        int arraySize = array.length;
        int result = 0;
        for (int i = 0; i < arraySize - 1; i++){
            int levelDrop = 0;
            int oderMargin = -1;
            while ((array[i] - levelDrop) > array[i+1] && oderMargin == -1) { 
                oderMargin = findOderMargin(array, i, array[i] - levelDrop);
                if (oderMargin > 0){
                    result += getFilling(array, i, oderMargin, array[i] - levelDrop);
                    i = oderMargin - 1; //Jump tp the next pond
                }
                levelDrop ++;
            }
        } 
        return result;
    }

    private int getFilling(int[] array, int startIndex, int endIndex, int level){
        int result = 0;
        for (int i = startIndex + 1; i < endIndex; i++){
            result += level - array[i];
        }
        return result;
    }

    private int findOderMargin(int[] array, int index, int level) {
        int arraySize = array.length;
        for (int i = index + 1; i < arraySize; i++){
            if (array[i] >= level) {
                return i;
            }
        }
        return -1;
    }
    
}