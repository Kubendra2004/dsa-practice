## Algorithm Type

**Kadane's Algorithm (Dynamic Programming)** — track the maximum subarray sum ending at each position.

## Solution Approach

1. Initialize two variables: `current_max = nums[0]` and `global_max = nums[0]`.
2. Iterate from index 1 to the end of the array.
3. At each index `i`, decide whether to extend the existing subarray or start a new one:
   - `current_max = max(nums[i], current_max + nums[i])`
4. Update `global_max = max(global_max, current_max)`.
5. After the iteration, `global_max` holds the maximum subarray sum.

## Core Idea

At each position, the maximum subarray ending there is either: (a) just the current element itself, or (b) the current element added to the previous maximum subarray. If the running sum becomes negative, it's better to start fresh from the next element.

## Pseudocode

```
function maxSubArray(nums):
    current_max = nums[0]
    global_max = nums[0]
    for i from 1 to len(nums) - 1:
        current_max = max(nums[i], current_max + nums[i])
        global_max = max(global_max, current_max)
    return global_max
```

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Edge Cases

- All negative numbers — Kadane's returns the largest (least negative) single element
- Single-element array — return that element
- All positive numbers — return the sum of the entire array

## Language Notes

- Java implementation: [MaximumSubarray.java](MaximumSubarray.java)
- Python reinforcement: [maximum_subarray.ipynb](maximum_subarray.ipynb)

## Practice Goal

If you can explain Kadane's algorithm and why resetting on negative running sums works, you are ready for in-place matrix marking problems.

**Interview Rating:** 7/10 (扣3分: 经典DP但变体少, 全负数边界需要特殊注意)