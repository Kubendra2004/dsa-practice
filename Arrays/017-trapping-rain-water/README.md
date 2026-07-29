# LeetCode 42: Trapping Rain Water

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

## Pattern

Two-Pointer / Boundary — track max height from left and right boundaries, use the smaller one to determine water at each position.

## Why This Problem Matters

This is a hard but very common interview problem that combines two-pointer technique with the concept of local maxima as boundaries. It's a premium interview question at top tech companies.

## Core Idea

Use two pointers from both ends. Track the max height seen from the left (`left_max`) and from the right (`right_max`). At each position, move the pointer with the smaller max and calculate trapped water as `max - height[current]`.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Edge Cases

- Empty array — 0
- Single bar — 0
- Monotonically increasing or decreasing — 0
- All bars same height — 0

## Language Notes

- Java implementation: [TrappingRainWater.java](TrappingRainWater.java)
- Python reinforcement: [trapping_rain_water.ipynb](trapping_rain_water.ipynb)

## Practice Goal

If you can explain the two-pointer boundary approach with left_max and right_max, you are ready for binary search problems on rotated arrays.

**Interview Rating:** 8/10