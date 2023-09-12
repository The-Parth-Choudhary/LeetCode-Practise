package Array;

public class Q38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(8));
    }

    public static String countAndSay(int n) {
        String prevStr = "1";

        for(int i = 2; i <= n ; i++){
            String currNum = convert(prevStr);
            prevStr = currNum;
        }

        return prevStr;
    }

    private static String convert(String s){
        char prevCh = s.charAt(0);
        int prevCount = 1;
        StringBuilder ans = new StringBuilder();

        for(int i = 1; i < s.length(); i++){
            char currCh = s.charAt(i);

            if(currCh != prevCh){
                ans.append(Integer.toString(prevCount));
                ans.append(prevCh);
                prevCount = 1;
                prevCh = currCh;
            }

            else {
                prevCount++;
            }
        }

        ans.append(Integer.toString(prevCount));
        ans.append(prevCh);

        return ans.toString();
    }
}
