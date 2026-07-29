# LeetCode 33: Search in Rotated Sorted Array

## Problem

Given a rotated sorted array and a target value, return the index of the target if it exists, or -1 otherwise. Must solve in O(log n) time.

## Pattern

**Binary Search** — determine which half is sorted at each step and decide which side to search.

## Why This Problem Matters

This is the definitive binary search variant for rotated arrays. It teaches how to adapt binary search when the standard sorted order is broken by a rotation pivot. Essential for interview preparation.

## Core Idea

At each step, check which half (left or right) is sorted. If the target falls within the sorted half's range, search that half. Otherwise, search the unsorted half.

## Complexity

- Time: `O(log n)`
- Space: `O(1)`

## Edge Cases

- Single-element array
- Target not present
- Array with no rotation (fully sorted)
- Target is the smallest or largest element

## Language Notes

- Java implementation: [SearchRotatedSorted.java](SearchRotatedSorted.java)
- Python reinforcement: [search_rotated_sorted.ipynb](search_rotated_sorted.ipynb)

## Practice Goal

If you can explain how to determine which half is sorted at each step, you have mastered binary search variants for arrays.

**Interview Rating:** 7/10