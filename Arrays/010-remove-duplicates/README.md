# LeetCode 26: Remove Duplicates from Sorted Array

## Problem

Given a sorted array `nums`, remove the duplicates in-place such that each unique element appears only once. Return the number of unique elements.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

## Algorithm Type

Two-Pointer Technique — slow pointer tracks last unique position, fast pointer scans for next unique element.

## Solution Approach

1. Initialize a `slow` pointer at index 0 (first element is always unique in sorted array).
2. Scan with a `fast` pointer starting from index 1.
3. When `nums[fast] != nums[slow]`, increment `slow` and copy `nums[fast]` to `nums[slow]`.
4. After the scan completes, return `slow + 1` as the count of unique elements.

## Core Idea

Since the array is sorted, duplicates are adjacent. The slow/fast pointer pair efficiently skips duplicates in a single pass without extra space.

## Pseudocode

```
function removeDuplicates(nums):
    if nums is empty:
        return 0
    slow = 0
    for fast from 1 to len(nums) - 1:
        if nums[fast] != nums[slow]:
            slow += 1
            nums[slow] = nums[fast]
    return slow + 1
```

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Edge Cases

- Array with all identical elements (e.g., `[0,0,0,0]`)
- Array with no duplicates (e.g., `[1,2,3]`)
- Single-element array
- Empty array (if allowed by constraints)

## Language Notes

- Java implementation: [RemoveDuplicates.java](RemoveDuplicates.java)
- Python reinforcement: [remove_duplicates.ipynb](remove_duplicates.ipynb)

## Practice Goal

If you can explain the slow/fast pointer pattern clearly, you are ready for the next array pattern: two-pointer from both ends (e.g., container with most water, move zeroes).

**Interview Rating:** 4/10 (扣6分: 仅适用于已排序数组，变化空间极小，deduplication是子问题而非独立算法)