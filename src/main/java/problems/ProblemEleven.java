package problems;

public class ProblemEleven {
    
    /**
     * Implement Conway's Game of Life.
     * It should be able to be initialized with a starting list of live cell coordinates and the number of steps it should run for. 
     * Once initialized, it should print out the board state at each step. Since it's an infinite board, print out only the relevant coordinates.
     * 
     * @param liveCells location of the living cells in the matrix
     * @param steps number of steps
     * @return last configuration
     */
    public boolean[][] conwayGame(int[][] liveCells, int steps){
        //construct matrix 
        boolean[][] matrix = initializeMatrix(liveCells);
        printer(matrix);

        //conway's rules
        for(int step = 0; step < steps; step++){
            int[][] tempLiveCells = new int[0][2];

            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    if (isAliveAndHasTwoOrThreeNeighbors(matrix, i, j) || isDeadButHasThreeNeighbors(matrix, i, j)){
                        int[] liveCell = {i,j};
                        tempLiveCells = addToMatrix(tempLiveCells, liveCell);
                    }
                }
            }
            matrix = initializeMatrix(tempLiveCells);
            printer(matrix);
        }

        return matrix;
    }

    private int neighbors(boolean[][] neighborhood, int row, int column){
        int numberOfNeighbors = 0;

        for(int i = row - 1; i <= row + 1; i++){
            for(int j = column - 1; j <= column + 1; j++){
                try {
                    if(neighborhood[i][j] && ((i != row) || (j != column))) {
                        numberOfNeighbors ++;
                    } 
                } catch (ArrayIndexOutOfBoundsException exception) {
                    exception.getMessage();
                }
            }
        }
        return numberOfNeighbors;
    }

    private boolean[][] initializeMatrix(int[][] liveCells){
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = -1;
        int minWidth = Integer.MAX_VALUE;
        int maxWidth = -1;
        int numberOfLiveCells = liveCells.length;

        if(liveCells.length == 0) return new boolean[1][1];

        //find matrix size
        for(int i = 0; i < numberOfLiveCells; i++){
            if(liveCells[i][0] < minHeight) minHeight = liveCells[i][0];
            if(liveCells[i][0] > maxHeight) maxHeight = liveCells[i][0];
            if(liveCells[i][1] < minWidth) minWidth = liveCells[i][1];
            if(liveCells[i][1] > maxWidth) maxWidth = liveCells[i][1];
        }
       
        int height = maxHeight - minHeight + 1;
        int width = maxWidth - minWidth + 1;
        int margin = 1;

        //all values by default are false
        boolean[][] matrix = new boolean[height + 2 * margin][width + 2 * margin];

        //populate matrix
        for(int j = 0; j < numberOfLiveCells; j++){
            matrix[liveCells[j][0] - minHeight + margin][liveCells[j][1] - minWidth + margin] = true;
        }

        return matrix;
    }

    private void printer(boolean[][] matrix){
        for(boolean[] row : matrix){
            for(boolean cell : row){
                if (cell) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    private boolean isAliveAndHasTwoOrThreeNeighbors(boolean[][] neighborhood, int row, int column){
        boolean result = (neighborhood[row][column] && (neighbors(neighborhood, row, column) == 2 || neighbors(neighborhood, row, column) == 3));
        return result;
    }

    private boolean isDeadButHasThreeNeighbors(boolean[][] neighborhood, int row, int column){
        boolean result = (!neighborhood[row][column] && (neighbors(neighborhood, row, column) == 3));
        return result;
    }

    private int[][] addToMatrix(int[][] matrix, int[] array){
        int[][] newMatrix = new int[matrix.length + 1][2];
        for(int i = 0; i < matrix.length; i++){
            newMatrix[i] = matrix[i];
        }
        newMatrix[matrix.length] = array;
        return newMatrix;
    }
}
