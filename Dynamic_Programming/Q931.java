package Dynamic_Programming;

public class Q931 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        System.out.println(minFallingPathSum(matrix));
    }

    public static int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        Integer[][] dp = new Integer[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            min = Math.min(min, helper(matrix, 0, i, dp));
        }

        return min;
    }

    private static int helper(int[][] matrix, int row, int col, Integer[][] dp) {
        if (dp[row][col] != null) {
            return dp[row][col];
        }

        if (row == matrix.length - 1) {
            return dp[row][col] = matrix[row][col];
        }

        int min = Integer.MAX_VALUE;

        if (col > 0) {
            min = Math.min(min, helper(matrix, row + 1, col - 1, dp) + matrix[row][col]);
        }
        min = Math.min(min, helper(matrix, row + 1, col, dp) + matrix[row][col]);
        if (col < matrix.length - 1) {
            min = Math.min(min, helper(matrix, row + 1, col + 1, dp) + matrix[row][col]);
        }

        return dp[row][col] = min;
    }
}
