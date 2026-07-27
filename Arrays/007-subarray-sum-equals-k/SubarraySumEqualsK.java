import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 560: Subarray Sum Equals K
 *
 * Problem: Given an array of integers nums and an integer k, return the total
 * number of continuous subarrays whose sum equals to k.
 *
 * Concept: Prefix Sum + HashMap
 * Difficulty: Medium
 */
public class SubarraySumEqualsK {

    /**
     * Counts the number of subarrays whose sum equals k.
     *
     * @param nums the input array
     * @param k the target sum
     * @return the number of subarrays with sum equal to k
     */
    public int subarraySum(int[] nums, int k) {
        // TODO: Implement your solution here
        return 0;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK solution = new SubarraySumEqualsK();

        // Test Case 1: Standard example
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("Test 1 - Input: [1,1,1], k=2");
        System.out.println("Expected: 2");
        System.out.println("Got: " + solution.subarraySum(nums1, k1));
        System.out.println();

        // Test Case 2: Mixed positive and negative values
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println("Test 2 - Input: [1,2,3], k=3");
        System.out.println("Expected: 2");
        System.out.println("Got: " + solution.subarraySum(nums2, k2));
        System.out.println();

        // Test Case 3: Negative numbers
        int[] nums3 = {1, -1, 0};
        int k3 = 0;
        System.out.println("Test 3 - Input: [1,-1,0], k=0");
        System.out.println("Expected: 3");
        System.out.println("Got: " + solution.subarraySum(nums3, k3));
    }
}
