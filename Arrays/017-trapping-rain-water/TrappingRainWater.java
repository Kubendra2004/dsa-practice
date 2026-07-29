public class TrappingRainWater {

    /**
     * Computes how much water can be trapped after raining.
     *
     * @param height array representing elevation map
     * @return total units of trapped water
     */
    public int trap(int[] height) {
        // TODO: Implement your solution here
        return 0;
    }

    public static void main(String[] args) {
        TrappingRainWater solution = new TrappingRainWater();

        // Test Case 1: Standard example
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Test 1 - Input: [0,1,0,2,1,0,1,3,2,1,2,1]");
        System.out.println("Expected: 6");
        System.out.println("Got: " + solution.trap(height1));
        System.out.println();

        // Test Case 2: No trapping possible
        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Test 2 - Input: [4,2,0,3,2,5]");
        System.out.println("Expected: 9");
        System.out.println("Got: " + solution.trap(height2));
        System.out.println();

        // Test Case 3: Empty array
        int[] height3 = {};
        System.out.println("Test 3 - Input: []");
        System.out.println("Expected: 0");
        System.out.println("Got: " + solution.trap(height3));
    }
}