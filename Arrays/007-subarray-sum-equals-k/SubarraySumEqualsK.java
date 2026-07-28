
import java.util.HashMap;

public class SubarraySumEqualsK {

    /**
     * Counts the number of subarrays whose sum equals k.
     *
     * @param nums the input array
     * @param k the target sum
     * @return the number of subarrays with sum equal to k
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int cursum = 0;
        HashMap<Integer, Integer> presum = new HashMap<>();
        presum.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            cursum += nums[i];
            int target = cursum - k;
            if (presum.containsKey(target)) {
                count += presum.get(target);
            }
            if (presum.containsKey(cursum)) {
                int pastFrequency = presum.get(cursum);
                // Put it back in the map, adding 1 to its frequency
                presum.put(cursum, pastFrequency + 1);
            } else {
                presum.put(cursum, 1);
            }
        }
        return count;
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
