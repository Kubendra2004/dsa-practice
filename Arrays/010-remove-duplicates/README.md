# LeetCode 26: Remove Duplicates from Sorted Array

## Problem

Given a sorted array `nums`, remove the duplicates in-place such that each unique element appears only once. Return the number of unique elements.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

## Pattern

Two-Pointer Technique — slow pointer tracks the last unique position, fast pointer scans for the next unique element.

## Why This Problem Matters

This is the canonical two-pointer problem for sorted arrays. The slow/fast pointer pattern is essential for in-place array deduplication and is a building block for more complex array manipulation problems.

## Core Idea

Use a `slow` pointer starting at index 0 (the first element is always unique). Scan with a `fast` pointer from index 1. When `nums[fast] != nums[slow]`, increment `slow` and copy `nums[fast]` to `nums[slow]`. After the scan, the first `slow + 1` elements are the unique ones.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Edge Cases

- Array with all identical elements
- Array with no duplicates
- Single-element array
- Empty array (if allowed by constraints)

## Language Notes

- Java implementation: [RemoveDuplicates.java](RemoveDuplicates.java)
- Python reinforcement: [remove_duplicates.ipynb](remove_duplicates.ipynb)

## Practice Goal

If you can explain the slow/fast pointer pattern clearly, you are ready for the next array pattern: two-pointer from both ends (e.g., container with most water, move zeroes).

**Interview Rating:** 3/5