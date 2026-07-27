
/**
 * LeetCode 11: Container With Most Water
 *
 * Problem: You are given an integer array height of length n. There are n vertical
 * lines drawn such that the two endpoints of the i-th line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container such that the container
 * contains the most water.
 *
 * Concept: Two-Pointer with Area Calculation
 * Difficulty: Easy
 */
public class ContainerWithMostWater {

    /**
     * Finds the maximum area between two vertical lines. Area = min(height[i],
     * height[j]) * (j - i)
     *
     * @param height the array of heights
     * @return the maximum area possible
     */
    public int maxArea(int[] height) {
        // TODO: Implement your solution here
        int left = 0;
        int right = height.length - 1;
        int maxwater = 0;
        while (left < right) {
            int width = right - left;
            int high = Math.min(height[left], height[right]);
            int area = width * high;
            maxwater = Math.max(maxwater, area);
            if (height[left] < height[right]) 
                left++;
            else
                right--;
        }
        
        return maxwater;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        // Test Case 1: Standard case
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Test 1 - Input: [1,8,6,2,5,4,8,3,7]");
        System.out.println("Expected: 49 (lines at index 1 and 8, height=min(8,7), width=7)");
        System.out.println("Got: " + solution.maxArea(height1));
        System.out.println();

        // Test Case 2: Two elements
        int[] height2 = {1, 1};
        System.out.println("Test 2 - Input: [1,1]");
        System.out.println("Expected: 1 (height=1, width=1)");
        System.out.println("Got: " + solution.maxArea(height2));
        System.out.println();

        // Test Case 3: Increasing then decreasing
        int[] height3 = {2, 3, 4, 5, 18, 17, 6};
        System.out.println("Test 3 - Input: [2,3,4,5,18,17,6]");
        System.out.println("Expected: 17 (lines at index 4 and 5, height=min(18,17), width=1)");
        System.out.println("Got: " + solution.maxArea(height3));
        System.out.println();

        // Test Case 4: Maximum at edges
        int[] height4 = {10, 1, 1, 1, 10};
        System.out.println("Test 4 - Input: [10,1,1,1,10]");
        System.out.println("Expected: 40 (lines at index 0 and 4, height=min(10,10), width=4)");
        System.out.println("Got: " + solution.maxArea(height4));
    }
}
