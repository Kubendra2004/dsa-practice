public class SetMatrixZeroes {

    /**
     * Modifies the matrix in-place so that if an element is 0,
     * its entire row and column are set to 0.
     *
     * @param matrix the input m x n matrix
     */
    public void setZeroes(int[][] matrix) {
        // TODO: Implement your solution here
    }

    public static void main(String[] args) {
        SetMatrixZeroes solution = new SetMatrixZeroes();

        // Test Case 1: Standard example
        int[][] matrix1 = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        System.out.println("Test 1 - Input: [[1,1,1],[1,0,1],[1,1,1]]");
        System.out.println("Expected: [[1,0,1],[0,0,0],[1,0,1]]");
        solution.setZeroes(matrix1);
        System.out.println("Got: " + java.util.Arrays.deepToString(matrix1));
        System.out.println();

        // Test Case 2: No zeroes
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Test 2 - Input: [[1,2,3],[4,5,6],[7,8,9]]");
        System.out.println("Expected: [[1,2,3],[4,5,6],[7,8,9]]");
        solution.setZeroes(matrix2);
        System.out.println("Got: " + java.util.Arrays.deepToString(matrix2));
        System.out.println();

        // Test Case 3: Entire first row has a zero
        int[][] matrix3 = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8}
        };
        System.out.println("Test 3 - Input: [[0,1,2],[3,4,5],[6,7,8]]");
        System.out.println("Expected: [[0,0,0],[0,4,5],[0,7,8]]");
        solution.setZeroes(matrix3);
        System.out.println("Got: " + java.util.Arrays.deepToString(matrix3));
    }
}