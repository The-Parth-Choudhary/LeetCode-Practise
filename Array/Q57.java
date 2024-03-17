package Array;

import java.util.*;

public class Q57 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr = new int[intervals.length + 1][2];
        for (int i = 0; i < arr.length; i++) {
            if (i == intervals.length || newInterval[0] < intervals[i][0]) {
                arr[i] = newInterval;
                for (int j = i + 1; j < arr.length; j++) {
                    arr[j] = intervals[j - 1];
                }
                break;
            } else {
                arr[i] = intervals[i];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= arr[i - 1][1]) {
                arr[i][0] = arr[i - 1][0];
                arr[i][1] = Math.max(arr[i - 1][1], arr[i][1]);
                arr[i - 1][0] = -1;
                arr[i - 1][1] = -1;
            }
        }

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] != -1) {
                list.add(arr[i]);
            }
        }

        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
