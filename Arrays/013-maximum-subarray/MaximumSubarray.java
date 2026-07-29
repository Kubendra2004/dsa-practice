public class MaximumSubarray {

    /**
     * Finds the contiguous subarray with the largest sum.
     *
     * @param nums the input array
     * @return the maximum subarray sum
     */
    public int maxSubArray(int[] nums) {
        // TODO: Implement your solution here
        return 0;
    }

    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();

        // Test Case 1: Standard example
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Test 1 - Input: [-2,1,-3,4,-1,2,1,-5,4]");
        System.out.println("Expected: 6");
        System.out.println("Got: " + solution.maxSubArray(nums1));
        System.out.println();

        // Test Case 2: Single element
        int[] nums2 = {1};
        System.out.println("Test 2 - Input: [1]");
        System.out.println("Expected: 1");
        System.out.println("Got: " + solution.maxSubArray(nums2));
        System.out.println();

        // Test Case 3: All negatives
        int[] nums3 = {-1, -2, -3};
        System.out.println("Test 3 - Input: [-1,-2,-3]");
        System.out.println("Expected: -1");
        System.out.println("Got: " + solution.maxSubArray(nums3));
    }
}