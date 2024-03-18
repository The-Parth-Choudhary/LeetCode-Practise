package Array;

import java.util.*;

public class Q435 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int n = intervals.length;
        int cnt = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] > intervals[i][0]) {
                intervals[i][1] = intervals[i - 1][1];
                cnt++;
            }
        }

        return cnt;
    }
}
