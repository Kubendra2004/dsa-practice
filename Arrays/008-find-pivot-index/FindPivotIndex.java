
/**
 * LeetCode 724: Find Pivot Index
 *
 * Problem: Given an array of integers nums, return the leftmost pivot index.
 * A pivot index is an index where the sum of the numbers to the left is equal
 * to the sum of the numbers to the right.
 *
 * Concept: Prefix Sum / Running Sum
 * Difficulty: Easy
 */
public class FindPivotIndex {

    /**
     * Finds the leftmost pivot index.
     *
     * @param nums the input array
     * @return the pivot index, or -1 if it does not exist
     */
    public int pivotIndex(int[] nums) {
        // TODO: Implement your solution here
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex solution = new FindPivotIndex();

        // Test Case 1: Standard example
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println("Test 1 - Input: [1,7,3,6,5,6]");
        System.out.println("Expected: 3");
        System.out.println("Got: " + solution.pivotIndex(nums1));
        System.out.println();

        // Test Case 2: No pivot exists
        int[] nums2 = {1, 2, 3};
        System.out.println("Test 2 - Input: [1,2,3]");
        System.out.println("Expected: -1");
        System.out.println("Got: " + solution.pivotIndex(nums2));
        System.out.println();

        // Test Case 3: Pivot at the start
        int[] nums3 = {2, 1, -1};
        System.out.println("Test 3 - Input: [2,1,-1]");
        System.out.println("Expected: 0");
        System.out.println("Got: " + solution.pivotIndex(nums3));
    }
}
