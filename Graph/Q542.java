package Graph;

import java.util.*;

public class Q542 {

    static class Node {
        int i;
        int j;
        int dist;

        Node(int i, int j, int dist) {
            this.i = i;
            this.j = j;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }

    public static int[][] updateMatrix(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        int[][] ans = new int[mat.length][mat[0].length];
        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new Node(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, -1, 0, 1};

        while (!q.isEmpty()) {
            int row = q.peek().i;
            int col = q.peek().j;
            int dist = q.peek().dist;
            q.poll();
            ans[row][col] = dist;

            for (int i = 0; i < 4; i++) {
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];

                if (nrow >= 0 && nrow < mat.length && ncol >= 0 && ncol < mat[0].length && !visited[nrow][ncol]) {
                    visited[nrow][ncol] = true;
                    q.offer(new Node(nrow, ncol, dist + 1));
                }
            }
        }

        return ans;
    }
}
