// 1. Two Sum
// Difficulty: Easy
// Topic: Arrays, Hash Map

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        int[] result = sol.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(result[0] + ", " + result[1]);
    }
}
