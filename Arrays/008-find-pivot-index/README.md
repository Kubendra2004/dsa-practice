# LeetCode 724: Find Pivot Index

## Problem
Given an array of integers `nums`, return the leftmost pivot index. A pivot index is an index where the sum of the numbers to the left equals the sum of the numbers to the right.

## Pattern
Prefix Sum / Running Sum

## Why This Problem Matters
This is a clean prefix-sum warmup. It teaches how to compare left-side and right-side totals without recomputing sums for every index.

## Core Idea
Compute the total sum once. Then scan from left to right while tracking the running left sum.

At each index, the right sum is `total_sum - left_sum - nums[i]`. If left sum equals right sum, that index is the pivot.

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

## Practice Goal
After this one, you should be comfortable using prefix sums for both counting and balance-style questions.
