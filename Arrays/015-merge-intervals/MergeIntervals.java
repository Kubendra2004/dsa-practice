public class MergeIntervals {

    /**
     * Merges all overlapping intervals and returns an array of non-overlapping intervals.
     *
     * @param intervals array of intervals where each interval is [start, end]
     * @return merged non-overlapping intervals
     */
    public int[][] merge(int[][] intervals) {
        // TODO: Implement your solution here
        return new int[0][];
    }

    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();

        // Test Case 1: Standard overlapping intervals
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println("Test 1 - Input: [[1,3],[2,6],[8,10],[15,18]]");
        System.out.println("Expected: [[1,6],[8,10],[15,18]]");
        int[][] result1 = solution.merge(intervals1);
        System.out.println("Got: " + java.util.Arrays.deepToString(result1));
        System.out.println();

        // Test Case 2: All intervals overlap
        int[][] intervals2 = {{1, 4}, {4, 5}};
        System.out.println("Test 2 - Input: [[1,4],[4,5]]");
        System.out.println("Expected: [[1,5]]");
        int[][] result2 = solution.merge(intervals2);
        System.out.println("Got: " + java.util.Arrays.deepToString(result2));
        System.out.println();

        // Test Case 3: No overlaps
        int[][] intervals3 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Test 3 - Input: [[1,2],[3,4],[5,6]]");
        System.out.println("Expected: [[1,2],[3,4],[5,6]]");
        int[][] result3 = solution.merge(intervals3);
        System.out.println("Got: " + java.util.Arrays.deepToString(result3));
    }
}