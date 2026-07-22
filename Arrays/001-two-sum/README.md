## 1. Two Sum
**Difficulty:** Easy
**Topic:** Arrays, Hash Map
**Date:** 2026-07-21

### Approach
Brute force checks every pair, O(n²). Optimized approach uses a hash map to
store each number's index while iterating once — for each number, check if
(target - number) already exists in the map. O(n) time.

### Time Complexity: O(n)
### Space Complexity: O(n)
