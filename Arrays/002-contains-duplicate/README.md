# LeetCode 217: Contains Duplicate

## Problem
Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

## Solution Approach

### **Strategy: HashSet (Early Exit)**
1. Create an empty `HashSet` to track numbers we've seen.
2. Iterate through the array.
3. For each number:
   - If it's **already in the set** → return `true` immediately (duplicate found!)
   - Otherwise → add it to the set
4. If we finish the loop without finding duplicates → return `false`.

### **Why This Works**
- A set only stores unique values.
- When we encounter a number that's already in the set, we've found a duplicate.
- We exit immediately—no need to scan the entire array if duplicates exist early.

### **Example Trace**
```
Input: nums = [1, 2, 3, 1]

Step 1: num=1
  - Set: {1}
  
Step 2: num=2
  - Set: {1, 2}
  
Step 3: num=3
  - Set: {1, 2, 3}
  
Step 4: num=1
  - 1 is already in set → Return true ✓

Output: true
```

## Complexity Analysis

| Metric | Value | Explanation |
|--------|-------|-------------|
| **Time Complexity** | **O(n)** | Single pass through the array; HashSet contains/add is O(1) on average |
| **Space Complexity** | **O(n)** | HashSet stores up to n unique elements in worst case |

## Code
```java
public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
        if (seen.contains(num)) {
            return true;
        }
        seen.add(num);
    }
    return false;
}
```

## Key Learning Points
- ✅ **HashSet Pattern**: Efficient deduplication and membership testing
- ✅ **Early Exit**: Return immediately when condition is met (don't process unnecessary elements)
- ✅ **O(1) Lookup**: HashSet operations (contains, add) are constant time on average

## Interview Readiness
- **Approach**: ⭐⭐⭐⭐⭐ Optimal, simple, and clean
- **Alternative**: Could use sorting O(n log n) time, O(1) space if interviewer asks for space optimization
- **Edge Cases Handled**:
  - Single element → returns `false` ✓
  - All duplicates → returns `true` on first duplicate ✓
  - Large numbers → works correctly ✓
  - Negative numbers → works correctly ✓

## Related Problems
- Find All Duplicates in Array — Return all duplicates, not just true/false
- Contains Duplicate II — Check if duplicates are within k distance
- Contains Duplicate III — Check if duplicates are within value range

## Python Alternative
```python
def containsDuplicate(nums):
    return len(nums) != len(set(nums))
```
*Clever one-liner that leverages Python's set, but less efficient in interview settings.*
