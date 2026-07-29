## Algorithm Type

**In-Place Marking** — use the first row and first column of the matrix itself as flags to indicate which rows/columns should be zeroed.

## Solution Approach

1. First, check if the first row and first column contain any zeroes. Record this in two boolean variables `first_row_zero` and `first_col_zero`.
2. Use the first row and first column as markers: for any `matrix[i][j] == 0` (where `i > 0` and `j > 0`), set `matrix[i][0] = 0` and `matrix[0][j] = 0`.
3. Iterate through the inner matrix (excluding first row and column). If `matrix[i][0] == 0` or `matrix[0][j] == 0`, set `matrix[i][j] = 0`.
4. Finally, zero out the first row if `first_row_zero`, and zero out the first column if `first_col_zero`.

## Core Idea

The matrix borders serve double duty as markers. Boolean variables protect the first row/column from being overwritten prematurely by their own markers.

## Pseudocode

```
function setZeroes(matrix):
    m = number of rows
    n = number of columns
    first_row_zero = false
    first_col_zero = false
    
    // Check if first row contains any zero
    for j from 0 to n - 1:
        if matrix[0][j] == 0:
            first_row_zero = true
    
    // Check if first column contains any zero
    for i from 0 to m - 1:
        if matrix[i][0] == 0:
            first_col_zero = true
    
    // Use first row and column as markers
    for i from 1 to m - 1:
        for j from 1 to n - 1:
            if matrix[i][j] == 0:
                matrix[i][0] = 0
                matrix[0][j] = 0
    
    // Zero out inner matrix based on markers
    for i from 1 to m - 1:
        for j from 1 to n - 1:
            if matrix[i][0] == 0 or matrix[0][j] == 0:
                matrix[i][j] = 0
    
    // Zero out first row if needed
    if first_row_zero:
        for j from 0 to n - 1:
            matrix[0][j] = 0
    
    // Zero out first column if needed
    if first_col_zero:
        for i from 0 to m - 1:
            matrix[i][0] = 0
```

## Complexity

- Time: `O(m * n)` — at most 3 passes over the matrix
- Space: `O(1)` — uses the matrix itself as storage

## Edge Cases

- Matrix with no zeroes — no changes needed
- Matrix that is entirely zeroes — entire matrix stays zeroes  
- First row or first column contains zeroes — boolean flags prevent premature zeroing
- Single-row or single-column matrix — handled by the boolean flags

## Language Notes

- Java implementation: [SetMatrixZeroes.java](SetMatrixZeroes.java)
- Python reinforcement: [set_matrix_zeroes.ipynb](set_matrix_zeroes.ipynb)

**Interview Rating:** 7/10 (扣3分: first-row/column double-duty trick is well-known but still trips up candidates under pressure)