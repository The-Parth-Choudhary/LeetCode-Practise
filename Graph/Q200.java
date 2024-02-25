package Graph;

public class Q200 {
    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};

        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int islands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }

        return islands;
    }

    private static void dfs(char[][] grid, int i, int j) {
        if (grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        if (i - 1 >= 0) {
            dfs(grid, i - 1, j);
        }
        if (j - 1 >= 0) {
            dfs(grid, i, j - 1);
        }
        if (i + 1 < grid.length) {
            dfs(grid, i + 1, j);
        }
        if (j + 1 < grid[i].length) {
            dfs(grid, i, j + 1);
        }
    }
}
