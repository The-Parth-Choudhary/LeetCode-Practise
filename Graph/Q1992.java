package Graph;

import java.util.*;

public class Q1992 {
    public static void main(String[] args) {
        int[][] land = {{1, 0, 0}, {0, 1, 1}, {0, 1, 1}};
        int[][] ans = findFarmland(land);
        for (int[] a : ans) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static int[][] findFarmland(int[][] land) {
        int n = land.length;
        int m = land[0].length;

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1) {
                    int[] bound = getLand(land, i, j);
                    ans.add(bound);
                }
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

    private static int[] getLand(int[][] land, int x, int y) {
        int[] ans = new int[4];
        ans[0] = x;
        ans[1] = y;

        int n = land.length;
        int m = land[0].length;

        int r = x;
        int c = y;

        while (r < n && land[r][y] == 1) {
            r++;
        }
        while (c < m && land[x][c] == 1) {
            c++;
        }
        ans[2] = r - 1;
        ans[3] = c - 1;

        for (int i = x; i < r; i++) {
            for (int j = y; j < c; j++) {
                land[i][j] = 0;
            }
        }

        return ans;
    }
}
