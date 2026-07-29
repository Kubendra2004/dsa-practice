public class ProductExceptSelf {

    /**
     * Returns an array where each element at index i is the product
     * of all elements in nums except nums[i].
     *
     * @param nums the input array
     * @return array of products except self
     */
    public int[] productExceptSelf(int[] nums) {
        // TODO: Implement your solution here
        return new int[nums.length];
    }

    public static void main(String[] args) {
        ProductExceptSelf solution = new ProductExceptSelf();

        // Test Case 1: Standard example
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Test 1 - Input: [1,2,3,4]");
        System.out.println("Expected: [24,12,8,6]");
        int[] result1 = solution.productExceptSelf(nums1);
        System.out.print("Got: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) System.out.print(",");
        }
        System.out.println("]");
        System.out.println();

        // Test Case 2: Array with a zero
        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println("Test 2 - Input: [-1,1,0,-3,3]");
        System.out.println("Expected: [0,0,9,0,0]");
        int[] result2 = solution.productExceptSelf(nums2);
        System.out.print("Got: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) System.out.print(",");
        }
        System.out.println("]");
        System.out.println();

        // Test Case 3: Two-element array
        int[] nums3 = {2, 3};
        System.out.println("Test 3 - Input: [2,3]");
        System.out.println("Expected: [3,2]");
        int[] result3 = solution.productExceptSelf(nums3);
        System.out.print("Got: [");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i]);
            if (i < result3.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}