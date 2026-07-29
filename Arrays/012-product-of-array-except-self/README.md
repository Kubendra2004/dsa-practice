## Algorithm Type

**Prefix Product / Suffix Product** — compute running products from both ends and combine.

## Solution Approach

1. Initialize an output array `result` of the same length as `nums`, filled with 1s.
2. First pass (left to right): maintain a running `prefix` product. For each index `i`, set `result[i] = prefix` then update `prefix *= nums[i]`.
3. Second pass (right to left): maintain a running `suffix` product. For each index `i`, multiply `result[i] *= suffix` then update `suffix *= nums[i]`.
4. After both passes, `result[i]` equals the product of all elements except `nums[i]`.

## Core Idea

Each element's result is the product of all elements to its left multiplied by the product of all elements to its right. Two passes (one from each direction) compute this in O(1) extra space (excluding output).

## Pseudocode

```
function productExceptSelf(nums):
    n = len(nums)
    result = array of size n filled with 1
    
    // Left pass: result[i] = product of all elements to the left of i
    prefix = 1
    for i from 0 to n - 1:
        result[i] = prefix
        prefix = prefix * nums[i]
    
    // Right pass: multiply result[i] by product of all elements to the right of i
    suffix = 1
    for i from n - 1 down to 0:
        result[i] = result[i] * suffix
        suffix = suffix * nums[i]
    
    return result
```

## Complexity

- Time: `O(n)` — two linear passes
- Space: `O(1)` excluding output array

## Edge Cases

- Array with one zero — all results are zero except the zero position (which equals the product of all other elements)
- Array with multiple zeroes — all results are zero
- Two-element array — simple multiplication swap

## Language Notes

- Java implementation: [ProductExceptSelf.java](ProductExceptSelf.java)
- Python reinforcement: [product_except_self.ipynb](product_except_self.ipynb)

**Interview Rating:** 7/10 (扣3分: 需要用output数组做workaround来实现O(1)空间，思路巧妙但概念不特别深入)