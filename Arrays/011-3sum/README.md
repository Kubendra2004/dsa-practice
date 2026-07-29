# LeetCode 15: 3Sum

## Problem

Given an integer array `nums`, return all the unique triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

The solution set must not contain duplicate triplets.

## Pattern

Two-Pointer — sort the array, fix one element, and use two pointers to find pairs that complete the triplet.

## Why This Problem Matters

3Sum is one of the most important prefix-sum-adjacent problems and a very common interview question. It teaches how to reduce a brute-force O(n^3) problem to O(n^2) using sorting + two pointers, and how to handle duplicate elimination cleanly.

## Core Idea

Sort the array. For each element `nums[i]`, use two pointers (`left = i + 1`, `right = len(nums) - 1`) to find pairs where `nums[left] + nums[right] == -nums[i]`. Skip duplicates for `i`, `left`, and `right` to avoid duplicate triplets.

## Complexity

- Time: `O(n^2)`
- Space: `O(1)` (excluding output)

## Edge Cases

- Array with fewer than 3 elements returns `[]`
- All zeroes returns `[[0,0,0]]`
- No valid triplet returns `[]`
- Duplicate elements in array — must deduplicate results

## Language Notes

- Java implementation: [ThreeSum.java](ThreeSum.java)
- Python reinforcement: [three_sum.ipynb](three_sum.ipynb)

## Practice Goal

If you can explain the two-pointer deduplication strategy clearly, you are ready for the next array pattern: prefix product / prefix sum variants for product-based problems.

**Interview Rating:** 7/10