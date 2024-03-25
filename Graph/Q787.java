package Graph;

import java.util.*;

public class Q787 {

    static class Pair {
        int node;
        int cost;
        int stops;

        Pair(int node, int cost, int stops) {
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public static void main(String[] args) {
        int[][] flights = {{0, 1, 5}, {1, 2, 5}, {0, 3, 2}, {3, 1, 2}, {1, 4, 1}, {4, 2, 1}};
        System.out.println(findCheapestPrice(5, flights, 0, 2, 2));
    }

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < flights.length; i++) {
            adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2], 0));
        }

        pq.offer(new Pair(src, 0, -1));
        while (!pq.isEmpty()) {
            int node = pq.peek().node;
            int cost = pq.peek().cost;
            int stops = pq.poll().stops;

            if (node == dst) {
                return cost;
            }

            if (stops == k) {
                continue;
            }

            for (Pair i : adj.get(node)) {
                int adjNode = i.node;
                int adjCost = i.cost;

                if (cost + adjCost < dist[adjNode]) {
                    pq.offer(new Pair(adjNode, cost + adjCost, stops + 1));
                    dist[adjNode] = cost + adjCost;
                }
            }
        }

        return -1;
    }
}
