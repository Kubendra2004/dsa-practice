# LeetCode 73: Set Matrix Zeroes

## Problem

Given an `m x n` integer matrix `matrix`, if an element is `0`, set its entire row and column to `0` in-place.

## Pattern

In-Place Marking — use the first row and first column of the matrix itself as markers to avoid extra space.

## Why This Problem Matters

This is a classic in-place marking problem that tests your ability to use the input structure itself as storage. It extends the concept of prefix sums/products by using the array boundaries as flags rather than a separate data structure.

## Core Idea

Use the first cell of each row and column as a flag to indicate whether that row/column should be zeroed. Use two boolean variables to track whether the first row and first column themselves need zeroing (since they serve double duty as markers).

## Complexity

- Time: `O(m * n)`
- Space: `O(1)`

## Edge Cases

- Matrix with no zeroes — no changes needed
- Matrix that is entirely zeroes — entire matrix stays zeroes
- First row or first column contains zeroes — need special tracking
- Single-row or single-column matrix

## Language Notes

- Java implementation: [SetMatrixZeroes.java](SetMatrixZeroes.java)
- Python reinforcement: [set_matrix_zeroes.ipynb](set_matrix_zeroes.ipynb)

## Practice Goal

If you can explain the in-place marking strategy and why first-row/first-column double-duty needs boolean tracking, you are ready for the next pattern: boundary-based matrix traversal.

**Interview Rating:** 7/10