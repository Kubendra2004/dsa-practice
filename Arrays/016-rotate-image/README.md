# LeetCode 48: Rotate Image

## Problem

You are given an `n x n` 2D matrix representing an image. Rotate the image by 90 degrees (clockwise) in-place.

## Pattern

Matrix Transpose + Reverse — transpose the matrix (swap rows and columns), then reverse each row.

## Why This Problem Matters

This is a classic matrix manipulation problem that tests spatial reasoning and in-place array operations. The transpose-then-reverse technique is a powerful pattern for 90-degree rotations.

## Core Idea

Transpose the matrix by swapping `matrix[i][j]` with `matrix[j][i]` for all `i < j`. Then reverse each row. This achieves a 90-degree clockwise rotation in-place.

## Complexity

- Time: `O(n^2)`
- Space: `O(1)`

## Edge Cases

- 1x1 matrix — no change needed
- 2x2 matrix — simple swap
- Matrix with duplicate values — rotations still work the same

## Language Notes

- Java implementation: [RotateImage.java](RotateImage.java)
- Python reinforcement: [rotate_image.ipynb](rotate_image.ipynb)

## Practice Goal

If you can explain the transpose-then-reverse approach clearly, you are ready for boundary-based two-pointer problems like trapping rain water.

**Interview Rating:** 7/10