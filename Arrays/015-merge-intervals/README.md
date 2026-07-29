# LeetCode 56: Merge Intervals

## Problem

Given an array of `intervals` where `intervals[i] = [starti, endi]`, merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

## Pattern

Sort + Merge — sort by start time, then extend the end boundary when intervals overlap.

## Why This Problem Matters

Interval merging is a fundamental pattern for scheduling and range-based problems. It teaches how to sort by one dimension and then merge based on overlap, which is a common real-world scenario.

## Core Idea

Sort intervals by start time. Iterate and merge: if the current interval overlaps with the last merged interval (current start <= last end), extend the last end. Otherwise, add the current interval as a new entry.

## Complexity

- Time: `O(n log n)` (for sorting)
- Space: `O(n)` (for output, or `O(1)` if sorting in-place)

## Edge Cases

- No overlapping intervals — return as-is
- All intervals overlap — merge into one
- Single interval — return it
- Intervals that are adjacent (e.g., [1,4], [4,5]) — should merge

## Language Notes

- Java implementation: [MergeIntervals.java](MergeIntervals.java)
- Python reinforcement: [merge_intervals.ipynb](merge_intervals.ipynb)

## Practice Goal

If you can explain the sort-then-merge strategy clearly, you are ready for matrix traversal problems like rotating a matrix.

**Interview Rating:** 7/10