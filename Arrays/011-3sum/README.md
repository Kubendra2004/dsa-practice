# LeetCode 15: 3Sum

## Problem

Given an integer array `nums`, return all the unique triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

The solution set must not contain duplicate triplets.

## Algorithm Type

**Two-Pointer** — sort the array, fix one element, then use two pointers to find pairs that sum to the negation of the fixed element.

## Solution Approach

1. Sort the array in non-decreasing order.
2. Iterate through each element `nums[i]` as the fixed first element of the triplet.
3. For each `i`, set `target = -nums[i]`. Use two pointers (`left = i + 1`, `right = len(nums) - 1`) to find pairs that sum to `target`.
4. If `nums[left] + nums[right] < target`, increment `left` to increase the sum.
5. If `nums[left] + nums[right] > target`, decrement `right` to decrease the sum.
6. If `nums[left] + nums[right] == target`, record the triplet. Skip duplicate values for `left` and `right` to avoid duplicate triplets in the result.
7. On the outer loop, skip duplicate values for `i` as well.

## Core Idea

Sorting transforms the 3Sum problem into a series of 2Sum problems. For each fixed element, two pointers scan inward from both ends of the remaining sorted subarray, efficiently finding complementary pairs.

## Pseudocode

```
function threeSum(nums):
    sort nums in ascending order
    result = []
    for i from 0 to len(nums) - 3:
        if i > 0 and nums[i] == nums[i - 1]:
            continue  // skip duplicate first elements
        target = -nums[i]
        left = i + 1
        right = len(nums) - 1
        while left < right:
            sum = nums[left] + nums[right]
            if sum < target:
                left += 1
            elif sum > target:
                right -= 1
            else:  // sum == target
                result.append([nums[i], nums[left], nums[right]])
                while left < right and nums[left] == nums[left + 1]:
                    left += 1  // skip duplicate left values
                while left < right and nums[right] == nums[right - 1]:
                    right -= 1  // skip duplicate right values
                left += 1
                right -= 1
    return result
```

## Complexity

- Time: `O(n^2)` — sorting is `O(n log n)`, the nested two-pointer scan is `O(n^2)`
- Space: `O(1)` excluding output (or `O(n)` if sorting uses extra space)

## Edge Cases

- Array with fewer than 3 elements — return empty list
- All zeroes — return `[[0,0,0]]`
- No valid triplet exists — return empty list
- Duplicate elements in array — must deduplicate both outer loop and inner pair

## Language Notes

- Java implementation: [ThreeSum.java](ThreeSum.java)
- Python reinforcement: [three_sum.ipynb](three_sum.ipynb)

**Interview Rating:** 7/10 (扣3分: duplicate skipping logic is the main trap; otherwise standard two-pointer after sort)