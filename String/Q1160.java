package String;

public class Q1160 {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";

        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int[] count = new int[26];

        for(int i = 0; i < chars.length(); i++){
            count[chars.charAt(i) - 'a']++;
        }

        int ans = 0;

        for(String word : words){
            if(canForm(word, count)){
                ans += word.length();
            }
        }

        return ans;
    }

    private static boolean canForm(String word, int[] count){
        int[] curr = new int[26];

        for(int i = 0; i < word.length(); i++){
            int a = word.charAt(i) - 'a';
            curr[a]++;

            if(curr[a] > count[a]){
                return false;
            }
        }

        return true;
    }
}
