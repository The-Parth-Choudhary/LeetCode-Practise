package String;

public class Q2264 {
    public static void main(String[] args) {
        String num = "6777133339";

        System.out.println(largestGoodInteger(num));
    }

    public static String largestGoodInteger(String num) {
        String ans = "";

        int i = 0;
        int j = 2;

        while(j < num.length()){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(j)){
                if(ans.isEmpty()){
                    ans = num.substring(i, j+1);
                }
                else if(ans.charAt(0) < num.charAt(i)){
                    ans = num.substring(i, j+1);

                }
            }

            i++;
            j++;
        }

        return ans;
    }
}
