# LeetCode 001: Two Sum

## Problem
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers that add up to the target. You may assume each input has exactly one solution and you cannot use the same element twice.

## Solution Approach

### **Strategy: Hash Map (One-Pass)**
1. Create a `HashMap` to store numbers we've seen and their indices.
2. Iterate through the array once.
3. For each number, calculate the complement: `complement = target - current_number`
4. Check if the complement exists in the HashMap:
   - If **yes** → return the indices immediately
   - If **no** → add the current number and its index to the HashMap
5. If no pair is found, return an empty array.

### **Why This Works**
- The complement is the second number we need.
- By storing previously seen numbers, we can find the pair in a single pass.
- We don't need to try all pairs like a brute-force approach.

### **Example Trace**
```
Input: nums = [2, 7, 11, 15], target = 9

Step 1: i=0, num=2, complement=7
  - HashMap: {2: 0}
  
Step 2: i=1, num=7, complement=2
  - 2 is in HashMap at index 0 → Return [0, 1] ✓

Output: [0, 1]
```

## Complexity Analysis

| Metric | Value | Explanation |
|--------|-------|-------------|
| **Time Complexity** | **O(n)** | Single pass through the array; HashMap lookup/insert is O(1) |
| **Space Complexity** | **O(n)** | HashMap stores up to n elements in worst case |

## Code
```java
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
```

## Key Learning Points
- ✅ **Hash Map Pattern**: Transform O(n²) brute force into O(n) by trading space
- ✅ **Complement Trick**: Subtract to find what number you need, instead of checking all pairs
- ✅ **Early Exit**: Return as soon as you find the answer (no need to scan the entire array)

## Interview Readiness
- **Approach**: ⭐⭐⭐⭐⭐ Optimal and clean
- **Edge Cases Handled**:
  - Empty array → returns `[]`
  - Single element → returns `[]` (no two numbers)
  - Negative numbers → works correctly
  - Duplicate numbers in target calculation → works (e.g., `[3, 3], target=6`)

## Related Problems
- Two Sum II (Sorted Array) — Use two-pointer instead
- Two Sum III (Data Structure) — Maintain running HashMap
