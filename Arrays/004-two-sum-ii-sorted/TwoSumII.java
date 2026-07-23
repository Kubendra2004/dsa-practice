/**
 * LeetCode 167: Two Sum II – Input Array Is Sorted
 * 
 * Problem: Given a sorted integer array numbers and an integer target, return the 
 * indices of the two numbers (1-indexed) that add up to the target. You may assume 
 * each input has exactly one solution and you cannot use the same element twice.
 * 
 * Concept: Two-pointer technique
 * Difficulty: Easy
 */

public class TwoSumII {
    
    /**
     * Finds the two numbers in a sorted array that add up to the target.
     * 
     * @param numbers the sorted input integer array
     * @param target the target sum
     * @return a 1-indexed array [index1, index2] where numbers[index1-1] + numbers[index2-1] = target
     */
    public int[] twoSum(int[] numbers, int target) {
        // TODO: Implement your solution here
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target)
                return new int[]{left+1,right+1};
            else if (sum<target)
                left++;
            else
                right--;

        }
        return new int[] {0, 0};
    }
    
    public static void main(String[] args) {
        TwoSumII solution = new TwoSumII();
        
        // Test Case 1: Standard case
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Test 1 - Input: [2, 7, 11, 15], target = 9");
        System.out.println("Expected: [1, 2]");
        int[] result1 = solution.twoSum(numbers1, target1);
        System.out.println("Got: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println();
        
        // Test Case 2: Second and third elements
        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        System.out.println("Test 2 - Input: [2, 3, 4], target = 6");
        System.out.println("Expected: [1, 3]");
        int[] result2 = solution.twoSum(numbers2, target2);
        System.out.println("Got: [" + result2[0] + ", " + result2[1] + "]");
        System.out.println();
        
        // Test Case 3: Last two elements
        int[] numbers3 = {1, 2, 3, 4, 4, 9, 56, 90};
        int target3 = 13;
        System.out.println("Test 3 - Input: [1, 2, 3, 4, 4, 9, 56, 90], target = 13");
        System.out.println("Expected: [4, 6] (4 + 9 = 13)");
        int[] result3 = solution.twoSum(numbers3, target3);
        System.out.println("Got: [" + result3[0] + ", " + result3[1] + "]");
        System.out.println();
        
        // Test Case 4: Negative numbers
        int[] numbers4 = {-1, 0, 1, 2, 3};
        int target4 = 2;
        System.out.println("Test 4 - Input: [-1, 0, 1, 2, 3], target = 2");
        System.out.println("Expected: [2, 4] (-1 + 3 = 2, or 0 + 2 = 2)");
        int[] result4 = solution.twoSum(numbers4, target4);
        System.out.println("Got: [" + result4[0] + ", " + result4[1] + "]");
    }
}
