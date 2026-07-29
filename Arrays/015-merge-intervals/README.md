## Algorithm Type

**Sort + Merge** — sort intervals by start time, then merge overlapping ones by extending the end boundary.

## Solution Approach

1. Sort the intervals by start time.
2. Initialize a result list with the first interval.
3. Iterate through the remaining intervals:
   - If the current interval overlaps with the last interval in the result (i.e., `current_start <= last_end`), merge them by extending `last_end = max(last_end, current_end)`.
   - Otherwise, add the current interval as a new entry in the result.
4. Return the merged result list.

## Core Idea

Sorting by start time ensures that overlapping intervals are adjacent. A single linear pass then suffices to merge them all.

## Pseudocode

```
function merge(intervals):
    sort intervals by start time
    result = [intervals[0]]
    for i from 1 to len(intervals) - 1:
        if intervals[i].start <= result[-1].end:
            // Overlapping — extend the end
            result[-1].end = max(result[-1].end, intervals[i].end)
        else:
            // Non-overlapping — add new interval
            result.append(intervals[i])
    return result
```

## Complexity

- Time: `O(n log n)` — dominated by sorting
- Space: `O(n)` for the output list (or `O(1)` if sorting in-place)

## Edge Cases

- No overlapping intervals — return as-is
- All intervals overlap — merge into one
- Single interval — return it unchanged
- Adjacent intervals `[1,4], [4,5]` — should merge to `[1,5]`

## Language Notes

- Java implementation: [MergeIntervals.java](MergeIntervals.java)
- Python reinforcement: [merge_intervals.ipynb](merge_intervals.ipynb)

**Interview Rating:** 7/10 (扣3分: sort-then-merge is standard, but edge cases with adjacent intervals trip candidates up)