# LeetCode 560: Subarray Sum Equals K

## Problem
Given an integer array `nums` and an integer `k`, return the number of continuous subarrays whose sum equals `k`.

## Pattern
Prefix Sum + Hash Map

## Why This Problem Matters
This is one of the most common prefix-sum interview problems. It tests whether you can turn a subarray-sum counting problem into a running-prefix frequency lookup.

## Core Idea
Track how many times each prefix sum has appeared so far.

If the current prefix sum is `sum`, then every previous prefix sum equal to `sum - k` forms a valid subarray ending at the current index.

## Complexity
- Time: `O(n)`
- Space: `O(n)`

## Edge Cases
- Empty array returns `0`
- `k = 0` still works with negative numbers
- Multiple overlapping subarrays can be counted

## Language Notes
- Java implementation: [SubarraySumEqualsK.java](SubarraySumEqualsK.java)
- Python reinforcement: [subarray_sum_equals_k.ipynb](subarray_sum_equals_k.ipynb)

## Practice Goal
If you can explain this clearly, you are ready for the next prefix-sum variant: pivot-style index balancing or range sum queries.
