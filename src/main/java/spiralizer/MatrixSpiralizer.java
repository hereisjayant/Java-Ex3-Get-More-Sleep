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
        int r= rows; //these are the n's of our program
        int c= cols;

        int numberOfElements = rows*cols;

        int nth_element= 0; //counter for inMatrix

        int i=0;// for rows
        int j=0;// for cols

        

        return outMatrix;
    }


    private static int getCurrentRow(int n, int rows){

        return n/rows;
    }

    private static int getCurrentCol(int n, int rows){

        return n%rows;
    }

}