package String;

public class Q1662 {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for (int i = 0; i < word1.length; i++) {
            str1 += word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            str2 += word2[i];
        }

        return str1.equals(str2);
    }
}
