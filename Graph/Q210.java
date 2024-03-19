package Graph;

import java.util.*;

public class Q210 {
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        System.out.println(Arrays.toString(findOrder(n, edges)));
    }

    public static int[] findOrder(int n, int[][] edges) {
        int[] inorder = new int[n];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            inorder[edges[i][1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inorder[i] == 0) {
                q.offer(i);
            }
        }

        int cnt = n - 1;
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[n];
        while (!q.isEmpty()) {
            int curr = q.poll();
            list.add(curr);
            for (int i : adj.get(curr)) {
                inorder[i]--;
                if (inorder[i] == 0) {
                    q.offer(i);
                }
            }
            ans[cnt--] = curr;
        }


        if (list.size() != n) {
            return new int[0];
        }

        return ans;
    }
}
