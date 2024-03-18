package Graph;

public class Q785 {
    public static void main(String[] args) {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        System.out.println(isBipartite(graph));
    }

    public static boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == 0) {
                if (!dfs(graph, i, color, 1)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean dfs(int[][] graph, int index, int[] color, int c) {
        color[index] = c;

        for (int i : graph[index]) {
            if (color[i] == 0) {
                if (!dfs(graph, i, color, -c)) {
                    return false;
                }
            } else {
                if (color[i] == c) {
                    return false;
                }
            }
        }

        return true;
    }
}
