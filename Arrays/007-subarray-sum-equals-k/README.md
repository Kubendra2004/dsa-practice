# LeetCode 560: Subarray Sum Equals K

## Problem

Given an integer array `nums` and an integer `k`, return the number of continuous subarrays whose sum equals `k`.

## Algorithm Type

Prefix Sum + Hash Map

## Solution Approach

1. Initialize a hashmap to store prefix sum frequencies, starting with `{0: 1}`.
2. Iterate through the array, maintaining a running cumulative sum.
3. At each index, compute `target = current_sum - k`.
4. If `target` exists in the hashmap, add its frequency to the count.
5. Update the hashmap with the current prefix sum frequency.
6. Return the total count.

## Core Idea

Track how many times each prefix sum has appeared so far. If the current prefix sum is `sum`, then every previous prefix sum equal to `sum - k` forms a valid subarray ending at the current index.


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

**Interview Rating:** 8/10 (扣2分: 负数+k=0场景对初学者有陷阱，对HashMap操作边界不熟会出错)

## Practice Goal

If you can explain this clearly, you are ready for the next prefix-sum variant: pivot-style index balancing or range sum queries.
