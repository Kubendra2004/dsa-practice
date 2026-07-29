# LeetCode 53: Maximum Subarray

## Problem

Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

## Pattern

Kadane's Algorithm — dynamic programming where you track the maximum subarray sum ending at each position.

## Why This Problem Matters

This is the canonical dynamic programming problem on arrays and one of the most frequently asked interview questions. It teaches the concept of local vs. global optima in a single pass.

## Core Idea

At each index, decide whether to extend the current subarray or start a new one. Track the maximum sum seen so far. If the running sum drops below zero, reset it — a negative running sum cannot contribute to a maximum subarray.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Edge Cases

- All negative numbers — return the largest (least negative) element
- Single-element array — return that element
- All positive numbers — return the sum of the entire array

## Language Notes

- Java implementation: [MaximumSubarray.java](MaximumSubarray.java)
- Python reinforcement: [maximum_subarray.ipynb](maximum_subarray.ipynb)

## Practice Goal

If you can explain Kadane's algorithm and why resetting on negative running sums works, you are ready for the next pattern: in-place matrix marking problems.

**Interview Rating:** 7/10