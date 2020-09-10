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

        int numberOfElements = rows*cols;

        int nth_element= 0; //counter for inMatrix

        int start_forward= 0;
        int end_forward = cols-1;
        int start_down =1;
        int end_down = rows-1;
        int start_backwards = end_forward-1;
        int end_backwards = 0;
        int start_upwards = end_down-1;
        int end_upwards = start_down;

        int i=0;
        int j=0;

        while(true){
            //this goes forward
            for(j= start_forward; j<=end_forward; j++){

                //this gets the position of the input matrix
                int row_in = getCurrentRow(nth_element, rows);
                int col_in = getCurrentCol(nth_element, cols);

                outMatrix[i][j]= inMatrix[row_in][col_in];
                nth_element++;

                if(nth_element==numberOfElements) break;
            }
            j--;
            end_forward--;
            start_forward++;
            if(nth_element==numberOfElements) break;

            //this goes down
            for(i= start_down; i<=end_down; i++){

                //this gets the position of the input matrix
                int row_in = getCurrentRow(nth_element, rows);
                int col_in = getCurrentCol(nth_element, cols);

                outMatrix[i][j]= inMatrix[row_in][col_in];
                nth_element++;

                if(nth_element==numberOfElements) break;
            }
            i--;
            end_down--;
            start_down++;
            if(nth_element==numberOfElements) break;

            //this goes backwards
            for(j= start_backwards; j>=end_backwards; j--){

                //this gets the position of the input matrix
                int row_in = getCurrentRow(nth_element, rows);
                int col_in = getCurrentCol(nth_element, cols);

                outMatrix[i][j]= inMatrix[row_in][col_in];
                nth_element++;

                if(nth_element==numberOfElements) break;
            }
            j++;
            end_backwards++;
            start_backwards--;
            if(nth_element==numberOfElements) break;

            //this goes upwards
            for(i= start_upwards; i>=end_upwards; i--){

                //this gets the position of the input matrix
                int row_in = getCurrentRow(nth_element, rows);
                int col_in = getCurrentCol(nth_element, cols);

                outMatrix[i][j]= inMatrix[row_in][col_in];
                nth_element++;

                if(nth_element==numberOfElements) break;
            }
            i++;
            end_upwards++;
            start_upwards--;
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