package Graph;

import java.util.*;

public class Q207 {
    public static void main(String[] args) {
        int numCourses = 20;
        int[][] prerequisites = {{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}};
        System.out.println(canFinish(numCourses, prerequisites));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses];
        boolean[] pathVis = new boolean[numCourses]; 
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            adj.get(course).add(prerequisiteCourse);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (!dfs(adj, visited, i, pathVis)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean dfs(List<List<Integer>> adj, boolean[] visited, int index, boolean[] pathVis) {
        visited[index] = true;
        pathVis[index] = true;

        for (int i : adj.get(index)) {
            if (!visited[i]) {
                if (!dfs(adj, visited, i, pathVis)) {
                    return false;
                }
            } else if (pathVis[i]) {
                return false;
            }
        }

        pathVis[index] = false;

        return true;
    }
}
