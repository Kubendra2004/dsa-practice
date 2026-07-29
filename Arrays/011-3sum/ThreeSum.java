public class ThreeSum {

    /**
     * Finds all unique triplets in the array that sum to zero.
     *
     * @param nums the input array
     * @return a list of unique triplets that sum to zero
     */
    public List<List<Integer>> threeSum(int[] nums) {
        // TODO: Implement your solution here
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();

        // Test Case 1: Standard example
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Test 1 - Input: [-1,0,1,2,-1,-4]");
        System.out.println("Expected: [[-1,-1,2],[-1,0,1]]");
        System.out.println("Got: " + solution.threeSum(nums1));
        System.out.println();

        // Test Case 2: No valid triplet
        int[] nums2 = {0, 1, 1};
        System.out.println("Test 2 - Input: [0,1,1]");
        System.out.println("Expected: []");
        System.out.println("Got: " + solution.threeSum(nums2));
        System.out.println();

        // Test Case 3: All zeroes
        int[] nums3 = {0, 0, 0};
        System.out.println("Test 3 - Input: [0,0,0]");
        System.out.println("Expected: [[0,0,0]]");
        System.out.println("Got: " + solution.threeSum(nums3));
    }
}