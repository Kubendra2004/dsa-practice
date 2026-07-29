
public class MoveZeroes {

    /**
     * Moves all zeroes in the array to the end while maintaining the relative
     * order of the non-zero elements.
     *
     * @param nums the input array
     */
    public void moveZeroes(int[] nums) {
        // TODO: Implement your solution here
        int writer = 0;
        int reader = 0;
        while (reader < nums.length) {
            if (nums[reader] != 0) {
                int temp = nums[reader];
                nums[reader] = nums[writer];
                nums[writer] = temp;
                writer++;
            }
            reader++;
        }
    }

    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();

        // Test Case 1: Standard example
        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.println("Test 1 - Input: [0,1,0,3,12]");
        System.out.println("Expected: [1,3,12,0,0]");
        solution.moveZeroes(nums1);
        System.out.print("Got: [");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
            if (i < nums1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.println();

        // Test Case 2: All zeroes
        int[] nums2 = {0, 0, 0};
        System.out.println("Test 2 - Input: [0,0,0]");
        System.out.println("Expected: [0,0,0]");
        solution.moveZeroes(nums2);
        System.out.print("Got: [");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i]);
            if (i < nums2.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.println();

        // Test Case 3: No zeroes
        int[] nums3 = {1, 2, 3};
        System.out.println("Test 3 - Input: [1,2,3]");
        System.out.println("Expected: [1,2,3]");
        solution.moveZeroes(nums3);
        System.out.print("Got: [");
        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i]);
            if (i < nums3.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
