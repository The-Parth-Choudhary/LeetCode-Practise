package Array;

import java.util.Arrays;

public class Q56 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)-> a[0] - b[0]);

        int n = intervals.length;

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= intervals[i-1][1]){
                intervals[i][1] = Math.max(intervals[i][1], intervals[i - 1][1]);
                intervals[i][0] = intervals[i - 1][0];
                intervals[i - 1][0] = -1;
                intervals[i - 1][1] = -1;
                n--;
            }
        }

        int[][] ans = new int[n][2];
        int j = 0;

        for(int i = 0; i < intervals.length; i++){
            if(intervals[i][0] != -1){
                ans[j][0] = intervals[i][0];
                ans[j++][1] = intervals[i][1];
            }
        }

        return ans;
    }
}
