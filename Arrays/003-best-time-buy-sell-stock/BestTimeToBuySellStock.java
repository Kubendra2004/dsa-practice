/**
 * LeetCode 121: Best Time to Buy and Sell Stock
 * 
 * Problem: You are given an array prices where prices[i] is the price of a given 
 * stock on the i-th day. You want to maximize profit by choosing a single day to 
 * buy and a different later day to sell. Return the maximum profit you can achieve. 
 * If you can't make any profit, return 0.
 * 
 * Concept: One-pass tracking / Greedy observation
 * Difficulty: Easy
 */

public class BestTimeToBuySellStock {
    
    /**
     * Finds the maximum profit from buying and selling a stock once.
     * 
     * @param prices the array of stock prices
     * @return the maximum profit possible, or 0 if no profit can be made
     */
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
    
    public static void main(String[] args) {
        BestTimeToBuySellStock solution = new BestTimeToBuySellStock();
        
        // Test Case 1: Mixed prices with profit opportunity
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test 1 - Input: [7, 1, 5, 3, 6, 4]");
        System.out.println("Expected: 5 (buy at 1, sell at 6)");
        System.out.println("Got: " + solution.maxProfit(prices1));
        System.out.println();
        
        // Test Case 2: Descending prices (no profit possible)
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Test 2 - Input: [7, 6, 4, 3, 1]");
        System.out.println("Expected: 0 (prices only decrease)");
        System.out.println("Got: " + solution.maxProfit(prices2));
        System.out.println();
        
        // Test Case 3: Only two prices
        int[] prices3 = {2, 4};
        System.out.println("Test 3 - Input: [2, 4]");
        System.out.println("Expected: 2 (buy at 2, sell at 4)");
        System.out.println("Got: " + solution.maxProfit(prices3));
        System.out.println();
        
        // Test Case 4: Best buy/sell at edges
        int[] prices4 = {1, 7, 5, 11, 5};
        System.out.println("Test 4 - Input: [1, 7, 5, 11, 5]");
        System.out.println("Expected: 10 (buy at 1, sell at 11)");
        System.out.println("Got: " + solution.maxProfit(prices4));
    }
}
