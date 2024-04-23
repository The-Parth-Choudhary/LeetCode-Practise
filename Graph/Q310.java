package Graph;

import java.util.*;

public class Q310 {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}};
        List<Integer> ans = findMinHeightTrees(n, edges);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ans = new ArrayList<>();
        if (n == 1) {
            ans.add(0);
            return ans;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] degree = new int[n];
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
            degree[edges[i][1]]++;
            degree[edges[i][0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                q.offer(i);
            }
        }

        while (n > 2) {
            int size = q.size();
            n -= size;
            for (int i = 0; i < size; i++) {
                int curr = q.poll();
                for (int it : adj.get(curr)) {
                    if (--degree[it] == 1) {
                        q.offer(it);
                    }
                }
            }
        }

        ans.addAll(q);
        return ans;
    }
}
