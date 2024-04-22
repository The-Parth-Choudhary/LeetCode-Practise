package Graph;

import java.util.*;

public class Q1971 {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {2, 4}, {4, 5}};
        int source = 0;
        int destination = 5;

        System.out.println(validPath(n, edges, source, destination));
    }

        public static boolean validPath ( int n, int[][] edges, int source, int destination){
            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < edges.length; i++) {
                adj.get(edges[i][0]).add(edges[i][1]);
                adj.get(edges[i][1]).add(edges[i][0]);
            }

            boolean[] visited = new boolean[n];

            if (dfs(adj, source, destination, visited)) {
                return true;
            }

            return false;
        }

        private static boolean dfs (List < List < Integer >> adj,int s, int e, boolean[] visited){
            if (s == e) {
                return true;
            }
            visited[s] = true;

            for (int i : adj.get(s)) {
                if (!visited[i] && dfs(adj, i, e, visited)) {
                    return true;
                }
            }

            return false;
        }
    }
