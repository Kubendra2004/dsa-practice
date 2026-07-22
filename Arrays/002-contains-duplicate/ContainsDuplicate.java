/**
 * LeetCode 217: Contains Duplicate
 * 
 * Problem: Given an integer array nums, return true if any value appears at least 
 * twice in the array, and return false if every element is distinct.
 * 
 * Concept: Hashing / Set-based deduplication
 * Difficulty: Easy
 */
import java.util.HashSet;
import java.util.Set;
public class ContainsDuplicate {
    
    /**
     * Determines if the array contains any duplicate values.
     * 
     * @param nums the input integer array
     * @return true if duplicates exist, false otherwise
     */
    public boolean containsDuplicate(int[] nums) {
        // TODO: Implement your solution here
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();
        
        // Test Case 1: Array with duplicates
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test 1 - Input: [1, 2, 3, 1]");
        System.out.println("Expected: true");
        System.out.println("Got: " + solution.containsDuplicate(nums1));
        System.out.println();
        
        // Test Case 2: Array with all distinct elements
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test 2 - Input: [1, 2, 3, 4]");
        System.out.println("Expected: false");
        System.out.println("Got: " + solution.containsDuplicate(nums2));
        System.out.println();
        
        // Test Case 3: Single element
        int[] nums3 = {1};
        System.out.println("Test 3 - Input: [1]");
        System.out.println("Expected: false");
        System.out.println("Got: " + solution.containsDuplicate(nums3));
        System.out.println();
        
        // Test Case 4: Large duplicates
        int[] nums4 = {99, 99};
        System.out.println("Test 4 - Input: [99, 99]");
        System.out.println("Expected: true");
        System.out.println("Got: " + solution.containsDuplicate(nums4));
    }
}
