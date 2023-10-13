package Array;

import java.util.Arrays;

public class Q2482 {
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 1}, {1, 0, 1}, {0, 0, 1}};
        System.out.println(Arrays.deepToString(onesMinusZeros(grid)));
    }

    public static int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i = 0 ; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    cnt++;
                }
            }
            row[i] = cnt;
        }

        for(int i = 0 ; i < m; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(grid[j][i] == 1){
                    cnt++;
                }
            }
            col[i] = cnt;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int oneRow = row[i];
                int oneCol = col[j];
                int zeroRow = n - oneRow;
                int zeroCol = m - oneCol;
                grid[i][j] = oneRow + oneCol - zeroRow - zeroCol;
            }
        }

        return grid;
    }
}
