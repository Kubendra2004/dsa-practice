# LeetCode 724: Find Pivot Index

## Problem

Given an array of integers `nums`, return the leftmost pivot index. A pivot index is an index where the sum of the numbers to the left equals the sum of the numbers to the right.

## Algorithm Type

Prefix Sum / Running Sum

## Solution Approach

1. Compute the total sum of the array in one pass.
2. Initialize `left_sum = 0`.
3. Iterate through the array from left to right.
4. At each index `i`, compute `right_sum = total_sum - left_sum - nums[i]`.
5. If `left_sum == right_sum`, return `i` as the pivot index.
6. Otherwise, add `nums[i]` to `left_sum` and continue.
7. If no pivot is found, return `-1`.

## Core Idea

Compute the total sum once. Then scan from left to right while tracking the running left sum. At each index, the right sum is `total_sum - left_sum - nums[i]`. If left sum equals right sum, that index is the pivot.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Edge Cases

- Empty array has no pivot
- Single-element array returns `0`
- Multiple pivots: return the leftmost one

## Language Notes

- Java implementation: [FindPivotIndex.java](FindPivotIndex.java)
- Python reinforcement: [find_pivot_index.ipynb](find_pivot_index.ipynb)

**Interview Rating:** 6/10 (扣4分: 题目直接，边界case少，一旦想到prefix sum即可秒杀，区分度低)

## Practice Goal

After this one, you should be comfortable using prefix sums for both counting and balance-style questions.
