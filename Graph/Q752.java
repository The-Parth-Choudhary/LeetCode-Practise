package Graph;

import java.util.*;

public class Q752 {
    static class Pair {
        String str;
        int moves;

        public Pair(String str, int moves) {
            this.str = str;
            this.moves = moves;
        }
    }

    public static void main(String[] args) {
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";

        System.out.println(openLock(deadends, target));
    }

    public static int openLock(String[] deadends, String target) {
        Set<String> deadendSet = new HashSet<>(Arrays.asList(deadends));

        if (deadendSet.contains("0000")) {
            return -1;
        }

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair("0000", 0));
        Set<String> visited = new HashSet<>();
        visited.add("0000");

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            String str = curr.str;
            int moves = curr.moves;

            if (str.equals(target)) {
                return moves;
            }

            for (int i = 0; i < 4; i++) {
                int[] ops = {1, -1};
                for (int j = 0; j < 2; j++) {
                    int newDigit = (str.charAt(i) - '0' + ops[j] + 10) % 10;
                    String newStr = str.substring(0, i) + newDigit + str.substring(i + 1);

                    if (!visited.contains(newStr) && !deadendSet.contains(newStr)) {
                        visited.add(newStr);
                        q.offer(new Pair(newStr, moves + 1));
                    }
                }
            }
        }

        return -1;
    }
}
