## Algorithm Type

**Matrix Transpose + Reverse** — transpose the matrix by swapping rows and columns, then reverse each row.

## Solution Approach

1. **Transpose** the matrix in-place: for all `i < j`, swap `matrix[i][j]` with `matrix[j][i]`. This converts rows into columns.
2. **Reverse each row**: for each row, swap elements symmetrically from the ends inward.
3. The combination of transpose + row reversal achieves a 90-degree clockwise rotation.

## Core Idea

A 90-degree clockwise rotation is equivalent to transposing the matrix (reflecting over the main diagonal) and then reversing each row (reflecting over the vertical midline).

## Pseudocode

```
function rotate(matrix):
    n = len(matrix)
    
    // Step 1: Transpose — swap matrix[i][j] with matrix[j][i] for i < j
    for i from 0 to n - 1:
        for j from i + 1 to n - 1:
            swap(matrix[i][j], matrix[j][i])
    
    // Step 2: Reverse each row
    for i from 0 to n - 1:
        left = 0
        right = n - 1
        while left < right:
            swap(matrix[i][left], matrix[i][right])
            left += 1
            right -= 1
```

## Complexity

- Time: `O(n^2)` — every cell is visited a constant number of times
- Space: `O(1)` — all operations are in-place

## Edge Cases

- 1x1 matrix — no change needed
- 2x2 matrix — simple swap of 4 elements
- Matrix with duplicate values — rotations still work identically

## Language Notes

- Java implementation: [RotateImage.java](RotateImage.java)
- Python reinforcement: [rotate_image.ipynb](rotate_image.ipynb)

**Interview Rating:** 7/10 (扣3分: transpose+reverse trick is standard, but spatial reasoning under interview pressure causes errors)