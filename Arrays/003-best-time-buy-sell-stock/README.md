# LeetCode 121: Best Time to Buy and Sell Stock

## Problem
You are given an array `prices` where `prices[i]` is the price of a given stock on the i-th day. You want to **maximize profit** by choosing a single day to buy and a **different later day** to sell. Return the **maximum profit** you can achieve. If you can't make any profit, return `0`.

## Solution Approach

### **Strategy: One-Pass Greedy Tracking**
1. Initialize two variables:
   - `minPrice = prices[0]` → Track the cheapest price seen so far
   - `maxProfit = 0` → Track the best profit seen so far
2. Iterate through the array starting from index 1.
3. For each price:
   - If current price < `minPrice` → Update `minPrice` (found a cheaper buy day)
   - Otherwise → Calculate profit = `price - minPrice` and update `maxProfit` if this profit is better
4. Return `maxProfit`.

### **Why This Works**
- **Key Insight**: For maximum profit, we always want to buy at the cheapest price seen **before** the selling day.
- Every day can be a potential **selling day**, so we check the profit if we sold on that day.
- The best **buying day** is always the minimum price before the current day.
- We only need **one pass** through the array—no nested loops needed.

### **Example Trace**
```
Input: prices = [7, 1, 5, 3, 6, 4]

minPrice=7, maxProfit=0

Day 1: price=1
  - 1 < 7 → minPrice=1

Day 2: price=5
  - 5 >= 1 → profit = 5-1=4 → maxProfit=4

Day 3: price=3
  - 3 >= 1 → profit = 3-1=2 → maxProfit stays 4

Day 4: price=6
  - 6 >= 1 → profit = 6-1=5 → maxProfit=5 ✓

Day 5: price=4
  - 4 >= 1 → profit = 4-1=3 → maxProfit stays 5

Output: 5 (buy at 1, sell at 6)
```

## Complexity Analysis

| Metric | Value | Explanation |
|--------|-------|-------------|
| **Time Complexity** | **O(n)** | Single pass through the array; constant operations per element |
| **Space Complexity** | **O(1)** | Only two variables used; no extra data structures |

## Code
```java
public int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int maxProfit = 0;
    
    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;
        } else {
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
    }
    
    return maxProfit;
}
```

## Key Learning Points
- ✅ **Greedy Algorithm**: At each step, maintain the best option seen so far
- ✅ **One-Pass Solution**: Optimal time without nested loops or extra data structures
- ✅ **State Tracking**: Track two key values (min and max) to solve the problem efficiently
- ✅ **Problem Transformation**: Think of each day as a sell day, find the best buy day before it

## Interview Readiness
- **Approach**: ⭐⭐⭐⭐⭐ Optimal, O(n) time and O(1) space
- **Common Mistakes to Avoid**:
  - ❌ Using nested loops (O(n²) — acceptable but not optimal)
  - ❌ Overwriting maxProfit instead of using Math.max()
  - ❌ Initializing minPrice to Integer.MIN_VALUE (can cause overflow)
- **Edge Cases Handled**:
  - Prices only decrease → returns 0 ✓
  - Only two prices → handles correctly ✓
  - Best buy/sell at edges → finds correct pair ✓
  - Single price → returns 0 ✓

## Related Problems
- Best Time to Buy and Sell Stock II — Multiple transactions allowed
- Best Time to Buy and Sell Stock III — At most 2 transactions
- Best Time to Buy and Sell Stock IV — At most k transactions
- Best Time to Buy and Sell Stock with Cooldown — Add cooldown period

## Alternative Approach (Not Optimal)
```java
// Brute Force: O(n²) time, O(1) space
public int maxProfit(int[] prices) {
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
        for (int j = i + 1; j < prices.length; j++) {
            if (prices[j] > prices[i]) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
    }
    return maxProfit;
}
```
*This works but is inefficient. The one-pass solution is preferred in interviews.*
