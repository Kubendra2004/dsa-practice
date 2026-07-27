
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 3: Longest Substring Without Repeating Characters
 *
 * Problem: Given a string s, find the length of the longest substring without
 * repeating characters.
 *
 * Concept: Sliding Window with HashMap Difficulty: Easy
 */
public class LongestSubstringNoRepeating {

    /**
     * Finds the length of the longest substring without repeating characters.
     *
     * @param s the input string
     * @return the length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (lastSeen.containsKey(currentChar)) {
                left = Math.max(left, lastSeen.get(currentChar) + 1);
            }

            lastSeen.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringNoRepeating solution = new LongestSubstringNoRepeating();

        // Test Case 1: Multiple repeating characters
        String s1 = "abcabcbb";
        System.out.println("Test 1 - Input: \"" + s1 + "\"");
        System.out.println("Expected: 3 (substring \"abc\")");
        System.out.println("Got: " + solution.lengthOfLongestSubstring(s1));
        System.out.println();

        // Test Case 2: All same characters
        String s2 = "bbbbb";
        System.out.println("Test 2 - Input: \"" + s2 + "\"");
        System.out.println("Expected: 1 (substring \"b\")");
        System.out.println("Got: " + solution.lengthOfLongestSubstring(s2));
        System.out.println();

        // Test Case 3: Mixed repeating pattern
        String s3 = "pwwkew";
        System.out.println("Test 3 - Input: \"" + s3 + "\"");
        System.out.println("Expected: 3 (substring \"wke\")");
        System.out.println("Got: " + solution.lengthOfLongestSubstring(s3));
        System.out.println();

        // Test Case 4: Empty string
        String s4 = "";
        System.out.println("Test 4 - Input: \"" + s4 + "\"");
        System.out.println("Expected: 0 (empty string)");
        System.out.println("Got: " + solution.lengthOfLongestSubstring(s4));
        System.out.println();

        // Test Case 5: All unique characters
        String s5 = "abcdefg";
        System.out.println("Test 5 - Input: \"" + s5 + "\"");
        System.out.println("Expected: 7 (all characters)");
        System.out.println("Got: " + solution.lengthOfLongestSubstring(s5));
    }
}
