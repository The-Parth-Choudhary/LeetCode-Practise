package Graph;

import java.util.*;

public class Q909 {
    public static void main(String[] args) {
        int[][] board = {
            {-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1},
            {-1,35,-1,-1,13,-1},
            {-1,-1,-1,-1,-1,-1},
            {-1,15,-1,-1,-1,-1}
        };

        System.out.println(snakesAndLadders(board));
    }

    public static int snakesAndLadders(int[][] board) {
        int n = board.length;
        int k = 1;
        int[] b = new int[n*n+1];
        for(int i = 0; i < n; i++){
            for(int j = (i%2 == 0) ? 0 : n-1; j >= 0 && j < n; ){
                b[k++] = board[n-i-1][j];
                if(i%2 == 0){
                    j++;
                }
                else{
                    j--;
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        int cnt = 0;
        boolean[] visited = new boolean[n*n+1];

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i < size; i++){
                int curr = q.poll();

                for(int j = curr+1 ; j <= curr+6; j++){
                    int ind = (b[j] == -1) ? j : b[j];

                    if(!visited[ind]){
                        if(ind == n*n){
                            return cnt+1;
                        }

                        visited[ind] = true;
                        q.offer(ind);
                    }
                }
            }

            cnt++;
        }

        return -1;
    }
}
