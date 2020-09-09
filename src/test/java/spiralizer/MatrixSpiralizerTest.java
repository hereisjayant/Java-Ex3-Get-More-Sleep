package spiralizer;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MatrixSpiralizerTest {

    /** Check if two integer matrices have the same contents
     *
     * @param matrix1
     * @param matrix2
     * @return true if the contents of matrix1 and matrix2 are identical and false otherwise
     */
    public static boolean testEqual(int[][] matrix1, int[][] matrix2) {

        /*
            Basic sanity checking:
                Verify that lengths are equal
         */
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        if (matrix1.length != matrix2.length) {
            return false;
        }
        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }

        /*
            Test the contents of the matrices
         */
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    @Test
    public void test2x2() {
        int[][] inMatrix  = { {1, 2}, {3, 4} };
        int[][] expOutput = { {1, 2}, {4, 3} };
        assertTrue(testEqual(expOutput, MatrixSpiralizer.spiralize(inMatrix)));
    }

    @Test
    public void test3x3() {
        int[][] inMatrix  = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] expOutput = { {1, 2, 3}, {8, 9, 4}, {7, 6, 5} };
        assertTrue(testEqual(expOutput, MatrixSpiralizer.spiralize(inMatrix)));
    }

    @Test
    public void test4x4() {
        int[][] inMatrix  = {
                {14, 12, 9, 10},
                {10, 8, 17, 12},
                {99, 34, 10, 5},
                {18, 72, 2, 11}
        };
        int[][] expOutput = {
                {14, 12, 9, 10},
                {5, 18, 72, 10},
                {10, 11, 2, 8},
                {34, 99, 12, 17}
        };
        assertTrue(testEqual(expOutput, MatrixSpiralizer.spiralize(inMatrix)));
    }

    @Test
    public void test6x7() {
        int[][] inMatrix = {
                {1, 2, 3, 4, 5, 6},
                {4, 5, 6, 7, 8, 9},
                {7, 8, 9, 10, 11, 12},
                {10, 11, 12, 13, 14, 15},
                {13, 14, 15, 16, 17, 18},
                {16, 17, 18, 19, 20, 21}
        };
        int[][] expOutput = {
                {1, 2, 3, 4, 5, 6},
                {11, 12, 13, 14, 15, 4},
                {10, 17, 18, 19, 13, 5},
                {12, 16, 21, 20, 14, 6},
                {11, 18, 17, 16, 15, 7},
                {10, 9, 8, 7, 9, 8}
        };
        assertTrue(testEqual(expOutput, MatrixSpiralizer.spiralize(inMatrix)));
    }

    @Test
    public void test10x9() {
        int[][] inMatrix = {
                {78, 130, 377, 362, 483, 65, 110, 189, 299, 16},
                {53, 56, 18, 273, 254, 101, 168, 2, 178, 156},
                {430, 259, 84, 90, 118, 326, 492, 463, 207, 321},
                {17, 171, 385, 17, 409, 275, 271, 316, 264, 274},
                {426, 165, 205, 279, 159, 136, 1, 166, 30, 106},
                {190, 307, 282, 442, 237, 454, 253, 498, 457, 302},
                {136, 401, 107, 121, 119, 11, 279, 250, 311, 288},
                {421, 122, 338, 289, 165, 243, 269, 424, 260, 131},
                {365, 295, 371, 413, 35, 204, 363, 327, 441, 304},
                {440, 329, 407, 430, 448, 61, 136, 99, 183, 17}
        };
        int[][] expOutput = {
                {78, 130, 377, 362, 483, 65, 110, 189, 299, 16},
                {275, 271, 316, 264, 274, 426, 165, 205, 279, 53},
                {409, 121, 119, 11, 279, 250, 311, 288, 159, 56},
                {17, 107, 413, 35, 204, 363, 327, 421, 136, 18},
                {385, 401, 371, 61, 136, 99, 441, 122, 1, 273},
                {171, 136, 295, 448, 17, 183, 304, 338, 166, 254},
                {17, 302, 365, 430, 407, 329, 440, 289, 30, 101},
                {321, 457, 131, 260, 424, 269, 243, 165, 106, 168},
                {207, 498, 253, 454, 237, 442, 282, 307, 190, 2},
                {463, 492, 326, 118, 90, 84, 259, 430, 156, 178}
        };
        assertTrue(testEqual(expOutput, MatrixSpiralizer.spiralize(inMatrix)));
    }

    @Test
    public void test2x10() {
        int[][] inMatrix = {
            {488, 173, 296, 345, 314, 146, 207, 1, 477, 333},
            {420, 457, 385, 356, 204, 304, 172, 43, 54, 43}
        };
        int[][] expOutput = {
            {488, 173, 296, 345, 314, 146, 207, 1, 477, 333},
            {43, 54, 43, 172, 304, 204, 356, 385, 457, 420},
        };
        assertTrue(testEqual(expOutput, MatrixSpiralizer.spiralize(inMatrix)));
    }
}
