package String;

public class Q58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" +");
        return arr[arr.length - 1].length();
    }
}
