package Array;

public class Q1582 {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}};
        System.out.println(numSpecial(arr));
    }

    public static int numSpecial(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    if (row[i] == 1 && col[j] == 1) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}
