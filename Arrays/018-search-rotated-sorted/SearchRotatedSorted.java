public class SearchRotatedSorted {

    /**
     * Searches for a target in a rotated sorted array.
     *
     * @param nums the rotated sorted array
     * @param target the value to search for
     * @return the index of target, or -1 if not found
     */
    public int search(int[] nums, int target) {
        // TODO: Implement your solution here
        return -1;
    }

    public static void main(String[] args) {
        SearchRotatedSorted solution = new SearchRotatedSorted();

        // Test Case 1: Standard example
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Test 1 - Input: [4,5,6,7,0,1,2], target=0");
        System.out.println("Expected: 4");
        System.out.println("Got: " + solution.search(nums1, 0));
        System.out.println();

        // Test Case 2: Target not found
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Test 2 - Input: [4,5,6,7,0,1,2], target=3");
        System.out.println("Expected: -1");
        System.out.println("Got: " + solution.search(nums2, 3));
        System.out.println();

        // Test Case 3: Single element
        int[] nums3 = {1};
        System.out.println("Test 3 - Input: [1], target=0");
        System.out.println("Expected: -1");
        System.out.println("Got: " + solution.search(nums3, 0));
    }
}