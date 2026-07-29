# LeetCode 283: Move Zeroes

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

Do this in-place without making a copy of the array.

## Algorithm Type

Two-Pointer Technique — write pointer tracks the position to place the next non-zero element.

## Solution Approach

1. Initialize a `write` pointer at index 0.
2. Iterate through the array with a `read` pointer.
3. Every time `nums[read] != 0`, copy it to `nums[write]` and increment `write`.
4. After the scan, fill all positions from `write` to the end with zeroes.

## Core Idea

Use a write pointer to compact non-zero elements to the front in a single pass. Then fill the remaining positions with zeroes.

## Pseudocode

```
function moveZeroes(nums):
    write = 0
    for read from 0 to len(nums) - 1:
        if nums[read] != 0:
            nums[write] = nums[read]
            write += 1
    for i from write to len(nums) - 1:
        nums[i] = 0
```

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Edge Cases

- Array with all zeroes
- Array with no zeroes
- Single-element array
- Array with only one zero at the beginning or end

## Language Notes

- Java implementation: [MoveZeroes.java](MoveZeroes.java)
- Python reinforcement: [move_zeroes.ipynb](move_zeroes.ipynb)

## Practice Goal

If you can explain the two-pointer write-pattern clearly, you are ready for the next array variant: removing duplicates from a sorted array.

**Interview Rating:** 3/10 (扣7分: 过于简单，two-pointer write pattern太基础，毫无算法深度可言)