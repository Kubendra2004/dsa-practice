## Algorithm Type

**Two-Pointer / Boundary** — track max height from both ends, move the pointer with the smaller boundary inward.

## Solution Approach

1. Initialize two pointers: `left = 0` and `right = len(height) - 1`.
2. Track `left_max` (maximum height seen from the left) and `right_max` (maximum height seen from the right).
3. While `left < right`:
   - If `height[left] < height[right]`:
     - If `height[left] >= left_max`, update `left_max`.
     - Otherwise, add `left_max - height[left]` to the total trapped water.
     - Move `left` pointer one step right.
   - Else (height[left] >= height[right]):
     - If `height[right] >= right_max`, update `right_max`.
     - Otherwise, add `right_max - height[right]` to the total trapped water.
     - Move `right` pointer one step left.
4. Return the total trapped water.

## Core Idea

Water trapped at any position depends on the **minimum** of the maximum boundary heights on both sides. By tracking left_max and right_max and always advancing the pointer at the smaller boundary, we guarantee the correctness of each water calculation.

## Pseudocode

```
function trap(height):
    if height is empty:
        return 0
    
    left = 0
    right = len(height) - 1
    left_max = 0
    right_max = 0
    total_water = 0
    
    while left < right:
        if height[left] < height[right]:
            if height[left] >= left_max:
                left_max = height[left]
            else:
                total_water += left_max - height[left]
            left += 1
        else:
            if height[right] >= right_max:
                right_max = height[right]
            else:
                total_water += right_max - height[right]
            right -= 1
    
    return total_water
```

## Complexity

- Time: `O(n)` — each pointer traverses the array at most once
- Space: `O(1)` — only a few variables used

## Edge Cases

- Empty array — 0 trapped water
- Single bar — 0 trapped water
- Monotonically increasing heights — 0 trapped water
- Monotonically decreasing heights — 0 trapped water
- All bars same height — 0 trapped water

## Language Notes

- Java implementation: [TrappingRainWater.java](TrappingRainWater.java)
- Python reinforcement: [trapping_rain_water.ipynb](trapping_rain_water.ipynb)

**Interview Rating:** 8/10 (扣2分: Hard-rated, two-pointer boundary logic is tricky to reason about under pressure; deducting only 2 for the conceptual depth)