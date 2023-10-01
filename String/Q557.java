package String;

public class Q557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder ans = new StringBuilder();

        for(String word : words){
            ans.append(new StringBuilder(word).reverse()).append(" ");
        }

        return ans.toString().trim();
    }
}
