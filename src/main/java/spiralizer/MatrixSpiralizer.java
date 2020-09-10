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


        while(true) {

            //this goes forward
            for (; j <=  c-1; j++) { //here i is fixed, and j is changing

                //this gets the position of the input matrix
                int row_in = getCurrentRow(nth_element, rows);
                int col_in = getCurrentCol(nth_element, cols);

                // places input matrix element to output matrix
                outMatrix[i][j]= inMatrix[row_in][col_in];

                //increases the nth element counter in inMatrix
                nth_element++;

                //exits loop if all elements have been transferred
                if(nth_element==numberOfElements) break;
            }
            c--;
            j--;
            //exits loop if all elements have been transferred
            if(nth_element==numberOfElements) break;

            //this goes down
            for (i=i+1; i <= r-1; i++) {

                //this gets the position of the input matrix
                int row_in = getCurrentRow(nth_element, rows);
                int col_in = getCurrentCol(nth_element, cols);

                // places input matrix element to output matrix
                outMatrix[i][j]= inMatrix[row_in][col_in];

                //increases the nth element counter in inMatrix
                nth_element++;

                //exits loop if all elements have been transferred
                if(nth_element==numberOfElements) break;
            }
            r--;
            i--;
            //exits loop if all elements have been transferred
            if(nth_element==numberOfElements) break;

            //this goes backwards
            for (j=j-1; j >= (rows-1)-c; j--) { //here i is fixed, and j is changing

                //this gets the position of the input matrix
                int row_in = getCurrentRow(nth_element, rows);
                int col_in = getCurrentCol(nth_element, cols);

                // places input matrix element to output matrix
                outMatrix[i][j]= inMatrix[row_in][col_in];

                //increases the nth element counter in inMatrix
                nth_element++;

                //exits loop if all elements have been transferred
                if(nth_element==numberOfElements) break;
            }
            c--;
            j++;
            //exits loop if all elements have been transferred
            if(nth_element==numberOfElements) break;

            //this goes up
            for (i=i-1; i > (rows-1)-(r); i--) {

                //this gets the position of the input matrix
                int row_in = getCurrentRow(nth_element, rows);
                int col_in = getCurrentCol(nth_element, cols);

                // places input matrix element to output matrix
                outMatrix[i][j]= inMatrix[row_in][col_in];

                //increases the nth element counter in inMatrix
                nth_element++;

                //exits loop if all elements have been transferred
                if(nth_element==numberOfElements) break;
            }
            r--;
            i++;

            //exits loop if all elements have been transferred
            if(nth_element==numberOfElements) break;

        }
        return outMatrix;
    }


    private static int getCurrentRow(int n, int rows){

        return n/rows;
    }

    private static int getCurrentCol(int n, int rows){

        return n%rows;
    }

}