package Graph;

import java.util.*;

public class Q802 {
    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        System.out.println(eventualSafeNodes(graph));
    }

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        boolean[] pathVis = new boolean[graph.length];
        boolean[] check = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, pathVis, check);
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            if (check[i]) {
                ans.add(i);
            }
        }

        return ans;
    }

    private static boolean dfs(int[][] graph, int index, boolean[] visited, boolean[] pathVis, boolean[] check) {
        visited[index] = true;
        pathVis[index] = true;
        check[index] = false;

        for (int i : graph[index]) {
            if (!visited[i]) {
                if (dfs(graph, i, visited, pathVis, check)) {
                    check[index] = false;
                    return true;
                }
            } else if (pathVis[i]) {
                check[index] = false;
                return true;
            }
        }

        check[index] = true;
        pathVis[index] = false;
        return false;
    }
}
