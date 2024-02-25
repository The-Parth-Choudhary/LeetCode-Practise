package Graph;

public class Q547 {
    public static void main(String[] args) {
        int[][] isConnected = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        System.out.println(findCircleNum(isConnected));
    }

    public static int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int provinces = 0;

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }

        return provinces;
    }

    private static void dfs(int[][] isConnected, boolean[] visited, int index) {
        visited[index] = true;

        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[index][i] == 1 && !visited[i]) {
                dfs(isConnected, visited, i);
            }
        }
    }
}
