package String;

public class Q1221 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }

    public static int balancedStringSplit(String s) {
        int cnt = 0;
        int total = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                total++;
            }
            else{
                total--;
            }

            if(total == 0){
                cnt++;
            }
        }

        return cnt;
    }
}
