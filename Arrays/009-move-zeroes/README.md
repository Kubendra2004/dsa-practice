# LeetCode 283: Move Zeroes

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

Do this in-place without making a copy of the array.

## Pattern

Two-Pointer Technique — write pointer tracks the position to place the next non-zero element.

## Why This Problem Matters

This is a foundational two-pointer problem that teaches in-place array manipulation. The write-pointer pattern is used in many array problems where elements need to be filtered or rearranged without extra space.

## Core Idea

Use a `write` pointer starting at 0. Scan the array with a `read` pointer. Every time you encounter a non-zero element, write it at the `write` position and increment `write`. After the scan, fill all positions from `write` to the end with zeroes.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Edge Cases

- Array with all zeroes
- Array with no zeroes
- Single-element array
- Array with only one zero at the beginning or end

## Language Notes

- Java implementation: [MoveZeroes.java](MoveZeroes.java)
- Python reinforcement: [move_zeroes.ipynb](move_zeroes.ipynb)

## Practice Goal

If you can explain the two-pointer write-pattern clearly, you are ready for the next array variant: removing duplicates from a sorted array.

**Interview Rating:** 3/5