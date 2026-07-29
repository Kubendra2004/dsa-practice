## Algorithm Type

**Binary Search** — determine which half is sorted at each step and decide which side to search.

## Solution Approach

1. Initialize `left = 0` and `right = len(nums) - 1`.
2. While `left <= right`:
   a. Compute `mid = (left + right) // 2`.
   b. If `nums[mid] == target`, return `mid`.
   c. Determine which half is sorted:
      - If `nums[left] <= nums[mid]`, the left half `[left..mid]` is sorted.
        - If `nums[left] <= target < nums[mid]`, search left: `right = mid - 1`.
        - Otherwise, search right: `left = mid + 1`.
      - Else the right half `[mid..right]` is sorted.
        - If `nums[mid] < target <= nums[right]`, search right: `left = mid + 1`.
        - Otherwise, search left: `right = mid - 1`.
3. If the loop exits without finding the target, return `-1`.

## Core Idea

In a rotated sorted array, at least one half of any midpoint split is always sorted. We exploit this property to discard half of the search space at each step, just like standard binary search.

## Pseudocode

```
function search(nums, target):
    left = 0
    right = len(nums) - 1
    
    while left <= right:
        mid = (left + right) // 2
        
        if nums[mid] == target:
            return mid
        
        // Determine which half is sorted
        if nums[left] <= nums[mid]:
            // Left half is sorted
            if nums[left] <= target and target < nums[mid]:
                right = mid - 1  // target is in sorted left half
            else:
                left = mid + 1   // target is in right half
        else:
            // Right half is sorted
            if nums[mid] < target and target <= nums[right]:
                left = mid + 1   // target is in sorted right half
            else:
                right = mid - 1  // target is in left half
    
    return -1
```

## Complexity

- Time: `O(log n)` — standard binary search halving
- Space: `O(1)` — only pointer variables used

## Edge Cases

- Single-element array — check directly or let the loop handle it
- Target not present — return -1 after loop exits
- Array with no rotation (fully sorted) — behaves like standard binary search
- Target is the smallest or largest element — boundary condition in sorted half check

## Language Notes

- Java implementation: [SearchRotatedSorted.java](SearchRotatedSorted.java)
- Python reinforcement: [search_rotated_sorted.ipynb](search_rotated_sorted.ipynb)

**Interview Rating:** 7/10 (扣3分: determining which half is sorted requires careful boundary checks; easy to write off-by-one errors)