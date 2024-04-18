package Graph;

public class Q463 {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }

        return 0;
    }

    private static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }

        if (grid[i][j] == 2) {
            return 0;
        }

        grid[i][j] = 2;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int cnt = 0;

        for (int t = 0; t < 4; t++) {
            int di = i + dx[t];
            int dj = j + dy[t];

            cnt += dfs(grid, di, dj);
        }

        return cnt;
    }
}
