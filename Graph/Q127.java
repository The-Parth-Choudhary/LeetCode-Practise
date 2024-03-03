package Graph;

import java.util.*;

public class Q127 {
     static class Pair{
        String word;
        int len;
        Pair(String word, int len){
            this.word = word;
            this.len = len;
        }
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        System.out.println(ladderLength(beginWord, endWord, wordList));
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        boolean[] visited = new boolean[wordList.size()];

        return bfs(beginWord, endWord, wordList, visited);
    }

    private static int bfs(String beginWord, String endWord, List<String> wordList, boolean[] visited){
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(beginWord, 1));

        while(!q.isEmpty()){
            String word = q.peek().word;
            int len = q.poll().len;

            if(word.equals(endWord)){
                return len;
            }

            for(int i = 0; i < wordList.size(); i++){
                if(!visited[i] && diff(word, wordList.get(i))){
                    q.offer(new Pair(wordList.get(i), len+1));
                    visited[i] = true;
                }
            }
        }

        return 0;
    }

    private static boolean diff(String a, String b){
        int diff = 0;

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                diff++;
            }
        }

        return diff == 1;
    }
}
