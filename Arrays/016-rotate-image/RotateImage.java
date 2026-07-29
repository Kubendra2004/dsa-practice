public class RotateImage {

    /**
     * Rotates the n x n matrix 90 degrees clockwise in-place.
     *
     * @param matrix the input n x n matrix
     */
    public void rotate(int[][] matrix) {
        // TODO: Implement your solution here
    }

    public static void main(String[] args) {
        RotateImage solution = new RotateImage();

        // Test Case 1: 3x3 matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Test 1 - Input: [[1,2,3],[4,5,6],[7,8,9]]");
        System.out.println("Expected: [[7,4,1],[8,5,2],[9,6,3]]");
        solution.rotate(matrix1);
        System.out.println("Got: " + java.util.Arrays.deepToString(matrix1));
        System.out.println();

        // Test Case 2: 4x4 matrix
        int[][] matrix2 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        System.out.println("Test 2 - Input: [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]");
        System.out.println("Expected: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]");
        solution.rotate(matrix2);
        System.out.println("Got: " + java.util.Arrays.deepToString(matrix2));
    }
}