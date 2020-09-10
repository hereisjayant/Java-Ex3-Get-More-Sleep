package spiralizer;

import org.jetbrains.annotations.NotNull;

public class MatrixSpiralizer {

    /**
     * @param inMatrix
     * @return a matrix that is "spriralized" version of inMatrix
     */
    public static int[][] spiralize(@NotNull int[][] inMatrix) {

        int outMatrix[][];
        int rows = inMatrix.length;
        int cols = inMatrix[0].length;

        outMatrix = new int[rows][cols];

        //Make the traverser go through n elements before changing the way
        int r= rows; //these are the ns of our program
        int c= cols;

        int numberOfElements = rows*cols;

        int nth_element= 0;

        int i=0;
        int j=0;


        while(true) {
            for (; j <= c-1; j++) { //here i is fixed, and j is changing

                //this gets the position of the input matrix
                int row_in = getCurrentRow(nth_element, rows);
                int col_in = getCurrentCol(nth_element, cols);

                // places input matrix element to output matrix
                outMatrix[i][j]= inMatrix[row_in][col_in];

                //increases the nth element counter in inMatrix
                nth_element++;
                //TODO: change c here
            }
            for (; i <= r-1; i++) {

                //this gets the position of the input matrix
                int row_in = getCurrentRow(nth_element, rows);
                int col_in = getCurrentCol(nth_element, cols);

                // places input matrix element to output matrix
                outMatrix[i][j]= inMatrix[row_in][col_in];

                //increases the nth element counter in inMatrix
                nth_element++;
                //TODO: change r here
            }
        }
        return outMatrix;
    }


    private static int getCurrentRow(int n, int rows){

        return n/rows;
    }

    private static int getCurrentCol(int n, int cols){

        return n/cols;
    }

}