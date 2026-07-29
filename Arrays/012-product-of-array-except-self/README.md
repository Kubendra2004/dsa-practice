# LeetCode 238: Product of Array Except Self

## Problem

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

Solve it in O(n) time and without using division.

## Pattern

Prefix Product — compute running product from the left and from the right, then combine.

## Why This Problem Matters

This is a classic prefix-product problem that tests whether you can compute cumulative products from both directions without extra space. It's a direct extension of the prefix sum concept and is frequently asked in interviews.

## Core Idea

For each index `i`, the result is the product of all elements to the left of `i` multiplied by the product of all elements to the right of `i`. Compute these running products in two passes using the output array itself for O(1) extra space.

## Complexity

- Time: `O(n)`
- Space: `O(1)` (excluding output array)

## Edge Cases

- Array with one zero — all results are zero except the zero position
- Array with multiple zeroes — all results are zero
- Two-element array — simple swap

## Language Notes

- Java implementation: [ProductExceptSelf.java](ProductExceptSelf.java)
- Python reinforcement: [product_except_self.ipynb](product_except_self.ipynb)

## Practice Goal

If you can explain the two-pass prefix/suffix product approach clearly, you are ready for Kadane's algorithm for maximum subarray problems.

**Interview Rating:** 7/10