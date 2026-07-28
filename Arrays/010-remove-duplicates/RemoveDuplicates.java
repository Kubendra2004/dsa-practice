public class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted array in-place such that each unique
     * element appears only once. Returns the number of unique elements.
     *
     * @param nums the sorted input array
     * @return the number of unique elements
     */
    public int removeDuplicates(int[] nums) {
        // TODO: Implement your solution here
        return 0;
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();

        // Test Case 1: Standard example
        int[] nums1 = {1, 1, 2};
        System.out.println("Test 1 - Input: [1,1,2]");
        System.out.println("Expected: 2 (nums = [1,2,_])");
        int result1 = solution.removeDuplicates(nums1);
        System.out.println("Got length: " + result1);
        System.out.print("Got array: [");
        for (int i = 0; i < result1; i++) {
            System.out.print(nums1[i]);
            if (i < result1 - 1) System.out.print(",");
        }
        System.out.println("]");
        System.out.println();

        // Test Case 2: All duplicates
        int[] nums2 = {0, 0, 0, 0};
        System.out.println("Test 2 - Input: [0,0,0,0]");
        System.out.println("Expected: 1 (nums = [0,_])");
        int result2 = solution.removeDuplicates(nums2);
        System.out.println("Got length: " + result2);
        System.out.print("Got array: [");
        for (int i = 0; i < result2; i++) {
            System.out.print(nums2[i]);
            if (i < result2 - 1) System.out.print(",");
        }
        System.out.println("]");
        System.out.println();

        // Test Case 3: No duplicates
        int[] nums3 = {1, 2, 3};
        System.out.println("Test 3 - Input: [1,2,3]");
        System.out.println("Expected: 3 (nums = [1,2,3])");
        int result3 = solution.removeDuplicates(nums3);
        System.out.println("Got length: " + result3);
        System.out.print("Got array: [");
        for (int i = 0; i < result3; i++) {
            System.out.print(nums3[i]);
            if (i < result3 - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}