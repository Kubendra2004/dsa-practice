# LeetCode 3: Longest Substring Without Repeating Characters

## Problem

Given a string `s`, return the length of the longest substring without repeating characters.

## Pattern

Sliding Window with Hash Map

## Core Idea

Track the last index where each character was seen.

When a repeated character appears inside the current window, move the left boundary to one position after the previous occurrence. This keeps the window valid without rescanning the string.

## Complexity

- Time: `O(n)`
- Space: `O(min(n, charset))`

## Edge Cases

- Empty string returns `0`
- Single character returns `1`
- All unique characters return the full length
- All identical characters return `1`

## Language Notes

- Java implementation: [LongestSubstringNoRepeating.java](LongestSubstringNoRepeating.java)
- Python reinforcement: [longest_substring.ipynb](longest_substring.ipynb)

## Practice Goal

If you can solve this cleanly, you understand the basic sliding window template well enough to move to the next common variant: fixed-size windows or frequency-based windows.
